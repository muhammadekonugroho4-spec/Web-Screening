package com.github.gcacace.signaturepad.utils;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f37608a;

    /* renamed from: b, reason: collision with root package name */
    public d f37609b;

    public c() {
        this.f37608a = new StringBuilder();
        this.f37609b = null;
    }

    public c a(a r5, float r6) {
        Integer r62 = Integer.valueOf(Math.round(r6));
        e r02 = new e(r5.f37603a);
        e r1 = new e(r5.f37604b);
        e r2 = new e(r5.f37605c);
        e r3 = new e(r5.d);
        if (e() == true) goto L6;
        f(r62, r02);
    L6:
        if (r02.equals(this.f37609b.b()) == true) goto L8;
    L9:
        b();
        f(r62, r02);
    L10:
        this.f37609b.a(r1, r2, r3);
        return this;
    L8:
        if (r62.equals(this.f37609b.c()) == true) goto L10;
        goto L9
    }

    public final void b() {
        this.f37608a.append(this.f37609b);
    }

    public String c(int r4, int r5) {
        if (e() == false) goto L6;
        b();
    L6:
        return "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n<svg xmlns=\"http://www.w3.org/2000/svg\" version=\"1.2\" baseProfile=\"tiny\" height=\"" + r5 + "\" width=\"" + r4 + "\" viewBox=\"0 0 " + r4 + " " + r5 + "\"><g stroke-linejoin=\"round\" stroke-linecap=\"round\" fill=\"none\" stroke=\"black\">" + this.f37608a + "</g></svg>";
    }

    public void d() {
        this.f37608a.setLength(0);
        this.f37609b = null;
    }

    public final boolean e() {
        if (this.f37609b == null) goto L6;
        return true;
    L6:
        return false;
    }

    public final void f(Integer r2, e r3) {
        this.f37609b = new d(r3, r2);
    }
}
