package com.google.android.gms.internal.auth;

import com.google.common.base.Ascii;

/* loaded from: classes5.dex */
final class zzhl extends zzhk {
    public zzhl() {
    }

    @Override // com.google.android.gms.internal.auth.zzhk
    public final int zza(int r8, byte[] r9, int r10, int r11) {
    L2:
        if (r10 >= r11) goto L7;
        if (r9[r10] < 0) goto L7;
        r10 = r10 + 1;
    L7:
        if (r10 < r11) goto L9;
        return 0;
    L9:
        if (r10 >= r11) goto L10;
        int r02 = r10 + 1;
        byte r1 = r9[r10];
        if (r1 < 0) goto L14;
        r10 = r02;
        goto L9
    L14:
        if (r1 < (-32)) goto L15;
        if (r1 < (-16)) goto L25;
        if (r02 >= (r11 - 2)) goto L46;
        int r2 = r10 + 2;
        byte r03 = r9[r02];
        if (r03 > (-65)) goto L55;
        if ((((r1 << Ascii.FS) + (r03 + 112)) >> 30) != 0) goto L55;
        int r04 = r10 + 3;
        if (r9[r2] > (-65)) goto L55;
        r10 = r10 + 4;
        if (r9[r04] <= (-65)) goto L9;
    L55:
        return -1;
    L46:
        return zzhm.zza(r9, r02, r11);
    L25:
        if (r02 >= (r11 - 1)) goto L27;
        int r5 = r10 + 2;
        byte r05 = r9[r02];
        if (r05 > (-65)) goto L42;
        if (r1 != (-32)) goto L36;
        if (r05 >= (-96)) goto L36;
        return -1;
    L36:
        if (r1 != (-19)) goto L40;
        if (r05 < (-96)) goto L40;
        return -1;
    L40:
        r10 = r10 + 3;
        if (r9[r5] <= (-65)) goto L9;
    L42:
        return -1;
    L27:
        return zzhm.zza(r9, r02, r11);
    L15:
        if (r02 >= r11) goto L21;
        if (r1 < (-62)) goto L20;
        r10 = r10 + 2;
        if (r9[r02] <= (-65)) goto L9;
    L20:
        return -1;
    L21:
        return r1;
    L10:
        return 0;
    }
}
