package com.udojava.evalex;

/* loaded from: classes2.dex */
public abstract class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public String f173931a;

    /* renamed from: b, reason: collision with root package name */
    public int f173932b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f173933c;
    public boolean d;

    public c(String r1, int r2, boolean r3, boolean r4) {
        this.f173931a = r1;
        this.f173932b = r2;
        this.f173933c = r3;
        this.d = r4;
    }

    @Override // com.udojava.evalex.i
    public int a() {
        return this.f173932b;
    }

    @Override // com.udojava.evalex.i
    public boolean d() {
        return this.f173933c;
    }

    @Override // com.udojava.evalex.i
    public String e() {
        return this.f173931a;
    }

    public c(String r2, int r3, boolean r4) {
        this.d = false;
        this.f173931a = r2;
        this.f173932b = r3;
        this.f173933c = r4;
    }
}
