package com.example.learningas

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var myButton: Button
    private lateinit var myTextView: TextView
    private lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // chane what the users sees when they first lunch the app

        myButton = findViewById(R.id.myButton)
        myTextView = findViewById(R.id.myTextView)
        editText = findViewById(R.id.editText)
        myButton.text = getString(R.string.button_text)

        myButton.setOnClickListener {
            if (editText.text.toString().isNotEmpty()) {
                val input = editText.text.toString() //input from editText
                myTextView.visibility = View.VISIBLE
                myTextView.text = input
            } else {
                myTextView.text = "ur input is empty"
            }
        }

//            playing with user input
//            myButton.setOnClickListener {
//                if (editText.text.toString().isNotEmpty()) {
//                    val input = Integer.parseInt(editText.text.toString()) //input from editText
//                    myTextView.visibility = View.VISIBLE
//                    var calculations = input * 2
//                    myTextView.text = calculations.toString()
//                } else {
//                    myTextView.text = "ur input is empty"
//                }
//
//
//            } // this will listen for views


//        Handle Clicks

//    fun showMessage(view:View) { // the name of the function is allready added in the attribute of the button called onclick so when clicked it calls  this method
//        myTextView.visibility = View.VISIBLE // and then i perform the action i want
//        myTextView.visibility = View.VISIBLE // and then i perform the action i want
//        myTextView.text = "Hello Israel"
//
//// another way to handle clicks //lamdals and it has to be done in the oncreate function so i will move the lamdals there
//
//    }

        // ediText -> to like collect input from the user

        // get the text from the edit text

    }
}
