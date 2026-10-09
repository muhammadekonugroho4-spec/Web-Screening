package androidx.camera.core;

import android.util.Rational;

/* loaded from: classes.dex */
public final class G0 {

    /* renamed from: a, reason: collision with root package name */
    public int f4816a;

    /* renamed from: b, reason: collision with root package name */
    public Rational f4817b;

    /* renamed from: c, reason: collision with root package name */
    public int f4818c;
    public int d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f4819a;

        /* renamed from: b, reason: collision with root package name */
        public final Rational f4820b;

        /* renamed from: c, reason: collision with root package name */
        public final int f4821c;
        public int d;

        public a(Rational r2, int r3) {
            this.f4819a = 1;
            this.d = 0;
            this.f4820b = r2;
            this.f4821c = r3;
        }

        public G0 a() {
            androidx.core.util.h.h(this.f4820b, "The crop aspect ratio must be set.");
            return new G0(this.f4819a, this.f4820b, this.f4821c, this.d);
        }

        public a b(int r1) {
            this.d = r1;
            return this;
        }

        public a c(int r1) {
            this.f4819a = r1;
            return this;
        }
    }

    public G0(int r1, Rational r2, int r3, int r4) {
        this.f4816a = r1;
        this.f4817b = r2;
        this.f4818c = r3;
        this.d = r4;
    }

    public Rational a() {
        return this.f4817b;
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.f4818c;
    }

    public int d() {
        return this.f4816a;
    }
}
