package com.example.RecyclerView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.RecyclerView.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val data = ArrayList<Data>()
        for (i in 1..100){
            data.add(Data(R.drawable.ic_launcher_foreground, "Hamza$i"))

        }
        val adaptor = Adaptor(data)
        binding.recyclerView.adapter = adaptor





    }
}