package com.example.lat2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.MutableLiveData

class MhasiswaViewModel : AppCompatActivity() {
    val nama = MutableLiveData<String>()
    val nim = MutableLiveData<String>()
    val prodi = MutableLiveData<String>()
}