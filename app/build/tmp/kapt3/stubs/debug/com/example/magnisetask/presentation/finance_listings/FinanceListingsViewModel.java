package com.example.magnisetask.presentation.finance_listings;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lcom/example/magnisetask/presentation/finance_listings/FinanceListingsViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/magnisetask/domain/repository/MagniseRepository;", "(Lcom/example/magnisetask/domain/repository/MagniseRepository;)V", "<set-?>", "Lcom/example/magnisetask/presentation/finance_listings/FinanceListingsState;", "state", "getState", "()Lcom/example/magnisetask/presentation/finance_listings/FinanceListingsState;", "setState", "(Lcom/example/magnisetask/presentation/finance_listings/FinanceListingsState;)V", "state$delegate", "Landroidx/compose/runtime/MutableState;", "getCompanyListings", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class FinanceListingsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.magnisetask.domain.repository.MagniseRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState state$delegate = null;
    
    @javax.inject.Inject()
    public FinanceListingsViewModel(@org.jetbrains.annotations.NotNull()
    com.example.magnisetask.domain.repository.MagniseRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.magnisetask.presentation.finance_listings.FinanceListingsState getState() {
        return null;
    }
    
    public final void setState(@org.jetbrains.annotations.NotNull()
    com.example.magnisetask.presentation.finance_listings.FinanceListingsState p0) {
    }
    
    private final void getCompanyListings() {
    }
}