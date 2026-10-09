package androidx.appcompat.app;

/* loaded from: classes.dex */
public class u {
    public static u d;

    /* renamed from: a, reason: collision with root package name */
    public long f2565a;

    /* renamed from: b, reason: collision with root package name */
    public long f2566b;

    /* renamed from: c, reason: collision with root package name */
    public int f2567c;

    public u() {
    }

    public static u b() {
        if (d != null) goto L6;
        d = new u();
    L6:
        return d;
    }

    public void a(long r15, double r17, double r19) {
        double r4 = (0.01720197f * ((r15 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double r8 = (((((Math.sin(r4) * 0.03341960161924362d) + r4) + (Math.sin(2.0f * r3) * 3.4906598739326E-4d)) + (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d)) + 1.796593063d) + 3.141592653589793d;
        double r2 = (((Math.round((r2 - 9.0E-4f) - r6) + 9.0E-4f) + ((-r19) / 360.0d)) + (Math.sin(r4) * 0.0053d)) + (Math.sin(2.0d * r8) * (-0.0069d));
        double r42 = Math.asin(Math.sin(r8) * Math.sin(0.4092797040939331d));
        double r6 = 0.01745329238474369d * r17;
        double r82 = (Math.sin(-0.10471975803375244d) - (Math.sin(r6) * Math.sin(r42))) / (Math.cos(r6) * Math.cos(r42));
        if (r82 < 1.0d) goto L7;
        this.f2567c = 1;
        this.f2565a = -1;
        this.f2566b = -1;
        return;
    L7:
        if (r82 > (-1.0d)) goto L10;
        this.f2567c = 0;
        this.f2565a = -1;
        this.f2566b = -1;
        return;
    L10:
        double r62 = (float) (Math.acos(r82) / 6.283185307179586d);
        this.f2565a = Math.round((r2 + r62) * 8.64E7d) + 946728000000L;
        long r22 = Math.round((r2 - r62) * 8.64E7d) + 946728000000L;
        this.f2566b = r22;
        if (r22 < r15) goto L13;
    L16:
        this.f2567c = 1;
        return;
    L13:
        if (this.f2565a <= r15) goto L16;
        this.f2567c = 0;
    }
}
