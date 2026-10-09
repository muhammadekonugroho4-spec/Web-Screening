package com.aheaditec.talsec_security.security.api;

import android.util.Base64;
import com.aheaditec.talsec.security.A;
import com.aheaditec.talsec.security.AbstractC4289n;
import com.aheaditec.talsec.security.AbstractC4292o;
import com.aheaditec.talsec.security.AbstractC4317w1;
import com.aheaditec.talsec.security.C;
import com.aheaditec.talsec.security.r;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f30816a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f30817b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30818c;
    public final String[] d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f30819e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f30820f;

    /* renamed from: g, reason: collision with root package name */
    public final String[][] f30821g;

    /* renamed from: h, reason: collision with root package name */
    public final String[] f30822h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f30823i;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f30824a;

        /* renamed from: b, reason: collision with root package name */
        public final String[] f30825b;

        /* renamed from: c, reason: collision with root package name */
        public String f30826c;
        public String[] d;

        /* renamed from: e, reason: collision with root package name */
        public String[] f30827e;

        /* renamed from: f, reason: collision with root package name */
        public String[] f30828f;

        /* renamed from: g, reason: collision with root package name */
        public String[][] f30829g;

        /* renamed from: h, reason: collision with root package name */
        public String[] f30830h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f30831i;

        public a(String r2, String[] r3) {
            this.f30831i = true;
            this.f30824a = r2;
            this.f30825b = r3;
        }

        public String[] a() {
            return this.f30828f;
        }

        public String[] b() {
            return this.f30827e;
        }

        public a c(String[] r1) {
            this.f30828f = r1;
            return this;
        }

        public a d(String[] r1) {
            this.f30827e = r1;
            return this;
        }

        public d e() {
            return new d(this);
        }

        public String f() {
            return this.f30824a;
        }

        public String[] g() {
            return this.f30825b;
        }

        public boolean h() {
            return this.f30831i;
        }

        public String[] i() {
            return this.d;
        }

        public String[][] j() {
            return this.f30829g;
        }

        public String k() {
            return this.f30826c;
        }

        public String[] l() {
            return this.f30830h;
        }

        public a m(boolean r1) {
            this.f30831i = r1;
            return this;
        }

        public a n(String[][] r1) {
            this.f30829g = r1;
            return this;
        }

        public a o(String r1) {
            this.f30826c = r1;
            return this;
        }

        public a p(String[] r1) {
            this.f30830h = r1;
            return this;
        }
    }

    public d(a r4) {
        if (r4.f() == null) goto L6;
        b(r4.g());
        this.f30816a = r4.f();
        this.f30817b = r4.g();
        this.f30818c = r4.k();
        this.d = r4.i();
        this.f30819e = r4.b();
        this.f30820f = r4.a();
        this.f30821g = r4.j();
        this.f30822h = r4.l();
        this.f30823i = r4.h();
        return;
    L6:
        byte[] r2 = {-34, -17, -97, -59, -9, 39, Ascii.ETB, -64, 93, Ascii.SUB, -127, -118, 85, 53, -29, -34, Ascii.SYN, -114, 70, 46, Ascii.SYN, -65, -23, 50, -69, 109, 38, -105};
        a(r2, new byte[]{-78, 103, 5, -120, -85, 35, -120, -117, 36, 75, -8, -56, 75, 34, -100, 119, -114, -77, 57, -11, -106, -100, -33, 67, -27, -47, 95, -96});
        throw new IllegalArgumentException(new String(r2, StandardCharsets.UTF_8).intern());
    }

    public static void a(byte[] r23, byte[] r24) {
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

    public static void b(String[] r7) {
        int r1 = 0;
        if (r7 != null) goto L5;
    L18:
        byte[] r2 = {92, 122, Ascii.VT, 5, -115, 79, 60, -114, -47, 102, Ascii.NAK, 99, -115, Ascii.DC4, -3, Ascii.DC4, -119, -102, -95, -34, 0, -111, -12, -33, -61, 33, -69, 82, 116, -40, 106, 8, -74, -27, 66, Ascii.VT, 79, 6, -108, -30, 126, -58, -58, 94, Ascii.RS, Ascii.SI, Ascii.SO, -43, -98, -5, 97, 4, 118, -103, 80, -55, -40, -53, -103, -77, -78, 108, 46, -59, 2, 50, 97};
        a(r2, new byte[]{48, -46, -112, 71, 5, Ascii.FF, 111, -47, 8, 6, -110, -21, -6, 77, -87, 90, -64, -87, -38, -109, -117, -56, -88, -99, -73, Ascii.DLE, -27, Ascii.RS, 107, 96, 33, 98, -11, 80, 71, Ascii.DC2, 69, 68, 7, -86, 39, 121, -56, 101, -111, 58, 126, -93, 7, 111, Ascii.ESC, Ascii.VT, 54, -57, -122, -124, -48, 119, 0, -66, -24, -1, 86, -110, 100, 91, 6});
        throw new IllegalArgumentException(new String(r2, StandardCharsets.UTF_8).intern());
    L5:
        if (r7.length == 0) goto L18;
        int r02 = r7.length;
    L7:
        if (r1 >= r02) goto L17;
        String r3 = r7[r1];
    L14:
        e = move-exception;
        StringBuilder r12 = new StringBuilder();
        byte[] r5 = {99, 108, -66, 70, 70, -4, Ascii.FF, -4, 55, -21, -44, Ascii.DEL, Ascii.SYN, 87, 39, 60, Ascii.CAN, 105, -97, -96, -24, Ascii.SO, 120, Ascii.ETB, -27, 75, 70, 123, -54, 86, 51, -84, 110, 33, -52, -121, -23, Ascii.CR, -70, 92, -106, 123, -10, 99, 106, -56, -15, 81, 116, SignedBytes.MAX_POWER_OF_TWO, 109, -109, -51, -86, -15, -8, -23, 51, 81, -70, 53, -32, 89, -58, -78, 126};
        a(r5, new byte[]{61, -28, -29, 10, 60, 88, Ascii.DEL, Ascii.DEL, 46, -120, -45, -1, -113, Ascii.SO, 95, 66, 79, -6, Ascii.SI, -70, -77, 55, 52, 101, -99, -6, 71, 5, 1, -17, 103, -58, Ascii.GS, Ascii.DC4, -43, -114, -95, 50, -22, Ascii.SI, Ascii.SO, -29, -83, 42, Ascii.SUB, 118, -99, Ascii.ETB, 47, -7, Ascii.RS, -102, -65, -108, -101, 113, -89, -19, -122, -26, 114, 100, 65, -90, -110, 66});
        Charset r22 = StandardCharsets.UTF_8;
        r12.append(new String(r5, r22).intern());
        r12.append(r3);
        byte[] r4 = {10, 48, -17, -33, 39, -32, -90, 113, -28, -33, -90, 79, 86, 4, -54, 104, Ascii.FS, 52, 121, -85, Ascii.FS, 59, 84, -90};
        a(r4, new byte[]{75, -32, -101, -109, Ascii.RS, 94, -33, -20, -37, -122, -34, 86, 43, 53, -49, -12, 65, -48, 110, -76, -118, Ascii.EM, 79, 111});
        r12.append(new String(r4, r22).intern());
        throw new IllegalArgumentException(r12.toString(), e);
    L10:
        if (Base64.decode(r3, 2).length != 32) goto L12;
        r1 = r1 + 1;     // Catch: IllegalArgumentException -> L14
        goto L7
    L12:
        StringBuilder r03 = new StringBuilder();     // Catch: IllegalArgumentException -> L14
        byte[] r42 = {121, -100, -25, -118, -123, 19, -117, -82, -18, -126, 51, 32, -98, -30, -93, -25, -105, -11, 112, -26, 104, 46, 43, -122, 73, 39, -24, 102, -27, 67, 6, 83, 50, -49, Ascii.EM, -91, -49, 80, 6, -21, -50, 51, -43, 44, -88, -1, 46, 37, 86, 124, -62, -56, -120, 112, 93, -117, 87, UnsignedBytes.MAX_POWER_OF_TWO, Ascii.RS, -39, -127, SignedBytes.MAX_POWER_OF_TWO, -60, 2, 91, -107};     // Catch: IllegalArgumentException -> L14
        a(r42, new byte[]{83, -76, -83, -42, -3, 55, 4, -78, -27, -95, 112, 46, 7, 92, -29, 103, -50, -122, 43, 123, 51, Ascii.ETB, 99, -42, 65, Ascii.SYN, -78, -22, -36, -37, 124, 7, 113, 122, UnsignedBytes.MAX_POWER_OF_TWO, 108, -61, Ascii.SI, 126, -122, -58, 42, -47, -13, -40, 97, 110, 43, 81, -27, -69, -49, 4, -17, 62, -32, 69, 126, 84, -125, 6, 5, -52, 98, 123, -87});     // Catch: IllegalArgumentException -> L14
        Charset r52 = StandardCharsets.UTF_8;     // Catch: IllegalArgumentException -> L14
        r03.append(new String(r42, r52).intern());     // Catch: IllegalArgumentException -> L14
        r03.append(r3);     // Catch: IllegalArgumentException -> L14
        byte[] r43 = {8, 37, -36, -93, -78, 54, 126, -30, Ascii.NAK, -16, 124, 75, -110, 65, 77, -5, -91, 80, 66, 59, -1, 104, 41, 125, -121, 76, Ascii.ETB, 67, 4, 97, -46, -123, -44, 84, -54, 118, 108, -61, 10, -81, Ascii.CAN, -56, 74, -22, 63, -51, 50, Ascii.CR, 52, -51, -12, -14, 36, 54, -91, 42, -4, -3, -108, Ascii.DC2, 102, -8, -104, -31, -69, 57, -107, -12, -35};     // Catch: IllegalArgumentException -> L14
        a(r43, new byte[]{77, -43, -54, -73, -87, 40, 39, 125, 76, 115, 74, -15, -42, 67, -114, -76, -100, -14, 60, 50, -92, -35, 111, -1, 0, 9, -116, Ascii.RS, -124, -34, -47, -116, -46, 2, 0, -22, Ascii.ESC, 118, SignedBytes.MAX_POWER_OF_TWO, -61, -120, Ascii.DEL, 58, 106, 104, 122, 40, 85, 104, -113, -106, -126, 89, 47, -36, 50, -97, 104, -54, 98, Ascii.US, -88, -16, 103, -33, 44, -71, -89, -13});     // Catch: IllegalArgumentException -> L14
        r03.append(new String(r43, r52).intern());     // Catch: IllegalArgumentException -> L14
        throw new IllegalArgumentException(r03.toString());     // Catch: IllegalArgumentException -> L14
    }

    public String[] c() {
        return this.f30820f;
    }

    public String[] d() {
        return this.f30819e;
    }

    public String e() {
        return this.f30816a;
    }

    public String[] f() {
        return this.f30817b;
    }

    public String[] g() {
        return this.d;
    }

    public String[][] h() {
        return this.f30821g;
    }

    public String i() {
        return this.f30818c;
    }

    public String[] j() {
        return this.f30822h;
    }

    public boolean k() {
        return this.f30823i;
    }
}
