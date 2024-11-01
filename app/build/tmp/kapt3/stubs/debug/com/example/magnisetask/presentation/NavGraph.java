package com.example.magnisetask.presentation;

/**
 * Realization of [NavGraphSpec] for the app.
 * It uses [TypedDestination] instead of [DestinationSpec].
 *
 * @see [NavGraphSpec]
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0002\b\u00030\u0005j\u0002`\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u00030\u0005j\u0002`\u00060\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\b\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0002\b\u00030\u0005j\u0002`\u0006H\u00c6\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u00030\u0005j\u0002`\u00060\bH\u00c6\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\bH\u00c6\u0003JM\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0002\b\u00030\u0005j\u0002`\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u00030\u0005j\u0002`\u00060\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\bH\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001R\u001f\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u00030\u0005j\u0002`\u00060\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR(\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0002\b\u00030\u0005j\u0002`\u00060\u000eX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\n\u0012\u0002\b\u00030\u0005j\u0002`\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\""}, d2 = {"Lcom/example/magnisetask/presentation/NavGraph;", "Lcom/ramcosta/composedestinations/spec/NavGraphSpec;", "route", "", "startDestination", "Lcom/example/magnisetask/presentation/destinations/TypedDestination;", "Lcom/example/magnisetask/presentation/destinations/Destination;", "destinations", "", "nestedNavGraphs", "(Ljava/lang/String;Lcom/example/magnisetask/presentation/destinations/TypedDestination;Ljava/util/List;Ljava/util/List;)V", "getDestinations", "()Ljava/util/List;", "destinationsByRoute", "", "getDestinationsByRoute", "()Ljava/util/Map;", "getNestedNavGraphs", "getRoute", "()Ljava/lang/String;", "getStartDestination", "()Lcom/example/magnisetask/presentation/destinations/TypedDestination;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
public final class NavGraph implements com.ramcosta.composedestinations.spec.NavGraphSpec {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String route = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.magnisetask.presentation.destinations.TypedDestination<?> startDestination = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.magnisetask.presentation.destinations.TypedDestination<?>> destinations = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.magnisetask.presentation.NavGraph> nestedNavGraphs = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, com.example.magnisetask.presentation.destinations.TypedDestination<?>> destinationsByRoute = null;
    
    public NavGraph(@org.jetbrains.annotations.NotNull()
    java.lang.String route, @org.jetbrains.annotations.NotNull()
    com.example.magnisetask.presentation.destinations.TypedDestination<?> startDestination, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.example.magnisetask.presentation.destinations.TypedDestination<?>> destinations, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.magnisetask.presentation.NavGraph> nestedNavGraphs) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getRoute() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.example.magnisetask.presentation.destinations.TypedDestination<?> getStartDestination() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.magnisetask.presentation.destinations.TypedDestination<?>> getDestinations() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.example.magnisetask.presentation.NavGraph> getNestedNavGraphs() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.Map<java.lang.String, com.example.magnisetask.presentation.destinations.TypedDestination<?>> getDestinationsByRoute() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.magnisetask.presentation.destinations.TypedDestination<?> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.magnisetask.presentation.destinations.TypedDestination<?>> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.magnisetask.presentation.NavGraph> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.magnisetask.presentation.NavGraph copy(@org.jetbrains.annotations.NotNull()
    java.lang.String route, @org.jetbrains.annotations.NotNull()
    com.example.magnisetask.presentation.destinations.TypedDestination<?> startDestination, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.example.magnisetask.presentation.destinations.TypedDestination<?>> destinations, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.magnisetask.presentation.NavGraph> nestedNavGraphs) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}