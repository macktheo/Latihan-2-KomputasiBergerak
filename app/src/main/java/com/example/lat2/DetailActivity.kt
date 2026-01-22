package com.example.lat2

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvNama = findViewById<TextView>(R.id.tvNama)
        val tvNim = findViewById<TextView>(R.id.tvNim)
        val tvProdi = findViewById<TextView>(R.id.tvProdi)

        val nama = intent.getStringExtra("NAMA")
        val nim = intent.getStringExtra("NIM")
        val prodi = intent.getStringExtra("PRODI")

        tvNama.text = "Nama : $nama"
        tvNim.text = "NIM : $nim"
        tvProdi.text = "Prodi : $prodi"
    }
}