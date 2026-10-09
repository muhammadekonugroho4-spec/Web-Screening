package com.google.android.play.integrity.internal;

/* loaded from: classes5.dex */
final class e extends f {

    /* renamed from: a, reason: collision with root package name */
    private final int f38350a;

    /* renamed from: b, reason: collision with root package name */
    private final long f38351b;

    public e(int r1, long r2) {
        this.f38350a = r1;
        this.f38351b = r2;
    }

    @Override // com.google.android.play.integrity.internal.f
    public final int a() {
        return this.f38350a;
    }

    @Override // com.google.android.play.integrity.internal.f
    public final long b() {
        return this.f38351b;
    }

    public final boolean equals(Object r8) {
        if (r8 != this) goto L6;
        return true;
    L6:
        if ((r8 instanceof f) == false) goto L12;
        f r82 = (f) r8;
        if (this.f38350a != r82.a()) goto L12;
        if (this.f38351b != r82.b()) goto L12;
        return true;
    L12:
        return false;
    }

    public final int hashCode() {
        long r02 = this.f38351b;
        int r03 = (int) (r02 ^ (r02 >>> 32));
        return r03 ^ ((this.f38350a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f38350a + ", eventTimestamp=" + this.f38351b + "}";
    }
}
