package com.febryan.intentactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.febryan.intentactivity.databinding.ActivityMoveResultBinding

class MoveResultActivity : AppCompatActivity() {

    lateinit var binding: ActivityMoveResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMoveResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnKirim.setOnClickListener {
            val data = binding.edtData.text.toString()
            val intent = Intent()
            intent.putExtra("DATA-RESULT", data)
            setResult(200, intent)
            finish()
        }

    }
}