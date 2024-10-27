package com.example.daggerpratice

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticsModule::class])
interface AppComponent  {

    fun getAnalyticsServices():AnalyticsServices
}