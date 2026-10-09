package androidx.compose.animation.core;

/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC2395p f6857a;

    /* renamed from: b, reason: collision with root package name */
    public final B f6858b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6859c;

    static {
    }

    public /* synthetic */ n1(AbstractC2395p r1, B r2, int r3, kotlin.jvm.internal.i r4) {
        this(r1, r2, r3);
    }

    public final int a() {
        return this.f6859c;
    }

    public final B b() {
        return this.f6858b;
    }

    public final AbstractC2395p c() {
        return this.f6857a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof n1) == true) goto L8;
        return false;
    L8:
        n1 r52 = (n1) r5;
        if (kotlin.jvm.internal.p.g(this.f6857a, r52.f6857a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f6858b, r52.f6858b) == true) goto L15;
        return false;
    L15:
        if (AbstractC2400s.c(this.f6859c, r52.f6859c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f6857a.hashCode() * 31) + this.f6858b.hashCode()) * 31) + AbstractC2400s.d(this.f6859c);
    }

    public String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f6857a + ", easing=" + this.f6858b + ", arcMode=" + AbstractC2400s.e(this.f6859c) + ')';
    }

    public n1(AbstractC2395p r1, B r2, int r3) {
        this.f6857a = r1;
        this.f6858b = r2;
        this.f6859c = r3;
    }
}
