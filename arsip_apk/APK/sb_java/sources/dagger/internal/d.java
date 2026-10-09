package dagger.internal;

/* loaded from: classes2.dex */
public final class d implements c, dagger.a {

    /* renamed from: b, reason: collision with root package name */
    public static final d f173983b = null;

    /* renamed from: a, reason: collision with root package name */
    public final Object f173984a;

    static {
        f173983b = new d(null);
    }

    public d(Object r1) {
        this.f173984a = r1;
    }

    public static c a(Object r2) {
        return new d(g.c(r2, "instance cannot be null"));
    }

    @Override // javax.inject.a
    public Object get() {
        return this.f173984a;
    }
}
