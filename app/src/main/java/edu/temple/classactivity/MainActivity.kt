package edu.temple.classactivity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var displayTextView : TextView
    lateinit var nameEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        displayTextView = findViewById(R.id.displayTextView)
        nameEditText = findViewById(R.id.nameEditText)

        findViewById<Button>(R.id.clickMeButton).setOnClickListener {
            if (nameEditText.text.isNotEmpty()) {
                displayTextView.text = "Hello, ${nameEditText.text}"
                nameEditText.error = null
            } else {
                nameEditText.error = "Please enter your name!"
                displayTextView.text = ""
            }
        }
    }
}
