package androidx.work.impl.utils;

/* loaded from: classes4.dex */
public abstract class M {
    public static final void a(androidx.core.util.a r1, androidx.work.I r2, String r3) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        kotlin.jvm.internal.p.l(r2, "info");
        kotlin.jvm.internal.p.l(r3, "tag");
        r1.accept(r2);     // Catch: Throwable -> L5
        return;
    L5:
        th = move-exception;
        androidx.work.r.e().d(r3, "Exception handler threw an exception", th);
    }
}
