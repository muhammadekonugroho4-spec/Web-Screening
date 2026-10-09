package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* loaded from: classes5.dex */
public final class zzlx {
    public static Object zza(Object r4) {
        if (r4 != null) goto L23;
        return null;
    L23:
        ByteArrayOutputStream r1 = new ByteArrayOutputStream();     // Catch: Throwable -> L14
        ObjectOutputStream r2 = new ObjectOutputStream(r1);     // Catch: Throwable -> L14
        r2.writeObject(r4);     // Catch: Throwable -> L12
        r2.flush();     // Catch: Throwable -> L12
        ObjectInputStream r42 = new ObjectInputStream(new ByteArrayInputStream(r1.toByteArray()));     // Catch: Throwable -> L12
        Object r12 = r42.readObject();     // Catch: Throwable -> L10
        r2.close();     // Catch: Throwable -> L21
        r42.close();     // Catch: Throwable -> L21
        return r12;
    L10:
        th = th;
    L16:
        if (r2 == null) goto L18;
        r2.close();     // Catch: Throwable -> L21
    L18:
        if (r42 == null) goto L20;
        r42.close();     // Catch: Throwable -> L21
    L20:
        throw th;     // Catch: Throwable -> L21
    L12:
        th = th;
        r42 = null;
    L14:
        th = th;
        r42 = null;
        r2 = null;
    L21:
        return null;
    }

    public static String zza(String r4, String[] r5, String[] r6) {
        Preconditions.checkNotNull(r5);
        Preconditions.checkNotNull(r6);
        int r02 = Math.min(r5.length, r6.length);
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L15;
        String r3 = r5[r2];
        if (r4 != null) goto L8;
        if (r3 != null) goto L8;
        boolean r32 = true;
    L11:
        if (r32 == true) goto L13;
        r2 = r2 + 1;
        goto L3
    L13:
        return r6[r2];
    L8:
        if (r4 != null) goto L10;
        r32 = false;
        goto L11
    L10:
        r32 = r4.equals(r3);
        goto L11
    L15:
        return null;
    }
}
