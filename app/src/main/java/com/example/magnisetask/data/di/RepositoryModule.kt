package com.example.magnisetask.data.di

import com.example.magnisetask.data.repository.MagniseRepositoryImpl
import com.example.magnisetask.domain.repository.MagniseRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun provideMagniseRepository(): MagniseRepository {
        return MagniseRepositoryImpl()
    }
}