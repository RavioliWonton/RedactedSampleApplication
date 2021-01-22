package com.example.redactedsampleapplication

import androidx.appcompat.app.AppCompatActivity
import com.example.redactedsampleapplication.databinding.ActivityMainBinding

class MainActivity: AppCompatActivity(R.layout.activity_main) {
    override fun onStart() {
        super.onStart()
        ActivityMainBinding.bind(window.decorView.rootView).text.text =
            SampleBean(1, "John", "secret").redacted
    }
}