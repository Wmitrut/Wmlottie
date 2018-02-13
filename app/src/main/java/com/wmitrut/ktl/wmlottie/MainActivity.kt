package com.wmitrut.ktl.wmlottie

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.airbnb.lottie.LottieAnimationView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animationView = findViewById<View>(R.id.animation_view) as LottieAnimationView;
        val pauseButton = findViewById<View>(R.id.button_pause);

        pauseButton.setOnClickListener(){
            if (animationView.isAnimating()) {
                animationView.pauseAnimation();
                button_pause.setImageResource(R.drawable.play)
            }else {
                animationView.resumeAnimation();
                button_pause.setImageResource(R.drawable.pause)
            }
        }

    }
}
