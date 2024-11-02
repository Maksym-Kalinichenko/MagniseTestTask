package com.example.magnisetask.data.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019J@\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u00062\b\b\u0003\u0010\u000b\u001a\u00020\tH\'J\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\u000e\u001a\u00020\u0006H\'JJ\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u0006H\'J@\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0003\u0010\u0014\u001a\u00020\u00062\b\b\u0003\u0010\u0015\u001a\u00020\u00062\b\b\u0003\u0010\u0016\u001a\u00020\u00062\b\b\u0003\u0010\u0017\u001a\u00020\u00062\b\b\u0003\u0010\u0018\u001a\u00020\u0006H\'\u00a8\u0006\u001a"}, d2 = {"Lcom/example/magnisetask/data/remote/MagniseApi;", "", "getFinanceInfo", "Lretrofit2/Call;", "Lcom/example/magnisetask/domain/model/FinanceInfo;", "instrumentId", "", "provider", "interval", "", "periodicity", "barsCount", "getInstruments", "Lcom/example/magnisetask/domain/model/InstrumentsResponse;", "kind", "getOldData", "startDate", "endDate", "getToken", "Lcom/example/magnisetask/domain/model/TokenResponse;", "realm", "client_id", "grantType", "username", "password", "Companion", "app_debug"})
public abstract interface MagniseApi {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REALM = "fintatech";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GRAND_TYPE = "password";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CLIENT_ID = "app-cli";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USERNAME = "r_test@fintatech.com";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PASSWORD = "kisfiz-vUnvy9-sopnyv";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PROVIDER = "oanda";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KIND = "forex";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "https://platform.fintacharts.com";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PERIODICITY_M = "minute";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PERIODICITY_H = "hour";
    public static final int INTERVAL = 1;
    public static final int BARS_COUNT = 10;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WSS_URL = "wss://platform.fintacharts.com/api/streaming/ws/v1/realtime";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.magnisetask.data.remote.MagniseApi.Companion Companion = null;
    
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "/identity/realms/{realm}/protocol/openid-connect/token")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<com.example.magnisetask.domain.model.TokenResponse> getToken(@retrofit2.http.Path(value = "realm")
    @org.jetbrains.annotations.NotNull()
    java.lang.String realm, @retrofit2.http.Field(value = "client_id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String client_id, @retrofit2.http.Field(value = "grant_type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String grantType, @retrofit2.http.Field(value = "username")
    @org.jetbrains.annotations.NotNull()
    java.lang.String username, @retrofit2.http.Field(value = "password")
    @org.jetbrains.annotations.NotNull()
    java.lang.String password);
    
    @retrofit2.http.GET(value = "/api/instruments/v1/instruments")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<com.example.magnisetask.domain.model.InstrumentsResponse> getInstruments(@retrofit2.http.Query(value = "provider")
    @org.jetbrains.annotations.NotNull()
    java.lang.String provider, @retrofit2.http.Query(value = "kind")
    @org.jetbrains.annotations.NotNull()
    java.lang.String kind);
    
    @retrofit2.http.GET(value = "/api/bars/v1/bars/count-back")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<com.example.magnisetask.domain.model.FinanceInfo> getFinanceInfo(@retrofit2.http.Query(value = "instrumentId")
    @org.jetbrains.annotations.NotNull()
    java.lang.String instrumentId, @retrofit2.http.Query(value = "provider")
    @org.jetbrains.annotations.NotNull()
    java.lang.String provider, @retrofit2.http.Query(value = "interval")
    int interval, @retrofit2.http.Query(value = "periodicity")
    @org.jetbrains.annotations.NotNull()
    java.lang.String periodicity, @retrofit2.http.Query(value = "barsCount")
    int barsCount);
    
    @retrofit2.http.GET(value = "/api/bars/v1/bars/date-range")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<com.example.magnisetask.domain.model.FinanceInfo> getOldData(@retrofit2.http.Query(value = "instrumentId")
    @org.jetbrains.annotations.NotNull()
    java.lang.String instrumentId, @retrofit2.http.Query(value = "provider")
    @org.jetbrains.annotations.NotNull()
    java.lang.String provider, @retrofit2.http.Query(value = "interval")
    int interval, @retrofit2.http.Query(value = "periodicity")
    @org.jetbrains.annotations.NotNull()
    java.lang.String periodicity, @retrofit2.http.Query(value = "startDate")
    @org.jetbrains.annotations.NotNull()
    java.lang.String startDate, @retrofit2.http.Query(value = "endDate")
    @org.jetbrains.annotations.NotNull()
    java.lang.String endDate);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/magnisetask/data/remote/MagniseApi$Companion;", "", "()V", "BARS_COUNT", "", "BASE_URL", "", "CLIENT_ID", "GRAND_TYPE", "INTERVAL", "KIND", "PASSWORD", "PERIODICITY_H", "PERIODICITY_M", "PROVIDER", "REALM", "TOKEN", "getTOKEN", "()Ljava/lang/String;", "setTOKEN", "(Ljava/lang/String;)V", "USERNAME", "WSS_URL", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String REALM = "fintatech";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String GRAND_TYPE = "password";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CLIENT_ID = "app-cli";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USERNAME = "r_test@fintatech.com";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PASSWORD = "kisfiz-vUnvy9-sopnyv";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PROVIDER = "oanda";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String KIND = "forex";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String BASE_URL = "https://platform.fintacharts.com";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PERIODICITY_M = "minute";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PERIODICITY_H = "hour";
        public static final int INTERVAL = 1;
        public static final int BARS_COUNT = 10;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WSS_URL = "wss://platform.fintacharts.com/api/streaming/ws/v1/realtime";
        public static java.lang.String TOKEN;
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTOKEN() {
            return null;
        }
        
        public final void setTOKEN(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}