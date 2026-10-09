package com.aheaditec.talsec.security;

import android.content.Context;
import android.util.Base64;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.security.MessageDigest;
import kotlin.text.C11850c;

/* renamed from: com.aheaditec.talsec.security.o1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4294o1 extends AbstractC4290n0 implements InterfaceC4288m1 {

    /* renamed from: e, reason: collision with root package name */
    public static final String f30666e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f30667f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final String f30668g = null;

    static {
        byte[] r1 = {123, 91, Ascii.DC4, 48, -104, -8, 113, -71, -10};
        n(r1, new byte[]{47, 58, 120, 67, -3, -101, 46, -22, -90});
        Charset r2 = StandardCharsets.UTF_8;
        f30668g = new String(r1, r2).intern();
        byte[] r3 = {-107, -123, -10, -106, 81, UnsignedBytes.MAX_POWER_OF_TWO, 89, 111, -18, -40, 123, Ascii.SYN, 44, -34, 78, -117, -8, 77, Ascii.US, Ascii.DC4, 72, -54, 56, 42, -69, 35, 67, -44, 67, -1, -124, -77, -103, -9, -17, 74, 97, -107, 100, -118, -90, -31, 63, 19};
        n(r3, new byte[]{-44, -51, -76, -2, 56, -41, 0, 35, -99, -110, 62, 68, 104, -65, Ascii.FF, -77, -120, 10, 93, 115, 62, -102, 124, 105, -114, 107, 2, -31, 52, -44, -12, -27, -32, -124, -105, Ascii.US, 36, -38, Ascii.FF, -69, -59, -109, 7, 46});
        f30666e = new String(r3, r2).intern();
        byte[] r32 = {112, -31, -22, -75};
        n(r32, new byte[]{19, -114, -121, -124, -73, -43, 107, -121});
        String r6 = new String(r32, r2).intern();
        byte[] r33 = {-105, 86, 120, -56};
        n(r33, new byte[]{-44, 57, Ascii.NAK, -7, -68, 117, 99, -55});
        String r7 = new String(r33, r2).intern();
        byte[] r34 = {-46, -102, -94, 47};
        n(r34, new byte[]{-79, -43, -49, Ascii.RS, -64, 73, 33, 10});
        String r8 = new String(r34, r2).intern();
        byte[] r35 = {-1, -34, -3, Ascii.CAN};
        n(r35, new byte[]{-68, -111, -112, 41, -18, 104, -50, 67});
        String r9 = new String(r35, r2).intern();
        byte[] r36 = {74, -96, -79, 87};
        n(r36, new byte[]{41, -49, -4, 102, -56, -16, -100, Ascii.ETB});
        String r10 = new String(r36, r2).intern();
        byte[] r37 = {-97, -8, 54, 3};
        n(r37, new byte[]{-36, -105, 123, 50, 123, -45, 19, -95});
        String r11 = new String(r37, r2).intern();
        byte[] r38 = {-82, -73, -40, 106};
        n(r38, new byte[]{-51, -8, -107, 91, Ascii.US, -106, -113, Ascii.NAK});
        String r12 = new String(r38, r2).intern();
        byte[] r39 = {119, 39, 9, 92};
        n(r39, new byte[]{52, 104, 68, 109, -56, -82, -56, 92});
        String r13 = new String(r39, r2).intern();
        byte[] r310 = {61, Ascii.SYN, 107, 41};
        n(r310, new byte[]{126, 89, 38, Ascii.CAN, 77, -92, 100, 81});
        String r14 = new String(r310, r2).intern();
        byte[] r311 = {-75, 107, -67, 77};
        n(r311, new byte[]{-42, 4, -48, Ascii.DEL, 3, -85, 86, 105});
        String r15 = new String(r311, r2).intern();
        byte[] r312 = {-92, 45, -24, -83};
        n(r312, new byte[]{-25, 66, -123, -97, UnsignedBytes.MAX_POWER_OF_TWO, -67, -28, 86});
        String r16 = new String(r312, r2).intern();
        byte[] r313 = {-23, Ascii.ESC, -18, -25};
        n(r313, new byte[]{-118, 84, -125, -43, 125, 73, 1, 83});
        String r17 = new String(r313, r2).intern();
        byte[] r314 = {-127, -125, -60, 98};
        n(r314, new byte[]{-62, -52, -87, 80, 110, -1, Ascii.VT, -15});
        String r18 = new String(r314, r2).intern();
        byte[] r315 = {83, -36, 66, -21};
        n(r315, new byte[]{48, -77, Ascii.SI, -39, Ascii.US, -97, -12, 115});
        String r19 = new String(r315, r2).intern();
        byte[] r316 = {77, -122, 41, -127};
        n(r316, new byte[]{Ascii.SO, -23, 100, -77, 56, Ascii.US, Ascii.VT, -71});
        String r20 = new String(r316, r2).intern();
        byte[] r317 = {75, 1, 111, -126};
        n(r317, new byte[]{40, 78, 34, -80, 93, -90, 52, -101});
        String r21 = new String(r317, r2).intern();
        byte[] r318 = {56, -2, 124, 98};
        n(r318, new byte[]{123, -79, 49, 80, 46, -27, 76, -116});
        String r22 = new String(r318, r2).intern();
        byte[] r319 = {37, 59, 48, 8};
        n(r319, new byte[]{102, 116, 125, 58, 115, -116, -85, 74});
        String r23 = new String(r319, r2).intern();
        byte[] r320 = {-29, 35, -122, -106};
        n(r320, new byte[]{UnsignedBytes.MAX_POWER_OF_TWO, 76, -21, -91, -126, 17, 75, 97});
        String r24 = new String(r320, r2).intern();
        byte[] r321 = {-67, -21, 112, -99};
        n(r321, new byte[]{-2, -124, Ascii.GS, -82, -46, -57, -54, -60});
        String r25 = new String(r321, r2).intern();
        byte[] r322 = {-83, -37, -98, -76};
        n(r322, new byte[]{-50, -108, -13, -121, 79, 42, 117, 50});
        String r26 = new String(r322, r2).intern();
        byte[] r323 = {7, -33, -34, -89};
        n(r323, new byte[]{68, -112, -77, -108, 6, Ascii.SYN, 119, 97});
        String r27 = new String(r323, r2).intern();
        byte[] r324 = {Ascii.DEL, 119, 48, -42};
        n(r324, new byte[]{Ascii.FS, Ascii.CAN, 125, -27, 124, 112, -87, 33});
        String r28 = new String(r324, r2).intern();
        byte[] r325 = {-93, -79, 59, Ascii.DEL};
        n(r325, new byte[]{-32, -34, 118, 76, -124, 77, 3, 94});
        String r29 = new String(r325, r2).intern();
        byte[] r326 = {-24, 85, -36, -38};
        n(r326, new byte[]{-117, Ascii.SUB, -111, -23, 103, Ascii.FF, -126, 67});
        String r30 = new String(r326, r2).intern();
        byte[] r327 = {Ascii.GS, -8, 67, 71};
        n(r327, new byte[]{94, -73, Ascii.SO, 116, 17, 76, 69, -121});
        String r31 = new String(r327, r2).intern();
        byte[] r328 = {75, -19, 4, -74};
        n(r328, new byte[]{8, -94, 73, -123, 94, -68, 77, -104});
        String r329 = new String(r328, r2).intern();
        byte[] r330 = {65, -39, -85, Ascii.FF};
        n(r330, new byte[]{34, -74, -58, 56, -51, -60, -90, -48});
        String r332 = new String(r330, r2).intern();
        byte[] r331 = {56, 94, Ascii.ESC, 69};
        n(r331, new byte[]{123, 49, 118, 113, 67, -66, 72, Ascii.ESC});
        String r342 = new String(r331, r2).intern();
        byte[] r333 = {-82, 99, 38, 40};
        n(r333, new byte[]{-51, 44, 75, Ascii.FS, 7, 89, -80, 92});
        String r352 = new String(r333, r2).intern();
        byte[] r334 = {-32, Ascii.DC2, -40, -80};
        n(r334, new byte[]{-93, 93, -75, -124, -3, -94, -66, -25});
        String r362 = new String(r334, r2).intern();
        byte[] r335 = {17, 122, -94, -55};
        n(r335, new byte[]{114, Ascii.NAK, -17, -3, 95, -51, -18, -24});
        String r372 = new String(r335, r2).intern();
        byte[] r336 = {-82, -70, -77, 9};
        n(r336, new byte[]{-19, -43, -2, 61, 125, 5, 100, -102});
        String r382 = new String(r336, r2).intern();
        byte[] r337 = {79, -52, -17, -16};
        n(r337, new byte[]{44, -125, -94, -60, -27, 96, -62, 100});
        String r392 = new String(r337, r2).intern();
        byte[] r338 = {-19, 38, -92, -74};
        n(r338, new byte[]{-82, 105, -23, -126, UnsignedBytes.MAX_POWER_OF_TWO, Ascii.DLE, 77, 93});
        String r40 = new String(r338, r2).intern();
        byte[] r110 = {-75, -93, 97, -33};
        n(r110, new byte[]{-10, -20, 44, -21, 52, -34, 96, -21});
        f30667f = new String[]{r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r329, r332, r342, r352, r362, r372, r382, r392, r40, new String(r110, r2).intern()};
    }

    public C4294o1(Context r4) {
        byte[] r2 = {68, -102, -98, 65, -121, 84, -74, -48, -80, 102, -94, 59, -91, -35, -85, 32, -4, -65, -16, 60, 19, -70, 87, -21, 109, -41, 17, -67, 110, -90, -36, -23, 51, -99, -56, 7, 36, 70, 81, -94, 5, -41, -124, -13};
        n(r2, new byte[]{5, -46, -36, 41, -18, 3, -17, -100, -61, 44, -25, 105, -31, -68, -23, Ascii.CAN, -116, -8, -78, 91, 101, -22, 19, -88, 88, -97, 80, -120, Ascii.EM, -115, -84, -65, 74, -18, -80, 82, 97, 9, 57, -109, 102, -91, -68, -50});
        Charset r1 = StandardCharsets.UTF_8;
        super(r4, new String(r2, r1).intern(), f30667f);
        m(r4);
        byte[] r22 = {-105, 61, -108, 110, Ascii.FS, -122, 4, -83, -94, -50, -30, -125, -43, 87, -38};
        n(r22, new byte[]{-33, 92, -25, 6, 121, -30, 91, -64, -53, -87, -112, -30, -95, 50, -66});
        l(o(new String(r22, r1).intern()));
    }

    public static void n(byte[] r15, byte[] r16) {
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

    public static String o(String r3) {
        byte[] r1 = {42, -90, -75, -73, -99, -93, -16};     // Catch: Exception -> L4
        n(r1, new byte[]{121, -18, -12, -102, -81, -106, -58, 100});     // Catch: Exception -> L4
        return Base64.encodeToString(MessageDigest.getInstance(new String(r1, StandardCharsets.UTF_8).intern()).digest(r3.getBytes(C11850c.f180362b)), 2);
    L7:
        return r3;
    }

    @Override // com.aheaditec.talsec.security.AbstractC4290n0
    public String c(String r4) {
        String r02 = o(r4);
        if (this.f30652a.contains(r02) == false) goto L7;
        return this.f30652a.getString(r02, null);
    L7:
        return this.f30652a.getString(r4, null);
    }

    @Override // com.aheaditec.talsec.security.AbstractC4290n0
    public void d() {
        super.d();
    }

    @Override // com.aheaditec.talsec.security.AbstractC4290n0
    public void g(String r1, String r2) {
        super.g(o(r1), r2);
    }

    @Override // com.aheaditec.talsec.security.AbstractC4290n0
    public boolean k(String r1) {
        if (c(r1) == null) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // com.aheaditec.talsec.security.AbstractC4290n0
    public void l(String r1) {
        super.l(r1);
    }

    public final void m(Context r7) {
        StringBuilder r3 = new StringBuilder();     // Catch: Exception -> L7
        r3.append(r7.getApplicationInfo().dataDir);     // Catch: Exception -> L7
        r3.append(AbstractC4290n0.f30650b);     // Catch: Exception -> L7
        byte[] r4 = {75, 51, -66, 51, 124, -102, 111, -123, 63};     // Catch: Exception -> L7
        n(r4, new byte[]{Ascii.US, 82, -46, SignedBytes.MAX_POWER_OF_TWO, Ascii.EM, -7, 48, -42, 111});     // Catch: Exception -> L7
        Charset r1 = StandardCharsets.UTF_8;     // Catch: Exception -> L7
        r3.append(new String(r4, r1).intern());     // Catch: Exception -> L7
        byte[] r42 = {UnsignedBytes.MAX_POWER_OF_TWO, -55, 72, 67};     // Catch: Exception -> L7
        n(r42, new byte[]{-82, -79, 37, 47, -16, -18, 35, 96});     // Catch: Exception -> L7
        r3.append(new String(r42, r1).intern());     // Catch: Exception -> L7
        File r2 = new File(r3.toString());     // Catch: Exception -> L7
        if (r2.exists() == false) goto L12;
        Files.delete(r2.toPath());     // Catch: Exception -> L7
        return;
    L12:
        return;
    L7:
        e = move-exception;
        byte[] r32 = {-76, 45, -36, -61, 123, -38, -71, 44, 40, -30, UnsignedBytes.MAX_POWER_OF_TWO, -96, 61, 59, 123, 46, 119, 97, -80, -13, 104, 42, 10, -111, -54, -6, Ascii.RS, 51, 122, Ascii.DEL, -106, -29, 59, -2, 3, 19, Ascii.NAK, -3, 74, -62, Ascii.GS};
        n(r32, new byte[]{-15, 85, -65, -90, Ascii.VT, -82, -48, 67, 70, -62, -28, -43, 79, 82, Ascii.NAK, 73, 87, Ascii.SO, -36, -105, 72, 90, 120, -12, -84, -97, 108, 86, Ascii.DC4, Ascii.FS, -13, -112, Ascii.ESC, -116, 102, 126, 122, -117, 43, -82, 51});
        new C4261d1(-7774, new String(r32, StandardCharsets.UTF_8).intern(), e);
    }

    public C4294o1(Context r1, String r2, String[] r3) {
        super(r1, r2, r3);
    }
}
