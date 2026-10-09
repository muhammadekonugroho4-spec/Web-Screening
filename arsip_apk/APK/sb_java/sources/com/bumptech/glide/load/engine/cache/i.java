package com.bumptech.glide.load.engine.cache;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f32728a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32729b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f32730c;
    public final int d;

    public static final class a {

        /* renamed from: i, reason: collision with root package name */
        public static final int f32731i = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Context f32732a;

        /* renamed from: b, reason: collision with root package name */
        public ActivityManager f32733b;

        /* renamed from: c, reason: collision with root package name */
        public c f32734c;
        public float d;

        /* renamed from: e, reason: collision with root package name */
        public float f32735e;

        /* renamed from: f, reason: collision with root package name */
        public float f32736f;

        /* renamed from: g, reason: collision with root package name */
        public float f32737g;

        /* renamed from: h, reason: collision with root package name */
        public int f32738h;

        static {
            f32731i = 1;
        }

        public a(Context r2) {
            this.d = 2.0f;
            this.f32735e = f32731i;
            this.f32736f = 0.4f;
            this.f32737g = 0.33f;
            this.f32738h = 4194304;
            this.f32732a = r2;
            this.f32733b = (ActivityManager) r2.getSystemService("activity");
            this.f32734c = new b(r2.getResources().getDisplayMetrics());
            if (i.e(this.f32733b) == false) goto L6;
            this.f32735e = 0.0f;
            return;
        }

        public i a() {
            return new i(this);
        }
    }

    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final DisplayMetrics f32739a;

        public b(DisplayMetrics r1) {
            this.f32739a = r1;
        }

        @Override // com.bumptech.glide.load.engine.cache.i.c
        public int a() {
            return this.f32739a.heightPixels;
        }

        @Override // com.bumptech.glide.load.engine.cache.i.c
        public int b() {
            return this.f32739a.widthPixels;
        }
    }

    public interface c {
        int a();

        int b();
    }

    public i(a r7) {
        this.f32730c = r7.f32732a;
        if (e(r7.f32733b) == false) goto L5;
        int r02 = r7.f32738h / 2;
    L6:
        this.d = r02;
        int r1 = c(r7.f32733b, r7.f32736f, r7.f32737g);
        float r2 = (r7.f32734c.b() * r7.f32734c.a()) * 4;
        int r3 = Math.round(r7.f32735e * r2);
        int r22 = Math.round(r2 * r7.d);
        int r4 = r1 - r02;
        int r5 = r22 + r3;
        if (r5 > r4) goto L9;
        this.f32729b = r22;
        this.f32728a = r3;
    L11:
        if (Log.isLoggable("MemorySizeCalculator", 3) == false) goto L18;
        StringBuilder r23 = new StringBuilder();
        r23.append("Calculation complete, Calculated memory cache size: ");
        r23.append(f(this.f32729b));
        r23.append(", pool size: ");
        r23.append(f(this.f32728a));
        r23.append(", byte array size: ");
        r23.append(f(r02));
        r23.append(", memory class limited? ");
        if (r5 <= r1) goto L15;
        boolean r03 = true;
    L16:
        r23.append(r03);
        r23.append(", max size: ");
        r23.append(f(r1));
        r23.append(", memoryClass: ");
        r23.append(r7.f32733b.getMemoryClass());
        r23.append(", isLowMemoryDevice: ");
        r23.append(e(r7.f32733b));
        Log.d("MemorySizeCalculator", r23.toString());
        return;
    L15:
        r03 = false;
        goto L16
    L18:
        return;
    L9:
        float r24 = r4;
        float r32 = r7.f32735e;
        float r42 = r7.d;
        float r25 = r24 / (r32 + r42);
        this.f32729b = Math.round(r42 * r25);
        this.f32728a = Math.round(r25 * r7.f32735e);
        goto L11
    L5:
        r02 = r7.f32738h;
        goto L6
    }

    public static int c(ActivityManager r2, float r3, float r4) {
        float r02 = r2.getMemoryClass() * 1048576;
        if (e(r2) == false) goto L6;
        r3 = r4;
    L6:
        return Math.round(r02 * r3);
    }

    public static boolean e(ActivityManager r02) {
        return r02.isLowRamDevice();
    }

    public int a() {
        return this.d;
    }

    public int b() {
        return this.f32728a;
    }

    public int d() {
        return this.f32729b;
    }

    public final String f(int r4) {
        return Formatter.formatFileSize(this.f32730c, r4);
    }
}
