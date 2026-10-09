package com.github.piasy.biv.metadata;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class a {
    public static int a(File r5) {
        int r02 = 0;
        FileInputStream r1 = new FileInputStream(r5);     // Catch: IOException -> L8
        byte[] r52 = new byte[21];     // Catch: IOException -> L8
        int r2 = r1.read(r52);     // Catch: IOException -> L8
        if (r2 < 3) goto L11;
        if (c(r52) == false) goto L11;
        r02 = 1;
    L22:
        r1.close();     // Catch: IOException -> L8
        return r02;
    L11:
        if (r2 < 12) goto L22;
        if (d(r52) == false) goto L22;
        if (r2 >= 17) goto L17;
    L21:
        r02 = 3;
        goto L22
    L17:
        if (b(r52) == false) goto L21;
        r02 = 2;
        if ((r52[20] & 2) == 0) goto L21;
    L8:
        e = move-exception;
        e.printStackTrace();
        return r02;
    }

    public static boolean b(byte[] r2) {
        if (r2[12] == 86) goto L5;
        return false;
    L5:
        if (r2[13] == 80) goto L7;
        return false;
    L7:
        if (r2[14] == 56) goto L9;
        return false;
    L9:
        if (r2[15] != 88) goto L16;
        return true;
    L16:
        return false;
    }

    public static boolean c(byte[] r4) {
        if (r4[0] == 71) goto L5;
    L9:
        return false;
    L5:
        if (r4[1] != 73) goto L9;
        if (r4[2] != 70) goto L9;
        return true;
    }

    public static boolean d(byte[] r4) {
        if (r4[0] == 82) goto L5;
    L19:
        return false;
    L5:
        if (r4[1] != 73) goto L19;
        if (r4[2] != 70) goto L19;
        if (r4[3] != 70) goto L19;
        if (r4[8] != 87) goto L19;
        if (r4[9] != 69) goto L19;
        if (r4[10] != 66) goto L19;
        if (r4[11] != 80) goto L19;
        return true;
    }

    public static String e(int r1) {
        if (r1 != 1) goto L5;
        return "GIF";
    L5:
        if (r1 != 2) goto L7;
        return "ANIMATED_WEBP";
    L7:
        if (r1 == 3) goto L10;
        return "STILL_IMAGE";
    L10:
        return "STILL_WEBP";
    }
}
