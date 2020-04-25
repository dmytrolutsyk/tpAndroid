package com.example.tp_maison_android.constraintlayout

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.tp_maison_android.R

class ConstraintLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = intent
        if ( intent != null){
            var following = ""
            if (intent.hasExtra("Following")){
                following = intent.getStringExtra("Following")
            }
            var follower = ""
            if (intent.hasExtra("Follower")){
                follower = intent.getStringExtra("Follower")
            }
            var name = ""
            if (intent.hasExtra("Name")){
                name = intent.getStringExtra("Name")
            }
            var textView = findViewById<View>(R.id.textView) as TextView
            textView.text = "Following " + following
            var textView2 = findViewById<View>(R.id.textView2) as TextView
            textView2.text = "Follower " + follower
            var textView3 = findViewById<View>(R.id.textView3) as TextView
            textView3.text = name
        }
    }
}