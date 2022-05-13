//package com.example.android.hilt.tools
//
//import android.util.Log

//@Suppress("NOTHING_TO_INLINE")
//inline fun <T> T?.log(ta: String = "TAG_AD") {
//    this.apply {//
//        Log.d(ta, this.toString())
//    }
//}

//fun toUTF8(st: String): String {
//    val result = URLEncoder.encode(st, "utf-8")
//    return URLDecoder.decode(result, "UTF-8")
//}
//

//fun FirebaseCrash() {
//    throw RuntimeException("Firebase test Crash") // Force a crash
//}

//@Suppress("NOTHING_TO_INLINE")
//inline fun RecyclerView.noScroll(context: Context): RecyclerView {
//    layoutManager = LinearLayoutManager(context)
//    isNestedScrollingEnabled = false
//    return this
//}

//@Suppress("NOTHING_TO_INLINE")
//inline fun <T> T.gap() = this.apply {
//    var gap = " "
//    (0..5).forEach { _ -> gap += "$this" }
//}

//廢棄 API處理
//@Suppress("NOTHING_TO_INLINE")
//fun getColorAD(context: Context, color: Int) = ContextCompat.getColor(context, color)
//
//fun getDrawable(context: Context, Draw: Int) = ContextCompat.getDrawable(context, Draw)

//fun getNumStyle(num: Float, pp: Boolean = false): String {
//    return String.format("%,d", num)
//}
//
//fun getNumStyle(num: Long): String {
//    return String.format("%,d", num)
//}
//
//fun getDecimal(field: String): String {
//    var response = field
//    try {
//        val temp = field.replace(",", "")
//        response = when (temp.toFloat().toBigDecimal().rem(1.toBigDecimal()).toFloat()) {
//            0f -> String.format("%,.0f", temp.toFloat().toBigDecimal())
//            else -> {
//                val n2 =
//                    temp.toFloat().toBigDecimal().rem(1.toBigDecimal()).toString().length - 2
//                String.format("%,.${n2}f", temp.toFloat())
//            }
//        }
//    } catch (ex: Exception) {
//    }
//    return response
//}
//
//fun String.toastAD(cont: Context, long: Boolean = false): Toast {
//    val showtime = if (long) Toast.LENGTH_LONG else Toast.LENGTH_SHORT
//    return Toast.makeText(cont, this, showtime).apply { show() }
//}
//
//fun Context.toastAD(message: String, long: Boolean = false): Toast {
//    val showtime = if (long) Toast.LENGTH_LONG else Toast.LENGTH_SHORT
//    return Toast.makeText(this, message, showtime).apply { show() }
//}
//
//fun String.textToDouble(): Double = this.replace(",", "").toDouble()
//
//fun <T> T?.toBigDec(): String? =
//    this.toString().replace(",", "").toBigDecimal().toPlainString()