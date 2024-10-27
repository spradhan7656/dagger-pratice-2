package com.example.daggerpratice

import dagger.BindsInstance
import dagger.Component


@ActivityScope
@Component(dependencies = [AppComponent::class], modules = [UserRepositoryModule::class,NotificationModule::class])
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance retryCount:Int,appComponent: AppComponent): UserRegistrationComponent
    }
}
/**
 * the dependensicies =[] will dependable objects created that we need to do something
 */