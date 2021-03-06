package me.dz.mobilemerge.chapter2.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import me.dz.mobilemerge.R

class Chapter2SecondActivity: AppCompatActivity() {

    companion object {
        const val ARG_TEXT = "arg_text"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter_2_second)
        val text = intent.getStringExtra(ARG_TEXT)
        val tv = findViewById<AppCompatTextView>(R.id.activityTv)
        tv.text = text
    }

}