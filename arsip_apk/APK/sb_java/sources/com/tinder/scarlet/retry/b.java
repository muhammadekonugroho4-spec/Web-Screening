package com.tinder.scarlet.retry;

/* loaded from: classes2.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final long f173773a;

    /* renamed from: b, reason: collision with root package name */
    public final long f173774b;

    public b(long r7, long r9) {
        this.f173773a = r7;
        this.f173774b = r9;
        boolean r3 = false;
        if (r7 <= 0) goto L5;
        boolean r2 = true;
    L7:
        if (r2 == false) goto L16;
        if (r9 <= 0) goto L11;
        r3 = true;
    L11:
        if (r3 == false) goto L14;
        return;
    L14:
        throw new IllegalArgumentException(("maxDurationMillis, " + r9 + ", must be positive").toString());
    L16:
        throw new IllegalArgumentException(("initialDurationMillis, " + r7 + ", must be positive").toString());
    L5:
        r2 = false;
        goto L7
    }

    @Override // com.tinder.scarlet.retry.a
    public long a(int r9) {
        return (long) Math.min(this.f173774b, this.f173773a * Math.pow(2.0d, r9));
    }
}
