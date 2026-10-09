package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f f178502a;

    /* renamed from: b, reason: collision with root package name */
    public final Collection f178503b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f178504c;

    public l(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f r2, Collection r3, boolean r4) {
        kotlin.jvm.internal.p.l(r2, "nullabilityQualifier");
        kotlin.jvm.internal.p.l(r3, "qualifierApplicabilityTypes");
        this.f178502a = r2;
        this.f178503b = r3;
        this.f178504c = r4;
    }

    public static /* synthetic */ l b(l r02, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f r1, Collection r2, boolean r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r02.f178502a;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r02.f178503b;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r02.f178504c;
    L12:
        return r02.a(r1, r2, r3);
    }

    public final l a(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f r2, Collection r3, boolean r4) {
        kotlin.jvm.internal.p.l(r2, "nullabilityQualifier");
        kotlin.jvm.internal.p.l(r3, "qualifierApplicabilityTypes");
        return new l(r2, r3, r4);
    }

    public final boolean c() {
        return this.f178504c;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f d() {
        return this.f178502a;
    }

    public final Collection e() {
        return this.f178503b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof l) == true) goto L8;
        return false;
    L8:
        l r52 = (l) r5;
        if (kotlin.jvm.internal.p.g(this.f178502a, r52.f178502a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f178503b, r52.f178503b) == true) goto L15;
        return false;
    L15:
        if (this.f178504c == r52.f178504c) goto L17;
        return false;
    L17:
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int r02 = ((this.f178502a.hashCode() * 31) + this.f178503b.hashCode()) * 31;
        boolean r1 = this.f178504c;
        int r12 = r1;
        if (r1 == 0) goto L6;
        r12 = 1;
    L6:
        return r02 + r12;
    }

    public String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f178502a + ", qualifierApplicabilityTypes=" + this.f178503b + ", definitelyNotNull=" + this.f178504c + ')';
    }

    public /* synthetic */ l(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f r1, Collection r2, boolean r3, int r4, kotlin.jvm.internal.i r5) {
        if ((r4 & 4) != 0) goto L5;
    L8:
        this(r1, r2, r3);
        return;
    L5:
        if (r1.c() != NullabilityQualifier.NOT_NULL) goto L7;
        r3 = true;
        goto L8
    L7:
        r3 = false;
        goto L8
    }
}
