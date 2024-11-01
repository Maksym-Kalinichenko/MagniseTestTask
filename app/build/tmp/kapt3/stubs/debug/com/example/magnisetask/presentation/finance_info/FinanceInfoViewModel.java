package com.example.magnisetask.presentation.finance_info;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\tH\u0003J$\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010!\u001a\u00020\"H\u0002J\u0018\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\"H\u0002J\u000e\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\tJ8\u0010(\u001a\u00020&2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000b0*2\u0012\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0,2\u0006\u0010!\u001a\u00020\"H\u0082@\u00a2\u0006\u0002\u0010-R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006."}, d2 = {"Lcom/example/magnisetask/presentation/finance_info/FinanceInfoViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "repository", "Lcom/example/magnisetask/domain/repository/MagniseRepository;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/example/magnisetask/domain/repository/MagniseRepository;)V", "_calendarData", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_dateFlow", "", "calendarData", "Lkotlinx/coroutines/flow/StateFlow;", "getCalendarData", "()Lkotlinx/coroutines/flow/StateFlow;", "dateFlow", "getDateFlow", "<set-?>", "Lcom/example/magnisetask/presentation/finance_info/FinanceInfoState;", "state", "getState", "()Lcom/example/magnisetask/presentation/finance_info/FinanceInfoState;", "setState", "(Lcom/example/magnisetask/presentation/finance_info/FinanceInfoState;)V", "state$delegate", "Landroidx/compose/runtime/MutableState;", "dateFromLong", "timestamp", "editList", "", "Lcom/example/magnisetask/domain/model/FinanceInfoFull;", "result", "format", "Lcom/example/magnisetask/util/TimeFormat;", "makeTime", "utcTimeString", "updateCalendarData", "", "it", "updateData", "data", "", "function", "Lcom/example/magnisetask/util/Resource;", "([Ljava/lang/String;Lcom/example/magnisetask/util/Resource;Lcom/example/magnisetask/util/TimeFormat;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class FinanceInfoViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.magnisetask.domain.repository.MagniseRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState state$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _dateFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> dateFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Long> _calendarData = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Long> calendarData = null;
    
    @javax.inject.Inject()
    public FinanceInfoViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle, @org.jetbrains.annotations.NotNull()
    com.example.magnisetask.domain.repository.MagniseRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.magnisetask.presentation.finance_info.FinanceInfoState getState() {
        return null;
    }
    
    public final void setState(@org.jetbrains.annotations.NotNull()
    com.example.magnisetask.presentation.finance_info.FinanceInfoState p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getDateFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Long> getCalendarData() {
        return null;
    }
    
    private final java.lang.Object updateData(java.lang.String[] data, com.example.magnisetask.util.Resource<java.util.List<com.example.magnisetask.domain.model.FinanceInfoFull>> function, com.example.magnisetask.util.TimeFormat format, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.util.List<com.example.magnisetask.domain.model.FinanceInfoFull> editList(java.util.List<com.example.magnisetask.domain.model.FinanceInfoFull> result, com.example.magnisetask.util.TimeFormat format) {
        return null;
    }
    
    private final java.lang.String makeTime(java.lang.String utcTimeString, com.example.magnisetask.util.TimeFormat format) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"NewApi"})
    private final java.lang.String dateFromLong(long timestamp) {
        return null;
    }
    
    public final void updateCalendarData(long it) {
    }
}