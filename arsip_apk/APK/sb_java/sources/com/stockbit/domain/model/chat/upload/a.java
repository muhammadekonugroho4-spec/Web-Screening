package com.stockbit.domain.model.chat.upload;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f81372a;

    /* renamed from: b, reason: collision with root package name */
    public final List f81373b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81374c;

    public a(String r2, List r3, String r4) {
        p.l(r2, "url");
        p.l(r3, "fields");
        p.l(r4, "cdnUrl");
        this.f81372a = r2;
        this.f81373b = r3;
        this.f81374c = r4;
    }

    public final String a() {
        return this.f81374c;
    }

    public final List b() {
        return this.f81373b;
    }

    public final String c() {
        return this.f81372a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f81372a, r52.f81372a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81373b, r52.f81373b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81374c, r52.f81374c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f81372a.hashCode() * 31) + this.f81373b.hashCode()) * 31) + this.f81374c.hashCode();
    }

    public String toString() {
        return "AWSUploadTokenEntity(url=" + this.f81372a + ", fields=" + this.f81373b + ", cdnUrl=" + this.f81374c + ")";
    }
}
