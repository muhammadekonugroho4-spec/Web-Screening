package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Arrays;

/* loaded from: classes5.dex */
abstract class zzj extends com.google.android.gms.common.internal.zzz {
    private final int zza;

    public zzj(byte[] r3) {
        if (r3.length != 25) goto L5;
        boolean r02 = true;
    L6:
        Preconditions.checkArgument(r02);
        this.zza = Arrays.hashCode(r3);
        return;
    L5:
        r02 = false;
        goto L6
    }

    public static byte[] zze(String r1) {
        return r1.getBytes("ISO-8859-1");
    L4:
        e = move-exception;
        throw new AssertionError(e);
    }

    public final boolean equals(Object r4) {
        if (r4 != null) goto L5;
    L18:
        return false;
    L5:
        if ((r4 instanceof com.google.android.gms.common.internal.zzaa) == false) goto L18;
        com.google.android.gms.common.internal.zzaa r42 = (com.google.android.gms.common.internal.zzaa) r4;     // Catch: RemoteException -> L14
        if (r42.zzc() == this.zza) goto L10;
        return false;
    L10:
        IObjectWrapper r43 = r42.zzd();     // Catch: RemoteException -> L14
        if (r43 == null) goto L16;
        byte[] r44 = (byte[]) ObjectWrapper.unwrap(r43);     // Catch: RemoteException -> L14
        return Arrays.equals(zzf(), r44);
    L16:
        return false;
    L14:
        e = move-exception;
        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
        goto L18
    }

    public final int hashCode() {
        return this.zza;
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final int zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final IObjectWrapper zzd() {
        return ObjectWrapper.wrap(zzf());
    }

    public abstract byte[] zzf();
}
