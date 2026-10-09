package com.google.android.gms.internal.auth;

import com.google.common.base.Ascii;

/* loaded from: classes5.dex */
final class zzhm {
    private static final zzhk zza = null;

    static {
        if (zzhi.zzu() == true) goto L5;
    L7:
        zza = new zzhl();
        return;
    L5:
        if (zzhi.zzv() == false) goto L7;
        int r02 = zzdr.zza;
        goto L7
    }

    public static /* bridge */ /* synthetic */ int zza(byte[] r6, int r7, int r8) {
        byte r02 = r6[r7 - 1];
        int r82 = r8 - r7;
        if (r82 != 0) goto L5;
        if (r02 <= (-12)) goto L27;
        return -1;
    L27:
        return r02;
    L5:
        if (r82 != 1) goto L7;
        byte r62 = r6[r7];
        if (r02 > (-12)) goto L24;
        if (r62 <= (-65)) goto L23;
        return -1;
    L23:
        return (r62 << 8) ^ r02;
    L24:
        return -1;
    L7:
        if (r82 != 2) goto L17;
        byte r83 = r6[r7];
        byte r63 = r6[r7 + 1];
        if (r02 > (-12)) goto L15;
        if (r83 > (-65)) goto L15;
        if (r63 <= (-65)) goto L14;
        return -1;
    L14:
        return (r63 << Ascii.DLE) ^ ((r83 << 8) ^ r02);
    L15:
        return -1;
    L17:
        throw new AssertionError();
    }

    public static String zzb(byte[] r7, int r8, int r9) throws zzfa {
        int r02 = r7.length;
        if (((r8 | r9) | ((r02 - r8) - r9)) < 0) goto L41;
        int r03 = r8 + r9;
        char[] r5 = new char[r9];
        int r1 = 0;
    L5:
        if (r8 >= r03) goto L10;
        byte r2 = r7[r8];
        if (zzhj.zzd(r2) == false) goto L10;
        r8 = r8 + 1;
        r5[r1] = (char) r2;
        r1 = r1 + 1;
    L10:
        int r6 = r1;
    L11:
        if (r8 >= r03) goto L39;
        int r12 = r8 + 1;
        byte r13 = r7[r8];
        if (zzhj.zzd(r13) == true) goto L14;
        if (r13 < (-32)) goto L22;
        if (r13 < (-16)) goto L29;
        if (r12 >= (r03 - 2)) goto L37;
        int r3 = r8 + 2;
        int r4 = r8 + 3;
        r8 = r8 + 4;
        zzhj.zza(r13, r7[r12], r7[r3], r7[r4], r5, r6);
        r6 = r6 + 2;
        goto L11
    L37:
        throw zzfa.zzb();
    L29:
        if (r12 >= (r03 - 1)) goto L32;
        int r32 = r8 + 2;
        r8 = r8 + 3;
        zzhj.zzb(r13, r7[r12], r7[r32], r5, r6);
        r6 = r6 + 1;
        goto L11
    L32:
        throw zzfa.zzb();
    L22:
        if (r12 >= r03) goto L25;
        r8 = r8 + 2;
        zzhj.zzc(r13, r7[r12], r5, r6);
        r6 = r6 + 1;
        goto L11
    L25:
        throw zzfa.zzb();
    L14:
        r5[r6] = (char) r13;
        r6 = r6 + 1;
        r8 = r12;
    L15:
        if (r8 >= r03) goto L11;
        byte r14 = r7[r8];
        if (zzhj.zzd(r14) == false) goto L11;
        r8 = r8 + 1;
        r5[r6] = (char) r14;
        r6 = r6 + 1;
        goto L15
    L39:
        return new String(r5, 0, r6);
    L41:
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(r02), Integer.valueOf(r8), Integer.valueOf(r9)}));
    }

    public static boolean zzc(byte[] r3) {
        return zza.zzb(r3, 0, r3.length);
    }

    public static boolean zzd(byte[] r1, int r2, int r3) {
        return zza.zzb(r1, r2, r3);
    }
}
