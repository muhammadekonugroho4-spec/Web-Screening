package androidx.constraintlayout.core.motion;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public String f21061a;

    /* renamed from: b, reason: collision with root package name */
    public int f21062b;

    /* renamed from: c, reason: collision with root package name */
    public int f21063c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public String f21064e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21065f;

    public a(a r2) {
        this.f21063c = Integer.MIN_VALUE;
        this.d = Float.NaN;
        this.f21064e = null;
        this.f21061a = r2.f21061a;
        this.f21062b = r2.f21062b;
        this.f21063c = r2.f21063c;
        this.d = r2.d;
        this.f21064e = r2.f21064e;
        this.f21065f = r2.f21065f;
    }

    public static String a(int r2) {
        return "#" + ("00000000" + Integer.toHexString(r2)).substring(r2.length() - 8);
    }

    public a b() {
        return new a(this);
    }

    public boolean c() {
        return this.f21065f;
    }

    public float d() {
        return this.d;
    }

    public int e() {
        return this.f21063c;
    }

    public String f() {
        return this.f21061a;
    }

    public String g() {
        return this.f21064e;
    }

    public int h() {
        return this.f21062b;
    }

    public void i(float r1) {
        this.d = r1;
    }

    public void j(int r1) {
        this.f21063c = r1;
    }

    public String toString() {
        String r02 = this.f21061a + ':';
        switch(this.f21062b) {
            case 900: goto L17;
            case 901: goto L15;
            case 902: goto L13;
            case 903: goto L11;
            case 904: goto L9;
            case 905: goto L7;
            default: goto L5;
        };
    L5:
        return r02 + "????";
    L7:
        return r02 + this.d;
    L9:
        return r02 + Boolean.valueOf(this.f21065f);
    L11:
        return r02 + this.f21064e;
    L13:
        return r02 + a(this.f21063c);
    L15:
        return r02 + this.d;
    L17:
        return r02 + this.f21063c;
    }

    public a(String r2, int r3, int r4) {
        this.f21063c = Integer.MIN_VALUE;
        this.d = Float.NaN;
        this.f21064e = null;
        this.f21061a = r2;
        this.f21062b = r3;
        if (r3 != 901) goto L6;
        this.d = r4;
        return;
    L6:
        this.f21063c = r4;
    }

    public a(String r2, int r3, float r4) {
        this.f21063c = Integer.MIN_VALUE;
        this.f21064e = null;
        this.f21061a = r2;
        this.f21062b = r3;
        this.d = r4;
    }
}
