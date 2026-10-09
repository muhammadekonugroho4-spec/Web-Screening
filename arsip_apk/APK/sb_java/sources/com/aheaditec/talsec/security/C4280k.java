package com.aheaditec.talsec.security;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.aheaditec.talsec.security.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4280k {

    /* renamed from: a, reason: collision with root package name */
    public final Set f30624a;

    public C4280k() {
        this.f30624a = new LinkedHashSet();
    }

    public static void b(byte[] r24, byte[] r25) {
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

    public final void a(B1 r4) {
        byte[] r2 = {87, 101, 80, -29, 65, 60, Ascii.GS, -87};
        b(r2, new byte[]{62, Ascii.VT, 51, -118, 37, 89, 115, -35});
        kotlin.jvm.internal.p.l(r4, new String(r2, StandardCharsets.UTF_8).intern());
        this.f30624a.add(r4);
    }

    public final JSONObject c() {
        if (this.f30624a.isEmpty() == false) goto L6;
        return null;
    L6:
        JSONObject r02 = new JSONObject();
        Iterator r1 = this.f30624a.iterator();
    L8:
        if (r1.hasNext() == false) goto L10;
        ((B1) r1.next()).a(r02);
        goto L8
    L10:
        return r02;
    }
}
