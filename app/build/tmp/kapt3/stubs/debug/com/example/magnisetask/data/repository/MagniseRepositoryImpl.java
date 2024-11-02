package com.example.magnisetask.data.repository;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0082@\u00a2\u0006\u0002\u0010\u000fJ\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013H\u0082@\u00a2\u0006\u0002\u0010\u0014J\"\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0096@\u00a2\u0006\u0002\u0010\u001bJ \u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00170\u00160\u001dH\u0096@\u00a2\u0006\u0002\u0010\u000fJ2\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u001aH\u0096@\u00a2\u0006\u0002\u0010\"J\u0010\u0010#\u001a\u0004\u0018\u00010$H\u0082@\u00a2\u0006\u0002\u0010\u000fJ\u0018\u0010%\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\'H\u0016J\u000e\u0010(\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/example/magnisetask/data/repository/MagniseRepositoryImpl;", "Lcom/example/magnisetask/domain/repository/MagniseRepository;", "()V", "okHttpClient", "Lokhttp3/OkHttpClient;", "retrofit", "Lretrofit2/Retrofit;", "kotlin.jvm.PlatformType", "retrofitAuth", "webSocket", "Lokhttp3/WebSocket;", "closeWebSocket", "", "getDataAsync", "Lcom/example/magnisetask/domain/model/InstrumentsResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFinanceAsync", "Lcom/example/magnisetask/domain/model/FinanceInfo;", "authService", "Lretrofit2/Call;", "(Lretrofit2/Call;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFinanceInfo", "Lcom/example/magnisetask/util/Resource;", "", "Lcom/example/magnisetask/domain/model/FinanceInfoFull;", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFinanceListings", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/magnisetask/domain/model/Instrument;", "getOldData", "startDate", "endDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTokenAsync", "Lcom/example/magnisetask/domain/model/TokenResponse;", "realTimeWebSocket", "socketListener", "Lcom/example/magnisetask/data/remote/SocketListener;", "sendEvent", "app_debug"})
public final class MagniseRepositoryImpl implements com.example.magnisetask.domain.repository.MagniseRepository {
    private okhttp3.WebSocket webSocket;
    private final retrofit2.Retrofit retrofit = null;
    @org.jetbrains.annotations.NotNull()
    private final okhttp3.OkHttpClient okHttpClient = null;
    private final retrofit2.Retrofit retrofitAuth = null;
    
    @javax.inject.Inject()
    public MagniseRepositoryImpl() {
        super();
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
    private final java.lang.Object getTokenAsync(kotlin.coroutines.Continuation<? super com.example.magnisetask.domain.model.TokenResponse> $completion) {
        return null;
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
    private final java.lang.Object getDataAsync(kotlin.coroutines.Continuation<? super com.example.magnisetask.domain.model.InstrumentsResponse> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getFinanceListings(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.magnisetask.util.Resource<java.util.List<com.example.magnisetask.domain.model.Instrument>>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getFinanceInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.magnisetask.util.Resource<java.util.List<com.example.magnisetask.domain.model.FinanceInfoFull>>> $completion) {
        return null;
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
    private final java.lang.Object getFinanceAsync(retrofit2.Call<com.example.magnisetask.domain.model.FinanceInfo> authService, kotlin.coroutines.Continuation<? super com.example.magnisetask.domain.model.FinanceInfo> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getOldData(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String startDate, @org.jetbrains.annotations.NotNull()
    java.lang.String endDate, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.magnisetask.util.Resource<java.util.List<com.example.magnisetask.domain.model.FinanceInfoFull>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    public void realTimeWebSocket(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    com.example.magnisetask.data.remote.SocketListener socketListener) {
    }
    
    @java.lang.Override()
    public void closeWebSocket() {
    }
    
    public final void sendEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
}