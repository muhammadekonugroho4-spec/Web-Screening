package com.stockbit.domain.model.academy;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f80534a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80535b;

    public b(int r2, String r3) {
        p.l(r3, "attachmentUrl");
        this.f80534a = r2;
        this.f80535b = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f80534a == r52.f80534a) goto L12;
        return false;
    L12:
        if (p.g(this.f80535b, r52.f80535b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f80534a) * 31) + this.f80535b.hashCode();
    }

    public String toString() {
        return "FileUnboxingEntity(id=" + this.f80534a + ", attachmentUrl=" + this.f80535b + ")";
    }
}
