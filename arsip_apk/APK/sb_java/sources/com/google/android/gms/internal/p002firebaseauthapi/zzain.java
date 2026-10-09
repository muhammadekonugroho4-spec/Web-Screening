package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzain;
import com.google.android.gms.internal.p002firebaseauthapi.zzaip;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes5.dex */
public abstract class zzain<MessageType extends zzain<MessageType, BuilderType>, BuilderType extends zzaip<MessageType, BuilderType>> implements zzaln {
    protected int zza;

    public zzain() {
        this.zza = 0;
    }

    public int zza(zzamc r3) {
        int r02 = zzi();
        if (r02 != (-1)) goto L6;
        int r32 = r3.zza(this);
        zzb(r32);
        return r32;
    L6:
        return r02;
    }

    public void zzb(int r1) {
        throw new UnsupportedOperationException();
    }

    public int zzi() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaln
    public final zzaiw zzj() {
        zzajf r02 = zzaiw.zzc(zzl());     // Catch: IOException -> L4
        zza(r02.zzb());     // Catch: IOException -> L4
        return r02.zza();
    L4:
        e = move-exception;
        throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
    }

    public final byte[] zzk() {
        byte[] r02 = new byte[zzl()];     // Catch: IOException -> L4
        zzajo r1 = zzajo.zzb(r02);     // Catch: IOException -> L4
        zza(r1);     // Catch: IOException -> L4
        r1.zzb();     // Catch: IOException -> L4
        return r02;
    L4:
        e = move-exception;
        throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
    }

    public final void zza(OutputStream r2) throws IOException {
        zzajo r22 = zzajo.zza(r2, zzajo.zzd(zzl()));
        zza(r22);
        r22.zzc();
    }
}
