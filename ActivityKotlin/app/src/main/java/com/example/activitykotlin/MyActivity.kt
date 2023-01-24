/**
 * Listing 3-9: Activity skeleton code
 */
package com.example.activitykotlin

import android.app.Activity
import android.os.Bundle
import android.util.Log

class MyActivity : Activity() {

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MyActivity", "onCreate()")
        setContentView(R.layout.main)
    }
}