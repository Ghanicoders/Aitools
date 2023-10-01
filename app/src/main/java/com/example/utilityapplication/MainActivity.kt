package com.example.utilityapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.utilityapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //this botton is use for open google tab
        binding.btngoole.setOnClickListener{
            startintent("https://www.google.com")
        }

        // this button is use for incognito mode
        binding.btnincogni.setOnClickListener{
            startintent("https://www.google.com")
        }
        //this button is use for open snapchat
        binding.btnsnap.setOnClickListener {
            startintent("https://www.snapchat.com")
        }

        // this is button is use for open watsapp webpage
        binding.btnwaweb.setOnClickListener {
            startintent("https://www.whatsapp.com")
        }

    }

    private fun startintent(url: String?) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }
}