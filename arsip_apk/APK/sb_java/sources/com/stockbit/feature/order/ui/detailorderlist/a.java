package com.stockbit.feature.order.ui.detailorderlist;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f101921a;

    /* renamed from: b, reason: collision with root package name */
    public final String f101922b;

    /* renamed from: c, reason: collision with root package name */
    public final String f101923c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f101924e;

    /* renamed from: f, reason: collision with root package name */
    public final int f101925f;

    static {
    }

    public a(int r1, String r2, String r3, String r4, String r5, int r6) {
        this.f101921a = r1;
        this.f101922b = r2;
        this.f101923c = r3;
        this.d = r4;
        this.f101924e = r5;
        this.f101925f = r6;
    }

    public final String a() {
        return this.f101924e;
    }

    public final int b() {
        return this.f101921a;
    }

    public final String c() {
        return this.f101923c;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f101922b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f101921a == r52.f101921a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f101922b, r52.f101922b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f101923c, r52.f101923c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f101924e, r52.f101924e) == true) goto L24;
        return false;
    L24:
        if (this.f101925f == r52.f101925f) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        int r02 = Integer.hashCode(this.f101921a) * 31;
        String r1 = this.f101922b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f101923c;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.d;
        if (r15 != null) goto L13;
        int r16 = 0;
    L14:
        int r05 = (r04 + r16) * 31;
        String r17 = this.f101924e;
        if (r17 == null) goto L19;
        r2 = r17.hashCode();
    L19:
        return ((r05 + r2) * 31) + Integer.hashCode(this.f101925f);
    L13:
        r16 = r15.hashCode();
        goto L14
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "DetailOrderlistExerciseEntity(expiryExerciseListDetailTextRes=" + this.f101921a + ", statusExerciseList=" + this.f101922b + ", priceExerciseList=" + this.f101923c + ", sharesOrderedExerciseList=" + this.d + ", amountOrderedExerciseList=" + this.f101924e + ", gtc=" + this.f101925f + ')';
    }
}
