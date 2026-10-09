package com.aheaditec.talsec.security;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes4.dex */
public class Z {

    /* renamed from: b, reason: collision with root package name */
    public static volatile Z f30547b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f30548c = null;
    public static final String d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final String f30549e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final String f30550f = null;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4288m1 f30551a;

    static {
        byte[] r2 = {62, -9, -52, -118, 39, 71, 58, -27, -89, -42, -75, Ascii.FS, 71, -85, -25, Ascii.ESC, 115};
        b(r2, new byte[]{53, -62, -103, -2, 62, 83, 61, -92, -87, -71, -64, -116, Ascii.ESC, -11, 125, -105, 1});
        Charset r1 = StandardCharsets.UTF_8;
        f30550f = new String(r2, r1).intern();
        byte[] r3 = {-4, -91, -98, -22, 99, 58, -68, 17, 105, Ascii.VT, -63, 5, -72, Ascii.CR, 57, -122, 106, -17};
        b(r3, new byte[]{120, -10, -42, -88, -17, -125, -71, -110, -17, -82, -120, Ascii.DEL, -64, -88, 65, Ascii.VT, Ascii.SI, -99});
        f30549e = new String(r3, r1).intern();
        byte[] r32 = {59, -123, -1, -45, -112, 113, 105, 32, 100, 85, 54, 10, -19, -34, -42, -125, -65, -3, 40};
        b(r32, new byte[]{SignedBytes.MAX_POWER_OF_TWO, Ascii.DC4, 119, -64, -72, 51, -10, 91, -12, 86, 60, 124, 108, -23, 115, 0, -34, -119, 77});
        d = new String(r32, r1).intern();
        byte[] r22 = {117, 19, -1, -60, 49, 61, -83, -70, -66, Ascii.SUB, 49, 46, 120, Ascii.FF, -40, -104, -28, 72, 123, 59};
        b(r22, new byte[]{2, -94, 118, -55, 87, 126, -72, -31, -60, -81, 73, 118, -7, -110, -106, -32, 105, 89, -7, 118});
        f30548c = new String(r22, r1).intern();
    }

    public Z(InterfaceC4288m1 r1) {
        this.f30551a = r1;
    }

    public static Z a(InterfaceC4288m1 r2) {
        if (f30547b != null) goto L16;
        monitor-enter(Z.class);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (f30547b != null) goto L11;
        f30547b = new Z(r2);     // Catch: Throwable -> L9
    L11:
        monitor-exit(Z.class);     // Catch: Throwable -> L9
    L16:
        return f30547b;
    }

