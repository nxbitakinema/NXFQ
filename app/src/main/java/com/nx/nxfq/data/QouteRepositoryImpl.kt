package com.nx.nxfq.data

import com.google.firebase.firestore.CollectionReference
import com.nx.nxfq.core.Constant.ID
import com.nx.nxfq.domain.model.Qoute
import com.nx.nxfq.domain.model.Response.Failure
import com.nx.nxfq.domain.model.Response.Success
import com.nx.nxfq.domain.repository.AddQouteResponse
import com.nx.nxfq.domain.repository.DeleteQouteResponse
import com.nx.nxfq.domain.repository.QouteRepository
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.tasks.await
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class QouteRepositoryImpl @Inject constructor(
    private val qouteRef: CollectionReference
) : QouteRepository {

    override fun getQouteFromFirestore() = callbackFlow {
        val snapshotListener = qouteRef.orderBy(ID).addSnapshotListener { snapshot, e ->
            val qouteResponse = if (snapshot != null) {
                val qoute = snapshot.toObjects(Qoute::class.java)
                Success(qoute)
            } else {
                Failure(e)
            }
            trySend(qouteResponse)
        }
        awaitClose {
            snapshotListener.remove()
        }
    }

    override suspend fun addQouteToFirestore(
        title: String,
        author: String
    ): AddQouteResponse = try {
        val id = qouteRef.document().id
        val qoute = Qoute(
            id = id,
            title = title,
            author = author
        )
        qouteRef.document(id).set(qoute).await()
        Success(true)
    } catch (e: Exception) {
        Failure(e)
    }

    override suspend fun deleteQouteFromFirestore(qouteId: String): DeleteQouteResponse = try {
        qouteRef.document(qouteId).delete().await()
        Success(true)
    } catch (e: Exception) {
        Failure(e)
    }
}