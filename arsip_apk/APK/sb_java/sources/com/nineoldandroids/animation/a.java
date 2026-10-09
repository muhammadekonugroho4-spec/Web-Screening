package com.nineoldandroids.animation;

import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class a implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f43511a;

    /* renamed from: com.nineoldandroids.animation.a$a, reason: collision with other inner class name */
    public interface InterfaceC0494a {
        void a(a r1);

        void b(a r1);

        void c(a r1);
    }

    public a() {
        this.f43511a = null;
    }

    public void a(InterfaceC0494a r2) {
        if (this.f43511a != null) goto L5;
        this.f43511a = new ArrayList();
    L5:
        this.f43511a.add(r2);
    }

    public a b() {
        a r02 = (a) super.clone();     // Catch: CloneNotSupportedException -> L9
        ArrayList r1 = this.f43511a;     // Catch: CloneNotSupportedException -> L9
        if (r1 == null) goto L8;
        r02.f43511a = new ArrayList();     // Catch: CloneNotSupportedException -> L9
        int r2 = r1.size();     // Catch: CloneNotSupportedException -> L9
        int r3 = 0;
    L5:
        if (r3 >= r2) goto L8;
        r02.f43511a.add(r1.get(r3));     // Catch: CloneNotSupportedException -> L9
        r3 = r3 + 1;
    L8:
        return r02;
    L10:
        throw new AssertionError();
    }

    public ArrayList c() {
        return this.f43511a;
    }

    public void e(InterfaceC0494a r2) {
        ArrayList r02 = this.f43511a;
        if (r02 == null) goto L10;
        r02.remove(r2);
        if (this.f43511a.size() != 0) goto L9;
        this.f43511a = null;
        return;
    L9:
        return;
    }

    public abstract void g();
}
