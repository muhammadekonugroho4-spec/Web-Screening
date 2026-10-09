package com.aheaditec.talsec.security;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* renamed from: com.aheaditec.talsec.security.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4318x {

    /* renamed from: a, reason: collision with root package name */
    public static final String f30759a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final String f30760b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final String f30761c = null;
    public static final String d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final String f30762e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final String f30763f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final Integer f30764g = null;

    /* renamed from: h, reason: collision with root package name */
    public static final Integer f30765h = null;

    /* renamed from: i, reason: collision with root package name */
    public static final Integer f30766i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final Integer f30767j = null;

    /* renamed from: k, reason: collision with root package name */
    public static final Integer f30768k = null;

    /* renamed from: l, reason: collision with root package name */
    public static final Integer f30769l = null;

    /* renamed from: m, reason: collision with root package name */
    public static final Integer f30770m = null;

    /* renamed from: n, reason: collision with root package name */
    public static final Integer f30771n = null;

    /* renamed from: o, reason: collision with root package name */
    public static final Integer f30772o = null;

    /* renamed from: p, reason: collision with root package name */
    public static final Integer f30773p = null;

    /* renamed from: q, reason: collision with root package name */
    public static final Integer f30774q = null;

    /* renamed from: r, reason: collision with root package name */
    public static final Integer f30775r = null;

    /* renamed from: s, reason: collision with root package name */
    public static final Integer f30776s = null;

    /* renamed from: t, reason: collision with root package name */
    public static final Integer f30777t = null;

    static {
        byte[] r2 = {120, -99, 50, -94, -65, 72};
        a(r2, new byte[]{45, -67, -118, 52, -111, 121, 53, 116});
        Charset r4 = StandardCharsets.UTF_8;
        f30763f = new String(r2, r4).intern();
        byte[] r1 = {57, 110, -5, 79, 95, Ascii.CAN};
        a(r1, new byte[]{-109, 58, Ascii.EM, -37, 41, 125, 53, -64});
        f30762e = new String(r1, r4).intern();
        byte[] r12 = {-36, 123, 108, -123};
        a(r12, new byte[]{-18, Ascii.FS, -78, -117, 69, -16, -81, -77});
        d = new String(r12, r4).intern();
        byte[] r13 = {53, 96, 36, 108, 80};
        a(r13, new byte[]{-69, 44, -27, -89, 51, -101, -39, 108});
        f30761c = new String(r13, r4).intern();
        byte[] r14 = {-125, 32, -70, -25, 86, 35, 81};
        a(r14, new byte[]{85, 107, SignedBytes.MAX_POWER_OF_TWO, 47, 55, 80, 52, 39});
        f30760b = new String(r14, r4).intern();
        byte[] r22 = {Ascii.ETB, 70, -23, 77, -69, Ascii.DEL, -15, -88, -82, 77, 103, -73, -127, Ascii.GS, Ascii.NAK, 83, -58, -5, 39, 10, 120, Ascii.CAN, -68, -94, -72, 95, 51, 99, 56};
        a(r22, new byte[]{-40, 92, 54, -98, 62, 5, 6, 106, 54, 82, -83, 124, 70, 37, -13, -44, 6, -102, -4, Ascii.SI, 67, 117, 75, 102, 41, 63, -52, -79, 65});
        f30759a = new String(r22, r4).intern();
        f30764g = null;
        f30765h = null;
        f30766i = null;
        f30767j = null;
        f30768k = null;
        f30769l = null;
        f30770m = null;
        f30771n = null;
        f30772o = null;
        f30773p = null;
        f30774q = null;
        f30775r = null;
        f30776s = null;
        f30777t = null;
    }

    public static void a(byte[] r23, byte[] r24) {
        byte[] r2 = null;
        int r4 = -1003175592;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        byte[] r3 = null;
    L3:
        int r12 = ((r4 & 16777216) * (r4 | 16777216)) + ((r4 & (-16777217)) * ((~r4) & 16777216));
        int r42 = r4 >>> 8;
        int r43 = ~((((~r42) | (-1095531540)) | r12) - ((r42 & (-1095531540)) | r12));
        int r8 = (-1171264002) - ((r43 & 2) | ((-130029571) - r43));
        int r44 = (-1109882652) ^ ((~r8) + ((r8 | 1) * 2));
        int r15 = -1216566512;
        boolean r82 = true;
        switch(r44) {
            case -1922532006: goto L40;
            case -1486048729: goto L30;
            case -497756741: goto L28;
            case 256719606: goto L20;
            case 1429728656: goto L13;
            case 1870596681: goto L12;
            case 1879000533: goto L6;
            default: goto L5;
        };
    L6:
        int r45 = r3.length;
        int r52 = 0 - r6;
        int r9 = 0 - r52;
        int r10 = r9 | r45;
        int r46 = (r45 ^ r9) ^ r10;
        int r122 = r9 * 2;
        int r13 = r3.length;
        byte r92 = r3[(r9 ^ r13) - (((~r13) & r9) * 2)];
        int r132 = r3.length;
        byte r53 = r2[((r52 | r132) * 2) - (r132 ^ r52)];
        r3[(r10 - r122) + r46] = (byte) (((((byte) (~r53)) + ((byte) (((byte) 2) * ((byte) (r53 | 1))))) ^ r92) ^ 1);
        r5 = (~r6) + (r6 * 2);
        int r47 = ((r6 > 2 ? 1 : (r6 == 2 ? 0 : -1)) >>> 31) & 1;
        if (r47 != 0) goto L10;
        r15 = 935800592;
    L10:
        if (r47 != 0) goto L11;
    L19:
        r4 = -1058029970;
    L11:
        r4 = r15;
        goto L3
    L12:
        return;
    L13:
        r5 = r3.length % 4;
        int r48 = ((r5 > 1 ? 1 : (r5 == 1 ? 0 : -1)) >>> 31) & 1;
        if (r48 != 0) goto L17;
        r15 = 935800592;
    L17:
        if (r48 == 0) goto L19;
    L20:
        int r152 = (r7 - 1) - (r7 | (-4));
        byte r49 = r2[r152];
        int r410 = ((r49 & 16777216) * (r49 | 16777216)) + ((r49 & UnsignedBytes.MAX_VALUE) * ((~r49) & 16777216));
        int r18 = r7 + 2;
        int r93 = r18 - (r7 & 2);
        int r102 = r2[r93] & UnsignedBytes.MAX_VALUE;
        int r103 = r102 * ((~r102) & 65536);
        int r411 = AbstractC4289n.a(r103, r410, 1, ((-1) - r103) | ((-1) - r410));
        int r182 = r18 + (((-1) - r7) | (-2));
        int r104 = r2[r182] & UnsignedBytes.MAX_VALUE;
        int r105 = r104 * ((~r104) & 256);
        int r106 = (r105 - 1) - ((~r411) | r105);
        int r412 = r2[r7] & UnsignedBytes.MAX_VALUE;
        int r413 = ~((r412 | ((~r106) | (-755325340))) - ((r106 & (-755325340)) | r412));
        byte r107 = r3[r152];
        int r108 = ((r107 & 16777216) * (r107 | 16777216)) + ((r107 & UnsignedBytes.MAX_VALUE) * ((~r107) & 16777216));
        int r123 = r3[r93] & UnsignedBytes.MAX_VALUE;
        int r124 = r123 * ((~r123) & 65536);
        int r133 = r3[r182] & UnsignedBytes.MAX_VALUE;
        int r134 = r133 * ((~r133) & 256);
        int r14 = r3[r7] & UnsignedBytes.MAX_VALUE;
        byte[] r19 = r2;
        int r1 = r413 << ((r413 > Double.NaN ? 1 : (r413 == Double.NaN ? 0 : -1)) >>> 31);
        int r414 = (-659933419) - ((1983400305 - r108) | (r108 & 2));
        int r415 = ((r414 ^ (~r124)) + ((r414 | r124) * 2)) + 1;
        int r416 = (r415 ^ r14) + ((r415 & r14) * 2);
        int r417 = ((r416 | r134) - (((-2109111237) & (~r134)) & r416)) + ((r134 | (-2109111237)) & r416);
        int r16 = AbstractC4309u.a(r1 | r417, 2, r1, r417);
        r3[r7] = (byte) r16;
        r3[r182] = (byte) (r16 >>> 8);
        r3[r93] = (byte) (r16 >>> 16);
        r3[r152] = (byte) (r16 >>> 24);
        r7 = (r7 ^ 4) + ((r7 & 4) * 2);
        int r418 = r3.length ^ (0 - (r3.length % 4));
        int r17 = ((r7 > (((r1 | r2) * 2) - r418) ? 1 : (r7 == (((r1 | r2) * 2) - r418) ? 0 : -1)) >>> 31) & 1;
        if (r17 == 0) goto L23;
        r4 = -1515449616;
    L24:
        r2 = r19;
        if (r17 != 0) goto L3;
        r4 = -10521562;
        goto L3
    L23:
        r4 = 935800592;
        goto L24
    L28:
        byte[] r192 = r2;
        int r110 = r3.length;
        int r22 = 0 - r6;
        int r111 = ((r110 | r22) * 2) - (r110 ^ r22);
        byte r419 = r192[r111];
        int r94 = r3.length;
        byte r25 = r192[((r22 | r94) - (((~r22) & 1163302289) & r94)) + ((1163302289 | r22) & r94)];
        r192[r111] = (byte) (((byte) (((byte) (r25 ^ (~r419))) + ((byte) (((byte) 2) * ((byte) (r25 | r419)))))) + ((byte) 1));
        r4 = 935800592;
    L29:
        r2 = r192;
        goto L3
    L30:
        int r112 = r23.length;
        int r26 = 0 - (0 - (r23.length % 4));
        if (((r112 & (~r26)) - ((~r112) & r26)) > 0) goto L33;
        r82 = false;
    L33:
        if (r82 == false) goto L35;
        int r125 = -1515449616;
    L36:
        if (r82 == false) goto L38;
        r4 = r125;
    L39:
        r2 = r24;
        r3 = r23;
        r7 = 0;
        goto L3
    L38:
        r4 = -10521562;
        goto L39
    L35:
        r125 = 935800592;
        goto L36
    L40:
        r192 = r2;
        int r27 = 0 - r5;
        int r420 = r27 * 3;
        int r28 = r.a(r27, -4, 1, r3.length);
        if ((r192[AbstractC4292o.a(0, (r1 & 2) | r28, r420, 1)] > Double.NaN ? 1 : (r192[AbstractC4292o.a(0, (r1 & 2) | r28, r420, 1)] == Double.NaN ? 0 : -1)) > (-1)) goto L43;
        r82 = false;
    L43:
        if (r82 == false) goto L45;
        r4 = 935800592;
    L46:
        r6 = r5;
        goto L29
    L45:
        r4 = -1671996003;
        goto L46
    L5:
        r4 = 935800592;
        goto L3
    }
}
