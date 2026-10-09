package com.google.android.gms.internal.common;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes5.dex */
public final class zzl {
    public static Object zza(Class r2, String r3, zzj... r4) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return zzc(r2, "isIsolated", null, false, r4);
    }

    public static Object zzb(String r1, String r2, ClassLoader r3, zzj... r4) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {
        return zzc(r3.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", null, false, r4);
    }

    private static Object zzc(Class r2, String r3, Object r4, boolean r5, zzj... r6) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        int r42 = r6.length;
        Class<?>[] r52 = new Class[r42];
        Object[] r43 = new Object[r42];
        int r02 = 0;
    L4:
        if (r02 >= r6.length) goto L7;
        zzj r1 = r6[r02];
        r1.getClass();
        r52[r02] = r1.zzc();
        r43[r02] = r6[r02].zzd();
        r02 = r02 + 1;
        goto L4
    L7:
        return r2.getDeclaredMethod(r3, r52).invoke(null, r43);
    }
}
