package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

/* loaded from: classes.dex */
public final class w extends u {
    static {
    }

    public w() {
    }

    @Override // java.util.Iterator
    public Object next() {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.a.a(f());
        n(e() + 2);
        return d()[e() - 2];
    }
}
