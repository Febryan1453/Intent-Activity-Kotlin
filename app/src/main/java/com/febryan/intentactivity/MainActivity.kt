package com.febryan.intentactivity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.febryan.intentactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val tag = "SiklusActivity"

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d(tag, "OnCreate")

        binding.btnMove.setOnClickListener {
            val intent = Intent(this@MainActivity, MoveActivity::class.java)
            startActivity(intent)
        }

        binding.btnMoveData.setOnClickListener {
            val intent = Intent(this@MainActivity, MoveDataActivity::class.java)
            intent.putExtra("nama", "Febryan")
            intent.putExtra("umur", "20")
            intent.putExtra("tinggi", "172 cm")
            startActivity(intent)
        }

        binding.btnMoveObject.setOnClickListener {
            val siswa = Siswa("Febryan", 20,'L', "A2",true,171.2)
            val intent = Intent(this@MainActivity, MoveObjectActivity::class.java)
            intent.putExtra("siswa", siswa)
            startActivity(intent)
        }

        binding.btnMoveWithResult.setOnClickListener {
            val intent = Intent(this@MainActivity, MoveResultActivity::class.java)
            startActivityForResult(intent, 100)
        }

        binding.btnMoveToApplication.setOnClickListener {
            val telp = "082191170349"
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:$telp")
            startActivity(intent)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 100){
            if (resultCode == 200){
                val text = data?.getStringExtra("DATA-RESULT")
                binding.tvHasil.text = text
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag, "OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag, "OnResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(tag, "OnRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, "OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag, "OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "OnDestroy")
    }
}