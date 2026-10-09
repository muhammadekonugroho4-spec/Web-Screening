package androidx.camera.core.impl.utils.executor;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class b implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static volatile b f5529a;

    public b() {
    }

    public static Executor a() {
        if (f5529a == null) goto L7;
        return f5529a;
    L7:
        monitor-enter(b.class);
    L11:
        th = move-exception;
        throw th;
    L9:
        if (f5529a != null) goto L13;
        f5529a = new b();     // Catch: Throwable -> L11
    L13:
        monitor-exit(b.class);     // Catch: Throwable -> L11
        return f5529a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable r1) {
        r1.run();
    }
}
