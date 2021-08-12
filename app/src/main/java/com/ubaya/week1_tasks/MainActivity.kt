package com.ubaya.week1_tasks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val nama = "bagus"
    val jumlah = 29

    val number1 = 2
    val number2 = 4
    val testAngka=21
    val testnama="haii"
    val albet=221
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Halo $nama $jumlah", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "Halo $nama", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "yooooo", Toast.LENGTH_SHORT).show()
        var hasil = number1*number2
        Toast.makeText(this, "Hasil perhitungan adalah $hasil", Toast.LENGTH_LONG).show()
    }
}