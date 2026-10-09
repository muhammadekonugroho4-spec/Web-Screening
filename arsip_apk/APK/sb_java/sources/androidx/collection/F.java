package androidx.collection;

import kotlin.collections.AbstractC11772p;

/* loaded from: classes.dex */
public final class F extends AbstractC2345i {

    /* renamed from: e, reason: collision with root package name */
    public int f6358e;

    public F(int r2) {
        super(null);
        if (r2 < 0) goto L5;
        boolean r02 = true;
    L6:
        if (r02 == true) goto L8;
        androidx.collection.internal.d.a("Capacity must be a positive value.");
    L8:
        g(c0.e(r2));
        return;
    L5:
        r02 = false;
        goto L6
    }

    public final void e() {
        this.f6358e = c0.a(b()) - this.d;
    }

    public final void f(int r9) {
        if (r9 != 0) goto L4;
        long[] r02 = c0.f6426a;
    L5:
        this.f6444a = r02;
        int r1 = r9 >> 3;
        long r4 = 255 << ((r9 & 7) << 3);
        r02[r1] = (r02[r1] & (~r4)) | r4;
        e();
        return;
    L4:
        long[] r12 = new long[((r9 + 15) & (-8)) >> 3];
        AbstractC11772p.D(r12, -9187201950435737472L, 0, 0, 6, null);
        r02 = r12;
        goto L5
    }

    public final void g(int r2) {
        if (r2 <= 0) goto L4;
        int r22 = Math.max(7, c0.d(r2));
    L5:
        this.f6446c = r22;
        f(r22);
        this.f6445b = new float[r22];
        return;
    L4:
        r22 = 0;
        goto L5
    }
}
