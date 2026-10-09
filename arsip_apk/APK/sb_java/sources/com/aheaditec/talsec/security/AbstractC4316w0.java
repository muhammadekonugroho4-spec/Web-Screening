package com.aheaditec.talsec.security;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.aheaditec.talsec.security.w0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4316w0 implements B1 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f30753a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final String f30754b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final String f30755c = null;
    public static final String d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final String f30756e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final String f30757f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final String f30758g = null;

    static {
        byte[] r2 = {66, 111, 112, -61, 36, 17, -10, -97, 106};
        e(r2, new byte[]{72, -22, 39, -112, 88, 66, -104, -67, Ascii.SO});
        Charset r1 = StandardCharsets.UTF_8;
        f30758g = new String(r2, r1).intern();
        byte[] r3 = {53, 123, -78, 115, 123, -35, Ascii.ESC, 107, -27, -76, 94, -43, 110, 122, -59, Ascii.ESC, -44, -38, -14, Ascii.SUB, 98, 80, -104};
        e(r3, new byte[]{93, -34, -27, 0, 53, -114, -123, 17, -96, -112, 81, -114, Ascii.ETB, -21, -58, 89, -71, -113, -46, 98, Ascii.SI, 53, -21});
        f30757f = new String(r3, r1).intern();
        byte[] r22 = {-31, 44, 93, -91, 77, -73, 80};
        e(r22, new byte[]{-87, 41, 85, -74, 40, -44, 36, -18});
        f30756e = new String(r22, r1).intern();
        byte[] r4 = {43, -82, -106, -47, Ascii.US, -56};
        e(r4, new byte[]{111, -101, -6, -97, 126, -92, -30, 70});
        d = new String(r4, r1).intern();
        byte[] r42 = {-124, -38, Ascii.US, 111, 37, -81, -82, 50};
        e(r42, new byte[]{4, 122, -126, 1, 87, -83, -3, 61});
        f30755c = new String(r42, r1).intern();
        byte[] r43 = {103, Ascii.US, 74, -7, -55, -119, 17, -9, -126, Ascii.EM, 69, -55, 93, -53, -26, 120, 74, 43, Ascii.GS, 114, -21, -34};
        e(r43, new byte[]{37, 60, 79, 115, -61, -53, 102, -126, Ascii.CR, 77, 77, -114, 83, -113, -91, -11, 70, 53, -110, 6, -114, -83});
        f30754b = new String(r43, r1).intern();
        byte[] r23 = {108, -122, -65, 53, 97, 121};
        e(r23, new byte[]{Ascii.FS, -59, -30, 39, 4, Ascii.VT, 104, -120});
        f30753a = new String(r23, r1).intern();
    }

    public AbstractC4316w0() {
    }

    public static void e(byte[] r23, byte[] r24) {
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

    public final String b(boolean[] r11) {
        if (r11 != null) goto L6;
        return null;
    L6:
        StringBuilder r4 = new StringBuilder();
        int r5 = r11.length;
        int r6 = 0;
    L7:
        if (r6 >= r5) goto L15;
        if (r11[r6] == false) goto L12;
        byte[] r8 = {-105};
        e(r8, new byte[]{-90, -111, 46, 6, -26, 121, -105, -44});
        String r7 = new String(r8, StandardCharsets.UTF_8);
    L11:
        r4.append(r7.intern());
        r6 = r6 + 1;
        goto L7
    L12:
        byte[] r82 = {68};
        e(r82, new byte[]{116, -22, 55, 80, -106, -45, -49, -127});
        r7 = new String(r82, StandardCharsets.UTF_8);
        goto L11
    L15:
        return r4.toString();
    }

    public final JSONArray c(Collection r3) {
        JSONArray r02 = new JSONArray();
        if (r3 == null) goto L9;
        Iterator r32 = r3.iterator();
    L7:
        if (r32.hasNext() == false) goto L9;
        r02.put(((List) r32.next()).toString());
    L9:
        return r02;
    }

    public JSONObject d(X509Certificate r8) {
        JSONObject r02 = new JSONObject();
        byte[] r3 = {62, -43, -42, -63, 17, 68};
        e(r3, new byte[]{110, 118, -69, -101, 116, 54, -19, -121});
        Charset r5 = StandardCharsets.UTF_8;
        r02.put(new String(r3, r5).intern(), r8.getIssuerDN().getName());
        byte[] r6 = {107, 90, -101, -34, -20, -22, Ascii.EM, -4, -58, 2, 102, UnsignedBytes.MAX_POWER_OF_TWO, -7, 1, -52, -17, 114, 102, -20, Ascii.FF, -68, 65};
        e(r6, new byte[]{Ascii.EM, -7, -3, -110, -96, 104, 110, 119, -55, 55, 42, -43, -81, 69, -69, UnsignedBytes.MAX_POWER_OF_TWO, 46, -8, -94, 72, -39, 50});
        r02.put(new String(r6, r5).intern(), f(r8));
        byte[] r32 = {-66, -4, 49, -52, -61, 54, -72, 103};
        e(r32, new byte[]{-18, 95, 88, -96, -67, Ascii.DC4, 7, -21});
        r02.put(new String(r32, r5).intern(), b(r8.getIssuerUniqueID()));
        byte[] r2 = {-72, 39, -67, -112, 84, 70};
        e(r2, new byte[]{-30, Ascii.DC2, -27, -32, 53, 42, Ascii.EM, 45});
        r02.put(new String(r2, r5).intern(), r8.getSerialNumber());
        byte[] r22 = {67, 59, 63, 80, -108, Ascii.GS, -15};
        e(r22, new byte[]{71, Ascii.RS, 115, 33, -15, 126, -123, 85});
        r02.put(new String(r22, r5).intern(), r8.getSubjectDN().getName());
        byte[] r33 = {-102, 68, 113, -20, 49, -55, -103, 107, 79, 65, 8, -79, -111, Ascii.ETB, Ascii.NAK, -24, -72, 67, -9, 60, -19, 102, -105};
        e(r33, new byte[]{0, 2, 41, 109, 107, 122, 3, Ascii.DC2, 58, 5, -125, -86, Ascii.SYN, 71, 119, 104, -27, -10, -50, 68, UnsignedBytes.MAX_POWER_OF_TWO, 3, -28});
        r02.put(new String(r33, r5).intern(), g(r8));
        byte[] r23 = {48, -69, 92, UnsignedBytes.MAX_POWER_OF_TWO, 80, 49, 85, 73, 89};
        e(r23, new byte[]{90, -98, 84, -47, 76, 34, 55, -25, 61});
        r02.put(new String(r23, r5).intern(), b(r8.getSubjectUniqueID()));
        return r02;
    }

    public final JSONArray f(X509Certificate r1) {
        return c(r1.getIssuerAlternativeNames());
    L5:
        return new JSONArray();
    }

    public final JSONArray g(X509Certificate r1) {
        return c(r1.getSubjectAlternativeNames());
    L5:
        return new JSONArray();
    }
}
