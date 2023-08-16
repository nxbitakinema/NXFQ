package com.nx.nxfq.domain.use_case

import com.nx.nxfq.domain.repository.QouteRepository

class GetQoute(
    private val repo: QouteRepository
) {
    operator fun invoke() = repo.getQouteFromFirestore()
}