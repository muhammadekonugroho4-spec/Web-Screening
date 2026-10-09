package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import com.google.firebase.perf.util.Constants;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f33092g = false;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f33093h = false;

    /* renamed from: i, reason: collision with root package name */
    public static final File f33094i = null;

    /* renamed from: j, reason: collision with root package name */
    public static volatile t f33095j;

    /* renamed from: k, reason: collision with root package name */
    public static volatile int f33096k;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f33097a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33098b;

    /* renamed from: c, reason: collision with root package name */
    public final int f33099c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f33100e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f33101f;

    static {
        if (Build.VERSION.SDK_INT >= 29) goto L5;
        boolean r02 = true;
    L6:
        f33092g = r02;
        f33093h = true;
        f33094i = new File("/proc/self/fd");
        f33096k = -1;
        return;
    L5:
        r02 = false;
        goto L6
    }

    public t() {
        this.f33100e = true;
        this.f33101f = new AtomicBoolean(false);
        this.f33097a = f();
        if (Build.VERSION.SDK_INT < 28) goto L6;
        this.f33098b = 20000;
        this.f33099c = 0;
        return;
    L6:
        this.f33098b = Constants.FROZEN_FRAME_TIME;
        this.f33099c = 128;
    }

    public static t b() {
        if (f33095j != null) goto L16;
        monitor-enter(t.class);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (f33095j != null) goto L11;
        f33095j = new t();     // Catch: Throwable -> L9
    L11:
        monitor-exit(t.class);     // Catch: Throwable -> L9
    L16:
        return f33095j;
    }

    public static boolean f() {
        if (g() == false) goto L5;
        return false;
    L5:
        if (h() == true) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean g() {
        if (Build.VERSION.SDK_INT == 26) goto L5;
        return false;
    L5:
        Iterator r02 = Arrays.asList(new String[]{"SC-04J", "SM-N935", "SM-J720", "SM-G570F", "SM-G570M", "SM-G960", "SM-G965", "SM-G935", "SM-G930", "SM-A520", "SM-A720F", "moto e5", "moto e5 play", "moto e5 plus", "moto e5 cruise", "moto g(6) forge", "moto g(6) play"}).iterator();
    L7:
        if (r02.hasNext() == false) goto L12;
        String r1 = (String) r02.next();
        if (Build.MODEL.startsWith(r1) == false) goto L7;
        return true;
    L12:
        return false;
    }

    public static boolean h() {
        if (Build.VERSION.SDK_INT == 27) goto L7;
        return false;
    L7:
        return Arrays.asList(new String[]{"LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM"}).contains(Build.MODEL);
    }

    public final boolean a() {
        if (f33092g == true) goto L5;
        return false;
    L5:
        if (this.f33101f.get() == true) goto L10;
        return true;
    L10:
        return false;
    }

    public final int c() {
        if (f33096k == (-1)) goto L7;
        return f33096k;
    L7:
        return this.f33098b;
    }

    public final synchronized boolean d() {
        monitor-enter(this);
        boolean r1 = true;
        int r02 = this.d + 1;     // Catch: Throwable -> L14
        this.d = r02;     // Catch: Throwable -> L14
        if (r02 < 50) goto L16;
        this.d = 0;     // Catch: Throwable -> L14
        int r2 = f33094i.list().length;     // Catch: Throwable -> L14
        long r3 = c();     // Catch: Throwable -> L14
        if (r2 < r3) goto L9;
        r1 = false;
    L9:
        this.f33100e = r1;     // Catch: Throwable -> L14
        if (r1 == true) goto L16;
        if (Log.isLoggable("Downsampler", 5) == false) goto L16;
        Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + r2 + ", limit " + r3);     // Catch: Throwable -> L14
    L16:
        boolean r03 = this.f33100e;     // Catch: Throwable -> L14
        monitor-exit(this);
        return r03;
    L14:
        th = move-exception;
        throw th;
    }

    public boolean e(int r4, int r5, boolean r6, boolean r7) {
        if (r6 == true) goto L9;
        if (Log.isLoggable("HardwareConfig", 2) == false) goto L7;
        Log.v("HardwareConfig", "Hardware config disallowed by caller");
    L7:
        return false;
    L9:
        if (this.f33097a == true) goto L15;
        if (Log.isLoggable("HardwareConfig", 2) == false) goto L13;
        Log.v("HardwareConfig", "Hardware config disallowed by device model");
    L13:
        return false;
    L15:
        if (f33093h == true) goto L21;
        if (Log.isLoggable("HardwareConfig", 2) == false) goto L19;
        Log.v("HardwareConfig", "Hardware config disallowed by sdk");
    L19:
        return false;
    L21:
        if (a() == true) goto L23;
        if (r7 == true) goto L28;
        int r62 = this.f33099c;
        if (r4 < r62) goto L34;
        if (r5 >= r62) goto L43;
        if (Log.isLoggable("HardwareConfig", 2) == false) goto L41;
        Log.v("HardwareConfig", "Hardware config disallowed because height is too small");
    L41:
        return false;
    L43:
        if (d() == false) goto L45;
        return true;
    L45:
        if (Log.isLoggable("HardwareConfig", 2) == false) goto L47;
        Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
    L47:
        return false;
    L34:
        if (Log.isLoggable("HardwareConfig", 2) == false) goto L36;
        Log.v("HardwareConfig", "Hardware config disallowed because width is too small");
    L36:
        return false;
    L28:
        if (Log.isLoggable("HardwareConfig", 2) == false) goto L30;
        Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
    L30:
        return false;
    L23:
        if (Log.isLoggable("HardwareConfig", 2) == false) goto L25;
        Log.v("HardwareConfig", "Hardware config disallowed by app state");
    L25:
        return false;
    }

    public boolean i(int r1, int r2, BitmapFactory.Options r3, boolean r4, boolean r5) {
        boolean r12 = e(r1, r2, r4, r5);
        if (r12 == false) goto L5;
        r3.inPreferredConfig = Bitmap.Config.HARDWARE;
        r3.inMutable = false;
    L5:
        return r12;
    }
}
