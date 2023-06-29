package com.example.projektwsb1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.projektwsb1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun zaloguj(view: View) {

        val login = binding.tbLogin.text.toString();
        val password = binding.tbPassword.text.toString();

        Toast.makeText(this, login+"|"+password, Toast.LENGTH_SHORT)

        if(login.equals("admin") && password.equals("admin")){
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        else{
            Toast.makeText(this, "Zły login/hasło", Toast.LENGTH_SHORT).show()
        }
    }
}