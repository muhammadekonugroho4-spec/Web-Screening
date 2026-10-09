package com.android.volley;

/* loaded from: classes4.dex */
public class c implements l {

    /* renamed from: a, reason: collision with root package name */
    public int f31986a;

    /* renamed from: b, reason: collision with root package name */
    public int f31987b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31988c;
    public final float d;

    public c() {
        this(2500, 1, 1.0f);
    }

    @Override // com.android.volley.l
    public int a() {
        return this.f31987b;
    }

    @Override // com.android.volley.l
    public void b(VolleyError r4) {
        this.f31987b++;
        int r02 = this.f31986a;
        this.f31986a = r02 + ((int) (r02 * this.d));
        if (d() == false) goto L5;
        return;
    L5:
        throw r4;
    }

    @Override // com.android.volley.l
    public int c() {
        return this.f31986a;
    }

    public boolean d() {
        if (this.f31987b > this.f31988c) goto L6;
        return true;
    L6:
        return false;
    }

    public c(int r1, int r2, float r3) {
        this.f31986a = r1;
        this.f31988c = r2;
        this.d = r3;
    }
}
