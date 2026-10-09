package com.aheaditec.talsec.security;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* renamed from: com.aheaditec.talsec.security.i1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4276i1 extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static final String f30615b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final String f30616c = null;
    public static final String d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final String f30617e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final String f30618f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final IntentFilter f30619g = null;

    /* renamed from: a, reason: collision with root package name */
    public boolean f30620a;

    static {
        byte[] r3 = {Ascii.ESC, 124, -39, 2, UnsignedBytes.MAX_POWER_OF_TWO, 34, 60, 54, 120, 113, 124, 44};
        b(r3, new byte[]{113, Ascii.SI, -93, 50, -26, 60, 121, 76, 67, 0, 62, 80});
        Charset r2 = StandardCharsets.UTF_8;
        f30618f = new String(r3, r2).intern();
        byte[] r4 = {120, 71, -90, -95, Ascii.EM, 80, 40, 55, Ascii.CAN, -98, -124};
        b(r4, new byte[]{80, -44, 7, -48, 109, -18, -116, 89, SignedBytes.MAX_POWER_OF_TWO, -37, -57});
        f30617e = new String(r4, r2).intern();
        byte[] r42 = {Ascii.GS, -124, -39, -31, 46, 76, -26, -122, 125};
        b(r42, new byte[]{115, -105, -93, -113, 120, -46, -50, -75, 63});
        d = new String(r42, r2).intern();
        byte[] r43 = {-101, -9, 47, 101, -60, 45, 125, -49, 8, -29, -70, 56, 65, 109, -76, Ascii.CR, Ascii.CAN, 86, -49, 72, 72, 9, -89, -72, -1, 112, -13, 63, 61, 87};
        b(r43, new byte[]{Ascii.SI, 105, 88, 50, -70, Ascii.DC2, 40, -113, 123, 86, -86, 93, 69, -23, -14, 82, -120, 5, -60, 35, 56, 54, -33, -46, -79, -46, -102, 61, 94, 50});
        f30616c = new String(r43, r2).intern();
        byte[] r1 = {102, 62};
        b(r1, new byte[]{46, 124, -14, -50, 60, 78, -54, -42});
        f30615b = new String(r1, r2).intern();
        byte[] r44 = {-24, -73, 114, -114, 123, -34, -125, 67, 36, -36, -5, -78, -34, 97, -107, -85, -94, Ascii.VT, -127, -94, -19, -83, 39, 67, -81, -48, 97, -14, -8, Ascii.SI};
        b(r44, new byte[]{-94, -88, 53, -121, 51, -127, 2, Ascii.FF, 95, -119, -21, -29, -56, -27, 17, -75, -30, 56, -10, -67, -101, -110, 95, -9, -31, 114, 45, -126, -101, 106});
        f30619g = new IntentFilter(new String(r44, r2).intern());
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

    public final void a(String r7) {
        byte[] r3 = {43, -62};
        b(r3, new byte[]{99, UnsignedBytes.MAX_POWER_OF_TWO, -78, -67, -127, 44, 62, Ascii.FS});
        Charset r5 = StandardCharsets.UTF_8;
        r7.equals(new String(r3, r5).intern());
        byte[] r1 = {-62, 106};
        b(r1, new byte[]{-118, 40, -105, -125, -79, 6, 78, -68});
        new String(r1, r5).intern();
        byte[] r12 = {-20, 10, 68, 72, -76, 83, -13, 95, -60, Ascii.SO, 54, 105, 10, -97, Ascii.DLE, 93, 109, 56, -118, Ascii.DEL, 87, Ascii.FF, 73, -72, -61, -112, 98, 39, 35, -42};
        b(r12, new byte[]{-48, 52, 69, Ascii.CR, -14, -12, -78, 102, -93, Ascii.FS, 44, -21, -122, -68, 121, 35, 33, 45, -64, -12, 73, 63, 66, -72, -52, -59, Ascii.FS, -16, Ascii.CR, -8});
        new String(r12, r5).intern();
    }

    public synchronized void c(Context r2) {
        monitor-enter(this);
        if (r2 == null) goto L12;
    L9:
        th = move-exception;
        throw th;
    L5:
        if (this.f30620a == false) goto L12;
        Context r22 = r2.getApplicationContext();     // Catch: Throwable -> L9
        if (r22 == null) goto L12;
        r22.unregisterReceiver(this);     // Catch: Throwable -> L9
        this.f30620a = false;     // Catch: Throwable -> L9
    L12:
        throw null;     // Catch: Throwable -> L9
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context r8, Intent r9) {
        if (r9 == null) goto L22;
        byte[] r5 = {-119, 33, 85, -57, -14, -16, -42, -80, 111};
        b(r5, new byte[]{-33, 50, Ascii.ETB, 117, -44, -114, -97, -33, 45});
        Charset r6 = StandardCharsets.UTF_8;
        if (r9.hasExtra(new String(r5, r6).intern()) == false) goto L10;
        byte[] r02 = {9, -38, 82, 61, -78, 8, -28, -29, -21};
        b(r02, new byte[]{95, 105, Ascii.FS, 91, Ascii.DC4, Ascii.ETB, -47, -110, -87});
        String r82 = r9.getStringExtra(new String(r02, r6).intern());
        if (r82 == null) goto L23;
        a(r82);
        return;
    L23:
        return;
    L10:
        byte[] r4 = {3, -74, 88, -2, -2, 77, 0, 39, 112, -111, -106};
        b(r4, new byte[]{89, -59, 34, -98, -56, -45, 116, 73, 40, -44, -43});
        if (r9.hasExtra(new String(r4, r6).intern()) == false) goto L14;
        byte[] r03 = {110, -96, Ascii.SI, Ascii.US, -78, -21, 7, 58, 96, -112, 72};
        b(r03, new byte[]{70, -77, 113, 61, Ascii.DC4, 118, 110, 102, 56, -43, Ascii.VT});
        r9.getStringExtra(new String(r03, r6).intern());
        return;
    L14:
        byte[] r3 = {-11, -117, 0, 81, -67, -97, -119, -91, -33, -127, 49, Ascii.VT};
        b(r3, new byte[]{-53, -104, 106, -1, 9, -94, -20, -35, -94, -112, 123, 53});
        if (r9.hasExtra(new String(r3, r6).intern()) == false) goto L24;
        byte[] r32 = {87, -25, -20, 4, -93, 116, 117, -60, -71, -19, 53, 10};
        b(r32, new byte[]{45, 116, -50, 52, 3, Ascii.VT, SignedBytes.MAX_POWER_OF_TWO, 126, 4, 125, 119, 54});
        String r92 = r9.getStringExtra(new String(r32, r6).intern());
        if (r92 == null) goto L25;
        byte[] r2 = {70, 56};
        b(r2, new byte[]{4, Ascii.DEL, 121, -38, 82, 114, -35, -10});
        if (r92.equals(new String(r2, r6).intern()) == false) goto L26;
        c(r8);
        return;
    L26:
        return;
    L25:
        return;
    L24:
        return;
    }
}
