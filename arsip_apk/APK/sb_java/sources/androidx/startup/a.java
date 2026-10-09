package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class a {
    public static volatile a d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f28127e = null;

    /* renamed from: a, reason: collision with root package name */
    public final Map f28128a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f28129b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f28130c;

    static {
        f28127e = new Object();
    }

    public a(Context r1) {
        this.f28130c = r1.getApplicationContext();
        this.f28129b = new HashSet();
        this.f28128a = new HashMap();
    }

    public static a e(Context r2) {
        if (d != null) goto L16;
        Object r02 = f28127e;
        monitor-enter(r02);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (d != null) goto L11;
        d = new a(r2);     // Catch: Throwable -> L9
    L11:
        monitor-exit(r02);     // Catch: Throwable -> L9
    L16:
        return d;
    }

    public void a(Bundle r6) {
        String r02 = this.f28130c.getString(c.f28131a);
        if (r6 != null) goto L22;
        return;
    L22:
        HashSet r1 = new HashSet();     // Catch: ClassNotFoundException -> L12
        Iterator<String> r2 = r6.keySet().iterator();     // Catch: ClassNotFoundException -> L12
    L6:
        if (r2.hasNext() == false) goto L14;
        String r3 = r2.next();     // Catch: ClassNotFoundException -> L12
        if (r02.equals(r6.getString(r3, null)) == false) goto L6;
        Class<?> r32 = Class.forName(r3);     // Catch: ClassNotFoundException -> L12
        if (b.class.isAssignableFrom(r32) == false) goto L6;
        this.f28129b.add(r32);     // Catch: ClassNotFoundException -> L12
        goto L6
    L14:
        Iterator r62 = this.f28129b.iterator();     // Catch: ClassNotFoundException -> L12
    L15:
        if (r62.hasNext() == false) goto L32;
        d((Class) r62.next(), r1);     // Catch: ClassNotFoundException -> L12
        goto L15
    L32:
        return;
    L12:
        e = move-exception;
        throw new StartupException(e);
    }

    public void b(Class r3) {
        androidx.tracing.a.c("Startup");     // Catch: Throwable -> L5 PackageManager.NameNotFoundException -> L7
        ComponentName r02 = new ComponentName(this.f28130c, r3);     // Catch: Throwable -> L5 PackageManager.NameNotFoundException -> L7
        a(this.f28130c.getPackageManager().getProviderInfo(r02, 128).metaData);     // Catch: Throwable -> L5 PackageManager.NameNotFoundException -> L7
        androidx.tracing.a.f();
        return;
    L5:
        th = move-exception;
        androidx.tracing.a.f();
        throw th;
    L7:
        e = move-exception;
        throw new StartupException(e);     // Catch: Throwable -> L5
    }

    public Object c(Class r3) {
        Object r02 = f28127e;
        monitor-enter(r02);
        Object r1 = this.f28128a.get(r3);     // Catch: Throwable -> L7
        if (r1 != null) goto L9;
        r1 = d(r3, new HashSet());     // Catch: Throwable -> L7
    L9:
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    public final Object d(Class r5, Set r6) {
        if (androidx.tracing.a.h() == false) goto L8;
        androidx.tracing.a.c(r5.getSimpleName());     // Catch: Throwable -> L5
    L5:
        th = move-exception;
        androidx.tracing.a.f();
        throw th;
    L8:
        if (r6.contains(r5) == true) goto L31;
        if (this.f28128a.containsKey(r5) == true) goto L27;
        r6.add(r5);     // Catch: Throwable -> L5
        b r02 = (b) r5.getDeclaredConstructor(null).newInstance(null);     // Catch: Throwable -> L21
        List r1 = r02.dependencies();     // Catch: Throwable -> L21
        if (r1.isEmpty() == true) goto L23;
        Iterator r12 = r1.iterator();     // Catch: Throwable -> L21
    L17:
        if (r12.hasNext() == false) goto L23;
        Class r2 = (Class) r12.next();     // Catch: Throwable -> L21
        if (this.f28128a.containsKey(r2) == true) goto L17;
        d(r2, r6);     // Catch: Throwable -> L21
    L23:
        Object r03 = r02.create(this.f28130c);     // Catch: Throwable -> L21
        r6.remove(r5);     // Catch: Throwable -> L21
        this.f28128a.put(r5, r03);     // Catch: Throwable -> L21
    L28:
        androidx.tracing.a.f();
        return r03;
    L21:
        th = move-exception;
        throw new StartupException(th);     // Catch: Throwable -> L5
    L27:
        r03 = this.f28128a.get(r5);     // Catch: Throwable -> L5
        goto L28
    L31:
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", new Object[]{r5.getName()}));     // Catch: Throwable -> L5
    }

    public Object f(Class r1) {
        return c(r1);
    }

    public boolean g(Class r2) {
        return this.f28129b.contains(r2);
    }
}
