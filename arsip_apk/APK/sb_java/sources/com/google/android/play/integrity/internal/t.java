package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes5.dex */
public abstract class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final TaskCompletionSource f38353a;

    public t() {
        this.f38353a = null;
    }

    public void a(Exception r2) {
        TaskCompletionSource r02 = this.f38353a;
        if (r02 == null) goto L6;
        r02.trySetException(r2);
        return;
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.f38353a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b();     // Catch: Exception -> L4
        return;
    L4:
        e = move-exception;
        a(e);
    }

    public t(TaskCompletionSource r1) {
        this.f38353a = r1;
    }
}
