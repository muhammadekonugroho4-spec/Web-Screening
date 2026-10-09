package com.stockbit.domain.model.entity.securities;

/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public String f83507a;

    /* renamed from: b, reason: collision with root package name */
    public String f83508b;

    /* renamed from: c, reason: collision with root package name */
    public String f83509c;
    public String d;

    public o(String r2, String r3, String r4, String r5) {
        kotlin.jvm.internal.p.l(r5, "valueFormated");
        this.f83507a = r2;
        this.f83508b = r3;
        this.f83509c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f83507a;
    }

    public final String b() {
        return this.f83509c;
    }

    public final String c() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof o) == true) goto L8;
        return false;
    L8:
        o r52 = (o) r5;
        if (kotlin.jvm.internal.p.g(this.f83507a, r52.f83507a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f83508b, r52.f83508b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f83509c, r52.f83509c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        String r02 = this.f83507a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f83508b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f83509c;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return ((r05 + r1) * 31) + this.d.hashCode();
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "FormulaCompositions(name=" + this.f83507a + ", value=" + this.f83508b + ", type=" + this.f83509c + ", valueFormated=" + this.d + ')';
    }
}
