package io.reactivex.internal.util;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f174626a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f174627b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f174628c;
    public int d;

    /* renamed from: io.reactivex.internal.util.a$a, reason: collision with other inner class name */
    public interface InterfaceC1838a extends io.reactivex.functions.f {
        @Override // io.reactivex.functions.f
        boolean test(Object r1);
    }

    public a(int r1) {
        this.f174626a = r1;
        Object[] r12 = new Object[r1 + 1];
        this.f174627b = r12;
        this.f174628c = r12;
    }

    public boolean a(org.reactivestreams.b r5) {
        Object[] r02 = this.f174627b;
        int r1 = this.f174626a;
    L3:
        int r2 = 0;
        if (r02 == null) goto L15;
    L5:
        if (r2 >= r1) goto L14;
        Object[] r3 = r02[r2];
        if (r3 == null) goto L14;
        if (NotificationLite.acceptFull(r3, r5) == true) goto L11;
        r2 = r2 + 1;
        goto L5
    L11:
        return true;
    L14:
        r02 = r02[r1];
        goto L3
    L15:
        return false;
    }

    public void b(Object r4) {
        int r02 = this.f174626a;
        int r1 = this.d;
        if (r1 != r02) goto L5;
        Object[] r12 = new Object[r02 + 1];
        this.f174628c[r02] = r12;
        this.f174628c = r12;
        r1 = 0;
    L5:
        this.f174628c[r1] = r4;
        this.d = r1 + 1;
    }

    public void c(InterfaceC1838a r5) {
        Object[] r02 = this.f174627b;
        int r1 = this.f174626a;
    L3:
        if (r02 == null) goto L14;
        int r2 = 0;
    L5:
        if (r2 >= r1) goto L13;
        Object r3 = r02[r2];
        if (r3 == null) goto L13;
        if (r5.test(r3) == true) goto L19;
        r2 = r2 + 1;
        goto L5
    L19:
        return;
    L13:
        r02 = r02[r1];
        goto L3
    }

    public void d(Object r3) {
        this.f174627b[0] = r3;
    }
}
