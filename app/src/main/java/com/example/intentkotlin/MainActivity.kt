package com.example.intentkotlin

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // definir el requestCode
    val RESULTADO_UNO=1
    val RESULTADO_DOS=2
    val RESULTADO_TRES=3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val gosecond = findViewById<Button>(R.id.button)

        gosecond.setOnClickListener{
            // Crea un Intent para iniciar la segunda actividad
            val intent = Intent(this, MainActivity2::class.java)

            // Añade números al Intent
            intent.putExtra("numero1", 3)
            intent.putExtra("numero2", 2)

            // Inicia la primera actividad
            startActivityForResult(intent, RESULTADO_UNO)

            // Añade números al Intent
            intent.putExtra("numero1", 4)
            intent.putExtra("numero2", 4)

            // Inicia la segunda actividad
            startActivityForResult(intent, RESULTADO_DOS)

            // Añade números al Intent
            intent.putExtra("numero1", 7)
            intent.putExtra("numero2", 8)

            // Inicia la tercera actividad
            startActivityForResult(intent, RESULTADO_TRES)

        }

    }

    @Deprecated("Deprecated in Java")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        val resultado1 = findViewById<TextView>(R.id.resultado1)
        val resultado2 = findViewById<TextView>(R.id.resultado2)
        val resultado3 = findViewById<TextView>(R.id.resultado3)

        // Comprobamos que el resultado es Ok y que el intent no venga vacío
        if(resultCode != Activity.RESULT_OK || data==null) return
        when(requestCode) {
            RESULTADO_UNO -> resultado1.text = data.getStringExtra("suma")
            RESULTADO_DOS -> resultado2.text = data.getStringExtra("suma")
            RESULTADO_TRES -> resultado3.text = data.getStringExtra("suma")

            // Other result codes
            else -> {}


        }
    }
}