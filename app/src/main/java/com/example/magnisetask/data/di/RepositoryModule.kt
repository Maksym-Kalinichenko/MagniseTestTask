package com.example.magnisetask.data.di

import com.example.magnisetask.data.repository.MagniseRepositoryImpl
import com.example.magnisetask.domain.repository.MagniseRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindMagniseRepository(
        magniseRepositoryImpl: MagniseRepositoryImpl
    ): MagniseRepository
}