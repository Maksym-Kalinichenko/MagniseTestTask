package com.example.magnisetask.presentation.finance_info;

import androidx.lifecycle.SavedStateHandle;
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
public final class FinanceInfoViewModel_Factory implements Factory<FinanceInfoViewModel> {
  private final Provider<SavedStateHandle> savedStateHandleProvider;

  private final Provider<MagniseRepository> repositoryProvider;

  public FinanceInfoViewModel_Factory(Provider<SavedStateHandle> savedStateHandleProvider,
      Provider<MagniseRepository> repositoryProvider) {
    this.savedStateHandleProvider = savedStateHandleProvider;
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public FinanceInfoViewModel get() {
    return newInstance(savedStateHandleProvider.get(), repositoryProvider.get());
  }

  public static FinanceInfoViewModel_Factory create(
      Provider<SavedStateHandle> savedStateHandleProvider,
      Provider<MagniseRepository> repositoryProvider) {
    return new FinanceInfoViewModel_Factory(savedStateHandleProvider, repositoryProvider);
  }

  public static FinanceInfoViewModel newInstance(SavedStateHandle savedStateHandle,
      MagniseRepository repository) {
    return new FinanceInfoViewModel(savedStateHandle, repository);
  }
}
