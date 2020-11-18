package com.qa.serviceexample

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import android.view.View

class MyService : Service() {

    val TAG = "Service is "

    override fun onBind(intent: Intent): IBinder? {
        return null
    }

    override fun onCreate() {
        Log.d(TAG, "Created")
        super.onCreate()
    }


    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d(TAG, "Started")
        val runner = Runnable {
            for (i in 1..30) {
                Log.d(TAG, "Iterating $i")
                Thread.sleep(3000)
            }
            stopSelf()
        }
        val thread = Thread(runner)
        thread.start()
        stopSelf()
        return super.onStartCommand(intent, flags, startId)
    }



    override fun onDestroy() {
        Log.d(TAG, "Torn Down")
        super.onDestroy()
    }

}