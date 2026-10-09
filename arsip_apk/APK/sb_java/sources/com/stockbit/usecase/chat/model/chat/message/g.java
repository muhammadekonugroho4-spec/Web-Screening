package com.stockbit.usecase.chat.model.chat.message;

/* loaded from: classes2.dex */
public final class g implements A {

    /* renamed from: a, reason: collision with root package name */
    public final int f155262a;

    /* renamed from: b, reason: collision with root package name */
    public final String f155263b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f155264c;

    public g(int r2, String r3, boolean r4) {
        kotlin.jvm.internal.p.l(r3, "createdAt");
        this.f155262a = r2;
        this.f155263b = r3;
        this.f155264c = r4;
    }

    public static /* synthetic */ g m(g r02, int r1, String r2, boolean r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r02.f155262a;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r02.f155263b;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r02.f155264c;
    L12:
        return r02.b(r1, r2, r3);
    }

    @Override // com.stockbit.usecase.chat.model.chat.message.A
    public int B() {
        return this.f155262a;
    }

    public final g b(int r2, String r3, boolean r4) {
        kotlin.jvm.internal.p.l(r3, "createdAt");
        return new g(r2, r3, r4);
    }

    @Override // com.stockbit.usecase.chat.model.chat.message.A
    public /* bridge */ A c(boolean r1) {
        return super.c(r1);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (this.f155262a == r52.f155262a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f155263b, r52.f155263b) == true) goto L15;
        return false;
    L15:
        if (this.f155264c == r52.f155264c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f155262a) * 31) + this.f155263b.hashCode()) * 31) + Boolean.hashCode(this.f155264c);
    }

    @Override // com.stockbit.usecase.chat.model.chat.message.A
    public String s() {
        return this.f155263b;
    }

    public String toString() {
        return "MessageDateUIState(messageId=" + this.f155262a + ", createdAt=" + this.f155263b + ", isEventBefore=" + this.f155264c + ")";
    }

    public boolean y() {
        return this.f155264c;
    }

    public /* synthetic */ g(int r2, String r3, boolean r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = false;
    L11:
        this(r2, r3, r4);
    }
}
