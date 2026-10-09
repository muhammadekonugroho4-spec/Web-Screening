package com.aheaditec.talsec.security;

import com.google.common.base.Ascii;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* renamed from: com.aheaditec.talsec.security.k0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4281k0 {
    public static final String d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final String f30625e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final String f30626f = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f30627a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30628b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30629c;

    static {
        byte[] r3 = {-76, -65, Ascii.SUB, Ascii.GS, -14, -46, -76, 9, -36, 65, 65, Ascii.SI, 47};
        b(r3, new byte[]{-46, -42, 116, 122, -105, -96, -60, 123, -75, 47, 53, 89, Ascii.FS});
        Charset r2 = StandardCharsets.UTF_8;
        f30626f = new String(r3, r2).intern();
        byte[] r4 = {-6, -56, 83, -71, 124, 110, 82, -127};
        b(r4, new byte[]{-105, -83, 55, -48, Ascii.GS, 42, 32, -20});
        f30625e = new String(r4, r2).intern();
        byte[] r32 = {-56, 101, -127, Ascii.CR, 125, Ascii.SYN, -59, -115, Ascii.NAK};
        b(r32, new byte[]{-87, Ascii.VT, -27, Ascii.DEL, Ascii.DC2, Ascii.DEL, -95, -60, 113});
        d = new String(r32, r2).intern();
    }

    public C4281k0(InterfaceC4287m0 r2) {
        this.f30627a = r2.a();
        this.f30628b = r2.b();
        this.f30629c = r2.c();
    }

    public static void b(byte[] r15, byte[] r16) {
        byte[] r1 = null;
        int r4 = 0;
        int r5 = 0;
        int r3 = -1850458006;
        byte[] r2 = null;
    L3:
        int r7 = ((16777216 & r3) * (r3 | 16777216)) + (((-16777217) & r3) * ((~r3) & 16777216));
        int r32 = r3 >>> 8;
        int r6 = (~r7) | r32;
        boolean r72 = true;
        int r33 = (r32 - 1) - r6;
        int r62 = (-1700147435) - ((r33 & 2) | (2028104049 - r33));
        int r10 = -1396193641;
        switch(((-1363443157) ^ ((~r62) + ((r62 | 1) * 2)))) {
            case -1940167324: goto L27;
            case -360299937: goto L18;
            case 399486784: goto L16;
            case 585276366: goto L10;
            case 1733787683: goto L6;
            default: goto L5;
        };
    L10:
        if (r15.length > 0) goto L12;
        r72 = false;
    L12:
        if (r72 == false) goto L14;
        r3 = 1985663266;
    L15:
        r2 = r15;
        r1 = r16;
        r5 = 0;
        goto L3
    L14:
        r3 = -1396193641;
        goto L15
    L16:
        return;
    L18:
        if ((r1[r5] > Double.NaN ? 1 : (r1[r5] == Double.NaN ? 0 : -1)) > (-1)) goto L20;
        r72 = false;
    L20:
        if (r72 == true) goto L23;
        r10 = 427928065;
    L23:
        if (r72 == false) goto L25;
        r3 = 614229416;
    L26:
        r4 = r5;
        goto L3
    L25:
        r3 = r10;
        goto L26
    L27:
        byte r34 = r1[r4];
        int r8 = ((byte) 0) - r34;
        r1[r4] = (byte) (((byte) (r34 & (~r8))) - ((byte) ((~r34) & r8)));
        r3 = 614229416;
    L5:
        r3 = -1396193641;
        goto L3
    L6:
        byte r35 = r2[r4];
        byte r52 = r1[r4];
        r2[r4] = (byte) (((byte) (r52 + r35)) - ((byte) (((byte) 2) * ((byte) (r52 & r35)))));
        r5 = (r4 ^ 1) + ((r4 & 1) * 2);
        if ((((r5 > r2.length ? 1 : (r5 == r2.length ? 0 : -1)) >>> 31) & 1) == 0) goto L5;
        r3 = 1985663266;
        goto L3
    }

    public JSONObject a() {
        JSONObject r3 = new JSONObject();
        if (this.f30627a == null) goto L6;
        byte[] r5 = {-43, -41, -40, -13, 126, 54, -27, 111, 56};
        b(r5, new byte[]{-76, -71, -68, -127, 17, 95, -127, 38, 92});
        r3.put(new String(r5, StandardCharsets.UTF_8).intern(), this.f30627a);
    L6:
        if (this.f30628b == null) goto L9;
        byte[] r4 = {-56, 100, 37, 62, -54, -65, -84, 39};
        b(r4, new byte[]{-91, 1, 65, 87, -85, -5, -34, 74});
        r3.put(new String(r4, StandardCharsets.UTF_8).intern(), this.f30628b);
    L9:
        if (this.f30629c == null) goto L11;
        byte[] r2 = {Ascii.SYN, 75, -53, -19, 35, 49, 7, 75, 65, -115, 43, Ascii.FF, 35};
        b(r2, new byte[]{112, 34, -91, -118, 70, 67, 119, 57, 40, -29, 95, 90, Ascii.DLE});
        r3.put(new String(r2, StandardCharsets.UTF_8).intern(), this.f30629c);
    L11:
        return r3;
    }
}
