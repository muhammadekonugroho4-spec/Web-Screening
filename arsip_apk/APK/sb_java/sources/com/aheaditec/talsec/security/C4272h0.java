package com.aheaditec.talsec.security;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* renamed from: com.aheaditec.talsec.security.h0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4272h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f30606a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final String f30607b = null;

    static {
        byte[] r2 = {-63, 53, -109, -103, -51, 79, -48, 43, 67, 81, -17, 70, -65, -83, -45, Ascii.CR, -31, 122, 33, 85, 108};
        b(r2, new byte[]{-71, 42, 19, -43, -42, -16, -47, 85, 82, 4, -94, Ascii.SUB, -30, -108, -46, 74, -55, -34, 85, 8, 9});
        Charset r1 = StandardCharsets.UTF_8;
        f30607b = new String(r2, r1).intern();
        byte[] r3 = {57, 43, -102, 1, -39, 113, 63, 9, 38, -121, 66, SignedBytes.MAX_POWER_OF_TWO, -107, 115, -91, Ascii.SI, -117, -3};
        b(r3, new byte[]{114, Ascii.RS, 17, 93, -77, -39, 111, 81, 106, -61, 65, Ascii.SYN, Ascii.DC2, -15, -26, 85, -1, -104});
        f30606a = new String(r3, r1).intern();
    }

    public C4272h0() {
    }

    public static void b(byte[] r23, byte[] r24) {
        byte[] r2 = null;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r4 = 1516727821;
        byte[] r3 = null;
    L3:
        int r12 = ((r4 & 16777216) * (r4 | 16777216)) + ((r4 & (-16777217)) * ((~r4) & 16777216));
        int r42 = r4 >>> 8;
        int r43 = A.a((650911840 & (~r12)) & r42, r42, r12, (r12 | 650911840) & r42);
        int r44 = (r43 ^ 642535957) + ((r43 & 642535957) * 2);
        int r16 = -365117735;
        boolean r9 = true;
        switch((((~r44) + ((r44 | 1) * 2)) ^ 962785775)) {
            case -1896910703: goto L41;
            case -1725904394: goto L38;
            case -1399959314: goto L31;
            case -1135475043: goto L30;
            case 180635757: goto L20;
            case 511524454: goto L16;
            case 961838909: goto L6;
            default: goto L19;
        };
    L16:
        int r45 = r3.length;
        int r72 = 0 - r5;
        int r11 = 0 - r72;
        int r10 = ((~r45) & r11) * 2;
        int r13 = r3.length;
        byte r132 = r3[((r13 | r72) * 2) - (r13 ^ r72)];
        int r14 = r3.length;
        byte r73 = r2[(r72 ^ r14) + ((r14 & r72) * 2)];
        r3[(r45 ^ r11) - r10] = (byte) (((byte) (r73 - r132)) + ((byte) (((byte) 2) * ((byte) ((~r73) & r132)))));
        r7 = AbstractC4317w1.a(r5, 3, (~r5) * 2, 1);
        if ((((r5 > 2 ? 1 : (r5 == 2 ? 0 : -1)) >>> 31) & 1) == 0) goto L19;
    L40:
        r4 = -458924450;
        goto L3
    L20:
        int r22 = r23.length;
        int r32 = 0 - (r23.length % 4);
        if ((((r22 ^ (~r32)) + ((r22 | r32) * 2)) + 1) > 0) goto L23;
        r9 = false;
    L23:
        if (r9 == false) goto L25;
        int r112 = -1605440657;
    L26:
        if (r9 == false) goto L28;
        r4 = r112;
    L29:
        r2 = r24;
        r3 = r23;
        r6 = 0;
        goto L3
    L28:
        r4 = -169475207;
        goto L29
    L25:
        r112 = -365117735;
        goto L26
    L30:
        return;
    L31:
        int r46 = A.a((-1205100636) & r6, r6, 3, (-1205100633) & r6);
        byte r8 = r2[r46];
        int r82 = ((r8 & 16777216) * (r8 | 16777216)) + ((r8 & UnsignedBytes.MAX_VALUE) * ((~r8) & 16777216));
        int r18 = r6 - 1;
        int r133 = r18 - (r6 | (-3));
        int r102 = r2[r133] & UnsignedBytes.MAX_VALUE;
        int r103 = r102 * ((~r102) & 65536);
        int r83 = AbstractC4289n.a(r103, r82, 1, ((-1) - r103) | ((-1) - r82));
        int r182 = r18 - (r6 | (-2));
        int r104 = r2[r182] & UnsignedBytes.MAX_VALUE;
        int r105 = r104 * ((~r104) & 256);
        int r106 = (r105 - 1) - ((~r83) | r105);
        int r84 = r2[r6] & UnsignedBytes.MAX_VALUE;
        int r85 = AbstractC4289n.a(r106, r84, 1, ((-1) - r106) | ((-1) - r84));
        byte r107 = r3[r46];
        int r108 = ((r107 & 16777216) * (r107 | 16777216)) + ((r107 & UnsignedBytes.MAX_VALUE) * ((~r107) & 16777216));
        int r113 = r3[r133] & UnsignedBytes.MAX_VALUE;
        int r114 = ((r113 * ((~r113) & 65536)) & (~r108)) + r108;
        int r109 = r3[r182] & UnsignedBytes.MAX_VALUE;
        int r1010 = r109 * ((~r109) & 256);
        int r1011 = ~((((~r1010) | 911399251) | r114) - ((911399251 & r1010) | r114));
        int r115 = r3[r6] & UnsignedBytes.MAX_VALUE;
        int r1012 = ~((((~r1011) | 1433568692) | r115) - ((1433568692 & r1011) | r115));
        int r86 = r85 << ((r85 > Double.NaN ? 1 : (r85 == Double.NaN ? 0 : -1)) >>> 31);
        int r116 = (-1254002618) - ((r86 & 2) | ((-1672003491) - r86));
        int r117 = (r116 + r1012) - ((r116 & r1012) * 2);
        r3[r6] = (byte) r117;
        r3[r182] = (byte) (r117 >>> 8);
        r3[r133] = (byte) (r117 >>> 16);
        r3[r46] = (byte) (r117 >>> 24);
        r6 = (r6 ^ 4) + ((r6 & 4) * 2);
        int r47 = r3.length;
        int r87 = 0 - (r3.length % 4);
        int r1013 = r87 * 3;
        int r88 = r.a(r87, -4, 1, r47);
        int r48 = ((r6 > AbstractC4292o.a(0, (r47 & 2) | r88, r1013, 1) ? 1 : (r6 == AbstractC4292o.a(0, (r47 & 2) | r88, r1013, 1) ? 0 : -1)) >>> 31) & 1;
        if (r48 == 0) goto L34;
        int r118 = -1605440657;
    L35:
        if (r48 != 0) goto L36;
        r4 = -169475207;
        goto L3
    L36:
        r4 = r118;
        goto L3
    L34:
        r118 = -365117735;
        goto L35
    L38:
        r7 = r3.length % 4;
        if ((((r7 > 1 ? 1 : (r7 == 1 ? 0 : -1)) >>> 31) & 1) == 0) goto L19;
    L41:
        int r49 = r3.length;
        int r89 = 0 - r5;
        int r410 = (r49 ^ r89) + ((r49 & r89) * 2);
        byte r92 = r2[r410];
        int r1014 = r3.length;
        int r810 = 0 - r89;
        int r119 = r810 | r1014;
        byte r811 = r2[C.a(r810, 2, r119, (r1014 ^ r810) ^ r119)];
        r2[r410] = (byte) (((byte) (((byte) 2) * ((byte) (r811 | r92)))) - ((byte) (r811 ^ r92)));
        r4 = -746753280;
    L19:
        r4 = -365117735;
        goto L3
    L6:
        int r411 = r3.length;
        int r52 = 0 - r7;
        int r1015 = (r52 | 165327505) & r411;
        int r812 = (165327505 & (~r52)) & r411;
        if ((r2[((r411 | r52) - r812) + r1015] > Double.NaN ? 1 : (r2[((r411 | r52) - r812) + r1015] == Double.NaN ? 0 : -1)) > (-1)) goto L9;
        r9 = false;
    L9:
        if (r9 == true) goto L12;
        r16 = 1093626513;
    L12:
        if (r9 == false) goto L14;
        r4 = -746753280;
    L15:
        r5 = r7;
        goto L3
    L14:
        r4 = r16;
        goto L15
    }

    public JSONObject a(C4313v0 r2) {
        JSONObject r02 = new JSONObject();
        if (r2 != null) goto L5;
        return r02;
    L5:
        r2.b();
        return r02;
    }
}
