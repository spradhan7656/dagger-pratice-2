package com.example.daggerpratice

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject
import javax.inject.Named

interface NotificationService{
    fun send(to:String,form:String,body:String?)
}

@ActivityScope
class EmailService @Inject constructor(): NotificationService{
    override fun send(to:String, form:String, body:String?) {
        Log.d("Email send", "Sent Email")
    }
}

class MessageService @Inject constructor(private val retryCount:Int): NotificationService{
    override fun send(to: String, form: String, body: String?) {
        Log.d("Message send", "Sent Message-${retryCount}")
    }

}