package com.google.android.gms.internal.common;

/* loaded from: classes5.dex */
final class zzo extends zzn {
    private final char zza;

    public zzo(char r1) {
        this.zza = r1;
    }

    public final String toString() {
        char[] r02 = new char[6];
        int r2 = 0;
        r02[0] = '\\';
        r02[1] = 'u';
        r02[2] = 0;
        r02[3] = 0;
        r02[4] = 0;
        r02[5] = 0;
        int r3 = this.zza;
    L3:
        if (r2 >= 4) goto L6;
        r02[5 - r2] = "0123456789ABCDEF".charAt(r3 & 15);
        r3 = r3 >> 4;
        r2 = r2 + 1;
        goto L3
    L6:
        return "CharMatcher.is('" + String.copyValueOf(r02) + "')";
    }

    @Override // com.google.android.gms.internal.common.zzr
    public final boolean zza(char r2) {
        if (r2 != this.zza) goto L6;
        return true;
    L6:
        return false;
    }
}
