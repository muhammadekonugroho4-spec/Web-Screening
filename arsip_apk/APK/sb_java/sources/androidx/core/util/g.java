package androidx.core.util;

import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: c, reason: collision with root package name */
    public final Object f23082c;

    public g(int r1) {
        super(r1);
        this.f23082c = new Object();
    }

    @Override // androidx.core.util.f, androidx.core.util.e
    public boolean a(Object r2) {
        p.l(r2, "instance");
        Object r02 = this.f23082c;
        monitor-enter(r02);
        boolean r22 = super.a(r2);     // Catch: Throwable -> L7
        monitor-exit(r02);
        return r22;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // androidx.core.util.f, androidx.core.util.e
    public Object acquire() {
        Object r02 = this.f23082c;
        monitor-enter(r02);
        Object r1 = super.acquire();     // Catch: Throwable -> L7
        monitor-exit(r02);
        return r1;
    L7:
        th = move-exception;
        throw th;
    }
}
