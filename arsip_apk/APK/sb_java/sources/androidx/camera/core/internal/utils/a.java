package androidx.camera.core.internal.utils;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f5717a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f5718b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5719c;
    public final b d;

    public a(int r2, b r3) {
        this.f5719c = new Object();
        this.f5717a = r2;
        this.f5718b = new ArrayDeque(r2);
        this.d = r3;
    }

    public Object a() {
        Object r02 = this.f5719c;
        monitor-enter(r02);
        Object r1 = this.f5718b.removeLast();     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    public void b(Object r4) {
        Object r02 = this.f5719c;
        monitor-enter(r02);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (this.f5718b.size() < this.f5717a) goto L9;
        Object r1 = a();     // Catch: Throwable -> L7
    L10:
        this.f5718b.addFirst(r4);     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        b r42 = this.d;
        if (r42 == null) goto L21;
        if (r1 == null) goto L22;
        r42.a(r1);
        return;
    L22:
        return;
    L21:
        return;
    L9:
        r1 = null;
        goto L10
    }

    public boolean c() {
        Object r02 = this.f5719c;
        monitor-enter(r02);
        boolean r1 = this.f5718b.isEmpty();     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }
}
