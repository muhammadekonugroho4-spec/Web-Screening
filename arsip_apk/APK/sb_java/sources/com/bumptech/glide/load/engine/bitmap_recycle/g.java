package com.bumptech.glide.load.engine.bitmap_recycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final a f32678a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f32679b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f32680a;

        /* renamed from: b, reason: collision with root package name */
        public List f32681b;

        /* renamed from: c, reason: collision with root package name */
        public a f32682c;
        public a d;

        public a() {
            this(null);
        }

        public void a(Object r2) {
            if (this.f32681b != null) goto L5;
            this.f32681b = new ArrayList();
        L5:
            this.f32681b.add(r2);
        }

        public Object b() {
            int r02 = c();
            if (r02 > 0) goto L5;
            return null;
        L5:
            return this.f32681b.remove(r02 - 1);
        }

        public int c() {
            List r02 = this.f32681b;
            if (r02 != null) goto L5;
            return 0;
        L5:
            return r02.size();
        }

        public a(Object r1) {
            this.d = this;
            this.f32682c = this;
            this.f32680a = r1;
        }
    }

    public g() {
        this.f32678a = new a();
        this.f32679b = new HashMap();
    }

    public static void e(a r2) {
        a r02 = r2.d;
        r02.f32682c = r2.f32682c;
        r2.f32682c.d = r02;
    }

    public static void g(a r1) {
        r1.f32682c.d = r1;
        r1.d.f32682c = r1;
    }

    public Object a(l r3) {
        a r02 = (a) this.f32679b.get(r3);
        if (r02 != null) goto L5;
        r02 = new a(r3);
        this.f32679b.put(r3, r02);
    L6:
        b(r02);
        return r02.b();
    L5:
        r3.a();
        goto L6
    }

    public final void b(a r2) {
        e(r2);
        a r02 = this.f32678a;
        r2.d = r02;
        r2.f32682c = r02.f32682c;
        g(r2);
    }

    public final void c(a r3) {
        e(r3);
        a r02 = this.f32678a;
        r3.d = r02.d;
        r3.f32682c = r02;
        g(r3);
    }

    public void d(l r3, Object r4) {
        a r02 = (a) this.f32679b.get(r3);
        if (r02 != null) goto L5;
        r02 = new a(r3);
        c(r02);
        this.f32679b.put(r3, r02);
    L6:
        r02.a(r4);
        return;
    L5:
        r3.a();
        goto L6
    }

    public Object f() {
        a r02 = this.f32678a.d;
    L4:
        if (r02.equals(this.f32678a) == true) goto L9;
        Object r1 = r02.b();
        if (r1 != null) goto L7;
        e(r02);
        this.f32679b.remove(r02.f32680a);
        ((l) r02.f32680a).a();
        r02 = r02.d;
        goto L4
    L7:
        return r1;
    L9:
        return null;
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder("GroupedLinkedMap( ");
        a r1 = this.f32678a.f32682c;
        boolean r2 = false;
    L4:
        if (r1.equals(this.f32678a) == true) goto L6;
        r02.append('{');
        r02.append(r1.f32680a);
        r02.append(':');
        r02.append(r1.c());
        r02.append("}, ");
        r1 = r1.f32682c;
        r2 = true;
        goto L4
    L6:
        if (r2 == false) goto L8;
        r02.delete(r02.length() - 2, r02.length());
    L8:
        r02.append(" )");
        return r02.toString();
    }
}
