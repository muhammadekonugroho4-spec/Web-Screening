package io.sentry;

/* loaded from: classes3.dex */
public final class N3 {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f174869a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f174870b;

    /* renamed from: c, reason: collision with root package name */
    public final Double f174871c;
    public final Boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final Double f174872e;

    public N3(Boolean r2) {
        this(r2, null);
    }

    public Double a() {
        return this.f174872e;
    }

    public Boolean b() {
        return this.d;
    }

    public Double c() {
        return this.f174871c;
    }

    public Double d() {
        return this.f174870b;
    }

    public Boolean e() {
        return this.f174869a;
    }

    public N3(Boolean r7, Double r8) {
        this(r7, r8, null, Boolean.FALSE, null);
    }

    public N3(Boolean r7, Double r8, Double r9) {
        this(r7, r8, r9, Boolean.FALSE, null);
    }

    public N3(Boolean r7, Double r8, Boolean r9, Double r10) {
        this(r7, r8, null, r9, r10);
    }

    public N3(Boolean r1, Double r2, Double r3, Boolean r4, Double r5) {
        this.f174869a = r1;
        this.f174870b = r2;
        this.f174871c = r3;
        if (r1.booleanValue() == true) goto L5;
    L7:
        boolean r12 = false;
    L8:
        this.d = Boolean.valueOf(r12);
        this.f174872e = r5;
        return;
    L5:
        if (r4.booleanValue() == false) goto L7;
        r12 = true;
        goto L8
    }
}
