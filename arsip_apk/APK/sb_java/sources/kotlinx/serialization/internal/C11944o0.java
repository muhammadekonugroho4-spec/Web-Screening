package kotlinx.serialization.internal;

import java.lang.ref.SoftReference;

/* renamed from: kotlinx.serialization.internal.o0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11944o0 {

    /* renamed from: a, reason: collision with root package name */
    public volatile SoftReference f180701a;

    public C11944o0() {
        this.f180701a = new SoftReference(null);
    }

    public final synchronized Object a(kotlin.jvm.functions.a r2) {
        monitor-enter(this);
        kotlin.jvm.internal.p.l(r2, "factory");     // Catch: Throwable -> L10
        Object r02 = this.f180701a.get();     // Catch: Throwable -> L10
        if (r02 == null) goto L7;
        monitor-exit(this);
        return r02;
    L7:
        Object r22 = r2.invoke();     // Catch: Throwable -> L10
        this.f180701a = new SoftReference(r22);     // Catch: Throwable -> L10
        monitor-exit(this);
        return r22;
    L10:
        th = move-exception;
        throw th;
    }
}
