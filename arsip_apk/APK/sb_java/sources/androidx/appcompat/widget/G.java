package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class G {

    /* renamed from: a, reason: collision with root package name */
    public int f3355a;

    /* renamed from: b, reason: collision with root package name */
    public int f3356b;

    /* renamed from: c, reason: collision with root package name */
    public int f3357c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3358e;

    /* renamed from: f, reason: collision with root package name */
    public int f3359f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3360g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3361h;

    public G() {
        this.f3355a = 0;
        this.f3356b = 0;
        this.f3357c = Integer.MIN_VALUE;
        this.d = Integer.MIN_VALUE;
        this.f3358e = 0;
        this.f3359f = 0;
        this.f3360g = false;
        this.f3361h = false;
    }

    public int a() {
        if (this.f3360g == false) goto L7;
        return this.f3355a;
    L7:
        return this.f3356b;
    }

    public int b() {
        return this.f3355a;
    }

    public int c() {
        return this.f3356b;
    }

    public int d() {
        if (this.f3360g == false) goto L7;
        return this.f3356b;
    L7:
        return this.f3355a;
    }

    public void e(int r2, int r3) {
        this.f3361h = false;
        if (r2 == Integer.MIN_VALUE) goto L5;
        this.f3358e = r2;
        this.f3355a = r2;
    L5:
        if (r3 == Integer.MIN_VALUE) goto L8;
        this.f3359f = r3;
        this.f3356b = r3;
        return;
    }

    public void f(boolean r2) {
        if (r2 != this.f3360g) goto L5;
        return;
    L5:
        this.f3360g = r2;
        if (this.f3361h == true) goto L8;
        this.f3355a = this.f3358e;
        this.f3356b = this.f3359f;
        return;
    L8:
        if (r2 == false) goto L19;
        int r22 = this.d;
        if (r22 != Integer.MIN_VALUE) goto L13;
        r22 = this.f3358e;
    L13:
        this.f3355a = r22;
        int r23 = this.f3357c;
        if (r23 != Integer.MIN_VALUE) goto L17;
        r23 = this.f3359f;
    L17:
        this.f3356b = r23;
        return;
    L19:
        int r24 = this.f3357c;
        if (r24 != Integer.MIN_VALUE) goto L23;
        r24 = this.f3358e;
    L23:
        this.f3355a = r24;
        int r25 = this.d;
        if (r25 != Integer.MIN_VALUE) goto L27;
        r25 = this.f3359f;
    L27:
        this.f3356b = r25;
    }

    public void g(int r3, int r4) {
        this.f3357c = r3;
        this.d = r4;
        this.f3361h = true;
        if (this.f3360g == false) goto L9;
        if (r4 == Integer.MIN_VALUE) goto L6;
        this.f3355a = r4;
    L6:
        if (r3 == Integer.MIN_VALUE) goto L14;
        this.f3356b = r3;
        return;
    L14:
        return;
    L9:
        if (r3 == Integer.MIN_VALUE) goto L11;
        this.f3355a = r3;
    L11:
        if (r4 == Integer.MIN_VALUE) goto L15;
        this.f3356b = r4;
        return;
    }
}
