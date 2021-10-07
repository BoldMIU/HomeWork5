package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
<<<<<<< HEAD
import android.view.View
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AlertDialog
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    var point = 0
    val date = SimpleDateFormat("dd/M/yyyy hh:mm:ss")
    val currentDate = date.format(Date())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Quiz application"

    }

    fun checkQuiz(view: View) {
        point = 0
        val radioOne = findViewById<RadioButton>(R.id.ans1)
        if (radioOne.isChecked()) {
            point += 50
        }
        val checkTwo = findViewById<CheckBox>(R.id.checkBox)
        if (checkTwo.isChecked) {
            point += 25
        }
        val checkFour = findViewById<CheckBox>(R.id.checkBox2)
        if (checkFour.isChecked) {
            point += 25
        }
        val alertDialog = AlertDialog.Builder(this@MainActivity).create()
        alertDialog.setTitle("Result")
        alertDialog.setMessage ("Total score: " + point + " " + "Submission date: " + currentDate)
        alertDialog.setButton(
            AlertDialog.BUTTON_POSITIVE,
            "OK"
        ) { dialog, which -> dialog.dismiss() }
        alertDialog.show()
    }

    fun resetQuiz(view: View) {
        findViewById<RadioGroup>(R.id.radio).clearCheck()
        findViewById<CheckBox>(R.id.ans1).setChecked(false)
        findViewById<CheckBox>(R.id.ans2).setChecked(false)
        findViewById<CheckBox>(R.id.ans3).setChecked(false)


    }


=======

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
>>>>>>> 9cefeb3cb9c9aa493a03ddac27eb80ddcf45fc90
}