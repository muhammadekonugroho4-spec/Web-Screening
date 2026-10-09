package com.stockbit.company.widget.config;

/* loaded from: classes7.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final String f68905a;

    /* renamed from: b, reason: collision with root package name */
    public final String f68906b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f68907c;
    public final boolean d;

    static {
    }

    public F(String r2, String r3, boolean r4, boolean r5) {
        kotlin.jvm.internal.p.l(r2, "selectedSymbol");
        kotlin.jvm.internal.p.l(r3, "searchQuery");
        this.f68905a = r2;
        this.f68906b = r3;
        this.f68907c = r4;
        this.d = r5;
    }

    public static /* synthetic */ F b(F r02, String r1, String r2, boolean r3, boolean r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r02.f68905a;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r02.f68906b;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r02.f68907c;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        return r02.a(r1, r2, r3, r4);
    }

    public final F a(String r2, String r3, boolean r4, boolean r5) {
        kotlin.jvm.internal.p.l(r2, "selectedSymbol");
        kotlin.jvm.internal.p.l(r3, "searchQuery");
        return new F(r2, r3, r4, r5);
    }

    public final String c() {
        return this.f68906b;
    }

    public final String d() {
        return this.f68905a;
    }

    public final boolean e() {
        return this.f68907c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof F) == true) goto L8;
        return false;
    L8:
        F r52 = (F) r5;
        if (kotlin.jvm.internal.p.g(this.f68905a, r52.f68905a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f68906b, r52.f68906b) == true) goto L15;
        return false;
    L15:
        if (this.f68907c == r52.f68907c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public final boolean f() {
        return this.d;
    }

    public int hashCode() {
        return (((((this.f68905a.hashCode() * 31) + this.f68906b.hashCode()) * 31) + Boolean.hashCode(this.f68907c)) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "SingleStockWidgetConfigUIState(selectedSymbol=" + this.f68905a + ", searchQuery=" + this.f68906b + ", isBottomSheetVisible=" + this.f68907c + ", isSaveComplete=" + this.d + ')';
    }

    public /* synthetic */ F(String r2, String r3, boolean r4, boolean r5, int r6, kotlin.jvm.internal.i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = "IHSG";
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = false;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = false;
    L14:
        this(r2, r3, r4, r5);
    }
}
