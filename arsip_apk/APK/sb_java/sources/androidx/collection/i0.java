package androidx.collection;

/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f6447a = null;

    static {
        f6447a = new Object();
    }

    public static final /* synthetic */ void a(h0 r02) {
        d(r02);
    }

    public static final /* synthetic */ Object b() {
        return f6447a;
    }

    public static final Object c(h0 r2, int r3) {
        kotlin.jvm.internal.p.l(r2, "<this>");
        int r32 = androidx.collection.internal.a.a(r2.f6442b, r2.d, r3);
        if (r32 < 0) goto L8;
        Object r22 = r2.f6443c[r32];
        if (r22 == f6447a) goto L10;
        return r22;
    L10:
        return null;
    L8:
        return null;
    }

    public static final void d(h0 r8) {
        int r02 = r8.d;
        int[] r1 = r8.f6442b;
        Object[] r2 = r8.f6443c;
        int r4 = 0;
        int r5 = 0;
    L3:
        if (r4 >= r02) goto L10;
        Object r6 = r2[r4];
        if (r6 == f6447a) goto L9;
        if (r4 == r5) goto L8;
        r1[r5] = r1[r4];
        r2[r5] = r6;
        r2[r4] = null;
    L8:
        r5 = r5 + 1;
    L9:
        r4 = r4 + 1;
        goto L3
    L10:
        r8.f6441a = false;
        r8.d = r5;
    }
}
