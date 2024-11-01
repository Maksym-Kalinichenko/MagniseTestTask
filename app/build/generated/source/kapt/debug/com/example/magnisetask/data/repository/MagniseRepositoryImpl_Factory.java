package com.example.magnisetask.data.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class MagniseRepositoryImpl_Factory implements Factory<MagniseRepositoryImpl> {
  @Override
  public MagniseRepositoryImpl get() {
    return newInstance();
  }

  public static MagniseRepositoryImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static MagniseRepositoryImpl newInstance() {
    return new MagniseRepositoryImpl();
  }

  private static final class InstanceHolder {
    private static final MagniseRepositoryImpl_Factory INSTANCE = new MagniseRepositoryImpl_Factory();
  }
}
