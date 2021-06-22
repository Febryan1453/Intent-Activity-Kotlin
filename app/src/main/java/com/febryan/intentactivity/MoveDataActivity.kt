package com.febryan.intentactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.febryan.intentactivity.databinding.ActivityMoveDataBinding

class MoveDataActivity : AppCompatActivity() {

    lateinit var binding: ActivityMoveDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMoveDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nama = intent.getStringExtra("nama") //misalkan kesalahannya adalah salah key yang di terima
        val umur = intent.getIntExtra("umur", 20) //mengapa nol karena ketika ada kesalahan maka nilai yang tampil adalah value defaultnya
        val tinggi = intent.getDoubleExtra("tinggi", 17.2)

        binding.tvNama.text = nama
        binding.tvUmur.text = umur.toString()
        binding.tvTinggi.text = tinggi.toString()

    }
}