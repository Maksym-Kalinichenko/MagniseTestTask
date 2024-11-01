package com.example.magnisetask.presentation.destinations;

/**
 * Interface for all TypedDestination with no navigation arguments
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016\u0082\u0001\u0001\t\u00a8\u0006\n"}, d2 = {"Lcom/example/magnisetask/presentation/destinations/DirectionDestination;", "Lcom/example/magnisetask/presentation/destinations/TypedDestination;", "", "Lcom/ramcosta/composedestinations/spec/Direction;", "argsFrom", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "navBackStackEntry", "Landroidx/navigation/NavBackStackEntry;", "Lcom/example/magnisetask/presentation/destinations/FinanceListingsScreenDestination;", "app_debug"})
public abstract interface DirectionDestination extends com.example.magnisetask.presentation.destinations.TypedDestination<kotlin.Unit>, com.ramcosta.composedestinations.spec.Direction {
    
    @java.lang.Override()
    public abstract void argsFrom(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavBackStackEntry navBackStackEntry);
    
    @java.lang.Override()
    public abstract void argsFrom(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle);
    
    /**
     * Interface for all TypedDestination with no navigation arguments
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        /**
         * Interface for all TypedDestination with no navigation arguments
         */
        @org.jetbrains.annotations.NotNull()
        public static java.util.List<androidx.navigation.NamedNavArgument> getArguments(@org.jetbrains.annotations.NotNull()
        com.example.magnisetask.presentation.destinations.DirectionDestination $this) {
            return null;
        }
        
        /**
         * Interface for all TypedDestination with no navigation arguments
         */
        @org.jetbrains.annotations.NotNull()
        public static java.util.List<androidx.navigation.NavDeepLink> getDeepLinks(@org.jetbrains.annotations.NotNull()
        com.example.magnisetask.presentation.destinations.DirectionDestination $this) {
            return null;
        }
        
        /**
         * Interface for all TypedDestination with no navigation arguments
         */
        @org.jetbrains.annotations.NotNull()
        public static com.ramcosta.composedestinations.spec.DestinationStyle getStyle(@org.jetbrains.annotations.NotNull()
        com.example.magnisetask.presentation.destinations.DirectionDestination $this) {
            return null;
        }
        
        public static void argsFrom(@org.jetbrains.annotations.NotNull()
        com.example.magnisetask.presentation.destinations.DirectionDestination $this, @org.jetbrains.annotations.NotNull()
        androidx.navigation.NavBackStackEntry navBackStackEntry) {
        }
        
        public static void argsFrom(@org.jetbrains.annotations.NotNull()
        com.example.magnisetask.presentation.destinations.DirectionDestination $this, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.SavedStateHandle savedStateHandle) {
        }
    }
}