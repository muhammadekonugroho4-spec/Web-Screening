package com.stockbit.domain.model.param.stream;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f84584a;

    /* renamed from: b, reason: collision with root package name */
    public String f84585b;

    public a(String r2, String r3) {
        p.l(r2, "postId");
        p.l(r3, "commentType");
        this.f84584a = r2;
        this.f84585b = r3;
    }

    public final String a() {
        return this.f84585b;
    }

    public final String b() {
        return this.f84584a;
    }

    public final void c(String r2) {
        p.l(r2, "<set-?>");
        this.f84585b = r2;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f84584a, r52.f84584a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84585b, r52.f84585b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f84584a.hashCode() * 31) + this.f84585b.hashCode();
    }

    public String toString() {
        return "CommentTypeParams(postId=" + this.f84584a + ", commentType=" + this.f84585b + ')';
    }
}
