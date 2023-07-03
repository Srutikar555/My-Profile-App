package com.example.srutisprofile

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.net.Uri
import android.view.View



import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openLinkedin(view :View){
        val websiteUrl = "https://www.linkedin.com/in/sruti-smaranika-kar-9a290125b"
        val intent = Intent(Intent.ACTION_VIEW,Uri.parse(websiteUrl))
        startActivity(intent)
    }

    fun openGithub(view :View){
        val websiteUrl = "https://github.com/Srutikar555"
        val intent = Intent(Intent.ACTION_VIEW,Uri.parse(websiteUrl))
        startActivity(intent)
    }

    fun openInstagram(view :View){
        val websiteUrl = "https://instagram.com/_srutikar_?igshid=MzNlNGNkZWQ4Mg"
        val intent = Intent(Intent.ACTION_VIEW,Uri.parse(websiteUrl))
        startActivity(intent)
    }
}