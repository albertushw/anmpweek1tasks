package com.ubaya.week1_tasks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val nama = "bagus"
    val jumlah = 29
    val tanggal1 = "agustus 12 2020"
    val tanggal2 = "agustus 12 2021"

    val number1 = 2
    val number2 = 4
    val testAngka=21
    val testnama="haii"
    val albet=221

    val number3 = 2
    val number4 = 4

    var feat = "hello"
    var ures = "myname"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Halo $nama $jumlah", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "Halo $nama", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "yooooo", Toast.LENGTH_SHORT).show()
        var hasil = number1*number2
        Toast.makeText(this, "Hasil perhitungan adalah $hasil", Toast.LENGTH_LONG).show()

        while(feat!=ures){
            ures = feat
        }

        if (hasil=20){
            feat="berhasil"
        }
    }
}