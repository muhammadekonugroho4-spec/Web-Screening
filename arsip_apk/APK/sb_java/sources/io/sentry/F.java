package io.sentry;

import io.sentry.util.AutoClosableReentrantLock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class F {

    /* renamed from: h, reason: collision with root package name */
    public static final Map f174772h = null;

    /* renamed from: a, reason: collision with root package name */
    public final Map f174773a;

    /* renamed from: b, reason: collision with root package name */
    public final List f174774b;

    /* renamed from: c, reason: collision with root package name */
    public final AutoClosableReentrantLock f174775c;
    public C11565b d;

    /* renamed from: e, reason: collision with root package name */
    public C11565b f174776e;

    /* renamed from: f, reason: collision with root package name */
    public C11565b f174777f;

    /* renamed from: g, reason: collision with root package name */
    public C11685v1 f174778g;

    static {
        HashMap r02 = new HashMap();
        f174772h = r02;
        r02.put("boolean", Boolean.class);
        r02.put("char", Character.class);
        r02.put("byte", Byte.class);
        r02.put("short", Short.class);
        r02.put("int", Integer.class);
        r02.put("long", Long.class);
        r02.put("float", Float.class);
        r02.put("double", Double.class);
    }

    public F() {
        this.f174773a = new HashMap();
        this.f174774b = new ArrayList();
        this.f174775c = new AutoClosableReentrantLock();
        this.d = null;
        this.f174776e = null;
        this.f174777f = null;
        this.f174778g = null;
    }

    public void a(C11565b r2) {
        if (r2 == null) goto L5;
        this.f174774b.add(r2);
        return;
    }

    public void b(List r2) {
        if (r2 == null) goto L5;
        this.f174774b.addAll(r2);
        return;
    }

    public void c() {
        InterfaceC11576d0 r02 = this.f174775c.a();
        Iterator r1 = this.f174773a.entrySet().iterator();     // Catch: Throwable -> L11
    L4:
        if (r1.hasNext() == false) goto L15;
        Map.Entry r2 = (Map.Entry) r1.next();     // Catch: Throwable -> L11
        if (r2.getKey() == null) goto L13;
        if (((String) r2.getKey()).startsWith("sentry:") == true) goto L4;
    L13:
        r1.remove();     // Catch: Throwable -> L11
        goto L4
    L15:
        if (r02 == null) goto L34;
        r02.close();
        return;
    L34:
        return;
    L11:
        th = move-exception;
        if (r02 != null) goto L26;
    L23:
        throw th;
    L26:
        r02.close();     // Catch: Throwable -> L21
    L21:
        th = move-exception;
        th.addSuppressed(th);
        goto L23
    }

    public Object d(String r3) {
        InterfaceC11576d0 r02 = this.f174775c.a();
        Object r32 = this.f174773a.get(r3);     // Catch: Throwable -> L7
        if (r02 == null) goto L6;
        r02.close();
    L6:
        return r32;
    L7:
        th = move-exception;
        if (r02 != null) goto L16;
    L13:
        throw th;
    L16:
        r02.close();     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        th.addSuppressed(th);
        goto L13
    }

    public Object e(String r3, Class r4) {
        InterfaceC11576d0 r02 = this.f174775c.a();
        Object r32 = this.f174773a.get(r3);     // Catch: Throwable -> L17
        if (r4.isInstance(r32) == false) goto L8;
        if (r02 == null) goto L12;
        r02.close();
        return r32;
    L12:
        return r32;
    L8:
        if (k(r32, r4) == false) goto L14;
        if (r02 == null) goto L12;
        r02.close();
        goto L12
    L14:
        if (r02 == null) goto L16;
        r02.close();
    L16:
        return null;
    L17:
        th = move-exception;
        if (r02 != null) goto L24;
    L23:
        throw th;
    L24:
        r02.close();     // Catch: Throwable -> L21
    L21:
        th = move-exception;
        th.addSuppressed(th);
        goto L23
    }

    public List f() {
        return new ArrayList(this.f174774b);
    }

    public C11685v1 g() {
        return this.f174778g;
    }

    public C11565b h() {
        return this.d;
    }

    public C11565b i() {
        return this.f174777f;
    }

    public C11565b j() {
        return this.f174776e;
    }

    public final boolean k(Object r3, Class r4) {
        Class r02 = (Class) f174772h.get(r4.getCanonicalName());
        if (r3 != null) goto L5;
        return false;
    L5:
        if (r4.isPrimitive() == false) goto L13;
        if (r02 != null) goto L8;
        return false;
    L8:
        if (r02.isInstance(r3) == false) goto L15;
        return true;
    L15:
        return false;
    L13:
        return false;
    }

    public void l(String r3, Object r4) {
        InterfaceC11576d0 r02 = this.f174775c.a();
        this.f174773a.put(r3, r4);     // Catch: Throwable -> L7
        if (r02 == null) goto L18;
        r02.close();
        return;
    L18:
        return;
    L7:
        th = move-exception;
        if (r02 != null) goto L16;
    L13:
        throw th;
    L16:
        r02.close();     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        th.addSuppressed(th);
        goto L13
    }

    public void m(C11685v1 r1) {
        this.f174778g = r1;
    }

    public void n(C11565b r1) {
        this.d = r1;
    }

    public void o(C11565b r1) {
        this.f174777f = r1;
    }

    public void p(C11565b r1) {
        this.f174776e = r1;
    }
}
