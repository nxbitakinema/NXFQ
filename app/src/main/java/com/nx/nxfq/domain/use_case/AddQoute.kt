package com.nx.nxfq.domain.use_case

import com.nx.nxfq.domain.repository.QouteRepository

class AddQoute(
    private val repo: QouteRepository
) {
    suspend operator fun invoke(
        title: String,
        author: String
    ) = repo.addQouteToFirestore(title, author)
}