package com.example.lat2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.jvm.java

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNama = findViewById<EditText>(R.id.etNama)
        val etNim = findViewById<EditText>(R.id.etNim)
        val etProdi = findViewById<EditText>(R.id.etProdi)
        val btnKirim = findViewById<Button>(R.id.btnKirim)

        btnKirim.setOnClickListener {
            val nama = etNama.text.toString()
            val nim = etNim.text.toString()
            val prodi = etProdi.text.toString()

            val intent = Intent(this, DetailActivity::class.java).apply {
                putExtra("NAMA", nama)
                putExtra("NIM", nim)
                putExtra("PRODI", prodi)
            }
            startActivity(intent)
        }
    }
}