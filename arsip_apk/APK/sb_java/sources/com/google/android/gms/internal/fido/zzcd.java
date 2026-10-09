package com.google.android.gms.internal.fido;

import java.math.RoundingMode;
import java.util.Arrays;

/* loaded from: classes5.dex */
final class zzcd {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean zzh;

    public zzcd(String r10, char[] r11) {
        byte[] r1 = new byte[128];
        Arrays.fill(r1, (byte) -1);
        int r4 = 0;
    L4:
        if (r4 >= r11.length) goto L14;
        char r5 = r11[r4];
        boolean r6 = true;
        if (r5 >= 128) goto L8;
        boolean r7 = true;
    L9:
        zzap.zzd(r7, "Non-ASCII character: %s", r5);
        if (r1[r5] == (-1)) goto L13;
        r6 = false;
    L13:
        zzap.zzd(r6, "Duplicate character: %s", r5);
        r1[r5] = (byte) r4;
        r4 = r4 + 1;
        goto L4
    L8:
        r7 = false;
        goto L9
    L14:
        this(r10, r11, r1, false);
    }

    public static /* bridge */ /* synthetic */ char[] zzd(zzcd r02) {
        return r02.zzf;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof zzcd) == false) goto L10;
        zzcd r42 = (zzcd) r4;
        if (this.zzh != r42.zzh) goto L10;
        if (Arrays.equals(this.zzf, r42.zzf) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final int hashCode() {
        int r02 = Arrays.hashCode(this.zzf);
        if (true == this.zzh) goto L5;
        int r1 = 1237;
    L7:
        return r02 + r1;
    L5:
        r1 = 1231;
        goto L7
    }

    public final String toString() {
        return this.zze;
    }

    public final char zza(int r2) {
        return this.zzf[r2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    public final zzcd zzb() {
        char[] r02 = this.zzf;
        int r1 = r02.length;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L45;
        if (zzad.zza(r02[r3]) == true) goto L6;
        r3 = r3 + 1;
        goto L3
    L6:
        char[] r03 = this.zzf;
        int r12 = r03.length;
        int r32 = 0;
    L7:
        int r5 = 65;
        if (r32 >= r12) goto L14;
        char r7 = r03[r32];
        if (r7 < 'A') goto L13;
        if (r7 > 'Z') goto L13;
        boolean r04 = true;
    L15:
        if (r04 == true) goto L43;
        char[] r05 = new char[this.zzf.length];
    L17:
        char[] r13 = this.zzf;
        if (r2 >= r13.length) goto L23;
        int r14 = r13[r2];
        if (zzad.zza(r14) == false) goto L22;
        r14 = r14 ^ 32;
    L22:
        r05[r2] = (char) r14;
        r2 = r2 + 1;
        goto L17
    L23:
        zzcd r15 = new zzcd(this.zze.concat(".upperCase()"), r05);
        if (this.zzh == true) goto L26;
    L41:
        return r15;
    L26:
        if (r15.zzh == true) goto L41;
        byte[] r06 = r15.zzg;
        byte[] r07 = Arrays.copyOf(r06, r06.length);
    L29:
        if (r5 > 90) goto L39;
        int r22 = r5 | 32;
        byte[] r33 = r15.zzg;
        byte r72 = r33[r5];
        byte r34 = r33[r22];
        if (r72 != (-1)) goto L33;
        r07[r5] = r34;
    L36:
        r5 = r5 + 1;
        goto L29
    L33:
        char r9 = (char) r5;
        char r10 = (char) r22;
        if (r34 != (-1)) goto L38;
        r07[r22] = r72;
        goto L36
    L38:
        throw new IllegalStateException(zzaq.zza("Can't ignoreCase() since '%s' and '%s' encode different values", new Object[]{Character.valueOf(r9), Character.valueOf(r10)}));
    L39:
        String r35 = r15.zze;
        return new zzcd(r35.concat(".ignoreCase()"), r15.zzf, r07, true);
    L43:
        throw new IllegalStateException("Cannot call upperCase() on a mixed-case alphabet");
    L13:
        r32 = r32 + 1;
        goto L7
    L14:
        r04 = false;
        goto L15
    L45:
        return this;
    }

    public final boolean zzc(char r3) {
        byte[] r32 = this.zzg;
        if (r32.length > 61) goto L5;
        return false;
    L5:
        if (r32[61] == (-1)) goto L10;
        return true;
    L10:
        return false;
    }

    private zzcd(String r4, char[] r5, byte[] r6, boolean r7) {
        this.zze = r4;
        r5.getClass();
        this.zzf = r5;
        int r42 = r5.length;     // Catch: ArithmeticException -> L10
        int r02 = zzcj.zzb(r42, RoundingMode.UNNECESSARY);     // Catch: ArithmeticException -> L10
        this.zzb = r02;     // Catch: ArithmeticException -> L10
        int r52 = Integer.numberOfTrailingZeros(r02);
        int r1 = 1 << (3 - r52);
        this.zzc = r1;
        this.zzd = r02 >> r52;
        this.zza = r42 - 1;
        this.zzg = r6;
        boolean[] r43 = new boolean[r1];
        int r53 = 0;
    L6:
        if (r53 >= this.zzd) goto L8;
        r43[zzcj.zza(r53 * 8, this.zzb, RoundingMode.CEILING)] = true;
        r53 = r53 + 1;
        goto L6
    L8:
        this.zzh = r7;
        return;
    L10:
        e = move-exception;
        throw new IllegalArgumentException("Illegal alphabet length " + r5.length, e);
    }
}
