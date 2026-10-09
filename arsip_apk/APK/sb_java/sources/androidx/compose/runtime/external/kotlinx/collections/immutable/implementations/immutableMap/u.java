package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class u implements Iterator, kotlin.jvm.internal.markers.a {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f16238a;

    /* renamed from: b, reason: collision with root package name */
    public int f16239b;

    /* renamed from: c, reason: collision with root package name */
    public int f16240c;

    static {
    }

    public u() {
        this.f16238a = t.f16230e.a().p();
    }

    public final Object a() {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.a.a(f());
        return this.f16238a[this.f16240c];
    }

    public final t b() {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.a.a(g());
        Object r02 = this.f16238a[this.f16240c];
        kotlin.jvm.internal.p.j(r02, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (t) r02;
    }

    public final Object[] d() {
        return this.f16238a;
    }

    public final int e() {
        return this.f16240c;
    }

    public final boolean f() {
        if (this.f16240c >= this.f16239b) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean g() {
        if (this.f16240c < this.f16239b) goto L5;
        boolean r02 = true;
    L6:
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.a.a(r02);
        if (this.f16240c >= this.f16238a.length) goto L9;
        return true;
    L9:
        return false;
    L5:
        r02 = false;
        goto L6
    }

    public final void h() {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.a.a(f());
        this.f16240c += 2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return f();
    }

    public final void j() {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.a.a(g());
        this.f16240c++;
    }

    public final void l(Object[] r2, int r3) {
        m(r2, r3, 0);
    }

    public final void m(Object[] r1, int r2, int r3) {
        this.f16238a = r1;
        this.f16239b = r2;
        this.f16240c = r3;
    }

    public final void n(int r1) {
        this.f16240c = r1;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
