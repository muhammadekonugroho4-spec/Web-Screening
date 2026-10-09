package com.stockbit.component.webview.model;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f77666a;

    /* renamed from: b, reason: collision with root package name */
    public final int f77667b;

    static {
    }

    public a(int r1, int r2) {
        this.f77666a = r1;
        this.f77667b = r2;
    }

    public final int a() {
        return this.f77666a;
    }

    public final int b() {
        return this.f77667b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f77666a == r52.f77666a) goto L12;
        return false;
    L12:
        if (this.f77667b == r52.f77667b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f77666a) * 31) + Integer.hashCode(this.f77667b);
    }

    public String toString() {
        return "WebViewMeasureProperty(width=" + this.f77666a + ", height=" + this.f77667b + ')';
    }
}
