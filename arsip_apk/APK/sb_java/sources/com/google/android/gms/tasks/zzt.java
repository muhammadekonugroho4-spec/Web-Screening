package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
final class zzt implements Executor {
    public zzt() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r1) {
        r1.run();
    }
}
