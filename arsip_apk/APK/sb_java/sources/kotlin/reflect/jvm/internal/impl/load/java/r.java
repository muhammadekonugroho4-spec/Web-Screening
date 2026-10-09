package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.EnumMap;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final EnumMap f178670a;

    public r(EnumMap r2) {
        kotlin.jvm.internal.p.l(r2, "defaultQualifiers");
        this.f178670a = r2;
    }

    public final l a(AnnotationQualifierApplicabilityType r2) {
        return (l) this.f178670a.get(r2);
    }

    public final EnumMap b() {
        return this.f178670a;
    }
}
