package com.example.daggerpratice

import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class NotificationModule() {

    /**
     * if want pass the parementer the services module is the retry count
     */

    /**
     * if you want to create the user based on the object use the @Named("pass_value") annotation
     */
    @ActivityScope
    @MessageQulifier
    @Provides
    fun getMessageService(retryCount:Int):NotificationService{
        return MessageService(retryCount)
    }
    @Named("email")
    @Provides
    fun getEmailService():NotificationService{
        return EmailService()
    }

}