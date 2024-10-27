package com.example.daggerpratice

import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class UserRepositoryModule {

    @ActivityScope
    @Binds
    @MessageQulifier
    abstract fun getSqlRepository(sqLrepository: SQLrepository): UserRepository
}