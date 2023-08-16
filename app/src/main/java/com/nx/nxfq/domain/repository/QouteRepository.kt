package com.nx.nxfq.domain.repository

import com.nx.nxfq.domain.model.Qoute
import com.nx.nxfq.domain.model.Response
import kotlinx.coroutines.flow.Flow

typealias Qoutes = List<Qoute>
typealias AppResponse = Response<Qoutes>
typealias AddQouteResponse = Response<Boolean>
typealias DeleteQouteResponse = Response<Boolean>

interface QouteRepository {

    fun getQouteFromFirestore(): Flow<AppResponse>

    suspend fun addQouteToFirestore(
        title: String, author: String): AddQouteResponse

    suspend fun deleteQouteFromFirestore(qouteId: String): DeleteQouteResponse

}