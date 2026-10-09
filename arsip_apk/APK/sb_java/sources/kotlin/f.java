package kotlin;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class f {
    public static void a(Throwable r1, Throwable r2) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        kotlin.jvm.internal.p.l(r2, "exception");
        if (r1 == r2) goto L6;
        kotlin.internal.b.f177438a.a(r1, r2);
        return;
    }

    public static List b(Throwable r1) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        return kotlin.internal.b.f177438a.c(r1);
    }

    public static String c(Throwable r2) {
        kotlin.jvm.internal.p.l(r2, "<this>");
        StringWriter r02 = new StringWriter();
        PrintWriter r1 = new PrintWriter(r02);
        r2.printStackTrace(r1);
        r1.flush();
        String r22 = r02.toString();
        kotlin.jvm.internal.p.k(r22, "toString(...)");
        return r22;
    }
}
