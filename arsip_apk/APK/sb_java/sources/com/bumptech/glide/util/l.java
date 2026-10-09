package com.bumptech.glide.util;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.clevertap.android.sdk.Constants;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

/* loaded from: classes4.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f33400a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f33401b = null;

    /* renamed from: c, reason: collision with root package name */
    public static volatile Handler f33402c;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33403a = null;

        static {
            int[] r02 = new int[Bitmap.Config.values().length];
            f33403a = r02;
            r02[Bitmap.Config.ALPHA_8.ordinal()] = 1;     // Catch: NoSuchFieldError -> L9
        L14:
            f33403a[Bitmap.Config.RGB_565.ordinal()] = 2;     // Catch: NoSuchFieldError -> L10
        L18:
            f33403a[Bitmap.Config.ARGB_4444.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L22:
            f33403a[Bitmap.Config.RGBA_F16.ordinal()] = 4;     // Catch: NoSuchFieldError -> L12
        L16:
            f33403a[Bitmap.Config.ARGB_8888.ordinal()] = 5;     // Catch: NoSuchFieldError -> L13
            return;
        }
    }

    static {
        f33400a = "0123456789abcdef".toCharArray();
        f33401b = new char[64];
    }

    public static void a() {
        if (r() == false) goto L6;
        return;
    L6:
        throw new IllegalArgumentException("You must call this method on a background thread");
    }

    public static void b() {
        if (s() == false) goto L6;
        return;
    L6:
        throw new IllegalArgumentException("You must call this method on the main thread");
    }

    public static boolean c(Object r02, Object r1) {
        if (r02 != null) goto L9;
        if (r1 != null) goto L6;
        return true;
    L6:
        return false;
    L9:
        return r02.equals(r1);
    }

    public static boolean d(Object r02, Object r1) {
        if (r02 != null) goto L9;
        if (r1 != null) goto L6;
        return true;
    L6:
        return false;
    L9:
        return r02.equals(r1);
    }

    public static String e(byte[] r5, char[] r6) {
        int r02 = 0;
    L4:
        if (r02 >= r5.length) goto L7;
        byte r1 = r5[r02];
        int r2 = r1 & UnsignedBytes.MAX_VALUE;
        int r3 = r02 * 2;
        char[] r4 = f33400a;
        r6[r3] = r4[r2 >>> 4];
        r6[r3 + 1] = r4[r1 & Ascii.SI];
        r02 = r02 + 1;
        goto L4
    L7:
        return new String(r6);
    }

    public static Queue f(int r1) {
        return new ArrayDeque(r1);
    }

    public static int g(int r02, int r1, Bitmap.Config r2) {
        return (r02 * r1) * i(r2);
    }

    public static int h(Bitmap r3) {
        if (r3.isRecycled() == true) goto L9;
        return r3.getAllocationByteCount();
    L7:
        return r3.getHeight() * r3.getRowBytes();
    L9:
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + r3 + Constants.AES_PREFIX + r3.getWidth() + "x" + r3.getHeight() + "] " + r3.getConfig());
    }

    public static int i(Bitmap.Config r2) {
        if (r2 != null) goto L4;
        r2 = Bitmap.Config.ARGB_8888;
    L4:
        int r22 = a.f33403a[r2.ordinal()];
        int r02 = 1;
        if (r22 == 1) goto L15;
        r02 = 2;
        if (r22 == 2) goto L15;
        if (r22 == 3) goto L15;
        if (r22 == 4) goto L13;
        return 4;
    L13:
        return 8;
    L15:
        return r02;
    }

    public static List j(Collection r2) {
        ArrayList r02 = new ArrayList(r2.size());
        Iterator r22 = r2.iterator();
    L4:
        if (r22.hasNext() == false) goto L8;
        Object r1 = r22.next();
        if (r1 == null) goto L4;
        r02.add(r1);
        goto L4
    L8:
        return r02;
    }

    public static Handler k() {
        if (f33402c != null) goto L16;
        monitor-enter(l.class);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (f33402c != null) goto L11;
        f33402c = new Handler(Looper.getMainLooper());     // Catch: Throwable -> L9
    L11:
        monitor-exit(l.class);     // Catch: Throwable -> L9
    L16:
        return f33402c;
    }

    public static int l(float r1) {
        return m(r1, 17);
    }

    public static int m(float r02, int r1) {
        return o(Float.floatToIntBits(r02), r1);
    }

    public static int n(int r1) {
        return o(r1, 17);
    }

    public static int o(int r02, int r1) {
        return (r1 * 31) + r02;
    }

    public static int p(Object r02, int r1) {
        if (r02 != null) goto L4;
        int r03 = 0;
    L6:
        return o(r03, r1);
    L4:
        r03 = r02.hashCode();
        goto L6
    }

    public static int q(boolean r02, int r1) {
        return o(r02 ? 1 : 0, r1);
    }

    public static boolean r() {
        return !s();
    }

    public static boolean s() {
        if (Looper.myLooper() != Looper.getMainLooper()) goto L6;
        return true;
    L6:
        return false;
    }

    public static boolean t(int r1) {
        if (r1 <= 0) goto L4;
        return true;
    L4:
        if (r1 == Integer.MIN_VALUE) goto L10;
        return false;
    L10:
        return true;
    }

    public static boolean u(int r02, int r1) {
        if (t(r02) == true) goto L5;
        return false;
    L5:
        if (t(r1) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static void v(Runnable r1) {
        k().post(r1);
    }

    public static void w(Runnable r1) {
        k().removeCallbacks(r1);
    }

    public static String x(byte[] r1) {
        char[] r02 = f33401b;
        monitor-enter(r02);
        String r12 = e(r1, r02);     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r12;
    L7:
        th = move-exception;
        throw th;
    }
}
