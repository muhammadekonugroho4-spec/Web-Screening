package org.chromium.support_lib_boundary.util;

import android.os.Build;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Collection;

/* loaded from: classes3.dex */
public abstract class a {
    static {
    }

    public static Object a(Class r2, InvocationHandler r3) {
        if (r3 != null) goto L6;
        return null;
    L6:
        return r2.cast(Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{r2}, r3));
    }

    public static boolean b(Collection r1, String r2) {
        if (r1.contains(r2) == false) goto L5;
        return true;
    L5:
        if (c() == true) goto L7;
        return false;
    L7:
        if (r1.contains(r2 + ":dev") == true) goto L14;
        return false;
    L14:
        return true;
    }

    public static boolean c() {
        String r02 = Build.TYPE;
        if ("eng".equals(r02) == false) goto L5;
        return true;
    L5:
        if ("userdebug".equals(r02) == true) goto L11;
        return false;
    L11:
        return true;
    }
}
