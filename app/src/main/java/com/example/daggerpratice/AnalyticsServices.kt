package com.example.daggerpratice

import android.util.Log

interface AnalyticsServices {
    fun trackEvent(event:String,eventType:String)
}
class MixPanel():AnalyticsServices{
    override fun trackEvent(event: String, eventType: String) {
        Log.d("MixPanel","MixPanel $event - $eventType")
    }
}
class FirebaseAnalytics():AnalyticsServices{
    override fun trackEvent(event: String, eventType: String) {
        Log.d("FirebaseAnalytics","FirebaseAnalytics $event - $eventType")
    }
}