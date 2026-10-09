package com.stockbit.domain.model.securities.profile;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f85724a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85725b;

    /* renamed from: c, reason: collision with root package name */
    public final List f85726c;

    public c(String r2, String r3, List r4) {
        p.l(r2, "fileUrl");
        p.l(r3, "uploadUrl");
        p.l(r4, "uploadBody");
        this.f85724a = r2;
        this.f85725b = r3;
        this.f85726c = r4;
    }

    public final String a() {
        return this.f85724a;
    }

    public final List b() {
        return this.f85726c;
    }

    public final String c() {
        return this.f85725b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f85724a, r52.f85724a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85725b, r52.f85725b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85726c, r52.f85726c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f85724a.hashCode() * 31) + this.f85725b.hashCode()) * 31) + this.f85726c.hashCode();
    }

    public String toString() {
        return "PersonalAmendUploadDocumentEntity(fileUrl=" + this.f85724a + ", uploadUrl=" + this.f85725b + ", uploadBody=" + this.f85726c + ")";
    }
}
