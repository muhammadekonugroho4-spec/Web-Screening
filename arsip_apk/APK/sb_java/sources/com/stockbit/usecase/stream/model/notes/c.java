package com.stockbit.usecase.stream.model.notes;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f163059a;

    /* renamed from: b, reason: collision with root package name */
    public final String f163060b;

    public c(String r2, String r3) {
        p.l(r2, "fileName");
        p.l(r3, "url");
        this.f163059a = r2;
        this.f163060b = r3;
    }

    public final String a() {
        return this.f163060b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f163059a, r52.f163059a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f163060b, r52.f163060b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f163059a.hashCode() * 31) + this.f163060b.hashCode();
    }

    public String toString() {
        return "NoteFileUIState(fileName=" + this.f163059a + ", url=" + this.f163060b + ")";
    }
}
