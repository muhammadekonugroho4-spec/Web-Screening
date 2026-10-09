package com.google.android.gms.internal.auth;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes5.dex */
public abstract class zzee implements Iterable, Serializable {
    private static final Comparator zza = null;
    public static final zzee zzb = null;
    private static final zzed zzd = null;
    private int zzc;

    static {
        zzb = new zzeb(zzez.zzd);
        int r02 = zzdr.zza;
        zzd = new zzed(null);
        zza = new zzdw();
    }

    public zzee() {
        this.zzc = 0;
    }

    public static int zzi(int r3, int r4, int r5) {
        int r02 = r4 - r3;
        if ((((r3 | r4) | r02) | (r5 - r4)) >= 0) goto L12;
        if (r3 < 0) goto L11;
        if (r4 >= r3) goto L9;
        throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + r3 + ", " + r4);
    L9:
        throw new IndexOutOfBoundsException("End index: " + r4 + " >= " + r5);
    L11:
        throw new IndexOutOfBoundsException("Beginning index: " + r3 + " < 0");
    L12:
        return r02;
    }

    public static zzee zzk(byte[] r3, int r4, int r5) {
        zzi(r4, r4 + r5, r3.length);
        byte[] r1 = new byte[r5];
        System.arraycopy(r3, r4, r1, 0, r5);
        return new zzeb(r1);
    }

    public static zzee zzl(String r2) {
        return new zzeb(r2.getBytes(zzez.zzb));
    }

    public abstract boolean equals(Object r1);

    public final int hashCode() {
        int r02 = this.zzc;
        if (r02 != 0) goto L8;
        int r03 = zzd();
        r02 = zze(r03, 0, r03);
        if (r02 != 0) goto L7;
        r02 = 1;
    L7:
        this.zzc = r02;
    L8:
        return r02;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzdv(this);
    }

    public final String toString() {
        Locale r02 = Locale.ROOT;
        String r1 = Integer.toHexString(System.identityHashCode(this));
        Integer r2 = Integer.valueOf(zzd());
        if (zzd() > 50) goto L5;
        String r3 = zzgw.zza(this);
    L7:
        return String.format(r02, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{r1, r2, r3});
    L5:
        r3 = zzgw.zza(zzf(0, 47)).concat("...");
        goto L7
    }

    public abstract byte zza(int r1);

    public abstract byte zzb(int r1);

    public abstract int zzd();

    public abstract int zze(int r1, int r2, int r3);

    public abstract zzee zzf(int r1, int r2);

    public abstract String zzg(Charset r1);

    public abstract boolean zzh();

    public final int zzj() {
        return this.zzc;
    }

    public final String zzm(Charset r2) {
        if (zzd() != 0) goto L7;
        return "";
    L7:
        return zzg(r2);
    }
}
