package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzkm {
    private static final Map zza = null;

    static {
        LinkedHashMap r02 = new LinkedHashMap(16);
        LinkedHashMap r2 = new LinkedHashMap(16);
        zzb(r02, r2, Boolean.TYPE, Boolean.class);
        zzb(r02, r2, Byte.TYPE, Byte.class);
        zzb(r02, r2, Character.TYPE, Character.class);
        zzb(r02, r2, Double.TYPE, Double.class);
        zzb(r02, r2, Float.TYPE, Float.class);
        zzb(r02, r2, Integer.TYPE, Integer.class);
        zzb(r02, r2, Long.TYPE, Long.class);
        zzb(r02, r2, Short.TYPE, Short.class);
        zzb(r02, r2, Void.TYPE, Void.class);
        zza = Collections.unmodifiableMap(r02);
        Collections.unmodifiableMap(r2);
    }

    public static Class zza(Class r1) {
        r1.getClass();
        Class r02 = (Class) zza.get(r1);
        if (r02 != null) goto L5;
        return r1;
    L5:
        return r02;
    }

    private static void zzb(Map r02, Map r1, Class r2, Class r3) {
        r02.put(r2, r3);
        r1.put(r3, r2);
    }
}
