package org.slf4j;

import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.helpers.d;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static volatile int f183024a;

    /* renamed from: b, reason: collision with root package name */
    public static final org.slf4j.helpers.c f183025b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final org.slf4j.helpers.a f183026c = null;
    public static boolean d;

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f183027e = null;

    /* renamed from: f, reason: collision with root package name */
    public static String f183028f;

    static {
        f183025b = new org.slf4j.helpers.c();
        f183026c = new org.slf4j.helpers.a();
        d = d.f("slf4j.detectLoggerNameMismatch");
        f183027e = new String[]{"1.6", "1.7"};
        f183028f = "org/slf4j/impl/StaticLoggerBinder.class";
    }

    public static final void a() {
    L8:
        e = move-exception;
        e(e);
        throw new IllegalStateException("Unexpected initialization failure", e);
    L18:
        e = move-exception;
        if (m(e.getMessage()) == false) goto L23;
        f183024a = 4;
        d.c("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
        d.c("Defaulting to no-operation (NOP) logger implementation");
        d.c("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
        return;
    L23:
        e(e);
        throw e;
    L11:
        e = move-exception;
        String r1 = e.getMessage();
        if (r1 != null) goto L15;
    L17:
        throw e;
    L15:
        if (r1.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()") == false) goto L17;
        f183024a = 2;
        d.c("slf4j-api 1.6.x (or later) is incompatible with this binding.");
        d.c("Your binding is version 1.5.5 or earlier.");
        d.c("Upgrade your binding to version 1.6.x.");
        goto L17
    L3:
        if (l() == true) goto L5;
        Set r02 = f();     // Catch: Exception -> L8 NoSuchMethodError -> L11 NoClassDefFoundError -> L18
        s(r02);     // Catch: Exception -> L8 NoSuchMethodError -> L11 NoClassDefFoundError -> L18
    L6:
        org.slf4j.impl.a.c();     // Catch: Exception -> L8 NoSuchMethodError -> L11 NoClassDefFoundError -> L18
        f183024a = 3;     // Catch: Exception -> L8 NoSuchMethodError -> L11 NoClassDefFoundError -> L18
        r(r02);     // Catch: Exception -> L8 NoSuchMethodError -> L11 NoClassDefFoundError -> L18
        g();     // Catch: Exception -> L8 NoSuchMethodError -> L11 NoClassDefFoundError -> L18
        p();     // Catch: Exception -> L8 NoSuchMethodError -> L11 NoClassDefFoundError -> L18
        f183025b.b();     // Catch: Exception -> L8 NoSuchMethodError -> L11 NoClassDefFoundError -> L18
        return;
    L5:
        r02 = null;
        goto L6
    }

    public static void b(org.slf4j.event.b r1, int r2) {
        if (r1.a().a() == false) goto L7;
        c(r2);
        return;
    L7:
        if (r1.a().b() == false) goto L9;
        return;
    L9:
        d();
    }

    public static void c(int r2) {
        d.c("A number (" + r2 + ") of logging calls during the initialization phase have been intercepted and are");
        d.c("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        d.c("See also http://www.slf4j.org/codes.html#replay");
    }

    public static void d() {
        d.c("The following set of substitute loggers may have been accessed");
        d.c("during the initialization phase. Logging calls during this");
        d.c("phase were not honored. However, subsequent logging calls to these");
        d.c("loggers will work as normally expected.");
        d.c("See also http://www.slf4j.org/codes.html#substituteLogger");
    }

    public static void e(Throwable r1) {
        f183024a = 2;
        d.d("Failed to instantiate SLF4J LoggerFactory", r1);
    }

    public static Set f() {
        LinkedHashSet r02 = new LinkedHashSet();
        ClassLoader r1 = c.class.getClassLoader();     // Catch: IOException -> L6
        if (r1 != null) goto L8;
        Enumeration<URL> r12 = ClassLoader.getSystemResources(f183028f);     // Catch: IOException -> L6
    L9:
        if (r12.hasMoreElements() == false) goto L14;
        r02.add(r12.nextElement());     // Catch: IOException -> L6
    L14:
        return r02;
    L8:
        r12 = r1.getResources(f183028f);     // Catch: IOException -> L6
    L6:
        e = move-exception;
        d.d("Error getting resources from path", e);
        goto L14
    }

    public static void g() {
        org.slf4j.helpers.c r02 = f183025b;
        monitor-enter(r02);
        r02.e();     // Catch: Throwable -> L8
        Iterator r1 = r02.d().iterator();     // Catch: Throwable -> L8
    L6:
        if (r1.hasNext() == false) goto L10;
        org.slf4j.helpers.b r2 = (org.slf4j.helpers.b) r1.next();     // Catch: Throwable -> L8
        r2.e(j(r2.getName()));     // Catch: Throwable -> L8
        goto L6
    L10:
        monitor-exit(r02);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public static a h() {
        if (f183024a == 0) goto L5;
    L15:
        int r02 = f183024a;
        if (r02 == 1) goto L32;
        if (r02 == 2) goto L30;
        if (r02 == 3) goto L28;
        if (r02 != 4) goto L26;
        return f183026c;
    L26:
        throw new IllegalStateException("Unreachable code");
    L28:
        return org.slf4j.impl.a.c().a();
    L30:
        throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
    L32:
        return f183025b;
    L5:
        monitor-enter(c.class);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (f183024a != 0) goto L11;
        f183024a = 1;     // Catch: Throwable -> L9
        o();     // Catch: Throwable -> L9
    L11:
        monitor-exit(c.class);     // Catch: Throwable -> L9
        goto L15
    }

    public static b i(Class r2) {
        b r02 = j(r2.getName());
        if (d == false) goto L9;
        Class r1 = d.a();
        if (r1 == null) goto L9;
        if (n(r2, r1) == false) goto L9;
        d.c(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", new Object[]{r02.getName(), r1.getName()}));
        d.c("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
    L9:
        return r02;
    }

    public static b j(String r1) {
        return h().a(r1);
    }

    public static boolean k(Set r1) {
        if (r1.size() <= 1) goto L5;
        return true;
    L5:
        return false;
    }

    public static boolean l() {
        String r02 = d.g("java.vendor.url");
        if (r02 != null) goto L7;
        return false;
    L7:
        return r02.toLowerCase().contains(Constants.KEY_ANDROID);
    }

    public static boolean m(String r3) {
        if (r3 != null) goto L6;
        return false;
    L6:
        if (r3.contains("org/slf4j/impl/StaticLoggerBinder") == false) goto L9;
        return true;
    L9:
        if (r3.contains("org.slf4j.impl.StaticLoggerBinder") == false) goto L11;
        return true;
    L11:
        return false;
    }

    public static boolean n(Class r02, Class r1) {
        return !r1.isAssignableFrom(r02);
    }

    public static final void o() {
        a();
        if (f183024a != 3) goto L6;
        t();
        return;
    }

    public static void p() {
        LinkedBlockingQueue r02 = f183025b.c();
        int r1 = r02.size();
        ArrayList r2 = new ArrayList(128);
        int r4 = 0;
    L4:
        if (r02.drainTo(r2, 128) == 0) goto L5;
        Iterator r5 = r2.iterator();
    L8:
        if (r5.hasNext() == false) goto L13;
        org.slf4j.event.b r6 = (org.slf4j.event.b) r5.next();
        q(r6);
        int r7 = r4 + 1;
        if (r4 != 0) goto L12;
        b(r6, r1);
    L12:
        r4 = r7;
        goto L8
    L13:
        r2.clear();
        goto L4
    }

    public static void q(org.slf4j.event.b r02) {
    }

    public static void r(Set r1) {
        if (r1 != null) goto L4;
        return;
    L4:
        if (k(r1) == false) goto L8;
        d.c("Actual binding is of type [" + org.slf4j.impl.a.c().b() + Constants.AES_SUFFIX);
        return;
    }

    public static void s(Set r3) {
        if (k(r3) == false) goto L11;
        d.c("Class path contains multiple SLF4J bindings.");
        Iterator r32 = r3.iterator();
    L6:
        if (r32.hasNext() == false) goto L8;
        d.c("Found binding in [" + ((URL) r32.next()) + Constants.AES_SUFFIX);
        goto L6
    L8:
        d.c("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        return;
    }

    public static final void t() {
        String r02 = org.slf4j.impl.a.f183041c;     // Catch: Throwable -> L11 NoSuchFieldError -> L14
        String[] r1 = f183027e;     // Catch: Throwable -> L11 NoSuchFieldError -> L14
        int r2 = r1.length;     // Catch: Throwable -> L11 NoSuchFieldError -> L14
        int r3 = 0;
        boolean r4 = false;
    L3:
        if (r3 >= r2) goto L8;
        if (r02.startsWith(r1[r3]) == false) goto L7;
        r4 = true;
    L7:
        r3 = r3 + 1;     // Catch: Throwable -> L11 NoSuchFieldError -> L14
        goto L3
    L8:
        if (r4 == true) goto L20;
        d.c("The requested version " + r02 + " by your slf4j binding is not compatible with " + Arrays.asList(f183027e).toString());     // Catch: Throwable -> L11 NoSuchFieldError -> L14
        d.c("See http://www.slf4j.org/codes.html#version_mismatch for further details.");     // Catch: Throwable -> L11 NoSuchFieldError -> L14
        return;
        goto L21
    L20:
        return;
    L11:
        th = move-exception;
        d.d("Unexpected problem occured during version sanity check", th);
        return;
    }
}
