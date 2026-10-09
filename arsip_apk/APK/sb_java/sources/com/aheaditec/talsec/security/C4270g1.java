package com.aheaditec.talsec.security;

/* renamed from: com.aheaditec.talsec.security.g1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4270g1 extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final int f30605a;

    public C4270g1(int r1, String r2) {
        super(r2);
        this.f30605a = r1;
    }

    public int a() {
        return this.f30605a;
    }

    public C4270g1(int r1, String r2, Throwable r3) {
        super(r2, r3);
        this.f30605a = r1;
    }
}
