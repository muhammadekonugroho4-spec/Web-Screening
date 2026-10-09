package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes5.dex */
public abstract class zzle implements Iterable, Serializable {
    public static final zzle zzb = null;
    private int zza;

    static {
        zzb = new zzlc(zznl.zzb);
        int r02 = zzks.zza;
    }

    public zzle() {
        this.zza = 0;
    }

    public static int zzi(int r3, int r4, int r5) {
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

    public static zzle zzk(byte[] r3, int r4, int r5) {
        zzi(r4, r4 + r5, r3.length);
        byte[] r1 = new byte[r5];
        System.arraycopy(r3, r4, r1, 0, r5);
        return new zzlc(r1);
    }

    public abstract boolean equals(Object r1);

    public final int hashCode() {
        int r02 = this.zza;
        if (r02 != 0) goto L8;
        int r1 = zzd();
        r02 = zzf(r1, 0, r1);
        if (r02 != 0) goto L7;
        r02 = 1;
    L7:
        this.zza = r02;
    L8:
        return r02;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzkx(this);
    }

    public final String toString() {
        Locale r02 = Locale.ROOT;
        String r1 = Integer.toHexString(System.identityHashCode(this));
        Integer r2 = Integer.valueOf(zzd());
        if (zzd() > 50) goto L5;
        String r3 = zzpg.zza(this);
    L7:
        return String.format(r02, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{r1, r2, r3});
    L5:
        r3 = zzpg.zza(zzg(0, 47)).concat("...");
        goto L7
    }

    public abstract byte zza(int r1);

    public abstract byte zzb(int r1);

    public abstract int zzd();

    public abstract void zze(byte[] r1, int r2, int r3, int r4);

    public abstract int zzf(int r1, int r2, int r3);

    public abstract zzle zzg(int r1, int r2);

    public abstract void zzh(zzkw r1) throws IOException;

    public final int zzj() {
        return this.zza;
    }

    public final byte[] zzl() {
        int r02 = zzd();
        if (r02 == 0) goto L5;
        byte[] r1 = new byte[r02];
        zze(r1, 0, 0, r02);
        return r1;
    L5:
        return zznl.zzb;
    }
}
