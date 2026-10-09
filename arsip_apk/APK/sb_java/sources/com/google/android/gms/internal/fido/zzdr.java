package com.google.android.gms.internal.fido;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: classes5.dex */
public abstract class zzdr implements Comparable {
    public zzdr() {
    }

    private final zzdr zzc(Class r5) throws zzdq {
        if (r5.isInstance(this) == false) goto L7;
        return (zzdr) r5.cast(this);
    L7:
        throw new zzdq("Expected a " + r5.getName() + " value, but got " + getClass().getName());
    }

    public static int zzd(byte r02) {
        return (r02 >> 5) & 7;
    }

    public static zzdm zzg(long r1) {
        return new zzdm(r1);
    }

    public static zzdp zzi(String r1) {
        return new zzdp(r1);
    }

    public static zzdr zzj(byte... r1) throws zzdl {
        r1.getClass();
        ByteArrayInputStream r02 = new ByteArrayInputStream(Arrays.copyOf(r1, r1.length));
        return zzds.zza(r02, new zzdu(r02));
    }

    public static zzdr zzk(InputStream r1) throws zzdl {
        return zzds.zza(r1, new zzdu(r1));
    }

    public abstract int zza();

    public int zzb() {
        return 0;
    }

    public final zzdk zze() throws zzdq {
        return (zzdk) zzc(zzdk.class);
    }

    public final zzdm zzf() throws zzdq {
        return (zzdm) zzc(zzdm.class);
    }

    public final zzdo zzh() throws zzdq {
        return (zzdo) zzc(zzdo.class);
    }
}
