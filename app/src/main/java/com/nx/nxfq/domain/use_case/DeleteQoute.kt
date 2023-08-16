package com.nx.nxfq.domain.use_case

import com.nx.nxfq.domain.repository.QouteRepository

class DeleteQoute(
    private val repo: QouteRepository
) {
    suspend operator fun invoke(bookId: String) = repo.deleteQouteFromFirestore(bookId)
}