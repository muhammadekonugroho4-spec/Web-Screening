package androidx.glance.layout;

/* loaded from: classes4.dex */
public final class h implements androidx.glance.h {

    /* renamed from: a, reason: collision with root package name */
    public androidx.glance.o f25317a;

    static {
    }

    public h() {
        this.f25317a = androidx.glance.o.f25335a;
    }

    @Override // androidx.glance.h
    public androidx.glance.o a() {
        return this.f25317a;
    }

    @Override // androidx.glance.h
    public androidx.glance.h b() {
        h r02 = new h();
        r02.c(a());
        return r02;
    }

    @Override // androidx.glance.h
    public void c(androidx.glance.o r1) {
        this.f25317a = r1;
    }

    public String toString() {
        return "EmittableSpacer(modifier=" + a() + ')';
    }
}
