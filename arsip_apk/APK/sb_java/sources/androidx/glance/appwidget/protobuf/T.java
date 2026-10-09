package androidx.glance.appwidget.protobuf;

import androidx.glance.appwidget.protobuf.AbstractC3997u;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class T extends AbstractC3980c implements RandomAccess {
    public static final T d = null;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f25027b;

    /* renamed from: c, reason: collision with root package name */
    public int f25028c;

    static {
        d = new T(new Object[0], 0, false);
    }

    public T(Object[] r1, int r2, boolean r3) {
        super(r3);
        this.f25027b = r1;
        this.f25028c = r2;
    }

    public static Object[] b(int r02) {
        return new Object[r02];
    }

    public static T d() {
        return d;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object r5) {
        a();
        int r02 = this.f25028c;
        Object[] r1 = this.f25027b;
        if (r02 != r1.length) goto L5;
        this.f25027b = Arrays.copyOf(r1, ((r02 * 3) / 2) + 1);
    L5:
        Object[] r03 = this.f25027b;
        int r12 = this.f25028c;
        this.f25028c = r12 + 1;
        r03[r12] = r5;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void e(int r2) {
        if (r2 < 0) goto L7;
        if (r2 >= this.f25028c) goto L7;
        return;
    L7:
        throw new IndexOutOfBoundsException(f(r2));
    }

    public final String f(int r3) {
        return "Index:" + r3 + ", Size:" + this.f25028c;
    }

    public T g(int r4) {
        if (r4 < this.f25028c) goto L7;
        return new T(Arrays.copyOf(this.f25027b, r4), this.f25028c, true);
    L7:
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int r2) {
        e(r2);
        return this.f25027b[r2];
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC3997u.d
    public /* bridge */ /* synthetic */ AbstractC3997u.d mutableCopyWithCapacity(int r1) {
        return g(r1);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC3980c, java.util.AbstractList, java.util.List
    public Object remove(int r5) {
        a();
        e(r5);
        Object[] r02 = this.f25027b;
        Object r1 = r02[r5];
        if (r5 >= (this.f25028c - 1)) goto L5;
        System.arraycopy(r02, r5 + 1, r02, r5, (r2 - r5) - 1);
    L5:
        this.f25028c--;
        ((AbstractList) this).modCount++;
        return r1;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int r3, Object r4) {
        a();
        e(r3);
        Object[] r02 = this.f25027b;
        Object r1 = r02[r3];
        r02[r3] = r4;
        ((AbstractList) this).modCount++;
        return r1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f25028c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int r5, Object r6) {
        a();
        if (r5 < 0) goto L13;
        int r02 = this.f25028c;
        if (r5 > r02) goto L13;
        Object[] r1 = this.f25027b;
        if (r02 >= r1.length) goto L9;
        System.arraycopy(r1, r5, r1, r5 + 1, r02 - r5);
    L10:
        this.f25027b[r5] = r6;
        this.f25028c++;
        ((AbstractList) this).modCount++;
        return;
    L9:
        Object[] r03 = b(((r02 * 3) / 2) + 1);
        System.arraycopy(this.f25027b, 0, r03, 0, r5);
        System.arraycopy(this.f25027b, r5, r03, r5 + 1, this.f25028c - r5);
        this.f25027b = r03;
    L13:
        throw new IndexOutOfBoundsException(f(r5));
    }
}
