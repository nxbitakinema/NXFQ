package com.nx.nxfq.domain.model

import com.google.firebase.firestore.ServerTimestamp
import java.util.Date

data class Qoute(
    var id: String? = null,
    @ServerTimestamp
    val dateForFirestore: Date? = null,
    var title: String? = null,
    var author: String? = null
)