package com.tecnodeinternet.myfirstandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameInput = findViewById<EditText>(R.id.name)
        val ageInput = findViewById<EditText>(R.id.age)
        val error= R.string.form_instruction
        val buttonGet = findViewById<Button>(R.id.buttonGet)

        buttonGet.setOnClickListener{
            if (nameInput.text.isEmpty() or ageInput.text.isEmpty()) {
                Toast.makeText(this, error, Toast.LENGTH_LONG).show()
                return@setOnClickListener
            } else {
                val age: Int= ageInput.text.toString().toInt()
                if(age<10){
                    var tens= (age*7)/10
                    var units= (age*7)%10
                    var luckyNumber= tens+units
                    if (luckyNumber>9){
                        do{
                            tens= luckyNumber/10
                            units= luckyNumber%10
                            luckyNumber=tens+units
                        }while (luckyNumber>9)
                        val message= "Welcome ${nameInput.text}, your lucky number is: $luckyNumber"
                        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
                    }else{
                        val message= "Welcome ${nameInput.text}, your lucky number is: $luckyNumber"
                        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
                    }
                }else{
                    var tens= age/10
                    var units= age%10
                    var luckyNumber= tens+units
                    if (luckyNumber>9){
                        do {
                            tens= luckyNumber/10
                            units= luckyNumber%10
                            luckyNumber=tens+units
                        }while (luckyNumber>9)
                        val message= "Welcome ${nameInput.text}, your lucky number is: $luckyNumber"
                        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
                    }else{
                        val message= "Welcome ${nameInput.text}, your lucky number is: $luckyNumber"
                        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
                    }
                }
                }
            }
        }

}