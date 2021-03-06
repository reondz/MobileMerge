package me.dz.mobilemerge.chapter2.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import me.dz.mobilemerge.R
import me.dz.mobilemerge.chapter2.fragment.Chapter2Fragment

class Chapter2Activity: AppCompatActivity() {

    companion object {
        const val TAG = "Chapter2Activity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "onCreate")
        setContentView(R.layout.activity_chapter_2)
        initView()
    }

    private fun initView() {
        val intentBtn = findViewById<AppCompatTextView>(R.id.intentBtn)
        val fragmentBtn = findViewById<AppCompatTextView>(R.id.intentBtn)

        intentBtn.setOnClickListener {
            testIntent()
        }

        fragmentBtn.setOnClickListener {
            testFragment()
        }

    }

    private fun testIntent() {
        val intent = Intent(this, Chapter2SecondActivity::class.java)
        intent.putExtra(Chapter2SecondActivity.ARG_TEXT, "Test Activity")
        startActivity(intent)
    }

    private fun testFragment() {
        val fragment = Chapter2Fragment.newInstance("Test Fragment")
        supportFragmentManager.beginTransaction()
            .add(R.id.container, fragment)
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy")
    }

}