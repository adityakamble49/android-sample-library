package com.adityakamble49.androidlibrarysample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.adityakamble49.samplelibrary.printGreetings
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sampleLibraryVersion.printGreetings("Aditya Kamble")
    }
}
