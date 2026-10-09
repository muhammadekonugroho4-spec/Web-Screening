package com.stockbit.domain.model.stream.notes;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final List f85860a;

    /* renamed from: b, reason: collision with root package name */
    public final g f85861b;

    public e(List r2, g r3) {
        p.l(r2, "notes");
        p.l(r3, "pagination");
        this.f85860a = r2;
        this.f85861b = r3;
    }

    public final List a() {
        return this.f85860a;
    }

    public final g b() {
        return this.f85861b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f85860a, r52.f85860a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85861b, r52.f85861b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f85860a.hashCode() * 31) + this.f85861b.hashCode();
    }

    public String toString() {
        return "CompanyNoteListEntity(notes=" + this.f85860a + ", pagination=" + this.f85861b + ")";
    }
}
