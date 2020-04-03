package com.vinc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)
    }
}
class MyReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        Toast.makeText(context, "Broadcast Intent Detected.",
            Toast.LENGTH_LONG).show()
    }
}
