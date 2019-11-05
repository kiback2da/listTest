package com.example.listtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val testListValue = listOf("ListTest1","ListTest2","ListTest3")

        mainListView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, testListValue)

        mainListView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this,"${testListValue[position]} and ${id}",Toast.LENGTH_SHORT).show()

        }
    }
}
