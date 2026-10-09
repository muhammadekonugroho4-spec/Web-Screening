package androidx.compose.runtime.internal;

/* renamed from: androidx.compose.runtime.internal.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3406b {
    public static AtomicInt a(AtomicInt r02) {
        return r02;
    }

    public static AtomicInt b(boolean r1) {
        return a(new AtomicInt(r1 ? 1 : 0));
    }

    public static final boolean c(AtomicInt r02) {
        if (r02.get() == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public static final boolean d(AtomicInt r1, boolean r2) {
        return r1.compareAndSet(1, r2 ? 1 : 0);
    }

    public static final void e(AtomicInt r02, boolean r1) {
        r02.set(r1 ? 1 : 0);
    }
}
