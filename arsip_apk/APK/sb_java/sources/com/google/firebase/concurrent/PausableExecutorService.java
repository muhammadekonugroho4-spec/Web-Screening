package com.google.firebase.concurrent;

import androidx.activity.T;
import java.util.concurrent.ExecutorService;

/* loaded from: classes6.dex */
public interface PausableExecutorService extends ExecutorService, PausableExecutor, AutoCloseable {
    @Override // java.lang.AutoCloseable
    /* synthetic */ default void close() {
        T.a(this);
    }
}
