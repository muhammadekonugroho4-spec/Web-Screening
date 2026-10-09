package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class m extends a {

    /* renamed from: c, reason: collision with root package name */
    public int f16203c;
    public Object[] d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16204e;

    static {
    }

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public m(Object[] r3, int r4, int r5, int r6) {
        super(r4, r5);
        this.f16203c = r6;
        Object[] r62 = new Object[r6];
        this.d = r62;
        if (r4 != r5) goto L5;
        ?? r52 = 1;
    L6:
        this.f16204e = r52;
        r62[0] = r3;
        h(r4 - r52, 1);
        return;
    L5:
        r52 = 0;
        goto L6
    }

    public final Object g() {
        int r02 = d() & 31;
        Object r1 = this.d[this.f16203c - 1];
        p.j(r1, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) r1)[r02];
    }

    public final void h(int r5, int r6) {
        int r02 = (this.f16203c - r6) * 5;
    L4:
        if (r6 >= this.f16203c) goto L6;
        Object[] r1 = this.d;
        Object r2 = r1[r6 - 1];
        p.j(r2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        r1[r6] = ((Object[]) r2)[n.a(r5, r02)];
        r02 = r02 - 5;
        r6 = r6 + 1;
        goto L4
    }

    public final void j(int r3) {
        int r02 = 0;
    L4:
        if (n.a(d(), r02) != r3) goto L6;
        r02 = r02 + 5;
        goto L4
    L6:
        if (r02 <= 0) goto L10;
        h(d(), ((this.f16203c - 1) - (r02 / 5)) + 1);
        return;
    }

    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final void l(Object[] r2, int r3, int r4, int r5) {
        e(r3);
        f(r4);
        this.f16203c = r5;
        if (this.d.length >= r5) goto L5;
        this.d = new Object[r5];
    L5:
        ?? r02 = 0;
        this.d[0] = r2;
        if (r3 != r4) goto L8;
        r02 = 1;
    L8:
        this.f16204e = r02;
        h(r3 - r02, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        if (hasNext() == false) goto L11;
        Object r02 = g();
        e(d() + 1);
        if (d() != getSize()) goto L8;
        this.f16204e = true;
        return r02;
    L8:
        j(0);
        return r02;
    L11:
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public Object previous() {
        if (hasPrevious() == false) goto L11;
        e(d() - 1);
        if (this.f16204e == false) goto L8;
        this.f16204e = false;
        return g();
    L8:
        j(31);
        return g();
    L11:
        throw new NoSuchElementException();
    }
}
