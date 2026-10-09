package com.guardsquare.dexguard;

import com.google.firebase.perf.util.Constants;

/* loaded from: classes6.dex */
public final class unregisterForContextMenu {
    private static void onOptionsItemSelected(int[] r3) {
        int r02 = 0;
    L4:
        if (r02 >= (r3.length / 2)) goto L6;
        int r1 = r3[r02];
        r3[r02] = r3[(r3.length - r02) - 1];
        r3[(r3.length - r02) - 1] = r1;
        r02 = r02 + 1;
        goto L4
    }

    public static void unregisterForContextMenu(int r11, int r12, boolean r13, int r14, int[] r15, int[][] r16, int[] r17) {
        if (r13 == true) goto L5;
        onOptionsItemSelected(r15);
    L5:
        int r2 = 0;
    L7:
        if (r2 >= r14) goto L9;
        int r112 = r11 ^ r15[r2];
        int r6 = (r112 >>> 16) & Constants.MAX_HOST_LENGTH;
        int r7 = (r112 >>> 8) & Constants.MAX_HOST_LENGTH;
        int r8 = r112 & Constants.MAX_HOST_LENGTH;
        int r122 = r12 ^ ((r16[2][r7] ^ (r16[0][r112 >>> 24] + r16[1][r6])) + r16[3][r8]);
        r2 = r2 + 1;
        r12 = r112;
        r11 = r122;
        goto L7
    L9:
        int r113 = r11 ^ r15[r15.length - 2];
        int r123 = r12 ^ r15[r15.length - 1];
        if (r13 == true) goto L12;
        onOptionsItemSelected(r15);
    L12:
        r17[0] = r123;
        r17[1] = r113;
    }
}
