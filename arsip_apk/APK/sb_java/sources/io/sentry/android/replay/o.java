package io.sentry.android.replay;

import android.content.Context;
import io.sentry.SentryReplayOptions;
import kotlin.Pair;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: g, reason: collision with root package name */
    public static final a f175938g = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f175939a;

    /* renamed from: b, reason: collision with root package name */
    public final int f175940b;

    /* renamed from: c, reason: collision with root package name */
    public final float f175941c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final int f175942e;

    /* renamed from: f, reason: collision with root package name */
    public final int f175943f;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final int a(int r4) {
            int r02 = r4 % 16;
            if (r02 > 8) goto L7;
            return Math.max(16, r4 - r02);
        L7:
            return r4 + (16 - r02);
        }

        public final o b(Context r9, SentryReplayOptions r10, int r11, int r12) {
            kotlin.jvm.internal.p.l(r9, "context");
            kotlin.jvm.internal.p.l(r10, "sessionReplay");
            float r122 = r12;
            float r112 = r11;
            Pair r92 = kotlin.m.a(Integer.valueOf(a(kotlin.math.d.e((r122 / r9.getResources().getDisplayMetrics().density) * r10.q().sizeScale))), Integer.valueOf(a(kotlin.math.d.e((r112 / r9.getResources().getDisplayMetrics().density) * r10.q().sizeScale))));
            int r3 = ((Number) r92.a()).intValue();
            int r2 = ((Number) r92.b()).intValue();
            return new o(r2, r3, r2 / r112, r3 / r122, r10.j(), r10.q().bitRate);
        }

        public a() {
        }
    }

    static {
        f175938g = new a(null);
    }

    public o(int r1, int r2, float r3, float r4, int r5, int r6) {
        this.f175939a = r1;
        this.f175940b = r2;
        this.f175941c = r3;
        this.d = r4;
        this.f175942e = r5;
        this.f175943f = r6;
    }

    public final int a() {
        return this.f175943f;
    }

    public final int b() {
        return this.f175942e;
    }

    public final int c() {
        return this.f175940b;
    }

    public final int d() {
        return this.f175939a;
    }

    public final float e() {
        return this.f175941c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof o) == true) goto L8;
        return false;
    L8:
        o r52 = (o) r5;
        if (this.f175939a == r52.f175939a) goto L12;
        return false;
    L12:
        if (this.f175940b == r52.f175940b) goto L15;
        return false;
    L15:
        if (Float.compare(this.f175941c, r52.f175941c) == 0) goto L18;
        return false;
    L18:
        if (Float.compare(this.d, r52.d) == 0) goto L21;
        return false;
    L21:
        if (this.f175942e == r52.f175942e) goto L24;
        return false;
    L24:
        if (this.f175943f == r52.f175943f) goto L26;
        return false;
    L26:
        return true;
    }

    public final float f() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f175939a) * 31) + Integer.hashCode(this.f175940b)) * 31) + Float.hashCode(this.f175941c)) * 31) + Float.hashCode(this.d)) * 31) + Integer.hashCode(this.f175942e)) * 31) + Integer.hashCode(this.f175943f);
    }

    public String toString() {
        return "ScreenshotRecorderConfig(recordingWidth=" + this.f175939a + ", recordingHeight=" + this.f175940b + ", scaleFactorX=" + this.f175941c + ", scaleFactorY=" + this.d + ", frameRate=" + this.f175942e + ", bitRate=" + this.f175943f + ')';
    }
}
