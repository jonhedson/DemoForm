package br.edu.infnet.demoform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    var name: EditText? = null
    var password: EditText? = null
    var email: EditText? = null
    var dob: EditText? = null
    var phoneno: EditText? = null
    var result: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        name = findViewById<EditText>(R.id.txtName)
        password = findViewById<EditText>(R.id.txtPwd)
        email = findViewById<EditText>(R.id.txtEmai)
        dob = findViewById<EditText>(R.id.txtDate)
        phoneno = findViewById<EditText>(R.id.txtPhone)
        var btnSubmit = findViewById<Button>(R.id.btnSend)
        result = findViewById<TextView>(R.id.resultView)

        btnSubmit.setOnClickListener(View.OnClickListener {
            if (name!!.text.toString().isEmpty() || password!!.text.toString()
                    .isEmpty() || email!!.text.toString().isEmpty() || dob!!.text.toString()
                    .isEmpty()
                || phoneno!!.text.toString().isEmpty()
            ) {
                result!!.text = "Please Fill All the Details"
            } else {
                result!!.text = """Name -  ${name!!.text} 
Password -  ${password!!.text} 
E-Mail -  ${email!!.text} 
DOB -  ${dob!!.text} 
Contact -  ${phoneno!!.text}"""
            }
        })
    }
}