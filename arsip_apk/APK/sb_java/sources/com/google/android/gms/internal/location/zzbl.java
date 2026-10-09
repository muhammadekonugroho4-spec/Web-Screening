package com.google.android.gms.internal.location;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes5.dex */
public final class zzbl extends zzbk {
    public static boolean zza(@NullableDecl Object r2, @NullableDecl Object r3) {
        if (r2 != r3) goto L5;
        return true;
    L5:
        if (r2 != null) goto L7;
    L9:
        return false;
    L7:
        if (r2.equals(r3) == false) goto L9;
        return true;
    }
}
