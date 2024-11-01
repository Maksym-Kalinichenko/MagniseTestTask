package com.example.magnisetask.presentation.finance_listings;

import com.example.magnisetask.domain.repository.MagniseRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class FinanceListingsViewModel_Factory implements Factory<FinanceListingsViewModel> {
  private final Provider<MagniseRepository> repositoryProvider;

  public FinanceListingsViewModel_Factory(Provider<MagniseRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public FinanceListingsViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static FinanceListingsViewModel_Factory create(
      Provider<MagniseRepository> repositoryProvider) {
    return new FinanceListingsViewModel_Factory(repositoryProvider);
  }

  public static FinanceListingsViewModel newInstance(MagniseRepository repository) {
    return new FinanceListingsViewModel(repository);
  }
}
