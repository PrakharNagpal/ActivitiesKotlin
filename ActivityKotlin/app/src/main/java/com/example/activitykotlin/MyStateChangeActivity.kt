package com.example.activitykotlin


import android.app.Activity
import android.os.Bundle
import android.util.Log

class MyStateChangeActivity : Activity() {

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("MyStateChangeActivity", "onCreate()")
    }

    public override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        Log.d("MyStateChangeActivity", "onRestoreInstanceState")
    }

    public override fun onRestart() {
        super.onRestart()

        Log.d("MyStateChangeActivity", "onRestart")
    }

    // Called at the start of the visible lifetime.
    public override fun onStart() {
        super.onStart()

        Log.d("MyStateChangeActivity", "onStart")
    }

    public override fun onResume() {
        super.onResume()

        Log.d("MyStateChangeActivity", "onResume")
    }

    public override fun onSaveInstanceState(savedInstanceState: Bundle) {

        super.onSaveInstanceState(savedInstanceState)
        Log.d("MyStateChangeActivity", "onSaveInstanceState")
    }

    // Called at the end of the active lifetime.
    public override fun onPause() {

        super.onPause()
        Log.d("MyStateChangeActivity", "onPause")
    }

    // Called at the end of the visible lifetime.
    public override fun onStop() {

        super.onStop()
        Log.d("MyStateChangeActivity", "onStop")
    }

    // Sometimes called at the end of the full lifetime.
    public override fun onDestroy() {

        super.onDestroy()
        Log.d("MyStateChangeActivity", "onDestroy")
    }
}