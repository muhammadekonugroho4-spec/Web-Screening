package com.stockbit.usecase.profile.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public ListItemType f159471a;

    /* renamed from: b, reason: collision with root package name */
    public int f159472b;

    /* renamed from: c, reason: collision with root package name */
    public int f159473c;
    public final String d;

    public e(ListItemType r2, int r3, int r4, String r5) {
        p.l(r2, "type");
        p.l(r5, "userName");
        this.f159471a = r2;
        this.f159472b = r3;
        this.f159473c = r4;
        this.d = r5;
    }

    public final int a() {
        return this.f159473c;
    }

    public final int b() {
        return this.f159472b;
    }

    public final ListItemType c() {
        return this.f159471a;
    }

    public final String d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (this.f159471a == r52.f159471a) goto L12;
        return false;
    L12:
        if (this.f159472b == r52.f159472b) goto L15;
        return false;
    L15:
        if (this.f159473c == r52.f159473c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f159471a.hashCode() * 31) + Integer.hashCode(this.f159472b)) * 31) + Integer.hashCode(this.f159473c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "MenuItemUIState(type=" + this.f159471a + ", text=" + this.f159472b + ", icon=" + this.f159473c + ", userName=" + this.d + ')';
    }
}
