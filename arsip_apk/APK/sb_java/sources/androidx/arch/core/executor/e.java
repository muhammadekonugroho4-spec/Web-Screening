package androidx.arch.core.executor;

/* loaded from: classes.dex */
public abstract class e {
    public e() {
    }

    public abstract void a(Runnable r1);

    public void b(Runnable r2) {
        if (c() == false) goto L6;
        r2.run();
        return;
    L6:
        d(r2);
    }

    public abstract boolean c();

    public abstract void d(Runnable r1);
}
