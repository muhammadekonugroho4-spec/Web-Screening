package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes5.dex */
public abstract class zzei implements Iterable, Serializable {
    public static final zzei zzb = null;
    private int zza;

    static {
        zzb = new zzeg(zzfo.zzb);
        int r02 = zzdv.zza;
    }

    public zzei() {
        this.zza = 0;
    }

    public static int zzh(int r3, int r4, int r5) {
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

    public static zzei zzj(byte[] r3, int r4, int r5) {
        zzh(r4, r4 + r5, r3.length);
        byte[] r1 = new byte[r5];
        System.arraycopy(r3, r4, r1, 0, r5);
        return new zzeg(r1);
    }

    public abstract boolean equals(Object r1);

    public final int hashCode() {
        int r02 = this.zza;
        if (r02 != 0) goto L8;
        int r1 = zzd();
        r02 = zze(r1, 0, r1);
        if (r02 != 0) goto L7;
        r02 = 1;
    L7:
        this.zza = r02;
    L8:
        return r02;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzea(this);
    }

    public final String toString() {
        Locale r02 = Locale.ROOT;
        String r1 = Integer.toHexString(System.identityHashCode(this));
        Integer r2 = Integer.valueOf(zzd());
        if (zzd() > 50) goto L5;
        String r3 = zzhf.zza(this);
    L7:
        return String.format(r02, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{r1, r2, r3});
    L5:
        r3 = zzhf.zza(zzf(0, 47)).concat("...");
        goto L7
    }

    public abstract byte zza(int r1);

    public abstract byte zzb(int r1);

    public abstract int zzd();

    public abstract int zze(int r1, int r2, int r3);

    public abstract zzei zzf(int r1, int r2);

    public abstract void zzg(zzdz r1) throws IOException;

    public final int zzi() {
        return this.zza;
    }
}
