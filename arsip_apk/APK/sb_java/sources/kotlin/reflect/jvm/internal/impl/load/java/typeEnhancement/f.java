package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final NullabilityQualifier f178725a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f178726b;

    public f(NullabilityQualifier r2, boolean r3) {
        p.l(r2, "qualifier");
        this.f178725a = r2;
        this.f178726b = r3;
    }

    public static /* synthetic */ f b(f r02, NullabilityQualifier r1, boolean r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r02.f178725a;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r02.f178726b;
    L9:
        return r02.a(r1, r2);
    }

    public final f a(NullabilityQualifier r2, boolean r3) {
        p.l(r2, "qualifier");
        return new f(r2, r3);
    }

    public final NullabilityQualifier c() {
        return this.f178725a;
    }

    public final boolean d() {
        return this.f178726b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (this.f178725a == r52.f178725a) goto L12;
        return false;
    L12:
        if (this.f178726b == r52.f178726b) goto L14;
        return false;
    L14:
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int r02 = this.f178725a.hashCode() * 31;
        boolean r1 = this.f178726b;
        int r12 = r1;
        if (r1 == 0) goto L6;
        r12 = 1;
    L6:
        return r02 + r12;
    }

    public String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f178725a + ", isForWarningOnly=" + this.f178726b + ')';
    }

    public /* synthetic */ f(NullabilityQualifier r1, boolean r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = false;
    L5:
        this(r1, r2);
    }
}
