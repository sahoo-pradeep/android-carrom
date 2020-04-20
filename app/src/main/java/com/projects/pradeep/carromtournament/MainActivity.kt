package com.projects.pradeep.carromtournament

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var carromClickOnce = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun quitButtonClicked(view: View) {
        finish()
    }

    fun carromImageClicked(view: View) {
        if (carromClickOnce) {
            val creditsIntent: Intent = Intent(this, CreditsActivity::class.java)
            startActivity(creditsIntent)
        } else {
            carromClickOnce = true
            Handler().postDelayed(Runnable { carromClickOnce = false }, 500)
        }
    }
}
