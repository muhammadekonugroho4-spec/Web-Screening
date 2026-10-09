package com.aheaditec.talsec.security;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final String f30304a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f30305b;

    public F(String r4, String[] r5) {
        byte[] r1 = {35, -100, -86, 80};
        a(r1, new byte[]{77, -3, -57, 53, -10, 82, 112, -101});
        kotlin.jvm.internal.p.l(r4, new String(r1, StandardCharsets.UTF_8).intern());
        this.f30304a = r4;
        this.f30305b = r5;
    }

    public static void a(byte[] r24, byte[] r25) {
        byte[] r2 = null;
        int r4 = -585497720;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        byte[] r3 = null;
    L3:
        int r12 = ((r4 & 16777216) * (r4 | 16777216)) + ((r4 & (-16777217)) * ((~r4) & 16777216));
        int r42 = r4 >>> 8;
        int r43 = ~((((~r42) | (-238348293)) | r12) - ((r42 & (-238348293)) | r12));
        int r8 = (-1081514022) - ((r43 & 2) | ((-10362931) - r43));
        int r14 = 2100390411;
        boolean r9 = true;
        switch(AbstractC4309u.a(r8 | (-428181225), 2, r8, -428181225)) {
            case -1819084085: goto L38;
            case -1350640889: goto L28;
            case -477594107: goto L27;
            case 769572960: goto L26;
            case 783648904: goto L20;
            case 1758587480: goto L13;
            case 2013813686: goto L6;
            default: goto L5;
        };
    L6:
        r7 = r2.length % 4;
        int r44 = ((r7 > 1 ? 1 : (r7 == 1 ? 0 : -1)) >>> 31) & 1;
        if (r44 != 0) goto L10;
        r14 = -897645243;
    L10:
        if (r44 != 0) goto L11;
    L44:
        r4 = -2079636786;
        goto L3
    L11:
        r4 = r14;
        goto L3
    L13:
        int r45 = r2.length;
        int r52 = 0 - r7;
        int r10 = (r52 | 822835569) & r45;
        int r82 = (822835569 & (~r52)) & r45;
        if ((r3[((r45 | r52) - r82) + r10] > Double.NaN ? 1 : (r3[((r45 | r52) - r82) + r10] == Double.NaN ? 0 : -1)) > (-1)) goto L16;
        r9 = false;
    L16:
        if (r9 == false) goto L18;
        r4 = -1057239115;
    L19:
        r5 = r7;
        goto L3
    L18:
        r4 = -897645243;
        goto L19
    L20:
        int r142 = (r6 + 4) + (((-1) - r6) | (-4));
        byte r46 = r3[r142];
        int r47 = ((r46 & 16777216) * (r46 | 16777216)) + ((r46 & UnsignedBytes.MAX_VALUE) * ((~r46) & 16777216));
        int r102 = r6 & 2;
        int r16 = (r6 + 2) - r102;
        int r122 = r3[r16] & UnsignedBytes.MAX_VALUE;
        int r123 = r122 * ((~r122) & 65536);
        int r48 = ~((r47 | ((~r123) | 467314697)) - ((r123 & 467314697) | r47));
        int r13 = (r6 + 1) - (r6 & 1);
        int r124 = r3[r13] & UnsignedBytes.MAX_VALUE;
        int r125 = r124 * ((~r124) & 256);
        int r49 = ~((r48 | ((~r125) | 1328859631)) - ((r125 & 1328859631) | r48));
        int r126 = r3[r6] & UnsignedBytes.MAX_VALUE;
        int r410 = AbstractC4289n.a(r49, r126, 1, ((-1) - r49) | ((-1) - r126));
        byte r127 = r2[r142];
        int r128 = ((r127 & 16777216) * (r127 | 16777216)) + ((r127 & UnsignedBytes.MAX_VALUE) * ((~r127) & 16777216));
        int r15 = r2[r16] & UnsignedBytes.MAX_VALUE;
        int r152 = r15 * ((~r15) & 65536);
        int r1 = A.a(((~r128) & 1647046022) & r152, r152, r128, (1647046022 | r128) & r152);
        int r11 = r2[r13] & UnsignedBytes.MAX_VALUE;
        int r112 = r11 * ((~r11) & 256);
        int r17 = ~((r1 | ((~r112) | (-2059442874))) - (((-2059442874) & r112) | r1));
        int r113 = r2[r6] & UnsignedBytes.MAX_VALUE;
        int r18 = AbstractC4289n.a(r17, r113, 1, ((-1) - r17) | ((-1) - r113));
        int r411 = r410 << ((r410 > Double.NaN ? 1 : (r410 == Double.NaN ? 0 : -1)) >>> 31);
        int r412 = (r411 + r18) - ((r411 & r18) * 2);
        r2[r6] = (byte) r412;
        r2[r13] = (byte) (r412 >>> 8);
        r2[r16] = (byte) (r412 >>> 16);
        r2[r142] = (byte) (r412 >>> 24);
        r6 = (-11) - (((-15) - r6) | r102);
        int r83 = r2.length ^ D.a(r2.length, 4, 0, 0);
        int r19 = ((r6 > (((r1 & (~r4)) * 2) - r83) ? 1 : (r6 == (((r1 & (~r4)) * 2) - r83) ? 0 : -1)) >>> 31) & 1;
        if (r19 == 0) goto L23;
        r4 = -897645243;
    L24:
        if (r19 == 0) goto L3;
        r4 = -1469476344;
        goto L3
    L23:
        r4 = 1251644638;
        goto L24
    L26:
        return;
    L27:
        int r110 = r2.length;
        int r413 = 0 - r5;
        int r111 = ((r110 | r413) - (((~r413) & (-515406864)) & r110)) + (((-515406864) | r413) & r110);
        byte r84 = r3[r111];
        int r92 = r2.length;
        byte r414 = r3[((r413 | r92) * 2) - (r92 ^ r413)];
        int r93 = ((byte) 0) - r84;
        int r85 = r93 | r414;
        r3[r111] = (byte) (((byte) (((byte) r85) - ((byte) (((byte) 2) * ((byte) r93))))) + ((byte) ((r414 ^ r93) ^ r85)));
        r4 = -1057239115;
        goto L3
    L28:
        int r114 = r24.length;
        int r22 = 0 - (r24.length % 4);
        if ((((r114 | r22) - (((~r22) & 942778902) & r114)) + ((942778902 | r22) & r114)) > 0) goto L31;
        r9 = false;
    L31:
        if (r9 == false) goto L33;
        int r153 = -897645243;
    L34:
        if (r9 == false) goto L36;
        r4 = -1469476344;
    L37:
        r3 = r25;
        r2 = r24;
        r6 = 0;
        goto L3
    L36:
        r4 = r153;
        goto L37
    L33:
        r153 = 1251644638;
        goto L34
    L38:
        int r115 = r2.length;
        int r415 = 0 - r5;
        int r103 = r2.length;
        int r129 = 0 - r415;
        byte r104 = r2[(r103 & (~r129)) - ((~r103) & r129)];
        int r116 = r2.length;
        byte r117 = r3[((r116 | r415) - (((~r415) & (-1678010279)) & r116)) + (((-1678010279) | r415) & r116)];
        r2[((r115 | r415) * 2) - (r115 ^ r415)] = (byte) (((byte) (((byte) (((byte) 2) * ((byte) (r117 | r104)))) - r117)) - r104);
        r7 = 4 - ((5 - r5) | (r5 & 2));
        int r118 = ((r5 > 2 ? 1 : (r5 == 2 ? 0 : -1)) >>> 31) & 1;
        if (r118 == 0) goto L41;
        r4 = 2100390411;
    L42:
        if (r118 == 0) goto L44;
    L41:
        r4 = -897645243;
        goto L42
    L5:
        r4 = -897645243;
        goto L3
    }

    public boolean equals(Object r6) {
        if (this != r6) goto L5;
        return true;
    L5:
        if (r6 == null) goto L7;
        Class<?> r2 = r6.getClass();
    L9:
        if (kotlin.jvm.internal.p.g(F.class, r2) == true) goto L11;
        return false;
    L11:
        byte[] r4 = {60, -6, 61, Ascii.EM, -118, 52, -7, -2, Ascii.DLE, 125, -56, -108, -118, 112, -41, -16, -11, -7, 68, -53, -118, -1, 91, 54, -85, -112, 70, 42, Ascii.VT, 93, -35, -22, 123, 43, 122, -32, -12, -44, 63, 34, UnsignedBytes.MAX_POWER_OF_TWO, 98, -73, 110, -22, -111, -4, Ascii.DC2, 69, Ascii.SUB, Ascii.DC2, 9, -96, -2, -94, -27, -110, -18, -94, -6, -43, 53, -121, -121, -39, -100, -108, -65, -124, Ascii.SYN, -113, -37, -51, -78, UnsignedBytes.MAX_POWER_OF_TWO, 113, -100, 113, 95, -1, 7, -4, 47, 80, -24, -97, 119, 122, 82, 2, -58, -34, -62};
        a(r4, new byte[]{82, -113, 81, 117, -86, 87, -104, -112, 126, Ascii.DC2, -68, -76, -24, Ascii.NAK, -9, -109, -108, -118, 48, -21, -2, -112, 123, 88, -60, -2, 107, 68, 126, 49, -79, -54, Ascii.SI, 82, 10, -123, -44, -73, 80, 79, -82, 3, -33, Ascii.VT, -117, -11, -107, 102, 32, 121, 60, 125, -63, -110, -47, UnsignedBytes.MAX_POWER_OF_TWO, -15, -79, -47, -97, -74, SignedBytes.MAX_POWER_OF_TWO, -11, -18, -83, -27, -70, -52, -31, 117, -6, -87, -92, -58, -7, 95, -7, Ascii.FS, 42, -109, 102, -120, SignedBytes.MAX_POWER_OF_TWO, 34, -58, -49, 5, Ascii.NAK, 34, 103, -76, -86, -69});
        kotlin.jvm.internal.p.j(r6, new String(r4, StandardCharsets.UTF_8).intern());
        F r62 = (F) r6;
        if (kotlin.jvm.internal.p.g(this.f30304a, r62.f30304a) == true) goto L14;
        return false;
    L14:
        String[] r02 = this.f30305b;
        String[] r63 = r62.f30305b;
        if (r02 == null) goto L21;
        if (r63 != null) goto L19;
        return false;
    L19:
        if (Arrays.equals(r02, r63) == true) goto L23;
        return false;
    L23:
        return true;
    L21:
        if (r63 == null) goto L23;
        return false;
    L7:
        r2 = null;
        goto L9
    }

    public int hashCode() {
        int r02 = this.f30304a.hashCode() * 31;
        String[] r1 = this.f30305b;
        if (r1 == null) goto L5;
        int r12 = Arrays.hashCode(r1);
    L7:
        return r02 + r12;
    L5:
        r12 = 0;
        goto L7
    }

    public String toString() {
        String r02 = this.f30304a;
        String r1 = Arrays.toString(this.f30305b);
        byte[] r4 = {Ascii.SO, -69, 112, 119, 45, 34, 45, Ascii.NAK, 62, -60, 75, Ascii.CAN, -117, -104};
        a(r4, new byte[]{94, -55, Ascii.US, 7, 72, 80, 89, 108, Ascii.SYN, -86, 42, 117, -18, -91});
        Charset r3 = StandardCharsets.UTF_8;
        String r2 = new String(r4, r3).intern();
        byte[] r6 = {48, 73, -65, -112, -47, 17, -4, -107};
        a(r6, new byte[]{Ascii.FS, 105, -55, -15, -67, 100, -103, -88});
        String r42 = new String(r6, r3).intern();
        byte[] r7 = {-6};
        a(r7, new byte[]{-45, -73, -111, -55, 38, -22, 41, 54});
        return r2 + r02 + r42 + r1 + new String(r7, r3).intern();
    }
}