    public static void b(byte[] r21, byte[] r22) {
        byte[] r2 = null;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r4 = 1180709023;
        byte[] r3 = null;
    L3:
        int r12 = ((r4 & 16777216) * (r4 | 16777216)) + ((r4 & (-16777217)) * ((~r4) & 16777216));
        int r42 = r4 >>> 8;
        boolean r11 = true;
        int r43 = AbstractC4289n.a(r42, r12, 1, ((-1) - r42) | ((-1) - r12));
        int r44 = (r43 ^ (-201803027)) + ((r43 & (-201803027)) * 2);
        int r15 = 1621215041;
        switch(((r44 - 814310662) - ((r44 & (-814310662)) * 2))) {
            case -2000520841: goto L29;
            case -870579640: goto L26;
            case -97532338: goto L20;
            case 298177592: goto L19;
            case 373627814: goto L18;
            case 975213712: goto L13;
            case 1548321255: goto L6;
            default: goto L5;
        };
    L6:
        int r23 = r21.length;
        int r32 = 0 - (0 - (r21.length % 4));
        if (((r23 & (~r32)) - ((~r23) & r32)) > 0) goto L9;
        r11 = false;
    L9:
        if (r11 == false) goto L11;
        r4 = 1910359311;
    L12:
        r2 = r22;
        r3 = r21;
        r6 = 0;
        goto L3
    L11:
        r4 = 1621215041;
        goto L12
    L18:
        return;
    L19:
        int r45 = r3.length;
        int r8 = 0 - r7;
        int r46 = AbstractC4292o.a(0, (r45 & 2) | r.a(r8, -4, 1, r45), r8 * 3, 1);
        byte r9 = r2[r46];
        int r10 = r3.length;
        int r82 = 0 - r8;
        int r112 = r82 | r10;
        byte r83 = r2[C.a(r82, 2, r112, (r10 ^ r82) ^ r112)];
        r2[r46] = (byte) (((byte) (r83 ^ r9)) + ((byte) (((byte) 2) * ((byte) (r83 & r9)))));
        r4 = 1565752577;
        goto L3
    L29:
        int r84 = r3.length ^ (0 - (0 - r5));
        if ((r2[((r4 & (~r7)) * 2) - r84] > Double.NaN ? 1 : (r2[((r4 & (~r7)) * 2) - r84] == Double.NaN ? 0 : -1)) > (-1)) goto L32;
        r11 = false;
    L32:
        if (r11 == false) goto L34;
        int r85 = 1565752577;
    L35:
        if (r11 == false) goto L37;
        r4 = r85;
    L38:
        r7 = r5;
        goto L3
    L37:
        r4 = -1164716566;
        goto L38
    L34:
        r85 = 1621215041;
    L5:
        r4 = r15;
        goto L3
    L26:
        int r122 = (r6 - 1) - (r6 | (-4));
        byte r47 = r2[r122];
        int r48 = ((r47 & 16777216) * (r47 | 16777216)) + ((r47 & UnsignedBytes.MAX_VALUE) * ((~r47) & 16777216));
        int r16 = (r6 + 3) + (((-1) - r6) | (-3));
        int r92 = r2[r16] & UnsignedBytes.MAX_VALUE;
        int r93 = r92 * ((~r92) & 65536);
        int r49 = ~((r48 | ((~r93) | (-1268032266))) - ((r93 & (-1268032266)) | r48));
        int r94 = A.a((-132004404) & r6, r6, 1, (-132004403) & r6);
        int r102 = r2[r94] & UnsignedBytes.MAX_VALUE;
        int r103 = r102 * ((~r102) & 256);
        int r104 = (r103 + r49) - (r103 & r49);
        int r410 = r2[r6] & UnsignedBytes.MAX_VALUE;
        int r105 = (r104 & (~r410)) + r410;
        byte r411 = r3[r122];
        int r412 = ((r411 & 16777216) * (r411 | 16777216)) + ((r411 & UnsignedBytes.MAX_VALUE) * ((~r411) & 16777216));
        int r13 = r3[r16] & UnsignedBytes.MAX_VALUE;
        int r132 = r13 * ((~r13) & 65536);
        int r413 = ~((r412 | ((~r132) | (-1355861741))) - (((-1355861741) & r132) | r412));
        int r133 = r3[r94] & UnsignedBytes.MAX_VALUE;
        int r134 = r133 * ((~r133) & 256);
        int r414 = AbstractC4289n.a(r134, r413, 1, ((-1) - r134) | ((-1) - r413));
        int r415 = (r414 - 1) - ((~(r3[r6] & UnsignedBytes.MAX_VALUE)) | r414);
        int r106 = r105 << ((r105 > Double.NaN ? 1 : (r105 == Double.NaN ? 0 : -1)) >>> 31);
        int r107 = (r106 ^ (-418000873)) + (((-418000873) & r106) * 2);
        int r108 = (r107 + r415) - ((r107 & r415) * 2);
        r3[r6] = (byte) r108;
        r3[r94] = (byte) (r108 >>> 8);
        r3[r16] = (byte) (r108 >>> 16);
        r3[r122] = (byte) (r108 >>> 24);
        r6 = (r6 ^ 4) + ((r6 & 4) * 2);
        int r95 = r3.length ^ D.a(r3.length, 4, 0, 0);
        if ((((r6 > (((r4 & (~r8)) * 2) - r95) ? 1 : (r6 == (((r4 & (~r8)) * 2) - r95) ? 0 : -1)) >>> 31) & 1) == 0) goto L5;
        r4 = 1910359311;
        goto L3
    L13:
        int r416 = r3.length;
        int r52 = 0 - r7;
        int r96 = r3.length;
        int r109 = ~r52;
        byte r97 = r3[((r96 | r52) - ((r109 & (-656070458)) & r96)) + ((r52 | (-656070458)) & r96)];
        int r14 = r3.length;
        byte r1010 = r2[((r109 ^ r14) + ((r14 | r52) * 2)) + 1];
        r3[((r416 | r52) * 2) - (r416 ^ r52)] = (byte) (((byte) (r1010 - r97)) + ((byte) (((byte) 2) * ((byte) ((~r1010) & r97)))));
        r5 = (~r7) + (r7 * 2);
        int r417 = ((r7 > 2 ? 1 : (r7 == 2 ? 0 : -1)) >>> 31) & 1;
        if (r417 == 0) goto L16;
        r15 = 986083301;
    L16:
        if (r417 != 0) goto L5;
    L25:
        r4 = -1138188205;
        goto L3
    L20:
        r5 = r3.length % 4;
        int r418 = ((r5 > 1 ? 1 : (r5 == 1 ? 0 : -1)) >>> 31) & 1;
        if (r418 == 0) goto L23;
        r15 = 986083301;
    L23:
        if (r418 == 0) goto L25;
        goto L25
    }
}
