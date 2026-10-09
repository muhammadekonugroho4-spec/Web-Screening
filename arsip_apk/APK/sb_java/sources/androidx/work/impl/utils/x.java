package androidx.work.impl.utils;

import android.net.NetworkRequest;

/* loaded from: classes4.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final x f29606a = null;

    static {
        f29606a = new x();
    }

    public x() {
    }

    public final int[] a(NetworkRequest r2) {
        kotlin.jvm.internal.p.l(r2, "request");
        int[] r22 = w.a(r2);
        kotlin.jvm.internal.p.k(r22, "request.capabilities");
        return r22;
    }

    public final int[] b(NetworkRequest r2) {
        kotlin.jvm.internal.p.l(r2, "request");
        int[] r22 = v.a(r2);
        kotlin.jvm.internal.p.k(r22, "request.transportTypes");
        return r22;
    }
}
