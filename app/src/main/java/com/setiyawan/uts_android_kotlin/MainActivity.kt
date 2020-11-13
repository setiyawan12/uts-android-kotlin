package com.setiyawan.uts_android_kotlin

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.setiyawan.uts_android_kotlin.helper.Constant
import com.setiyawan.uts_android_kotlin.helper.PrefHelper
import com.setiyawan.uts_android_kotlin.profile.SetiyawanActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var prefHelper: PrefHelper
    private lateinit var greetTextView: TextView
    private lateinit var greetImageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        prefHelper = PrefHelper(this)
        textUsername.text = prefHelper.getString( Constant.PREF_USERNAME )
        Logout.setOnClickListener {
            prefHelper.clear()
            showMessage( "Keluar" )
            moveIntent()
        }
        berita.setOnClickListener {
            startActivity(Intent(this,BeritaActivity::class.java))
        }
        kalkulator.setOnClickListener {
            startActivity(Intent(this,KalkulatorActivity::class.java))
        }

        profile.setOnClickListener {
            startActivity(Intent(this, SetiyawanActivity::class.java))
        }
        greetTextView = findViewById(R.id.greetText)
        greetImageView = findViewById(R.id.greetImg)
        greeting()
    }
    private fun moveIntent(){
        startActivity(Intent(this, LoginActivity::class.java))
    }
    private fun showMessage(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }
    private fun greeting() {
        val calendar = Calendar.getInstance()
        val timeOfDay = calendar[Calendar.HOUR_OF_DAY]
        if (timeOfDay >= 0 && timeOfDay < 12) {
            greetTextView.setText("Selamat Pagi")
            greetTextView.setTextColor(Color.GRAY)
            greetImageView.setImageResource(R.drawable.greet1)
        } else if (timeOfDay >= 12 && timeOfDay < 15) {
            greetTextView.setText("Selamat Siang")
            greetTextView.setTextColor(Color.GRAY)
            greetImageView.setImageResource(R.drawable.greet1)
        } else if (timeOfDay >= 15 && timeOfDay < 18) {
            greetTextView.setText("Selamat Sore")
            greetTextView.setTextColor(Color.GRAY)
            greetImageView.setImageResource(R.drawable.greet1)
        } else if (timeOfDay >= 18 && timeOfDay < 24) {
            greetTextView.setText("Selamat Malam")
            greetTextView.setTextColor(Color.GRAY)
            greetImageView.setImageResource(R.drawable.greet1
            )
        }
    }

}