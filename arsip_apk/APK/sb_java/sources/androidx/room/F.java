package androidx.room;

/* loaded from: classes4.dex */
public abstract class F implements G {

    /* renamed from: a, reason: collision with root package name */
    public final int f27631a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27632b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27633c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f27634a;

        /* renamed from: b, reason: collision with root package name */
        public final String f27635b;

        public a(boolean r1, String r2) {
            this.f27634a = r1;
            this.f27635b = r2;
        }
    }

    public F(int r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r3, "identityHash");
        kotlin.jvm.internal.p.l(r4, "legacyIdentityHash");
        this.f27631a = r2;
        this.f27632b = r3;
        this.f27633c = r4;
    }

    public abstract void a(androidx.sqlite.b r1);

    public abstract void b(androidx.sqlite.b r1);

    public final String c() {
        return this.f27632b;
    }

    public final String d() {
        return this.f27633c;
    }

    public final int e() {
        return this.f27631a;
    }

    public abstract void f(androidx.sqlite.b r1);

    public abstract void g(androidx.sqlite.b r1);

    public abstract void h(androidx.sqlite.b r1);

    public abstract void i(androidx.sqlite.b r1);

    public abstract a j(androidx.sqlite.b r1);
}
