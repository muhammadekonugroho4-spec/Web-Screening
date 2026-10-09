package com.airbnb.lottie;

import android.content.Context;
import java.io.File;

/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f31053a = false;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f31054b = false;

    /* renamed from: c, reason: collision with root package name */
    public static String[] f31055c;
    public static long[] d;

    /* renamed from: e, reason: collision with root package name */
    public static int f31056e;

    /* renamed from: f, reason: collision with root package name */
    public static int f31057f;

    /* renamed from: g, reason: collision with root package name */
    public static com.airbnb.lottie.network.e f31058g;

    /* renamed from: h, reason: collision with root package name */
    public static com.airbnb.lottie.network.d f31059h;

    /* renamed from: i, reason: collision with root package name */
    public static volatile com.airbnb.lottie.network.g f31060i;

    /* renamed from: j, reason: collision with root package name */
    public static volatile com.airbnb.lottie.network.f f31061j;

    public class a implements com.airbnb.lottie.network.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f31062a;

        public a(Context r1) {
            this.f31062a = r1;
        }

        @Override // com.airbnb.lottie.network.d
        public File a() {
            return new File(this.f31062a.getCacheDir(), "lottie_network_cache");
        }
    }

    static {
    }

    public static void a(String r4) {
        if (f31054b == true) goto L5;
        return;
    L5:
        int r02 = f31056e;
        if (r02 != 20) goto L9;
        f31057f++;
        return;
    L9:
        f31055c[r02] = r4;
        d[r02] = System.nanoTime();
        androidx.core.os.n.a(r4);
        f31056e++;
    }

    public static float b(String r4) {
        int r02 = f31057f;
        if (r02 <= 0) goto L7;
        f31057f = r02 - 1;
        return 0.0f;
    L7:
        if (f31054b == true) goto L9;
        return 0.0f;
    L9:
        int r03 = f31056e - 1;
        f31056e = r03;
        if (r03 == (-1)) goto L18;
        if (r4.equals(f31055c[r03]) == false) goto L16;
        androidx.core.os.n.b();
        return (System.nanoTime() - d[f31056e]) / 1000000.0f;
    L16:
        throw new IllegalStateException("Unbalanced trace call " + r4 + ". Expected " + f31055c[f31056e] + ".");
    L18:
        throw new IllegalStateException("Can't end trace section. There are none.");
    }

    public static com.airbnb.lottie.network.f c(Context r3) {
        Context r32 = r3.getApplicationContext();
        com.airbnb.lottie.network.f r02 = f31061j;
        if (r02 == null) goto L5;
        return r02;
    L5:
        monitor-enter(com.airbnb.lottie.network.f.class);
        com.airbnb.lottie.network.f r03 = f31061j;     // Catch: Throwable -> L13
        if (r03 != null) goto L15;
        com.airbnb.lottie.network.d r2 = f31059h;     // Catch: Throwable -> L13
        if (r2 != null) goto L12;
        r2 = new a(r32);     // Catch: Throwable -> L13
    L12:
        r03 = new com.airbnb.lottie.network.f(r2);     // Catch: Throwable -> L13
        f31061j = r03;     // Catch: Throwable -> L13
    L15:
        monitor-exit(com.airbnb.lottie.network.f.class);     // Catch: Throwable -> L13
        return r03;
    L13:
        th = move-exception;
        throw th;
    }

    public static com.airbnb.lottie.network.g d(Context r3) {
        com.airbnb.lottie.network.g r02 = f31060i;
        if (r02 == null) goto L5;
        return r02;
    L5:
        monitor-enter(com.airbnb.lottie.network.g.class);
        com.airbnb.lottie.network.g r03 = f31060i;     // Catch: Throwable -> L13
        if (r03 != null) goto L15;
        com.airbnb.lottie.network.f r32 = c(r3);     // Catch: Throwable -> L13
        com.airbnb.lottie.network.e r2 = f31058g;     // Catch: Throwable -> L13
        if (r2 != null) goto L12;
        r2 = new com.airbnb.lottie.network.b();     // Catch: Throwable -> L13
    L12:
        r03 = new com.airbnb.lottie.network.g(r32, r2);     // Catch: Throwable -> L13
        f31060i = r03;     // Catch: Throwable -> L13
    L15:
        monitor-exit(com.airbnb.lottie.network.g.class);     // Catch: Throwable -> L13
        return r03;
    L13:
        th = move-exception;
        throw th;
    }
}
