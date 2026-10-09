package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.perf.util.Constants;

@KeepForSdk
/* loaded from: classes5.dex */
public class MurmurHash3 {
    private MurmurHash3() {
    }

    @KeepForSdk
    public static int murmurhash3_x86_32(byte[] r7, int r8, int r9, int r10) {
        int r02 = r8;
    L3:
        int r1 = (r9 & (-4)) + r8;
        if (r02 >= r1) goto L6;
        int r12 = r7[r02] & Constants.MAX_HOST_LENGTH;
        int r4 = (r7[r02 + 1] & Constants.MAX_HOST_LENGTH) << 8;
        int r13 = (((r12 | r4) | ((r7[r02 + 2] & Constants.MAX_HOST_LENGTH) << 16)) | (r7[r02 + 3] << 24)) * (-862048943);
        int r102 = r10 ^ (((r13 >>> 17) | (r13 << 15)) * 461845907);
        r10 = (((r102 >>> 19) | (r102 << 13)) * 5) - 430675100;
        r02 = r02 + 4;
        goto L3
    L6:
        int r82 = r9 & 3;
        int r03 = 0;
        if (r82 != 1) goto L9;
    L15:
        int r72 = ((r7[r1] & Constants.MAX_HOST_LENGTH) | r03) * (-862048943);
        r10 = r10 ^ (((r72 >>> 17) | (r72 << 15)) * 461845907);
    L16:
        int r73 = r10 ^ r9;
        int r74 = (r73 ^ (r73 >>> 16)) * (-2048144789);
        int r75 = (r74 ^ (r74 >>> 13)) * (-1028477387);
        return r75 ^ (r75 >>> 16);
    L9:
        if (r82 != 2) goto L11;
    L14:
        r03 = r03 | ((r7[r1 + 1] & Constants.MAX_HOST_LENGTH) << 8);
        goto L15
    L11:
        if (r82 != 3) goto L16;
        r03 = (r7[r1 + 2] & Constants.MAX_HOST_LENGTH) << 16;
        goto L14
    }
}
