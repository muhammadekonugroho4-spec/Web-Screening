package androidx.compose.runtime.snapshots;

/* loaded from: classes.dex */
public abstract class W {

    /* renamed from: a, reason: collision with root package name */
    public long f16552a;

    /* renamed from: b, reason: collision with root package name */
    public W f16553b;

    static {
    }

    public W(long r1) {
        this.f16552a = r1;
    }

    public abstract void c(W r1);

    public abstract W d();

    public W e(long r2) {
        W r02 = d();
        r02.f16552a = r2;
        return r02;
    }

    public final W f() {
        return this.f16553b;
    }

    public final long g() {
        return this.f16552a;
    }

    public final void h(W r1) {
        this.f16553b = r1;
    }

    public final void i(long r1) {
        this.f16552a = r1;
    }

    public W() {
        this(AbstractC3457u.K().i());
    }
}
