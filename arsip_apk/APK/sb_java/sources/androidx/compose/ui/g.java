package androidx.compose.ui;

import androidx.compose.ui.e;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    public final float f17041b;

    /* renamed from: c, reason: collision with root package name */
    public final float f17042c;

    public static final class a implements e.b {

        /* renamed from: a, reason: collision with root package name */
        public final float f17043a;

        static {
        }

        public a(float r1) {
            this.f17043a = r1;
        }

        @Override // androidx.compose.ui.e.b
        public int a(int r1, int r2, LayoutDirection r3) {
            float r12 = (r2 - r1) / 2.0f;
            if (r3 != LayoutDirection.Ltr) goto L5;
            float r22 = this.f17043a;
        L7:
            return Math.round(r12 * (1 + r22));
        L5:
            r22 = (-1) * this.f17043a;
            goto L7
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (Float.compare(this.f17043a, ((a) r4).f17043a) == 0) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Float.hashCode(this.f17043a);
        }

        public String toString() {
            return "Horizontal(bias=" + this.f17043a + ')';
        }
    }

    public static final class b implements e.c {

        /* renamed from: a, reason: collision with root package name */
        public final float f17044a;

        static {
        }

        public b(float r1) {
            this.f17044a = r1;
        }

        @Override // androidx.compose.ui.e.c
        public int a(int r2, int r3) {
            return Math.round(((r3 - r2) / 2.0f) * (1 + this.f17044a));
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (Float.compare(this.f17044a, ((b) r4).f17044a) == 0) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Float.hashCode(this.f17044a);
        }

        public String toString() {
            return "Vertical(bias=" + this.f17044a + ')';
        }
    }

    static {
    }

    public g(float r1, float r2) {
        this.f17041b = r1;
        this.f17042c = r2;
    }

    @Override // androidx.compose.ui.e
    public long a(long r6, long r8, LayoutDirection r10) {
        float r1 = (((int) (r8 >> 32)) - ((int) (r6 >> 32))) / 2.0f;
        float r62 = (((int) (r8 & 4294967295L)) - ((int) (r6 & 4294967295L))) / 2.0f;
        if (r10 != LayoutDirection.Ltr) goto L5;
        float r7 = this.f17041b;
    L6:
        float r82 = 1;
        float r63 = r62 * (r82 + this.f17042c);
        return androidx.compose.ui.unit.o.f((Math.round(r1 * (r7 + r82)) << 32) | (Math.round(r63) & 4294967295L));
    L5:
        r7 = (-1) * this.f17041b;
        goto L6
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (Float.compare(this.f17041b, r52.f17041b) == 0) goto L12;
        return false;
    L12:
        if (Float.compare(this.f17042c, r52.f17042c) == 0) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Float.hashCode(this.f17041b) * 31) + Float.hashCode(this.f17042c);
    }

    public String toString() {
        return "BiasAlignment(horizontalBias=" + this.f17041b + ", verticalBias=" + this.f17042c + ')';
    }
}
