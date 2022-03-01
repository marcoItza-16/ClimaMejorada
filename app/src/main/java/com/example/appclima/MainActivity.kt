package com.example.appclima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var tvCiudad:TextView? =null
    var tvGrados:TextView? = null
    var tvEstatus:TextView? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvCiudad = findViewById(R.id.tvCiudad)
        tvGrados = findViewById(R.id.tvGrados)
        tvEstatus = findViewById(R.id.tvEstatus)

        val ciudad = intent.getStringExtra("com.vidamrr.appclima.ciudades.CIUDAD")

        Toast.makeText(this,ciudad,Toast.LENGTH_SHORT).show()
        val ciudadmx=Ciudad("Ciudad de México", 28,"Soleado")
        val ciudadBerlin = Ciudad("Berlín",27,"Cielo despejado")
        val ciudadMerida = Ciudad("Merida",35," Soleado")
        val ciudadCozumel = Ciudad("Cozumel",28,"Mayormente nublado")

        when(ciudad){
            "ciudad-mexico" -> {tvCiudad?.text=ciudadmx.nombre
                tvGrados?.text=ciudadmx.grados.toString()+"°"
                tvEstatus?.text=ciudadmx.estatus}
            "ciudad-berlin" -> {
                tvCiudad?.text=ciudadBerlin.nombre
                tvGrados?.text=ciudadBerlin.grados.toString()+"°"
                tvEstatus?.text=ciudadBerlin.estatus}
            "ciudad-merida" -> {
                tvCiudad?.text=ciudadMerida.nombre
                tvGrados?.text=ciudadMerida.grados.toString()+"°"
                tvEstatus?.text=ciudadMerida.estatus}
            "ciudad-cozumel" -> {
                tvCiudad?.text=ciudadCozumel.nombre
                tvGrados?.text=ciudadCozumel.grados.toString()+"°"
                tvEstatus?.text=ciudadCozumel.estatus}


            else -> Toast.makeText(this,"No se encuentra la información", Toast.LENGTH_SHORT).show()
        }
    }
}