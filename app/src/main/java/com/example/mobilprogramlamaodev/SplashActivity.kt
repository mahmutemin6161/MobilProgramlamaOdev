package com.example.mobilprogramlamaodev

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible

class SplashActivity:AppCompatActivity() {

    private lateinit var resim:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        resim = findViewById(R.id.girisResim) as ImageView
        resim.isVisible = false
        resimGoster()

    }



    private fun netKontrol()
    {
        if (UiHelper.hasInternetConnection(this)) {

            val t = Toast.makeText(this, "İnternet Var", Toast.LENGTH_LONG)
            t.show()
            anaEkranAc()

        } else {
            val t2 = Toast.makeText(this, "İnternet Yok", Toast.LENGTH_LONG)
            t2.show()
            finish()
        }
    }

    private fun resimGoster()
    {
        Handler().postDelayed({
            resim.isVisible = true

            netKontrol()
        }, 1000)
    }

    private fun anaEkranAc()
    {
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))

        }, 3000)
    }

}