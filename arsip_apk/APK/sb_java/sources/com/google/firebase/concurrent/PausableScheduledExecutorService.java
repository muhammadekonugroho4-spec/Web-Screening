package com.google.firebase.concurrent;

import androidx.activity.T;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public interface PausableScheduledExecutorService extends ScheduledExecutorService, PausableExecutorService, AutoCloseable {
    @Override // com.google.firebase.concurrent.PausableExecutorService, java.lang.AutoCloseable
    /* synthetic */ default void close() {
        T.a(this);
    }
}
