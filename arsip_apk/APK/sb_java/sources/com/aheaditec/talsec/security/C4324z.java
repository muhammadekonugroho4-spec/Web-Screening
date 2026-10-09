package com.aheaditec.talsec.security;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Base64;
import com.google.common.base.Ascii;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* renamed from: com.aheaditec.talsec.security.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4324z {

    /* renamed from: b, reason: collision with root package name */
    public static final String f30802b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final String f30803c = null;
    public static final String d = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f30804a;

    static {
        byte[] r2 = {-81, 94, Ascii.DLE, -41, 101, 0, 113, 102, 61, 111, -12, -3, -13, 97, 56, Ascii.GS, -120, -13, 17, -61, 75, -121, -58, -108, 7, 33, -119, 62, 7, 98, 104, Ascii.DC4, -108, -108, Ascii.ESC, 67, 118, Ascii.SI, -51, -91, 114, 88, -80, 104};
        c(r2, new byte[]{-54, 40, 72, -125, 43, 66, 4, 80, 87, 56, -74, -104, -104, Ascii.DLE, 91, 78, -23, -63, 87, -82, 4, -17, -125, -15, 77, 81, -53, Ascii.DEL, 99, 5, 17, 114, -28, -8, 109, 116, 59, 60, -30, -3, 36, 47, -61, 85});
        Charset r1 = StandardCharsets.UTF_8;
        d = new String(r2, r1).intern();
        byte[] r22 = {-108, -124, -29};
        c(r22, new byte[]{-32, -25, -127, -113, -46, -98, 119, -112});
        f30803c = new String(r22, r1).intern();
        byte[] r23 = {-48, 79, 39, -73, 123, 71};
        c(r23, new byte[]{-92, 46, 75, -60, Ascii.RS, 36, -23, 50});
        f30802b = new String(r23, r1).intern();
    }

    public C4324z(Context r1) {
        String r12 = b(r1);     // Catch: Exception -> L5
    L6:
        this.f30804a = r12;
        return;
    L5:
        r12 = null;
        goto L6
    }

    public static void c(byte[] r15, byte[] r16) {
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

    public String a() {
        return this.f30804a;
    }

    public final String b(Context r9) {
        File r3 = r9.getFilesDir();
        byte[] r5 = {10, -27, -12};
        c(r5, new byte[]{126, -122, -106, 9, -46, 17, Ascii.ESC, 124});
        Charset r7 = StandardCharsets.UTF_8;
        File r2 = new File(r3, new String(r5, r7).intern());
        if (r2.exists() == true) goto L5;
    L38:
        AssetManager r92 = r9.getAssets();     // Catch: Exception -> L32
        byte[] r1 = {-111, -86, -30, -42, 39, 84};     // Catch: Exception -> L32
        c(r1, new byte[]{-27, -53, -114, -91, 66, 55, -116, -74});     // Catch: Exception -> L32
        InputStream r93 = r92.open(new String(r1, r7).intern());     // Catch: Exception -> L32
        FileOutputStream r12 = new FileOutputStream(r2);     // Catch: Throwable -> L14
        String r32 = Base64.encodeToString(d(r93, r12), 2);     // Catch: Throwable -> L20
        byte[] r6 = {4, -68, 82, -113, Ascii.US, 33, -59, -16, -14, -26, -36, 106, -29, -108, -127, -126, -66, -88, -96, -3, Ascii.FF, 82, -111, -104, 119, 94, 67, -103, -93, 10, 63, 6, -9, -80, 72, 111, -48, -104, -121, -91, -96, -103, Ascii.GS, -98};     // Catch: Throwable -> L20
        c(r6, new byte[]{97, -54, 10, -37, 81, 99, -80, -58, -104, -79, -98, Ascii.SI, -120, -27, -30, -47, -33, -102, -26, -112, 67, 58, -44, -3, 61, 46, 1, -40, -57, 109, 70, 96, -121, -36, 62, 88, -99, -85, -88, -3, -10, -18, 110, -93});     // Catch: Throwable -> L20
        if (new String(r6, r7).intern().equals(r32) == true) goto L16;
        r12.close();     // Catch: Throwable -> L14
        r93.close();     // Catch: Exception -> L32
        return null;
    L16:
        r12.flush();     // Catch: Throwable -> L20
        String r02 = r2.getAbsolutePath();     // Catch: Throwable -> L20
        r12.close();     // Catch: Throwable -> L14
        r93.close();     // Catch: Exception -> L32
        return r02;
    L20:
        th = move-exception;
        r12.close();     // Catch: Throwable -> L23
    L25:
        throw th;     // Catch: Throwable -> L14
    L23:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L14
    L14:
        th = move-exception;
        if (r93 != null) goto L33;
    L31:
        throw th;     // Catch: Exception -> L32
    L33:
        r93.close();     // Catch: Throwable -> L29
    L29:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Exception -> L32
    L32:
        return null;
    L5:
        if (r2.delete() == true) goto L38;
        return null;
    }

    public final byte[] d(InputStream r5, OutputStream r6) {
        byte[] r1 = {-27, -125, 2, 96, -73, -44, 56};
        c(r1, new byte[]{-74, -53, 67, 77, -123, -31, Ascii.SO, -104});
        MessageDigest r02 = MessageDigest.getInstance(new String(r1, StandardCharsets.UTF_8).intern());
        byte[] r12 = new byte[UserMetadata.MAX_INTERNAL_KEY_SIZE];
    L3:
        int r2 = r5.read(r12);
        if (r2 <= 0) goto L7;
        r6.write(r12, 0, r2);
        r02.update(r12, 0, r2);
        goto L3
    L7:
        return r02.digest();
    }
}
