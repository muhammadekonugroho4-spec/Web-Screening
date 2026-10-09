package dagger.internal;

/* loaded from: classes2.dex */
public final class j implements h {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f173988c = null;

    /* renamed from: a, reason: collision with root package name */
    public volatile h f173989a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f173990b;

    static {
        f173988c = new Object();
    }

    public j(h r2) {
        this.f173990b = f173988c;
        this.f173989a = r2;
    }

    public static h a(h r1) {
        if ((r1 instanceof j) == false) goto L5;
        return r1;
    L5:
        if ((r1 instanceof b) == false) goto L8;
        return r1;
    L8:
        return new j((h) g.b(r1));
    }

    @Override // javax.inject.a
    public Object get() {
        Object r02 = this.f173990b;
        if (r02 != f173988c) goto L10;
        h r03 = this.f173989a;
        if (r03 == null) goto L7;
        Object r04 = r03.get();
        this.f173990b = r04;
        this.f173989a = null;
        return r04;
    L7:
        return this.f173990b;
    L10:
        return r02;
    }
}
