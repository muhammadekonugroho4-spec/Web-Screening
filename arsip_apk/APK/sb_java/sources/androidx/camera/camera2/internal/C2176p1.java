package androidx.camera.camera2.internal;

/* renamed from: androidx.camera.camera2.internal.p1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2176p1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4582a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.camera.camera2.internal.compat.C f4583b;

    /* renamed from: c, reason: collision with root package name */
    public int f4584c;

    public C2176p1(androidx.camera.camera2.internal.compat.C r2, int r3) {
        this.f4582a = new Object();
        this.f4583b = r2;
        this.f4584c = r3;
    }

    public int a() {
        Object r02 = this.f4582a;
        monitor-enter(r02);
        int r1 = this.f4584c;     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    public void b(int r2) {
        Object r02 = this.f4582a;
        monitor-enter(r02);
        this.f4584c = r2;     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
