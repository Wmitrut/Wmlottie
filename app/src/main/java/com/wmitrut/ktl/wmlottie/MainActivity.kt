package com.wmitrut.ktl.wmlottie

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.view.View
import com.airbnb.lottie.LottieAnimationView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animationView = findViewById<View>(R.id.animation_view) as LottieAnimationView
        val pauseButton = findViewById<View>(R.id.button_pause)
        val stopButton = findViewById<View>(R.id.button_stop)

        pauseButton.setOnClickListener{
            if (animationView.isAnimating()) {
                animationView.pauseAnimation()
                button_pause.setImageResource(R.drawable.play)
            }else {
                animationView.resumeAnimation()
                button_pause.setImageResource(R.drawable.pause)
            }
        }

        stopButton.setOnClickListener{
            animationView.cancelAnimation()
            animationView.setProgress(0F)
            button_pause.setImageResource(R.drawable.play)
        }


    }
}
