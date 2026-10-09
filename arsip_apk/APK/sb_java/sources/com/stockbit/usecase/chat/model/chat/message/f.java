package com.stockbit.usecase.chat.model.chat.message;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f155260a;

    /* renamed from: b, reason: collision with root package name */
    public final String f155261b;

    public f(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "previous");
        kotlin.jvm.internal.p.l(r3, "next");
        this.f155260a = r2;
        this.f155261b = r3;
    }

    public static /* synthetic */ f b(f r02, String r1, String r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r02.f155260a;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r02.f155261b;
    L9:
        return r02.a(r1, r2);
    }

    public final f a(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "previous");
        kotlin.jvm.internal.p.l(r3, "next");
        return new f(r2, r3);
    }

    public final String c() {
        return this.f155261b;
    }

    public final String d() {
        return this.f155260a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (kotlin.jvm.internal.p.g(this.f155260a, r52.f155260a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f155261b, r52.f155261b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f155260a.hashCode() * 31) + this.f155261b.hashCode();
    }

    public String toString() {
        return "MessageCursorUIState(previous=" + this.f155260a + ", next=" + this.f155261b + ")";
    }

    public /* synthetic */ f(String r2, String r3, int r4, kotlin.jvm.internal.i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = "";
    L8:
        this(r2, r3);
    }
}
