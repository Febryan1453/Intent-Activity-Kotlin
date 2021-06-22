package com.febryan.intentactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.febryan.intentactivity.databinding.ActivityMoveObjectBinding


class MoveObjectActivity : AppCompatActivity() {

    lateinit var binding : ActivityMoveObjectBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMoveObjectBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Tangkap data dengan key
        val siswa = intent.getParcelableExtra<Siswa>("siswa")
        if (siswa != null){
            binding.tvNama.text = siswa.nama
            binding.tvUmur.text = siswa.umur.toString()
            binding.tvGender.text = siswa.gender.toString()
            binding.tvKelas.text = siswa.kelas
            binding.tvLulus.text = if (siswa.lulus) "Lulus" else "Belum Lulus"
            binding.tvTinggi.text = siswa.tinggiBadan.toString()
        }

    }
}