package com.simplify.golapak.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.simplify.golapak.R
import com.simplify.golapak.databinding.ActivityContainerAuthBinding

class ContainerAuthActivity : AppCompatActivity() {
    val vbind by lazy { ActivityContainerAuthBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(vbind.root)
        supportActionBar?.hide();
        actionBar?.hide()
        val navController = findNavController(R.id.nav_host_auth)
        setupActionBarWithNavController(navController)


    }
}