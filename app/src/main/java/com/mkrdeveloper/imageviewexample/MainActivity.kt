package com.mkrdeveloper.imageviewexample

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val img = findViewById<ImageView>(R.id.imageView)
        val btn = findViewById<TextView>(R.id.button)

        val bitmap = BitmapFactory.decodeResource(this.resources,R.drawable.dal_logo)
         val uri = Uri.parse("android.resource://com.mkrdeveloper.imageviewexample/drawable/dal_logo")

        btn.setOnClickListener {

           // img.setImageResource(R.drawable.dal_logo)
             //img.setImageBitmap(bitmap)
           //  img.setImageDrawable(ContextCompat.getDrawable(applicationContext,R.drawable.dal_logo))
             img.setImageURI(uri)
        }
    }
}