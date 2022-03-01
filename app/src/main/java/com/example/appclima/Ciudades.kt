package com.example.appclima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Ciudades : AppCompatActivity() {

    val TAG = "com.vidamrr.appclima.ciudades.CIUDAD"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudades)

        val bMexico = findViewById<Button>(R.id.bMexico)
        val bBerlin = findViewById<Button>(R.id.bBerlin)
        val bmerida = findViewById<Button>(R.id.bmerida)
        val bcozumel = findViewById<Button>(R.id.bCozumel)

        bMexico.setOnClickListener(View.OnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(TAG, "ciudad-mexico")
            startActivity(intent)
        })
        bBerlin.setOnClickListener(View.OnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(TAG, "ciudad-berlin")
            startActivity(intent)
        })
        bmerida.setOnClickListener(View.OnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(TAG, "ciudad-merida")
            startActivity(intent)
        })
        bcozumel.setOnClickListener(View.OnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(TAG, "ciudad-cozumel")
            startActivity(intent)
        })


    }
}