package io.sentry;

/* loaded from: classes3.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final int f174815a;

    /* renamed from: b, reason: collision with root package name */
    public final int f174816b;

    public J(int r1, int r2) {
        this.f174815a = r1;
        this.f174816b = r2;
    }

    public boolean a(int r2) {
        if (r2 >= this.f174815a) goto L5;
        return false;
    L5:
        if (r2 > this.f174816b) goto L10;
        return true;
    L10:
        return false;
    }
}
