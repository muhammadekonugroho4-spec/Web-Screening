package io.sentry.util;

/* renamed from: io.sentry.util.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11672a {
    public static ClassLoader a(ClassLoader r02) {
        if (r02 != null) goto L8;
        ClassLoader r03 = Thread.currentThread().getContextClassLoader();
        if (r03 == null) goto L7;
        return r03;
    L7:
        return ClassLoader.getSystemClassLoader();
    L8:
        return r02;
    }
}
