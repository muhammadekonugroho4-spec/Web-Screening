package androidx.glance.appwidget;

/* renamed from: androidx.glance.appwidget.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3977p {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.glance.o f24936a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.glance.o f24937b;

    public C3977p(androidx.glance.o r1, androidx.glance.o r2) {
        this.f24936a = r1;
        this.f24937b = r2;
    }

    public static /* synthetic */ C3977p d(C3977p r02, androidx.glance.o r1, androidx.glance.o r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r02.f24936a;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r02.f24937b;
    L9:
        return r02.c(r1, r2);
    }

    public final androidx.glance.o a() {
        return this.f24936a;
    }

    public final androidx.glance.o b() {
        return this.f24937b;
    }

    public final C3977p c(androidx.glance.o r2, androidx.glance.o r3) {
        return new C3977p(r2, r3);
    }

    public final androidx.glance.o e() {
        return this.f24937b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C3977p) == true) goto L8;
        return false;
    L8:
        C3977p r52 = (C3977p) r5;
        if (kotlin.jvm.internal.p.g(this.f24936a, r52.f24936a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f24937b, r52.f24937b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final androidx.glance.o f() {
        return this.f24936a;
    }

    public int hashCode() {
        return (this.f24936a.hashCode() * 31) + this.f24937b.hashCode();
    }

    public String toString() {
        return "ExtractedSizeModifiers(sizeModifiers=" + this.f24936a + ", nonSizeModifiers=" + this.f24937b + ')';
    }

    public /* synthetic */ C3977p(androidx.glance.o r1, androidx.glance.o r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = androidx.glance.o.f25335a;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = androidx.glance.o.f25335a;
    L8:
        this(r1, r2);
    }
}
