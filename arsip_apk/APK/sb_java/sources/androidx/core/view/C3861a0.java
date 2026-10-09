package androidx.core.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.core.view.a0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3861a0 implements Iterator, kotlin.jvm.internal.markers.a {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.functions.l f23145a;

    /* renamed from: b, reason: collision with root package name */
    public final List f23146b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f23147c;

    public C3861a0(Iterator r1, kotlin.jvm.functions.l r2) {
        this.f23145a = r2;
        this.f23146b = new ArrayList();
        this.f23147c = r1;
    }

    public final void a(Object r3) {
        Iterator r32 = (Iterator) this.f23145a.invoke(r3);
        if (r32 == null) goto L9;
        if (r32.hasNext() == false) goto L9;
        this.f23146b.add(this.f23147c);
        this.f23147c = r32;
        return;
    L9:
        if (this.f23147c.hasNext() == true) goto L13;
        if (this.f23146b.isEmpty() == true) goto L17;
        this.f23147c = (Iterator) kotlin.collections.F.F0(this.f23146b);
        kotlin.collections.A.O(this.f23146b);
        goto L9
    L17:
        return;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f23147c.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        Object r02 = this.f23147c.next();
        a(r02);
        return r02;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
