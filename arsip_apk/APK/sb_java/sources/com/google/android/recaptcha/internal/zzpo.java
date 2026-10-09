package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* loaded from: classes5.dex */
final class zzpo implements PrivilegedExceptionAction {
    public zzpo() {
    }

    @Override // java.security.PrivilegedExceptionAction
    public final /* bridge */ /* synthetic */ Object run() throws Exception {
        Field[] r1 = Unsafe.class.getDeclaredFields();
        int r2 = r1.length;
        int r3 = 0;
    L4:
        if (r3 >= r2) goto L10;
        Field r5 = r1[r3];
        r5.setAccessible(true);
        Object r4 = r5.get(null);
        if (Unsafe.class.isInstance(r4) == true) goto L8;
        r3 = r3 + 1;
        goto L4
    L8:
        return (Unsafe) Unsafe.class.cast(r4);
    L10:
        return null;
    }
}
