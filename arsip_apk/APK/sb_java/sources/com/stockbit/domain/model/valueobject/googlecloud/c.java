package com.stockbit.domain.model.valueobject.googlecloud;

import java.util.List;
import kotlin.collections.AbstractC11777v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f86838a;

    /* renamed from: b, reason: collision with root package name */
    public final List f86839b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86840c;

    public c(String r2, List r3, String r4) {
        p.l(r2, "fileUrl");
        p.l(r3, "headers");
        p.l(r4, "url");
        this.f86838a = r2;
        this.f86839b = r3;
        this.f86840c = r4;
    }

    public final String a() {
        return this.f86838a;
    }

    public final List b() {
        return this.f86839b;
    }

    public final String c() {
        return this.f86840c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f86838a, r52.f86838a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86839b, r52.f86839b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f86840c, r52.f86840c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f86838a.hashCode() * 31) + this.f86839b.hashCode()) * 31) + this.f86840c.hashCode();
    }

    public String toString() {
        return "GoogleUploadUrl(fileUrl=" + this.f86838a + ", headers=" + this.f86839b + ", url=" + this.f86840c + ')';
    }

    public /* synthetic */ c(String r2, List r3, String r4, int r5, i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = AbstractC11777v.o();
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = "";
    L11:
        this(r2, r3, r4);
    }
}
