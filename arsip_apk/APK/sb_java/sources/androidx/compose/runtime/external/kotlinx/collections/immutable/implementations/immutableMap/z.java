package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

/* loaded from: classes.dex */
public final class z extends u {
    static {
    }

    public z() {
    }

    @Override // java.util.Iterator
    public Object next() {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.a.a(f());
        n(e() + 2);
        return d()[e() - 1];
    }
}
