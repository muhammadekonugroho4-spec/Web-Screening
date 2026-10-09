package com.google.android.recaptcha.internal;

import java.io.IOException;

/* loaded from: classes5.dex */
public abstract class zzkh {
    private static final zzkh zza = null;
    private static final zzkh zzb = null;

    static {
        zza = new zzke("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
        zzb = new zzke("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
        new zzkg("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new zzkg("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        zzkd r02 = new zzkd("base16()", "0123456789ABCDEF".toCharArray());
        new zzkg(r02, null);
        char[] r1 = new char[512];
        int r4 = 0;
        if (zzkd.zze(r02).length != 16) goto L5;
        boolean r2 = true;
    L6:
        zzjf.zza(r2);
    L8:
        if (r4 >= 256) goto L10;
        r1[r4] = r02.zza(r4 >>> 4);
        r1[r4 | 256] = r02.zza(r4 & 15);
        r4 = r4 + 1;
        goto L8
    L10:
        return;
    L5:
        r2 = false;
        goto L6
    }

    public zzkh() {
    }

    public static zzkh zzg() {
        return zza;
    }

    public static zzkh zzh() {
        return zzb;
    }

    public abstract int zza(byte[] r1, CharSequence r2) throws zzkf;

    public abstract void zzb(Appendable r1, byte[] r2, int r3, int r4) throws IOException;

    public abstract int zzc(int r1);

    public abstract int zzd(int r1);

    public CharSequence zze(CharSequence r1) {
        throw null;
    }

    public final String zzi(byte[] r3, int r4, int r5) {
        zzjf.zzd(0, r5, r3.length);
        StringBuilder r42 = new StringBuilder(zzd(r5));
        zzb(r42, r3, 0, r5);     // Catch: IOException -> L6
        return r42.toString();
    L6:
        e = move-exception;
        throw new AssertionError(e);
    }

    public final byte[] zzj(CharSequence r4) {
        CharSequence r42 = zze(r4);     // Catch: zzkf -> L7
        int r02 = zzc(r42.length());     // Catch: zzkf -> L7
        byte[] r1 = new byte[r02];     // Catch: zzkf -> L7
        int r43 = zza(r1, r42);     // Catch: zzkf -> L7
        if (r43 != r02) goto L5;
        return r1;
    L5:
        byte[] r03 = new byte[r43];     // Catch: zzkf -> L7
        System.arraycopy(r1, 0, r03, 0, r43);     // Catch: zzkf -> L7
        return r03;
    L7:
        e = move-exception;
        throw new IllegalArgumentException(e);
    }
}
