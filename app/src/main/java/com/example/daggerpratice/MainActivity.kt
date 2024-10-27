package com.example.daggerpratice

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService
    @Inject
    lateinit var emailService: EmailService
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val component=(application as UserApplication).userRegistrationComponent
//        component.inject(this)
        val appComponent=(application as UserApplication).appComponent
        val userRegistrationComponent=DaggerUserRegistrationComponent.factory().create(3,appComponent)
        userRegistrationComponent.inject(this)
        userRegistrationService.registerUser("spradhan7656@gmail.com","12345678")

    }
}