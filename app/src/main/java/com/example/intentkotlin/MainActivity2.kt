package com.example.intentkotlin

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Recoge el Intent que ha iniciado la actividad
        val intent = getIntent()

        // Recoge el valor de tipo int pasado en el Intent
        val numero1 = intent.getIntExtra("numero1", 0)
        val numero2 = intent.getIntExtra("numero2", 0)

        var resultado = numero1 + numero2

        intent.putExtra("suma", resultado.toString());
        Log.d("MENSAJES", "actualizado intent")

        setResult(Activity.RESULT_OK, intent);
        Log.d("MENSAJES", "actualizado resultado")

        // Cierro la activity
        finish()


    }
}
