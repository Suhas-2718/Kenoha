package com.example.kenoha1

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide


class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_background)

        val splashAnimation: ImageView = findViewById(R.id.splash_animation)
        val splashLogo: ImageView = findViewById(R.id.splash_logo)

        Glide.with(this)
            .asGif()
            .load(R.drawable.splash_gif)
            .into(splashAnimation)


        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}
