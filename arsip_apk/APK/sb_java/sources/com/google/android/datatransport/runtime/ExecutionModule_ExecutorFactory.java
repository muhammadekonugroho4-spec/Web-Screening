package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import java.util.concurrent.Executor;

@QualifierMetadata
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
/* loaded from: classes4.dex */
public final class ExecutionModule_ExecutorFactory implements Factory<Executor> {

    public static final class InstanceHolder {
        private static final ExecutionModule_ExecutorFactory INSTANCE = null;

        static {
            INSTANCE = new ExecutionModule_ExecutorFactory();
        }

        private InstanceHolder() {
        }

        public static /* synthetic */ ExecutionModule_ExecutorFactory access$000() {
            return INSTANCE;
        }
    }

    public ExecutionModule_ExecutorFactory() {
    }

    public static ExecutionModule_ExecutorFactory create() {
        return InstanceHolder.access$000();
    }

    public static Executor executor() {
        return (Executor) Preconditions.checkNotNullFromProvides(ExecutionModule.executor());
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.a
    public /* bridge */ /* synthetic */ Object get() {
        return get();
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.a
    public Executor get() {
        return executor();
    }
}
