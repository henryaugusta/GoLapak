package com.simplify.golapak.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.simplify.golapak.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val vbind by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(vbind.root)

        vbind.root.setOnClickListener {
            startActivity(Intent(this,ContainerAuthActivity::class.java))
        }

    }
}