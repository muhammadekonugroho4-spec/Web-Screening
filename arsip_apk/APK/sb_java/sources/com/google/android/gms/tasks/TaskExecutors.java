package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class TaskExecutors {
    public static final Executor MAIN_THREAD = null;
    static final Executor zza = null;

    static {
        MAIN_THREAD = new zzu();
        zza = new zzt();
    }

    private TaskExecutors() {
    }
}
