package com.example.toastlib

import android.content.Context
import android.widget.Toast

open class ToastClass {

    open fun showMessage(message: String, context: Context) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}