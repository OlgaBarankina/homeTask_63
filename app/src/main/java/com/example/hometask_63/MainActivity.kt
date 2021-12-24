package com.example.hometask_63

import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        ivsunshine.setOnClickListener{


            ivcloud1.animate()
                .translationX(-400F).duration = 5000
            ivcloud3.animate()
                .translationX(-500F).duration = 5000
            ivcloud5.animate()
                .translationX(-300F).duration = 5000
            ivcloud2.animate()
                .translationX(300F).duration = 5000
            ivcloud4.animate()
                .translationX(500F).duration = 5000
            ivsun.animate()
                .translationY(1200F).duration = 9000
            ivsunshine.animate()
                .translationY(1200F).duration = 9000

            ivsky.background.setColorFilter(Color.parseColor("#FF211A2B"), PorterDuff.Mode.SRC_ATOP)

        }







   }
}