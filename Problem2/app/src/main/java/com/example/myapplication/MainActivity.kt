package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.e
import android.widget.ArrayAdapter
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.Toast



class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val type = intent.getStringExtra("type")
        supportActionBar?.title


    }
    fun startCategoryDetail(type: String) {
        val detailIntent = Intent(this, Catalog::class.java)
        detailIntent.putExtra("TYPE", type)
        startActivity(detailIntent)
    }
    fun onClick(v: View?) {
        when(v?.id) {
            R.id.electronics ->startCategoryDetail(getString(R.string.electronic))
            R.id.clothes ->startCategoryDetail(getString(R.string.clothes))
            R.id.beauty ->startCategoryDetail(getString(R.string.beauty))
            R.id.food ->startCategoryDetail(getString(R.string.food))
            else ->  startCategoryDetail("Please")
        }
    }
}