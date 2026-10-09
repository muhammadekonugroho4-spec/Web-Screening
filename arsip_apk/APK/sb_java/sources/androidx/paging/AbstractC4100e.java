package androidx.paging;

import java.util.ArrayList;

/* renamed from: androidx.paging.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4100e {
    public static final /* synthetic */ Object a(M r02, int r1) {
        return d(r02, r1);
    }

    public static final /* synthetic */ Object b(M r02, int r1) {
        return e(r02, r1);
    }

    public static final /* synthetic */ r c(M r02) {
        return f(r02);
    }

    public static final Object d(M r3, int r4) {
        if (r4 < 0) goto L15;
        if (r4 >= r3.getSize()) goto L15;
        int r42 = r4 - r3.b();
        if (r42 >= 0) goto L8;
        return null;
    L8:
        if (r42 < r3.a()) goto L11;
        return null;
    L11:
        return r3.getItem(r42);
    L15:
        throw new IndexOutOfBoundsException("Index: " + r4 + ", Size: " + r3.getSize());
    }

    public static final Object e(M r02, int r1) {
        return d(r02, r1);
    }

    public static final r f(M r4) {
        int r02 = r4.a() - 1;
        ArrayList r1 = new ArrayList();
        if (r02 < 0) goto L9;
        int r2 = 0;
    L5:
        r1.add(r4.getItem(r2));
        if (r2 == r02) goto L9;
        r2 = r2 + 1;
    L9:
        return new r(r4.b(), r4.d(), r1);
    }
}
