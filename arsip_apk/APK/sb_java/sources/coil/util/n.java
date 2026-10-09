package coil.util;

import coil.decode.ExifOrientationPolicy;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f30271a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f30272b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f30273c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final ExifOrientationPolicy f30274e;

    public n(boolean r1, boolean r2, boolean r3, int r4, ExifOrientationPolicy r5) {
        this.f30271a = r1;
        this.f30272b = r2;
        this.f30273c = r3;
        this.d = r4;
        this.f30274e = r5;
    }

    public final boolean a() {
        return this.f30271a;
    }

    public final ExifOrientationPolicy b() {
        return this.f30274e;
    }

    public final int c() {
        return this.d;
    }

    public final boolean d() {
        return this.f30272b;
    }

    public final boolean e() {
        return this.f30273c;
    }

    public /* synthetic */ n(boolean r2, boolean r3, boolean r4, int r5, ExifOrientationPolicy r6, int r7, kotlin.jvm.internal.i r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = true;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = true;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = true;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = 4;
    L15:
        if ((r7 & 16) == 0) goto L17;
        r6 = ExifOrientationPolicy.RESPECT_PERFORMANCE;
    L17:
        ExifOrientationPolicy r72 = r6;
        int r62 = r5;
        boolean r52 = r4;
        this(r2, r3, r52, r62, r72);
    }
}
