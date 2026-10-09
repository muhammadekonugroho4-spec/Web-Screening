package androidx.room.util;

/* loaded from: classes4.dex */
public abstract class j {
    public static final int a(androidx.sqlite.b r2) {
        kotlin.jvm.internal.p.l(r2, "connection");
        androidx.sqlite.d r22 = r2.x0("SELECT changes()");
        r22.u0();     // Catch: Throwable -> L6
        int r02 = (int) r22.getLong(0);
        kotlin.jdk7.a.a(r22, null);
        return r02;
    L6:
        th = move-exception;
        throw th;     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        kotlin.jdk7.a.a(r22, th);
        throw th;
    }
}
