package com.adityakamble49.samplelibrary

import android.widget.TextView

/**
 * View Extensions
 *
 * @author Aditya Kamble
 * @since 16/9/2017
 */

val helloLibrary = HelloLibrary()

fun TextView.printGreetings(name: String) {
    this.text = helloLibrary.greetings(name)
}