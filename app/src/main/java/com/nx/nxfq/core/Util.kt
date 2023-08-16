package com.nx.nxfq.core

import android.util.Log
import com.nx.nxfq.core.Constant.TAG

class Util {
    companion object {
        fun printx(e: Exception?) = e?.apply {
            Log.e(TAG, stackTraceToString())
        }
    }
}