package com.aheaditec.talsec_security.security.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.aheaditec.talsec.security.A;
import com.aheaditec.talsec.security.AbstractC4289n;
import com.aheaditec.talsec.security.AbstractC4292o;
import com.aheaditec.talsec.security.C;
import com.aheaditec.talsec.security.D;
import com.aheaditec.talsec.security.r;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class ThreatListener extends BroadcastReceiver {

    /* renamed from: c, reason: collision with root package name */
    public static final String f30811c = null;
    public static final String d = null;

    /* renamed from: a, reason: collision with root package name */
    public final b f30812a;

    /* renamed from: b, reason: collision with root package name */
    public final a f30813b;

    public interface a {
        void a();

        void c();

        void f();

        void g();

        void h();
    }

    public interface b {
        void b();

        void d();

        void e();

        void i();

        void j();

        void k();

        void l();

        void m(List r1);

        void n();

        void p();

        void q();

        void r();
    }

    static {
        byte[] r2 = {-78, -94, -106, 105, 56, 35, 38, 80, -103, 125, -93};
        a(r2, new byte[]{-49, 19, -59, 83, 102, -112, 99, 50, -41, 59, -20});
        Charset r1 = StandardCharsets.UTF_8;
        d = new String(r2, r1).intern();
        byte[] r3 = {125, -44, Ascii.NAK, 67, 103, Ascii.DC2, -121, 66, 59};
        a(r3, new byte[]{Ascii.GS, -54, 61, 37, 33, -122, -80, 47, 122});
        f30811c = new String(r3, r1).intern();
    }

    public ThreatListener(b r3, a r4) {
        if (r3 == null) goto L6;
        this.f30812a = r3;
        this.f30813b = r4;
        return;
    L6:
        byte[] r1 = {-46, -124, 89, -117, 123, Ascii.GS, -124, 66, -52, 125, 87, -100, SignedBytes.MAX_POWER_OF_TWO, 34, -47, 37, -27, 0, 120, -46, Ascii.ETB, 8, -121, -21, 95};
        a(r1, new byte[]{122, Ascii.NAK, 32, 0, 2, -84, -47, 66, -88, -115, Ascii.RS, Ascii.SYN, Ascii.ETB, 124, -88, 106, -82, -110, 7, Ascii.VT, 98, -83, -43, -96, 113});
        throw new IllegalArgumentException(new String(r1, StandardCharsets.UTF_8).intern());
    }

    public static void a(byte[] r21, byte[] r22) {
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

    public void b(Context r5) {
        if (r5 == null) goto L6;
        androidx.localbroadcastmanager.content.a r52 = androidx.localbroadcastmanager.content.a.b(r5);
        byte[] r3 = {125, Ascii.SI, -8, 54, -23, -46, 0, 117, Ascii.DC4, -40, 54};
        a(r3, new byte[]{Ascii.DC2, 126, -98, 126, -107, -63, 73, 85, 90, -98, 121});
        r52.c(this, new IntentFilter(new String(r3, StandardCharsets.UTF_8).intern()));
        return;
    L6:
        byte[] r2 = {-121, -6, -22, 119, 42, 9, -78, -75, 33, 63, -88, 90, -21, -124, 113, -45, -45, -32, -3, -24, -93, -34, 49};
        a(r2, new byte[]{-83, -59, 110, Ascii.FS, 56, -95, -80, -82, 43, -114, -80, 77, 109, 32, 60, -54, -97, -16, 125, -74, -49, -78, Ascii.US});
        throw new IllegalArgumentException(new String(r2, StandardCharsets.UTF_8).intern());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context r17, Intent r18) {
        char r2 = 4;
        if (r18 == null) goto L113;
        byte[] r14 = {-126, Ascii.US, -91, 53, -115, 118, 49, 98, 118};
        a(r14, new byte[]{-76, -127, -51, -109, -69, 98, 90, 79, 55});
        Charset r15 = StandardCharsets.UTF_8;
        if (r18.hasExtra(new String(r14, r15).intern()) == false) goto L114;
        byte[] r142 = {47, Ascii.ETB, 49, 88, 38, 97, 50, Ascii.DC2, -14};
        a(r142, new byte[]{79, -119, 97, 48, 98, 85, 93, 95, -77});
        String r4 = r18.getStringExtra(new String(r142, r15).intern());
        if (r17 != null) goto L9;
        return;
    L9:
        switch(r4.hashCode()) {
            case -2000714514: goto L59;
            case -1367123171: goto L56;
            case -1226736817: goto L53;
            case -881046147: goto L50;
            case -416447130: goto L47;
            case -328950239: goto L44;
            case 3506402: goto L41;
            case 95458899: goto L38;
            case 99463088: goto L35;
            case 639597323: goto L32;
            case 834063317: goto L29;
            case 1107986850: goto L26;
            case 1129117765: goto L23;
            case 1336193813: goto L20;
            case 1556684755: goto L17;
            case 1558978392: goto L14;
            case 1580766949: goto L11;
            default: goto L62;
        };
    L11:
        byte[] r3 = {-100, 125, 77, 116, -60, -24, -107, -32, 5, -121, -114, -19, -36, 50, 53};
        a(r3, new byte[]{-40, 78, 41, 42, -118, -74, -79, -98, 79, Ascii.CAN, -25, -94, -75, 92, 82});
        if (r4.equals(new String(r3, r15).intern()) == false) goto L62;
        r2 = 15;
    L63:
        switch(r2) {
            case 0: goto L111;
            case 1: goto L109;
            case 2: goto L107;
            case 3: goto L105;
            case 4: goto L103;
            case 5: goto L101;
            case 6: goto L99;
            case 7: goto L97;
            case 8: goto L93;
            case 9: goto L89;
            case 10: goto L85;
            case 11: goto L81;
            case 12: goto L77;
            case 13: goto L71;
            case 14: goto L69;
            case 15: goto L67;
            case 16: goto L65;
            default: goto L123;
        };
    L65:
        this.f30812a.b();
        return;
    L67:
        this.f30812a.p();
        return;
    L69:
        this.f30812a.l();
        return;
    L71:
        byte[] r32 = {51, 36, 120, 87, 52, 4, Ascii.EM, Ascii.SYN, Ascii.ESC, -69, 120, -127};
        a(r32, new byte[]{103, -107, Ascii.RS, Ascii.EM, 94, -122, 70, 98, 59, 37, 41, -25});
        ArrayList r1 = r18.getParcelableArrayListExtra(new String(r32, r15).intern());
        if (r1 != null) goto L74;
        return;
    L74:
        if (r1.isEmpty() == true) goto L117;
        this.f30812a.m(r1);
        return;
    L117:
        return;
    L77:
        a r12 = this.f30813b;
        if (r12 == null) goto L118;
        r12.h();
        return;
    L118:
        return;
    L81:
        a r13 = this.f30813b;
        if (r13 == null) goto L119;
        r13.g();
        return;
    L119:
        return;
    L85:
        a r16 = this.f30813b;
        if (r16 == null) goto L120;
        r16.c();
        return;
    L120:
        return;
    L89:
        a r19 = this.f30813b;
        if (r19 == null) goto L121;
        r19.f();
        return;
    L121:
        return;
    L93:
        a r110 = this.f30813b;
        if (r110 == null) goto L122;
        r110.a();
        return;
    L122:
        return;
    L97:
        this.f30812a.e();
        return;
    L99:
        this.f30812a.i();
        return;
    L101:
        this.f30812a.j();
        return;
    L103:
        this.f30812a.k();
        return;
    L105:
        this.f30812a.q();
        return;
    L107:
        this.f30812a.n();
        return;
    L109:
        this.f30812a.d();
        return;
    L111:
        this.f30812a.r();
        return;
    L123:
        return;
    L14:
        byte[] r33 = {71, -6, -73, -31, -5, -7, Ascii.CAN};
        a(r33, new byte[]{Ascii.FF, -49, -85, -59, -108, -99, 125, 122});
        if (r4.equals(new String(r33, r15).intern()) == false) goto L62;
        r2 = '\n';
        goto L63
    L17:
        byte[] r5 = {19, -61, 17, Ascii.DEL, -71, -5, 5, 48, -28, -74, -88, -73, 63, Ascii.RS, 54, Ascii.FF, 124, -97, -37, -35, 123, 109, -87, 48, 108, -32, -67};
        a(r5, new byte[]{79, -35, 79, 38, -75, -72, 91, 110, 105, 47, -79, -35, 52, -81, 68, 121, 6, Ascii.ESC, -99, -53, -2, 109, -80, 94, Ascii.RS, -125, -40});
        if (r4.equals(new String(r5, r15).intern()) == false) goto L62;
    L20:
        byte[] r34 = {46, -61, -39, -19, -120, -118, Ascii.DLE, -39};
        a(r34, new byte[]{52, -34, -106, -102, -46, 46, 106, -60});
        if (r4.equals(new String(r34, r15).intern()) == false) goto L62;
        r2 = 2;
        goto L63
    L23:
        byte[] r35 = {47, 57, -111, Ascii.SI, 99, -9, 120, 57, 61};
        a(r35, new byte[]{69, 112, -52, -108, -17, -55, Ascii.CAN, -126, 115});
        if (r4.equals(new String(r35, r15).intern()) == false) goto L62;
        r2 = '\f';
        goto L63
    L26:
        byte[] r36 = {93, -107, 96, -20, -104, 116, 82, 81, -5, -95};
        a(r36, new byte[]{37, 33, -19, -63, -33, 69, Ascii.SUB, 86, -98, -59});
        if (r4.equals(new String(r36, r15).intern()) == false) goto L62;
        r2 = 11;
        goto L63
    L29:
        byte[] r52 = {87, 37, -95, -114, 84, -57, -121};
        a(r52, new byte[]{35, 116, -73, Ascii.DC2, 53, -75, -30, -71});
        if (r4.equals(new String(r52, r15).intern()) == false) goto L62;
        r2 = '\r';
        goto L63
    L32:
        byte[] r37 = {122, -11, -79, -74, -11, -25, -13, 66, -10, 17, -68, -51, -24, -28, 67, 33, -29, Ascii.RS};
        a(r37, new byte[]{Ascii.ESC, -46, -40, -19, 125, -76, -126, SignedBytes.MAX_POWER_OF_TWO, 123, 126, -63, -63, 122, -57, 33, 103, -111, 123});
        if (r4.equals(new String(r37, r15).intern()) == false) goto L62;
        r2 = '\t';
        goto L63
    L35:
        byte[] r38 = {-43, Ascii.US, -6, -121, 41};
        a(r38, new byte[]{-90, -96, Ascii.DEL, 5, 90, 109, -116, Ascii.DC4});
        if (r4.equals(new String(r38, r15).intern()) == false) goto L62;
        r2 = 5;
        goto L63
    L38:
        byte[] r39 = {99, 4, -8, -106, -37};
        a(r39, new byte[]{-16, -112, -124, -4, -68, -102, 125, 4});
        if (r4.equals(new String(r39, r15).intern()) == false) goto L62;
        r2 = 1;
        goto L63
    L41:
        byte[] r22 = {99, 36, 67, -2};
        a(r22, new byte[]{-6, 122, Ascii.SYN, -93, 123, -95, -55, -50});
        if (r4.equals(new String(r22, r15).intern()) == false) goto L62;
        r2 = 0;
        goto L63
    L44:
        byte[] r310 = {-69, -8, -53, 107, -116, -115, -102, 74, -68, -53, 110, 75};
        a(r310, new byte[]{-76, -55, -94, 49, -40, Ascii.DC2, -23, 72, -52, -24, -11, 87});
        if (r4.equals(new String(r310, r15).intern()) == false) goto L62;
        r2 = '\b';
        goto L63
    L47:
        byte[] r311 = {-43, 37, 35, -99, 97, -64, 87, 91, 37, 42};
        a(r311, new byte[]{-113, 118, 59, 17, -19, -35, Ascii.SO, 76, 74, 94});
        if (r4.equals(new String(r311, r15).intern()) == false) goto L62;
        r2 = 14;
        goto L63
    L50:
        byte[] r312 = {-127, 63, 36, 1, -102, -18};
        a(r312, new byte[]{-34, -114, 51, -118, -1, -100, Ascii.FS, Ascii.SO});
        if (r4.equals(new String(r312, r15).intern()) == false) goto L62;
        r2 = 3;
        goto L63
    L53:
        byte[] r53 = {46, 19, -76, 108, 92, 44, 39, 92, -50, -37, 94, Ascii.FF, 45};
        a(r53, new byte[]{51, -90, -84, Ascii.RS, 40, 121, 79, 78, -119, -17, 33, 123, 74});
        if (r4.equals(new String(r53, r15).intern()) == false) goto L62;
        r2 = 6;
        goto L63
    L56:
        byte[] r54 = {117, -84, -121, -6, 43, 19, -80, -88, -37, 120, -76, -121, 85, -45, Ascii.NAK, Ascii.ESC, 100};
        a(r54, new byte[]{3, -2, -53, -88, 65, -96, -69, -11, -101, 71, -60, -25, Ascii.SI, -48, 74, -105, Ascii.ETB});
        if (r4.equals(new String(r54, r15).intern()) == false) goto L62;
        r2 = 7;
        goto L63
    L59:
        byte[] r55 = {-115, -33, -88, 45, 78, -44, 3, -20, 63, 9, -89, 69, -83};
        a(r55, new byte[]{-55, -38, -82, 114, Ascii.DLE, -51, 87, -72, 52, -104, -77, 63, -56});
        if (r4.equals(new String(r55, r15).intern()) == false) goto L62;
        r2 = 16;
    L62:
        r2 = 65535;
        goto L63
    L114:
        return;
    }
}
