package androidx.collection;

import java.util.List;

/* loaded from: classes.dex */
public abstract class Y {

    /* renamed from: a, reason: collision with root package name */
    public static final Object[] f6407a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final ObjectList f6408b = null;

    static {
        f6407a = new Object[0];
        f6408b = new P(0);
    }

    public static final /* synthetic */ void a(List r02, int r1) {
        d(r02, r1);
    }

    public static final /* synthetic */ void b(List r02, int r1, int r2) {
        e(r02, r1, r2);
    }

    public static final /* synthetic */ Object[] c() {
        return f6407a;
    }

    public static final void d(List r2, int r3) {
        int r22 = r2.size();
        if (r3 < 0) goto L7;
        if (r3 >= r22) goto L7;
        return;
    L7:
        androidx.collection.internal.d.c("Index " + r3 + " is out of bounds. The list has " + r22 + " elements.");
    }

    public static final void e(List r2, int r3, int r4) {
        int r22 = r2.size();
        if (r3 <= r4) goto L5;
        androidx.collection.internal.d.a("Indices are out of order. fromIndex (" + r3 + ") is greater than toIndex (" + r4 + ").");
    L5:
        if (r3 >= 0) goto L7;
        androidx.collection.internal.d.c("fromIndex (" + r3 + ") is less than 0.");
    L7:
        if (r4 <= r22) goto L10;
        androidx.collection.internal.d.c("toIndex (" + r4 + ") is more than than the list size (" + r22 + ')');
        return;
    }

    public static final ObjectList f() {
        ObjectList r02 = f6408b;
        kotlin.jvm.internal.p.j(r02, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
        return r02;
    }

    public static final P g(Object r2) {
        P r02 = new P(1);
        r02.n(r2);
        return r02;
    }

    public static final P h(Object r2, Object r3) {
        P r02 = new P(2);
        r02.n(r2);
        r02.n(r3);
        return r02;
    }
}
