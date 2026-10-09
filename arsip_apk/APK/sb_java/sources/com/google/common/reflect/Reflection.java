package com.google.common.reflect;

import com.google.common.base.Preconditions;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
public final class Reflection {
    private Reflection() {
    }

    public static String getPackageName(Class<?> r02) {
        return getPackageName(r02.getName());
    }

    public static void initialize(Class<?>... r5) {
        int r02 = r5.length;
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L10;
        Class<?> r2 = r5[r1];
        Class.forName(r2.getName(), true, r2.getClassLoader());     // Catch: ClassNotFoundException -> L7
        r1 = r1 + 1;
    L7:
        e = move-exception;
        throw new AssertionError(e);
    }

    public static <T> T newProxy(Class<T> r2, InvocationHandler r3) {
        Preconditions.checkNotNull(r3);
        Preconditions.checkArgument(r2.isInterface(), "%s is not an interface", r2);
        return r2.cast(Proxy.newProxyInstance(r2.getClassLoader(), new Class[]{r2}, r3));
    }

    public static String getPackageName(String r2) {
        int r02 = r2.lastIndexOf(46);
        if (r02 >= 0) goto L7;
        return "";
    L7:
        return r2.substring(0, r02);
    }
}
