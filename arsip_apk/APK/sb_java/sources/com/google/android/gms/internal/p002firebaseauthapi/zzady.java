package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Type;

/* loaded from: classes5.dex */
public class zzady {
    static {
    }

    private zzady() {
    }

    public static Object zza(String r3, Type r4) throws zzabr {
        if (r4 != String.class) goto L15;
        zzafu r42 = (zzafu) new zzafu().zza(r3);     // Catch: Exception -> L8
        if (r42.zzb() == false) goto L11;
        return r42.zza();
    L11:
        throw new zzabr("No error message: " + r3);     // Catch: Exception -> L8
    L8:
        e = move-exception;
        throw new zzabr("Json conversion failed! " + e.getMessage(), e);
    L15:
        if (r4 != Void.class) goto L29;
        return null;
    L29:
        return ((zzaea) ((Class) r4).getConstructor(null).newInstance(null)).zza(r3);
    L20:
        e = move-exception;
        throw new zzabr("Json conversion failed! " + e.getMessage(), e);
    L23:
        e = move-exception;
        throw new zzabr("Instantiation of JsonResponse failed! " + String.valueOf(r4), e);
    }
}
