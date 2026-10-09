package androidx.constraintlayout.core;

/* loaded from: classes.dex */
public class g implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f21036a;

    /* renamed from: b, reason: collision with root package name */
    public int f21037b;

    public g(int r2) {
        if (r2 <= 0) goto L7;
        this.f21036a = new Object[r2];
        return;
    L7:
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override // androidx.constraintlayout.core.f
    public boolean a(Object r4) {
        int r02 = this.f21037b;
        Object[] r1 = this.f21036a;
        if (r02 >= r1.length) goto L6;
        r1[r02] = r4;
        this.f21037b = r02 + 1;
        return true;
    L6:
        return false;
    }

    @Override // androidx.constraintlayout.core.f
    public Object acquire() {
        int r02 = this.f21037b;
        if (r02 <= 0) goto L6;
        int r2 = r02 - 1;
        Object[] r3 = this.f21036a;
        Object r4 = r3[r2];
        r3[r2] = null;
        this.f21037b = r02 - 1;
        return r4;
    L6:
        return null;
    }

    @Override // androidx.constraintlayout.core.f
    public void b(Object[] r6, int r7) {
        if (r7 <= r6.length) goto L5;
        r7 = r6.length;
    L5:
        int r02 = 0;
    L6:
        if (r02 >= r7) goto L11;
        Object r1 = r6[r02];
        int r2 = this.f21037b;
        Object[] r3 = this.f21036a;
        if (r2 >= r3.length) goto L10;
        r3[r2] = r1;
        this.f21037b = r2 + 1;
    L10:
        r02 = r02 + 1;
        goto L6
    }
}
