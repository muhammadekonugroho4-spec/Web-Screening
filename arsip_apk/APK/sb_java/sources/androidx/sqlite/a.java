package androidx.sqlite;

import android.database.SQLException;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public abstract class a {
    public static final void a(b r1, String r2) {
        p.l(r1, "<this>");
        p.l(r2, "sql");
        d r12 = r1.x0(r2);
        r12.u0();     // Catch: Throwable -> L6
        kotlin.jdk7.a.a(r12, null);
        return;
    L6:
        th = move-exception;
        throw th;     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        kotlin.jdk7.a.a(r12, th);
        throw th;
    }

    public static final Void b(int r3, String r4) {
        StringBuilder r02 = new StringBuilder();
        r02.append("Error code: " + r3);
        if (r4 == null) goto L6;
        r02.append(", message: " + r4);
    L6:
        throw new SQLException(r02.toString());
    }
}
