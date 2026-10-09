package com.google.android.gms.internal.fido;

import com.google.common.primitives.Ints;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class zzbc extends zzav implements Set {
    private transient zzaz zza;

    public zzbc() {
    }

    private static zzbc zzf(int r13, Object... r14) {
        if (r13 == 0) goto L30;
        if (r13 == 1) goto L27;
        int r2 = zzh(r13);
        Object[] r6 = new Object[r2];
        int r7 = r2 - 1;
        int r3 = 0;
        int r5 = 0;
        int r8 = 0;
    L6:
        if (r3 >= r13) goto L15;
        Object r4 = r14[r3];
        zzbq.zza(r4, r3);
        int r9 = r4.hashCode();
        int r10 = zzau.zza(r9);
    L8:
        int r11 = r10 & r7;
        Object r12 = r6[r11];
        if (r12 == null) goto L10;
        if (r12.equals(r4) == true) goto L14;
        r10 = r10 + 1;
    L14:
        r3 = r3 + 1;
        goto L6
    L10:
        r14[r8] = r4;
        r6[r11] = r4;
        r5 = r5 + r9;
        r8 = r8 + 1;
        goto L14
    L15:
        Arrays.fill(r14, r8, r13, null);
        if (r8 != 1) goto L20;
        Object r132 = r14[0];
        r132.getClass();
        return new zzby(r132);
    L20:
        if (zzh(r8) < (r2 / 2)) goto L26;
        if (r8 > 0) goto L24;
        r14 = Arrays.copyOf(r14, r8);
    L24:
        return new zzbt(r14, r5, r6, r7, r8);
    L26:
        return zzf(r8, r14);
    L27:
        Object r133 = r14[0];
        r133.getClass();
        return new zzby(r133);
    L30:
        return zzbt.zza;
    }

    public static int zzh(int r5) {
        int r52 = Math.max(r5, 2);
        if (r52 >= 751619276) goto L10;
        int r02 = Integer.highestOneBit(r52 - 1);
    L5:
        r02 = r02 + r02;
        if ((r02 * 0.7d) < r52) goto L5;
        return r02;
    L10:
        if (r52 >= 1073741824) goto L13;
        return Ints.MAX_POWER_OF_TWO;
    L13:
        throw new IllegalArgumentException("collection too large");
    }

    public static zzbc zzk(Object r1, Object r2) {
        return zzf(2, new Object[]{r1, r2});
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof zzbc) == true) goto L8;
    L15:
        if (r5 != this) goto L18;
        return true;
    L18:
        if ((r5 instanceof Set) == false) goto L26;
        Set r52 = (Set) r5;
        if (size() != r52.size()) goto L26;
        if (containsAll(r52) == true) goto L25;
        return false;
    L25:
        return true;
    L26:
        return false;
    L8:
        if (zzg() == false) goto L15;
        if (((zzbc) r5).zzg() == false) goto L15;
        if (hashCode() == r5.hashCode()) goto L15;
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzbx.zza(this);
    }

    @Override // com.google.android.gms.internal.fido.zzav, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return zzd();
    }

    @Override // com.google.android.gms.internal.fido.zzav
    public abstract zzcb zzd();

    public boolean zzg() {
        return false;
    }

    public zzaz zzi() {
        zzaz r02 = this.zza;
        if (r02 != null) goto L6;
        zzaz r03 = zzj();
        this.zza = r03;
        return r03;
    L6:
        return r02;
    }

    public zzaz zzj() {
        Object[] r02 = toArray();
        int r1 = zzaz.zzd;
        return zzaz.zzh(r02, r02.length);
    }
}
