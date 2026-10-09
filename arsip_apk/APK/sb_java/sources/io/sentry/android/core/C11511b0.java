package io.sentry.android.core;

import android.os.Build;
import com.huawei.hms.android.SystemUtils;
import io.sentry.SentryLevel;

/* renamed from: io.sentry.android.core.b0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11511b0 {

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.Q f175342a;

    public C11511b0(io.sentry.Q r2) {
        this.f175342a = (io.sentry.Q) io.sentry.util.v.c(r2, "The ILogger object is required.");
    }

    public String a() {
        return Build.TAGS;
    }

    public String b() {
        return Build.MANUFACTURER;
    }

    public String c() {
        return Build.MODEL;
    }

    public int d() {
        return Build.VERSION.SDK_INT;
    }

    public String e() {
        return Build.VERSION.RELEASE;
    }

    public Boolean f() {
    L8:
        th = move-exception;
        this.f175342a.a(SentryLevel.ERROR, "Error checking whether application is running in an emulator.", th);
        return null;
    L4:
        if (Build.BRAND.startsWith("generic") == true) goto L6;
    L10:
        String r2 = Build.FINGERPRINT;     // Catch: Throwable -> L8
        if (r2.startsWith("generic") == false) goto L13;
    L42:
        boolean r02 = true;
    L43:
        return Boolean.valueOf(r02);
    L13:
        if (r2.startsWith(SystemUtils.UNKNOWN) == true) goto L42;
        String r1 = Build.HARDWARE;     // Catch: Throwable -> L8
        if (r1.contains("goldfish") == true) goto L42;
        if (r1.contains("ranchu") == true) goto L42;
        String r12 = Build.MODEL;     // Catch: Throwable -> L8
        if (r12.contains("google_sdk") == true) goto L42;
        if (r12.contains("Emulator") == true) goto L42;
        if (r12.contains("Android SDK built for x86") == true) goto L42;
        if (Build.MANUFACTURER.contains("Genymotion") == true) goto L42;
        String r13 = Build.PRODUCT;     // Catch: Throwable -> L8
        if (r13.contains("sdk_google") == true) goto L42;
        if (r13.contains("google_sdk") == true) goto L42;
        if (r13.contains("sdk") == true) goto L42;
        if (r13.contains("sdk_x86") == true) goto L42;
        if (r13.contains("vbox86p") == true) goto L42;
        if (r13.contains("emulator") == true) goto L42;
        if (r13.contains("simulator") == true) goto L42;
        r02 = false;
        goto L43
    L6:
        if (Build.DEVICE.startsWith("generic") == true) goto L42;
        goto L42
    }
}
