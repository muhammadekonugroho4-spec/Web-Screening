package com.aheaditec.talsec.security;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.nio.charset.StandardCharsets;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class X0 implements B1 {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f30540a;

    public X0(int[] r4) {
        byte[] r2 = {-118, 105, 101, -31, Ascii.ESC, 19, -17, -91, 59, -8, 117, -60, -89, 2, -88, 96, 73, -53, 80, 59, UnsignedBytes.MAX_POWER_OF_TWO, 70, -90};
        b(r2, new byte[]{-43, 60, -18, -83, 87, -111, 116, 10, 71, -69, -21, -59, -78, -107, -53, 39, 19, -46, Ascii.RS, 119, -18, 50, -43});
        kotlin.jvm.internal.p.l(r4, new String(r2, StandardCharsets.UTF_8).intern());
        this.f30540a = r4;
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

    @Override // com.aheaditec.talsec.security.B1
    public void a(JSONObject r7) {
        byte[] r2 = {-12, -118, -77, Ascii.SYN};
        b(r2, new byte[]{-121, 41, -57, -111, Ascii.DC4, 5, -13, 114});
        kotlin.jvm.internal.p.l(r7, new String(r2, StandardCharsets.UTF_8).intern());
        JSONArray r1 = new JSONArray();
        int[] r22 = this.f30540a;
        int r3 = r22.length;
        int r4 = 0;
    L3:
        if (r4 >= r3) goto L5;
        r1.put(r22[r4]);
        r4 = r4 + 1;
        goto L3
    L5:
        byte[] r32 = {-27, Ascii.VT, 42, -3, -83, -97, 75, 44, -29, 118, -19, -88, 38, 72, 85, 111, -106, Ascii.GS, 123, 42, Ascii.DLE};
        b(r32, new byte[]{118, -102, 67, -44, -79, 46, 42, 114, 122, 67, -93, -26, 62, 108, 38, Ascii.SUB, -38, -119, 4, 119, 113});
        r7.put(new String(r32, StandardCharsets.UTF_8).intern(), r1);
    }
}
