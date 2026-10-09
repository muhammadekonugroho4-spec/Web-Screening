package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes5.dex */
final class zzh extends zzi {
    private final char zza;

    public zzh(char r1) {
        this.zza = r1;
    }

    public final String toString() {
        char r02 = this.zza;
        char[] r1 = new char[6];
        int r3 = 0;
        r1[0] = '\\';
        r1[1] = 'u';
        r1[2] = 0;
        r1[3] = 0;
        r1[4] = 0;
        r1[5] = 0;
    L3:
        if (r3 >= 4) goto L6;
        r1[5 - r3] = "0123456789ABCDEF".charAt(r02 & 15);
        r02 = (char) (r02 >> 4);
        r3 = r3 + 1;
        goto L3
    L6:
        return "CharMatcher.is('" + String.copyValueOf(r1) + "')";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzf
    public final boolean zza(char r2) {
        if (r2 != this.zza) goto L6;
        return true;
    L6:
        return false;
    }
}
