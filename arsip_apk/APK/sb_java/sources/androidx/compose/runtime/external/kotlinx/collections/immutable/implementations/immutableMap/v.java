package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Map;

/* loaded from: classes.dex */
public final class v extends u {
    static {
    }

    public v() {
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return o();
    }

    public Map.Entry o() {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.a.a(f());
        n(e() + 2);
        return new b(d()[e() - 2], d()[e() - 1]);
    }
}
