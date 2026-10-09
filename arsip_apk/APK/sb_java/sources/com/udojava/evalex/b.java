package com.udojava.evalex;

import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public String f173928a;

    /* renamed from: b, reason: collision with root package name */
    public int f173929b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f173930c;

    public b(String r2, int r3, boolean r4) {
        this.f173928a = r2.toUpperCase(Locale.ROOT);
        this.f173929b = r3;
        this.f173930c = r4;
    }

    @Override // com.udojava.evalex.g
    public int a() {
        return this.f173929b;
    }

    @Override // com.udojava.evalex.g
    public boolean d() {
        if (this.f173929b >= 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // com.udojava.evalex.g
    public String getName() {
        return this.f173928a;
    }

    public b(String r2, int r3) {
        this(r2, r3, false);
    }
}
