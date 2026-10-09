package com.google.android.gms.internal.fido;

import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes5.dex */
public abstract class zzcz implements Iterable, Serializable {
    private static final Comparator zza = null;
    public static final zzcz zzb = null;
    private static final zzcy zzd = null;
    private int zzc;

    static {
        zzb = new zzcw(zzde.zzd);
        int r02 = zzcp.zza;
        zzd = new zzcy(null);
        zza = new zzcr();
    }

    public zzcz() {
        this.zzc = 0;
    }

    public static int zzj(int r3, int r4, int r5) {
        int r1 = r4 - r3;
        if ((((r3 | r4) | r1) | (r5 - r4)) >= 0) goto L12;
        if (r3 < 0) goto L11;
        if (r4 >= r3) goto L9;
        throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + r3 + ", " + r4);
    L9:
        throw new IndexOutOfBoundsException("End index: " + r4 + " >= " + r5);
    L11:
        throw new IndexOutOfBoundsException("Beginning index: " + r3 + " < 0");
    L12:
        return r1;
    }

    public static zzcz zzl(byte[] r2, int r3, int r4) {
        zzj(0, r4, r2.length);
        byte[] r1 = new byte[r4];
        System.arraycopy(r2, 0, r1, 0, r4);
        return new zzcw(r1);
    }

    public abstract boolean equals(Object r1);

    public final int hashCode() {
        int r02 = this.zzc;
        if (r02 != 0) goto L8;
        int r1 = zzd();
        r02 = zzf(r1, 0, r1);
        if (r02 != 0) goto L7;
        r02 = 1;
    L7:
        this.zzc = r02;
    L8:
        return r02;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzcq(this);
    }

    public final String toString() {
        Locale r02 = Locale.ROOT;
        String r1 = Integer.toHexString(System.identityHashCode(this));
        Integer r2 = Integer.valueOf(zzd());
        if (zzd() > 50) goto L5;
        String r3 = zzdg.zza(this);
    L7:
        return String.format(r02, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{r1, r2, r3});
    L5:
        r3 = zzdg.zza(zzg(0, 47)).concat("...");
        goto L7
    }

    public abstract byte zza(int r1);

    public abstract byte zzb(int r1);

    public abstract int zzd();

    public abstract void zze(byte[] r1, int r2, int r3, int r4);

    public abstract int zzf(int r1, int r2, int r3);

    public abstract zzcz zzg(int r1, int r2);

    public abstract InputStream zzh();

    public abstract ByteBuffer zzi();

    public final int zzk() {
        return this.zzc;
    }

    public final byte[] zzm() {
        int r02 = zzd();
        if (r02 == 0) goto L5;
        byte[] r1 = new byte[r02];
        zze(r1, 0, 0, r02);
        return r1;
    L5:
        return zzde.zzd;
    }
}
