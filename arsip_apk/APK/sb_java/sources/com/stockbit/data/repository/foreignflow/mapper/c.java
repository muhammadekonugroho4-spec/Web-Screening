package com.stockbit.data.repository.foreignflow.mapper;

import kotlin.jvm.internal.i;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f79971a;

    /* renamed from: b, reason: collision with root package name */
    public final String f79972b;

    /* renamed from: c, reason: collision with root package name */
    public final String f79973c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f79974e;

    public c(String r1, String r2, String r3, String r4, String r5) {
        this.f79971a = r1;
        this.f79972b = r2;
        this.f79973c = r3;
        this.d = r4;
        this.f79974e = r5;
    }

    public final String a() {
        return this.f79974e;
    }

    public final String b() {
        return this.f79971a;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f79973c;
    }

    public final String e() {
        return this.f79972b;
    }

    public /* synthetic */ c(String r2, String r3, String r4, String r5, String r6, int r7, i r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r7 & 16) == 0) goto L18;
        String r72 = null;
    L17:
        String r62 = r5;
        String r52 = r4;
        this(r2, r3, r52, r62, r72);
        return;
    L18:
        r72 = r6;
        goto L17
    }
}
