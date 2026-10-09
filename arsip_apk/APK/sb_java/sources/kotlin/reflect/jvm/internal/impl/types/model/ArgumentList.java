package kotlin.reflect.jvm.internal.impl.types.model;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ArgumentList extends ArrayList<k> implements j {
    public ArgumentList(int r1) {
        super(r1);
    }

    public /* bridge */ boolean a(k r1) {
        return super.contains(r1);
    }

    public /* bridge */ int b(k r1) {
        return super.indexOf(r1);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object r2) {
        if ((r2 instanceof k) == true) goto L7;
        return false;
    L7:
        return a((k) r2);
    }

    public /* bridge */ int e(k r1) {
        return super.lastIndexOf(r1);
    }

    public /* bridge */ boolean g(k r1) {
        return super.remove(r1);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object r2) {
        if ((r2 instanceof k) == true) goto L7;
        return -1;
    L7:
        return b((k) r2);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object r2) {
        if ((r2 instanceof k) == true) goto L7;
        return -1;
    L7:
        return e((k) r2);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object r2) {
        if ((r2 instanceof k) == true) goto L7;
        return false;
    L7:
        return g((k) r2);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }
}
