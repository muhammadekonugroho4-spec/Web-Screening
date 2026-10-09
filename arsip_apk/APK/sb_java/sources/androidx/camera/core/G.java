package androidx.camera.core;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: c, reason: collision with root package name */
    public static final G f4807c = null;
    public static final G d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final G f4808e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final G f4809f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final G f4810g = null;

    /* renamed from: h, reason: collision with root package name */
    public static final G f4811h = null;

    /* renamed from: i, reason: collision with root package name */
    public static final G f4812i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final G f4813j = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f4814a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4815b;

    static {
        f4807c = new G(0, 0);
        d = new G(1, 8);
        f4808e = new G(2, 10);
        f4809f = new G(3, 10);
        f4810g = new G(4, 10);
        f4811h = new G(5, 10);
        f4812i = new G(6, 10);
        f4813j = new G(6, 8);
    }

    public G(int r1, int r2) {
        this.f4814a = r1;
        this.f4815b = r2;
    }

    public static String c(int r02) {
        switch(r02) {
            case 0: goto L17;
            case 1: goto L15;
            case 2: goto L13;
            case 3: goto L11;
            case 4: goto L9;
            case 5: goto L7;
            case 6: goto L5;
            default: goto L3;
        };
    L3:
        return "<Unknown>";
    L5:
        return "DOLBY_VISION";
    L7:
        return "HDR10_PLUS";
    L9:
        return "HDR10";
    L11:
        return "HLG";
    L13:
        return "HDR_UNSPECIFIED";
    L15:
        return "SDR";
    L17:
        return "UNSPECIFIED";
    }

    public int a() {
        return this.f4815b;
    }

    public int b() {
        return this.f4814a;
    }

    public boolean d() {
        if (e() == true) goto L5;
        return false;
    L5:
        if (b() != 1) goto L7;
        return false;
    L7:
        if (a() != 10) goto L12;
        return true;
    L12:
        return false;
    }

    public boolean e() {
        if (b() != 0) goto L5;
        return false;
    L5:
        if (b() != 2) goto L7;
        return false;
    L7:
        if (a() == 0) goto L13;
        return true;
    L13:
        return false;
    }

    public boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof G) == false) goto L12;
        G r52 = (G) r5;
        if (this.f4814a != r52.b()) goto L12;
        if (this.f4815b != r52.a()) goto L12;
        return true;
    L12:
        return false;
    }

    public int hashCode() {
        return ((this.f4814a ^ 1000003) * 1000003) ^ this.f4815b;
    }

    public String toString() {
        return "DynamicRange@" + Integer.toHexString(System.identityHashCode(this)) + "{encoding=" + c(this.f4814a) + ", bitDepth=" + this.f4815b + "}";
    }
}
