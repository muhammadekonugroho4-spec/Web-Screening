package org.greenrobot.eventbus;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class o {
    public static final Map d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final a[] f182524e = null;

    /* renamed from: a, reason: collision with root package name */
    public List f182525a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f182526b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f182527c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final List f182528a;

        /* renamed from: b, reason: collision with root package name */
        public final Map f182529b;

        /* renamed from: c, reason: collision with root package name */
        public final Map f182530c;
        public final StringBuilder d;

        /* renamed from: e, reason: collision with root package name */
        public Class f182531e;

        /* renamed from: f, reason: collision with root package name */
        public Class f182532f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f182533g;

        public a() {
            this.f182528a = new ArrayList();
            this.f182529b = new HashMap();
            this.f182530c = new HashMap();
            this.d = new StringBuilder(128);
        }

        public boolean a(Method r3, Class r4) {
            Object r02 = this.f182529b.put(r4, r3);
            if (r02 != null) goto L7;
            return true;
        L7:
            if ((r02 instanceof Method) == false) goto L14;
            if (b((Method) r02, r4) == false) goto L12;
            this.f182529b.put(r4, this);
            goto L14
        L12:
            throw new IllegalStateException();
        L14:
            return b(r3, r4);
        }

        public final boolean b(Method r4, Class r5) {
            this.d.setLength(0);
            this.d.append(r4.getName());
            StringBuilder r02 = this.d;
            r02.append('>');
            r02.append(r5.getName());
            String r52 = this.d.toString();
            Class<?> r42 = r4.getDeclaringClass();
            Class r03 = (Class) this.f182530c.put(r52, r42);
            if (r03 != null) goto L5;
            return true;
        L5:
            if (r03.isAssignableFrom(r42) == true) goto L11;
            this.f182530c.put(r52, r03);
            return false;
        L11:
            return true;
        }

        public void c(Class r1) {
            this.f182532f = r1;
            this.f182531e = r1;
            this.f182533g = false;
        }

        public void d() {
            if (this.f182533g == false) goto L6;
            this.f182532f = null;
            return;
        L6:
            Class r02 = this.f182532f.getSuperclass();
            this.f182532f = r02;
            String r03 = r02.getName();
            if (r03.startsWith("java.") == false) goto L9;
        L16:
            this.f182532f = null;
            return;
        L9:
            if (r03.startsWith("javax.") == true) goto L16;
            if (r03.startsWith("android.") == true) goto L16;
            if (r03.startsWith("androidx.") == true) goto L16;
        }

        public void e() {
            this.f182528a.clear();
            this.f182529b.clear();
            this.f182530c.clear();
            this.d.setLength(0);
            this.f182531e = null;
            this.f182532f = null;
            this.f182533g = false;
        }
    }

    static {
        d = new ConcurrentHashMap();
        f182524e = new a[4];
    }

    public o(List r1, boolean r2, boolean r3) {
        this.f182525a = r1;
        this.f182526b = r2;
        this.f182527c = r3;
    }

    public List a(Class r4) {
        Map r02 = d;
        List r1 = (List) r02.get(r4);
        if (r1 == null) goto L6;
        return r1;
    L6:
        if (this.f182527c == false) goto L8;
        List r12 = c(r4);
    L10:
        if (r12.isEmpty() == true) goto L14;
        r02.put(r4, r12);
        return r12;
    L14:
        throw new EventBusException("Subscriber " + r4 + " and its super classes have no public methods with the @Subscribe annotation");
    L8:
        r12 = b(r4);
        goto L10
    }

    public final List b(Class r2) {
        a r02 = g();
        r02.c(r2);
    L4:
        if (r02.f182532f == null) goto L7;
        f(r02);
        d(r02);
        r02.d();
        goto L4
    L7:
        return e(r02);
    }

    public final List c(Class r2) {
        a r02 = g();
        r02.c(r2);
    L4:
        if (r02.f182532f == null) goto L7;
        d(r02);
        r02.d();
        goto L4
    L7:
        return e(r02);
    }

    public final void d(a r13) {
        Method[] r1 = r13.f182532f.getDeclaredMethods();     // Catch: Throwable -> L5
    L7:
        int r2 = r1.length;
        int r4 = 0;
    L8:
        if (r4 >= r2) goto L35;
        Method r6 = r1[r4];
        int r5 = r6.getModifiers();
        if ((r5 & 1) == 0) goto L28;
        if ((r5 & 5192) != 0) goto L28;
        Class<?>[] r52 = r6.getParameterTypes();
        if (r52.length != 1) goto L21;
        l r7 = (l) r6.getAnnotation(l.class);
        if (r7 == null) goto L34;
        Class<?> r72 = r52[0];
        if (r13.a(r6, r72) == false) goto L34;
        r13.f182528a.add(new n(r6, r72, r7.threadMode(), r7.priority(), r7.sticky()));
    L34:
        r4 = r4 + 1;
        goto L8
    L21:
        if (this.f182526b == false) goto L34;
        if (r6.isAnnotationPresent(l.class) == false) goto L34;
        throw new EventBusException("@Subscribe method " + (r6.getDeclaringClass().getName() + "." + r6.getName()) + "must have exactly 1 parameter but has " + r52.length);
    L28:
        if (this.f182526b == false) goto L34;
        if (r6.isAnnotationPresent(l.class) == false) goto L34;
        throw new EventBusException((r6.getDeclaringClass().getName() + "." + r6.getName()) + " is a illegal @Subscribe method: must be public, non-static, and non-abstract");
    L35:
        return;
    L5:
        r1 = r13.f182532f.getMethods();     // Catch: LinkageError -> L36
        r13.f182533g = true;
    L36:
        e = move-exception;
        String r132 = "Could not inspect methods of " + r13.f182532f.getName();
        if (this.f182527c == false) goto L40;
        String r133 = r132 + ". Please consider using EventBus annotation processor to avoid reflection.";
    L42:
        throw new EventBusException(r133, e);
    L40:
        r133 = r132 + ". Please make this class visible to EventBus annotation processor to avoid reflection.";
        goto L42
    }

    public final List e(a r6) {
        ArrayList r02 = new ArrayList(r6.f182528a);
        r6.e();
        a[] r1 = f182524e;
        monitor-enter(r1);
        int r2 = 0;
    L6:
        if (r2 >= 4) goto L13;
        a[] r3 = f182524e;     // Catch: Throwable -> L10
        if (r3[r2] == null) goto L9;
        r2 = r2 + 1;     // Catch: Throwable -> L10
        goto L6
    L9:
        r3[r2] = r6;     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        throw th;
    L13:
        monitor-exit(r1);     // Catch: Throwable -> L10
        return r02;
    }

    public final org.greenrobot.eventbus.meta.a f(a r3) {
        r3.getClass();
        List r32 = this.f182525a;
        if (r32 == null) goto L9;
        Iterator r33 = r32.iterator();
        if (r33.hasNext() == false) goto L9;
        a.a.a.a.c.f.a(r33.next());
        throw null;
    L9:
        return null;
    }

    public final a g() {
        a[] r02 = f182524e;
        monitor-enter(r02);
        int r1 = 0;
    L6:
        if (r1 >= 4) goto L15;
        a[] r2 = f182524e;     // Catch: Throwable -> L12
        a r3 = r2[r1];     // Catch: Throwable -> L12
        if (r3 != null) goto L9;
        r1 = r1 + 1;     // Catch: Throwable -> L12
        goto L6
    L9:
        r2[r1] = null;     // Catch: Throwable -> L12
        monitor-exit(r02);     // Catch: Throwable -> L12
        return r3;
    L12:
        th = move-exception;
        throw th;
    L15:
        monitor-exit(r02);     // Catch: Throwable -> L12
        return new a();
    }
}
