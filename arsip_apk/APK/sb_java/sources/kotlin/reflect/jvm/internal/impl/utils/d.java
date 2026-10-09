package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public abstract class d {
    public static final boolean a(Throwable r2) {
        p.l(r2, "<this>");
        Class<?> r22 = r2.getClass();
    L4:
        if (p.g(r22.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException") == true) goto L5;
        r22 = r22.getSuperclass();
        if (r22 != null) goto L4;
        return false;
    L5:
        return true;
    }

    public static final RuntimeException b(Throwable r1) {
        p.l(r1, "e");
        throw r1;
    }
}
