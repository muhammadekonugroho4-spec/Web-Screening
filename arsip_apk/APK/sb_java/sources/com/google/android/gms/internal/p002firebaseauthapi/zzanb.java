package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.common.base.Ascii;

/* loaded from: classes5.dex */
final class zzanb {
    private static final zzanc zza = null;

    static {
        if (zzana.zzc() == false) goto L5;
        zzana.zzd();
    L5:
        zza = new zzanf();
    }

    public static /* synthetic */ int zza(byte[] r6, int r7, int r8) {
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
        if (r62 > (-65)) goto L24;
        return (r62 << 8) ^ r02;
    L24:
        return -1;
    L7:
        if (r82 != 2) goto L17;
        byte r83 = r6[r7];
        byte r63 = r6[r7 + 1];
        if (r02 > (-12)) goto L15;
        if (r83 > (-65)) goto L15;
        if (r63 > (-65)) goto L15;
        return (r63 << Ascii.DLE) ^ ((r83 << 8) ^ r02);
    L15:
        return -1;
    L17:
        throw new AssertionError();
    }

    public static String zzb(byte[] r1, int r2, int r3) throws zzakm {
        return zza.zza(r1, r2, r3);
    }

    public static boolean zzc(byte[] r2, int r3, int r4) {
        if (zza.zza(0, r2, r3, r4) != 0) goto L6;
        return true;
    L6:
        return false;
    }

    public static int zza(String r1, byte[] r2, int r3, int r4) {
        return zza.zza(r1, r2, r3, r4);
    }

    public static int zza(String r8) {
        int r02 = r8.length();
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L7;
        if (r8.charAt(r2) >= 128) goto L7;
        r2 = r2 + 1;
    L7:
        int r3 = r02;
    L8:
        if (r2 >= r02) goto L28;
        char r4 = r8.charAt(r2);
        if (r4 >= 2048) goto L12;
        r3 = r3 + ((127 - r4) >>> 31);
        r2 = r2 + 1;
        goto L8
    L12:
        int r42 = r8.length();
    L13:
        if (r2 >= r42) goto L27;
        char r6 = r8.charAt(r2);
        if (r6 >= 2048) goto L17;
        r1 = r1 + ((127 - r6) >>> 31);
    L26:
        r2 = r2 + 1;
        goto L13
    L17:
        r1 = r1 + 2;
        if (55296 > r6) goto L26;
        if (r6 > 57343) goto L26;
        if (Character.codePointAt(r8, r2) < 65536) goto L25;
        r2 = r2 + 1;
        goto L26
    L25:
        throw new zzane(r2, r42);
    L27:
        r3 = r3 + r1;
    L28:
        if (r3 < r02) goto L31;
        return r3;
    L31:
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (r3 + 4294967296L));
    }
}
