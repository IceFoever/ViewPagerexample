package com.example.viewpager2test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images = listOf(
            R.drawable.maxresdefault,
            R.drawable.thumb
        )

        val adapter = ViewPagerAdapter(images)
        viewPager.adapter = adapter
         viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL
         //viewPager.beginFakeDrag()
         // viewPager.fakeDragBy(-10f)
         // viewPager.endFakeDrag()
    }
       // viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL
       // viewPager.beginFakeDrag()
      //  viewPager.fakeDragBy(-10f)
      //  viewPager.endFakeDrag()

    }