package com.androidmad.ytubeapi

import android.content.Context
import android.widget.Toast

/**
 * Created by Mushtaq
 * on 11-08-2019.
 */
fun Context.showShortToast(message: CharSequence) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun Context.showLongToast(message: CharSequence) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}