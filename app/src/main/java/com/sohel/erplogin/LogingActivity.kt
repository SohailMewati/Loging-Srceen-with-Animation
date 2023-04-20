package com.sohel.erplogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.*
import androidx.cardview.widget.CardView

class LogingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loging)

        // val fade_in:View = findViewById(R.anim.fade_in)
        // val bottom_down: View = findViewById(R.anim.bottom_down)
        val topLinearLayout = findViewById<LinearLayout>(R.id.top_linearLayout)
        val textView = findViewById<TextView>(R.id.txtView)
        val cardView = findViewById<CardView>(R.id.cardView)
        val cardView1 = findViewById<CardView>(R.id.cardView1)

        val user: EditText = findViewById(R.id.etUserName)
        val userPassword: EditText = findViewById(R.id.etPassword)

        val btnLogin = findViewById<Button>(R.id.btnLogin)

        val fade_in = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        val bottom_down = AnimationUtils.loadAnimation(this, R.anim.bottom_down)
        val bottom_up = AnimationUtils.loadAnimation(this, R.anim.bottom_up)

        topLinearLayout.animation = bottom_down
        textView.animation = fade_in
        cardView.animation = bottom_down
        cardView1.animation = bottom_down
        btnLogin.animation = fade_in

        btnLogin.setOnClickListener {
            val userName = user.text.toString()
            val password = userPassword.text.toString()

            if (userName.isEmpty()) {

                Toast.makeText(this, "Invalid user name", Toast.LENGTH_LONG).show()

            } else if (password.isEmpty()) {

                Toast.makeText(this, "Invalid password", Toast.LENGTH_LONG).show()

            } else if (password.length <= 5) {

                Toast.makeText(this, "Password should be greater than 5 ", Toast.LENGTH_LONG).show()

            } else {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }
        }

    }
}