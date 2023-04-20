package com.sohel.erplogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        getData()
    }

    fun getData(){
        Toast.makeText(this, "You write new new in kotlin line file", Toast.LENGTH_SHORT).show()
    }
}