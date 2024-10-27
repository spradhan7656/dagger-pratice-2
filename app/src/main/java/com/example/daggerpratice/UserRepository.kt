package com.example.daggerpratice

import android.nfc.Tag
import android.util.Log
import javax.inject.Inject


/**
 * in the dagger create object
 *
 */
interface UserRepository{
    fun saveUser(email: String, password: String)
}

@ActivityScope
class SQLrepository @Inject constructor(val analyticsServices: AnalyticsServices): UserRepository {
    override fun saveUser(email:String, password:String){
        Log.d("Save user","Save user in DB")
        analyticsServices.trackEvent("saveUser","CREATE")
    }
}
class FirebaseUserRepository @Inject constructor(val analyticsServices: AnalyticsServices): UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d("saveUser","Save user in Firebase")
        analyticsServices.trackEvent("saveUser","CREATE")
    }
}

/**
 * the analytics service will help the tracking the event when fun create and implement on the compoment
 */