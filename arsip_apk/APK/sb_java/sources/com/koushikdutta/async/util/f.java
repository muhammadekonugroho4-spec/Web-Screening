package com.koushikdutta.async.util;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f41665a;

    /* renamed from: b, reason: collision with root package name */
    public long f41666b;

    /* renamed from: c, reason: collision with root package name */
    public long f41667c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f41668e;

    /* renamed from: f, reason: collision with root package name */
    public int f41669f;

    /* renamed from: g, reason: collision with root package name */
    public int f41670g;

    /* renamed from: h, reason: collision with root package name */
    public int f41671h;

    public f(long r3) {
        if (r3 <= 0) goto L7;
        this.f41667c = r3;
        this.f41665a = new LinkedHashMap(0, 0.75f, true);
        return;
    L7:
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public Object a(Object r1) {
        return null;
    }

    public void b(boolean r1, Object r2, Object r3, Object r4) {
    }

    public final Object c(Object r7) {
        if (r7 == null) goto L35;
        monitor-enter(this);
        Object r02 = this.f41665a.get(r7);     // Catch: Throwable -> L9
        if (r02 == null) goto L11;
        this.f41670g++;
        monitor-exit(this);     // Catch: Throwable -> L9
        return r02;
    L11:
        this.f41671h++;
        monitor-exit(this);     // Catch: Throwable -> L9
        Object r03 = a(r7);
        if (r03 != null) goto L17;
        return null;
    L17:
        monitor-enter(this);
        this.f41668e++;
        Object r1 = this.f41665a.put(r7, r03);     // Catch: Throwable -> L21
        if (r1 == null) goto L23;
        this.f41665a.put(r7, r1);     // Catch: Throwable -> L21
    L24:
        monitor-exit(this);     // Catch: Throwable -> L21
        if (r1 == null) goto L28;
        b(false, r7, r03, r1);
        return r1;
    L28:
        j(this.f41667c);
        return r03;
    L23:
        this.f41666b += g(r7, r03);
    L21:
        th = move-exception;
        throw th;
    L9:
        th = move-exception;
        throw th;
    L35:
        throw new NullPointerException("key == null");
    }

    public final synchronized long d() {
        monitor-enter(this);
        long r02 = this.f41667c;     // Catch: Throwable -> L6
        monitor-exit(this);
        return r02;
    L6:
        th = move-exception;
        throw th;
    }

    public final Object e(Object r6, Object r7) {
        if (r6 == null) goto L18;
        if (r7 == null) goto L18;
        monitor-enter(this);
        this.d++;
        this.f41666b += g(r6, r7);
        Object r02 = this.f41665a.put(r6, r7);     // Catch: Throwable -> L8
        if (r02 == null) goto L10;
        this.f41666b -= g(r6, r02);
    L10:
        monitor-exit(this);     // Catch: Throwable -> L8
        if (r02 == null) goto L13;
        b(false, r6, r02, r7);
    L13:
        j(this.f41667c);
        return r02;
    L8:
        th = move-exception;
        throw th;
    L18:
        throw new NullPointerException("key == null || value == null");
    }

    public final Object f(Object r6) {
        if (r6 == null) goto L16;
        monitor-enter(this);
        Object r02 = this.f41665a.remove(r6);     // Catch: Throwable -> L7
        if (r02 == null) goto L9;
        this.f41666b -= g(r6, r02);
    L9:
        monitor-exit(this);     // Catch: Throwable -> L7
        if (r02 == null) goto L12;
        b(false, r6, r02, null);
    L12:
        return r02;
    L7:
        th = move-exception;
        throw th;
    L16:
        throw new NullPointerException("key == null");
    }

    public final long g(Object r5, Object r6) {
        long r02 = i(r5, r6);
        if (r02 < 0) goto L6;
        return r02;
    L6:
        throw new IllegalStateException("Negative size: " + r5 + ContainerUtils.KEY_VALUE_DELIMITER + r6);
    }

    public void h(long r1) {
        this.f41667c = r1;
    }

    public abstract long i(Object r1, Object r2);

    public final void j(long r7) {
    L2:
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L4:
        if (this.f41666b < 0) goto L23;
        if (this.f41665a.isEmpty() == false) goto L13;
        if (this.f41666b != 0) goto L23;
    L13:
        if (this.f41666b <= r7) goto L20;
        if (this.f41665a.isEmpty() == true) goto L20;
        Map.Entry r02 = (Map.Entry) this.f41665a.entrySet().iterator().next();     // Catch: Throwable -> L10
        Object r1 = r02.getKey();     // Catch: Throwable -> L10
        Object r03 = r02.getValue();     // Catch: Throwable -> L10
        this.f41665a.remove(r1);     // Catch: Throwable -> L10
        this.f41666b -= g(r1, r03);
        this.f41669f++;
        monitor-exit(this);     // Catch: Throwable -> L10
        b(true, r1, r03, null);
    L20:
        monitor-exit(this);     // Catch: Throwable -> L10
        return;
    L23:
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");     // Catch: Throwable -> L10
    }

    public final synchronized String toString() {
        monitor-enter(this);
        int r02 = this.f41670g;     // Catch: Throwable -> L6
        int r1 = this.f41671h + r02;     // Catch: Throwable -> L6
        if (r1 == 0) goto L8;
        int r03 = (r02 * 100) / r1;     // Catch: Throwable -> L6
    L9:
        String r04 = String.format(Locale.ENGLISH, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Long.valueOf(this.f41667c), Integer.valueOf(this.f41670g), Integer.valueOf(this.f41671h), Integer.valueOf(r03)});     // Catch: Throwable -> L6
        monitor-exit(this);
        return r04;
    L8:
        r03 = 0;
    L6:
        th = move-exception;
        throw th;
    }
}
