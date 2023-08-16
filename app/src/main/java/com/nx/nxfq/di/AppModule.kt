package com.nx.nxfq.di

import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.nx.nxfq.core.Constant.COLLECTION_NAME
import com.nx.nxfq.data.QouteRepositoryImpl
import com.nx.nxfq.domain.repository.QouteRepository
import com.nx.nxfq.domain.use_case.AddQoute
import com.nx.nxfq.domain.use_case.DeleteQoute
import com.nx.nxfq.domain.use_case.GetQoute
import com.nx.nxfq.domain.use_case.UseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideQouteRef() = Firebase.firestore.collection(COLLECTION_NAME)

    @Provides
    fun provideQouteRepository(qouteRef: CollectionReference): QouteRepository = QouteRepositoryImpl(qouteRef)

    @Provides
    fun provideUseCases(repo: QouteRepository) = UseCase(
        getQoute = GetQoute(repo),
        addQoute = AddQoute(repo),
        deleteQoute = DeleteQoute(repo)
    )

}