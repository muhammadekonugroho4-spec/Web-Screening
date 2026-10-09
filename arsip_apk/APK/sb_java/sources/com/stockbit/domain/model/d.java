package com.stockbit.domain.model;

import androidx.lifecycle.A;
import androidx.paging.DataSource;
import androidx.paging.PagedList;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final DataSource.Factory f82073a;

    /* renamed from: b, reason: collision with root package name */
    public final PagedList.a f82074b;

    /* renamed from: c, reason: collision with root package name */
    public final A f82075c;
    public final A d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlin.jvm.functions.a f82076e;

    /* renamed from: f, reason: collision with root package name */
    public final kotlin.jvm.functions.a f82077f;

    public d(DataSource.Factory r2, PagedList.a r3, A r4, A r5, kotlin.jvm.functions.a r6, kotlin.jvm.functions.a r7) {
        p.l(r2, "dataSourceFactory");
        p.l(r4, "networkState");
        p.l(r5, "refreshState");
        p.l(r6, "refresh");
        p.l(r7, "retry");
        this.f82073a = r2;
        this.f82074b = r3;
        this.f82075c = r4;
        this.d = r5;
        this.f82076e = r6;
        this.f82077f = r7;
    }

    public final PagedList.a a() {
        return this.f82074b;
    }

    public final DataSource.Factory b() {
        return this.f82073a;
    }

    public final A c() {
        return this.f82075c;
    }

    public final kotlin.jvm.functions.a d() {
        return this.f82076e;
    }

    public final A e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f82073a, r52.f82073a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82074b, r52.f82074b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f82075c, r52.f82075c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f82076e, r52.f82076e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f82077f, r52.f82077f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final kotlin.jvm.functions.a f() {
        return this.f82077f;
    }

    public int hashCode() {
        int r02 = this.f82073a.hashCode() * 31;
        PagedList.a r1 = this.f82074b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((((((((r02 + r12) * 31) + this.f82075c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f82076e.hashCode()) * 31) + this.f82077f.hashCode();
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "PagingData(dataSourceFactory=" + this.f82073a + ", boundaryCallback=" + this.f82074b + ", networkState=" + this.f82075c + ", refreshState=" + this.d + ", refresh=" + this.f82076e + ", retry=" + this.f82077f + ')';
    }

    public /* synthetic */ d(DataSource.Factory r8, PagedList.a r9, A r10, A r11, kotlin.jvm.functions.a r12, kotlin.jvm.functions.a r13, int r14, kotlin.jvm.internal.i r15) {
        if ((r14 & 2) == 0) goto L5;
        r9 = null;
    L5:
        this(r8, r9, r10, r11, r12, r13);
    }
}
