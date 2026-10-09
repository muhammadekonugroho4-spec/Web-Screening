package com.aheaditec.talsec.security;

import com.aheaditec.talsec.security.InterfaceC4252a1;

/* renamed from: com.aheaditec.talsec.security.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4256c {

    /* renamed from: a, reason: collision with root package name */
    public final String f30567a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f30568b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f30569c;
    public final String[] d;

    /* renamed from: e, reason: collision with root package name */
    public final String f30570e;

    /* renamed from: f, reason: collision with root package name */
    public final String f30571f;

    /* renamed from: g, reason: collision with root package name */
    public final String f30572g;

    public C4256c(String r2, InterfaceC4252a1.a r3, String r4, String r5) {
        this.f30567a = r2;
        this.f30568b = r3.a();
        this.f30570e = r4;
        String[] r22 = r3.c();
        this.f30569c = r22;
        if (r3.b() != null) goto L5;
        String[] r32 = new String[0];
    L6:
        this.d = r32;
        this.f30571f = r5;
        if (r22.length <= 0) goto L9;
        String r23 = r22[0];
    L10:
        this.f30572g = r23;
        return;
    L9:
        r23 = null;
        goto L10
    L5:
        r32 = r3.b();
        goto L6
    }

    public String[] a() {
        return this.f30568b;
    }

    public String[] b() {
        return this.f30569c;
    }

    public String[] c() {
        return this.d;
    }

    public String d() {
        return this.f30571f;
    }

    public String e() {
        return this.f30567a;
    }

    public String f() {
        return this.f30572g;
    }

    public String g() {
        return this.f30570e;
    }
}
