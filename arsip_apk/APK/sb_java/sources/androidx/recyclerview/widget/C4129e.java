package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4129e implements t {

    /* renamed from: a, reason: collision with root package name */
    public final t f27402a;

    /* renamed from: b, reason: collision with root package name */
    public int f27403b;

    /* renamed from: c, reason: collision with root package name */
    public int f27404c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public Object f27405e;

    public C4129e(t r2) {
        this.f27403b = 0;
        this.f27404c = -1;
        this.d = -1;
        this.f27405e = null;
        this.f27402a = r2;
    }

    @Override // androidx.recyclerview.widget.t
    public void a(int r6, int r7, Object r8) {
        if (this.f27403b != 3) goto L12;
        int r02 = this.f27404c;
        int r2 = this.d;
        if (r6 > (r02 + r2)) goto L12;
        int r3 = r6 + r7;
        if (r3 < r02) goto L12;
        if (this.f27405e != r8) goto L12;
        this.f27404c = Math.min(r6, r02);
        this.d = Math.max(r2 + r02, r3) - this.f27404c;
        return;
    L12:
        e();
        this.f27404c = r6;
        this.d = r7;
        this.f27405e = r8;
        this.f27403b = 3;
    }

    @Override // androidx.recyclerview.widget.t
    public void b(int r5, int r6) {
        if (this.f27403b != 1) goto L10;
        int r02 = this.f27404c;
        if (r5 < r02) goto L10;
        int r2 = this.d;
        if (r5 > (r02 + r2)) goto L10;
        this.d = r2 + r6;
        this.f27404c = Math.min(r5, r02);
        return;
    L10:
        e();
        this.f27404c = r5;
        this.d = r6;
        this.f27403b = 1;
    }

    @Override // androidx.recyclerview.widget.t
    public void c(int r4, int r5) {
        if (this.f27403b != 2) goto L10;
        int r02 = this.f27404c;
        if (r02 < r4) goto L10;
        if (r02 > (r4 + r5)) goto L10;
        this.d += r5;
        this.f27404c = r4;
        return;
    L10:
        e();
        this.f27404c = r4;
        this.d = r5;
        this.f27403b = 2;
    }

    @Override // androidx.recyclerview.widget.t
    public void d(int r2, int r3) {
        e();
        this.f27402a.d(r2, r3);
    }

    public void e() {
        int r02 = this.f27403b;
        if (r02 != 0) goto L6;
        return;
    L6:
        if (r02 != 1) goto L8;
        this.f27402a.b(this.f27404c, this.d);
    L15:
        this.f27405e = null;
        this.f27403b = 0;
        return;
    L8:
        if (r02 != 2) goto L10;
        this.f27402a.c(this.f27404c, this.d);
        goto L15
    L10:
        if (r02 != 3) goto L15;
        this.f27402a.a(this.f27404c, this.d, this.f27405e);
        goto L15
    }
}
