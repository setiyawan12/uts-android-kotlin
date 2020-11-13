package com.setiyawan.uts_android_kotlin.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.setiyawan.uts_android_kotlin.MainActivity
import com.setiyawan.uts_android_kotlin.R
import kotlinx.android.synthetic.main.activity_setiyawan.*

class SetiyawanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setiyawan)
        back.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}