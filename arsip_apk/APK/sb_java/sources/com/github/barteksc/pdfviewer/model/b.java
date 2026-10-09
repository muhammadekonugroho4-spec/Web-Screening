package com.github.barteksc.pdfviewer.model;

import android.graphics.Bitmap;
import android.graphics.RectF;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public int f37519a;

    /* renamed from: b, reason: collision with root package name */
    public Bitmap f37520b;

    /* renamed from: c, reason: collision with root package name */
    public RectF f37521c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public int f37522e;

    public b(int r1, Bitmap r2, RectF r3, boolean r4, int r5) {
        this.f37519a = r1;
        this.f37520b = r2;
        this.f37521c = r3;
        this.d = r4;
        this.f37522e = r5;
    }

    public int a() {
        return this.f37522e;
    }

    public int b() {
        return this.f37519a;
    }

    public RectF c() {
        return this.f37521c;
    }

    public Bitmap d() {
        return this.f37520b;
    }

    public boolean e() {
        return this.d;
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof b) == true) goto L5;
        return false;
    L5:
        b r42 = (b) r4;
        if (r42.b() == this.f37519a) goto L8;
    L17:
        return false;
    L8:
        if (r42.c().left != this.f37521c.left) goto L17;
        if (r42.c().right != this.f37521c.right) goto L17;
        if (r42.c().top != this.f37521c.top) goto L17;
        if (r42.c().bottom != this.f37521c.bottom) goto L17;
        return true;
    }

    public void f(int r1) {
        this.f37522e = r1;
    }
}
