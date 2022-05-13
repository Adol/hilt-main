package com.example.ktxExtension.tools

import android.util.Log

@Suppress("NOTHING_TO_INLINE")
inline fun <T> T?.log(ta: String = "TAG_AD") {
    this.apply {//
        Log.d(ta, this.toString())
    }
}