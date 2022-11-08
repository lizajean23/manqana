package com.example.manqana

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.ActionBar

class MainActivity : AppCompatActivity() {
    private lateinit var firstDigit : EditText
    private lateinit var secondDigit : EditText
    private lateinit var thirdDigit : EditText
    private lateinit var idNumber : EditText
    private lateinit var phoneNumber: EditText
    private lateinit var button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val actionBar:ActionBar? = supportActionBar
        actionBar?.hide()

        firstDigit = findViewById(R.id.firstDigit)
        secondDigit = findViewById(R.id.secondDigit)
        thirdDigit = findViewById(R.id.thirdDigit)
        idNumber = findViewById(R.id.idNumber)
        phoneNumber = findViewById(R.id.phoneNumber)
        button = findViewById(R.id.button)

    button.setOnClickListener{
        val symbols = "0123456789"
        if(firstDigit.length() != 2 || firstDigit.text.any{it in symbols}){
            firstDigit.error = "შეიყვანეთ სწორი ინფორმაცია"
            return@setOnClickListener

        }
        if (secondDigit.length() != 3  ){
            secondDigit.error = "უნდა შეიცავდეს სამ რიცხვს"


        }
        if(thirdDigit.length() != 2 || thirdDigit.text.any { it in symbols }){
            thirdDigit.error = "შეიყვანეთ სწორი ინფორმაცია"
            return@setOnClickListener
        }
        if(idNumber.length() != 11){
            idNumber.error = "უნდა შეიცავდეს 11 ციფრს"
            return@setOnClickListener

        }
        if(phoneNumber.length() != 9 || !(phoneNumber.text.toString().startsWith("5"))){
            phoneNumber.error = "შეიყვანეთ სწორი ტელეფონის ნომერი"
            return@setOnClickListener
        }
        Toast.makeText(this,"თქვენ წარმატებით შეიტანეთ მონახემები",Toast.LENGTH_LONG).show()

        }
    }

}
