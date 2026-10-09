package io.sentry.android.core.internal.util;

/* loaded from: classes3.dex */
public abstract class j {
    public static String a(Object r1) {
        if (r1 != null) goto L5;
        return null;
    L5:
        String r02 = r1.getClass().getCanonicalName();
        if (r02 == null) goto L9;
        return r02;
    L9:
        return r1.getClass().getSimpleName();
    }
}
