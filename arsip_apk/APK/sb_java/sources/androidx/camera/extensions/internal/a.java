package androidx.camera.extensions.internal;

/* loaded from: classes.dex */
public final class a extends h {

    /* renamed from: h, reason: collision with root package name */
    public final int f6111h;

    /* renamed from: i, reason: collision with root package name */
    public final int f6112i;

    /* renamed from: j, reason: collision with root package name */
    public final int f6113j;

    /* renamed from: k, reason: collision with root package name */
    public final String f6114k;

    public a(int r1, int r2, int r3, String r4) {
        this.f6111h = r1;
        this.f6112i = r2;
        this.f6113j = r3;
        if (r4 == null) goto L7;
        this.f6114k = r4;
        return;
    L7:
        throw new NullPointerException("Null description");
    }

    @Override // androidx.camera.extensions.internal.h
    public String e() {
        return this.f6114k;
    }

    @Override // androidx.camera.extensions.internal.h
    public int g() {
        return this.f6111h;
    }

    @Override // androidx.camera.extensions.internal.h
    public int h() {
        return this.f6112i;
    }

    @Override // androidx.camera.extensions.internal.h
    public int i() {
        return this.f6113j;
    }
}
