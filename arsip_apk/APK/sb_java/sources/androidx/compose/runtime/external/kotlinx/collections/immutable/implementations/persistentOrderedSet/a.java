package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f16241a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16242b;

    static {
    }

    public a(Object r1, Object r2) {
        this.f16241a = r1;
        this.f16242b = r2;
    }

    public final boolean a() {
        if (this.f16242b == androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f16258a) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean b() {
        if (this.f16241a == androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f16258a) goto L6;
        return true;
    L6:
        return false;
    }

    public final Object c() {
        return this.f16242b;
    }

    public final Object d() {
        return this.f16241a;
    }

    public final a e(Object r3) {
        return new a(this.f16241a, r3);
    }

    public final a f(Object r3) {
        return new a(r3, this.f16242b);
    }

    public a() {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c r02 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f16258a;
        this(r02, r02);
    }

    public a(Object r2) {
        this(r2, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f16258a);
    }
}
