package androidx.compose.animation.core;

/* renamed from: androidx.compose.animation.core.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2380h0 implements f1 {

    /* renamed from: a, reason: collision with root package name */
    public final f1 f6816a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6817b;

    public C2380h0(f1 r1, long r2) {
        this.f6816a = r1;
        this.f6817b = r2;
    }

    @Override // androidx.compose.animation.core.f1
    public boolean a() {
        return this.f6816a.a();
    }

    @Override // androidx.compose.animation.core.f1
    public long b(AbstractC2395p r3, AbstractC2395p r4, AbstractC2395p r5) {
        return this.f6816a.b(r3, r4, r5) + this.f6817b;
    }

    @Override // androidx.compose.animation.core.f1
    public AbstractC2395p e(long r10, AbstractC2395p r12, AbstractC2395p r13, AbstractC2395p r14) {
        long r02 = this.f6817b;
        if (r10 >= r02) goto L6;
        return r14;
    L6:
        return this.f6816a.e(r10 - r02, r12, r13, r14);
    }

    public boolean equals(Object r7) {
        if ((r7 instanceof C2380h0) == true) goto L5;
        return false;
    L5:
        C2380h0 r72 = (C2380h0) r7;
        if (r72.f6817b == this.f6817b) goto L8;
    L11:
        return false;
    L8:
        if (kotlin.jvm.internal.p.g(r72.f6816a, this.f6816a) == false) goto L11;
        return true;
    }

    @Override // androidx.compose.animation.core.f1
    public AbstractC2395p f(long r10, AbstractC2395p r12, AbstractC2395p r13, AbstractC2395p r14) {
        long r02 = this.f6817b;
        if (r10 >= r02) goto L6;
        return r12;
    L6:
        return this.f6816a.f(r10 - r02, r12, r13, r14);
    }

    public int hashCode() {
        return (this.f6816a.hashCode() * 31) + Long.hashCode(this.f6817b);
    }
}
