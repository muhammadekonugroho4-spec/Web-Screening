package androidx.compose.ui;

import androidx.compose.ui.e;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: b, reason: collision with root package name */
    public final float f16954b;

    /* renamed from: c, reason: collision with root package name */
    public final float f16955c;

    public static final class a implements e.b {

        /* renamed from: a, reason: collision with root package name */
        public final float f16956a;

        static {
        }

        public a(float r1) {
            this.f16956a = r1;
        }

        @Override // androidx.compose.ui.e.b
        public int a(int r1, int r2, LayoutDirection r3) {
            return Math.round(((r2 - r1) / 2.0f) * (1 + this.f16956a));
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (Float.compare(this.f16956a, ((a) r4).f16956a) == 0) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Float.hashCode(this.f16956a);
        }

        public String toString() {
            return "Horizontal(bias=" + this.f16956a + ')';
        }
    }

    static {
    }

    public f(float r1, float r2) {
        this.f16954b = r1;
        this.f16955c = r2;
    }

    @Override // androidx.compose.ui.e
    public long a(long r4, long r6, LayoutDirection r8) {
        long r42 = androidx.compose.ui.unit.s.c(((((int) (r6 >> 32)) - ((int) (r4 >> 32))) << 32) | ((((int) (r6 & 4294967295L)) - ((int) (r4 & 4294967295L))) & 4294967295L));
        float r5 = 1;
        float r62 = (((int) (r42 >> 32)) / 2.0f) * (this.f16954b + r5);
        float r43 = (((int) (r42 & 4294967295L)) / 2.0f) * (r5 + this.f16955c);
        return androidx.compose.ui.unit.o.f((Math.round(r62) << 32) | (Math.round(r43) & 4294967295L));
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (Float.compare(this.f16954b, r52.f16954b) == 0) goto L12;
        return false;
    L12:
        if (Float.compare(this.f16955c, r52.f16955c) == 0) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Float.hashCode(this.f16954b) * 31) + Float.hashCode(this.f16955c);
    }

    public String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f16954b + ", verticalBias=" + this.f16955c + ')';
    }
}
