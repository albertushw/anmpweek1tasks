package com.ubaya.week1_tasks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val nama = "bagus"
    val jumlah = 29
    val tanggal = "agustus 12 2021"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Halo $nama $jumlah", Toast.LENGTH_SHORT).show()
    }
}