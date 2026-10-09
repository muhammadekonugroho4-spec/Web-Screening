package androidx.camera.core.impl.utils;

import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Rational f5512a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final Rational f5513b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final Rational f5514c = null;
    public static final Rational d = null;

    /* renamed from: androidx.camera.core.impl.utils.a$a, reason: collision with other inner class name */
    public static final class C0051a implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        public final Rational f5515a;

        /* renamed from: b, reason: collision with root package name */
        public final RectF f5516b;

        /* renamed from: c, reason: collision with root package name */
        public final Rational f5517c;

        public C0051a(Rational r3, Rational r4) {
            this.f5515a = r3;
            if (r4 != null) goto L6;
            r4 = new Rational(4, 3);
        L6:
            this.f5517c = r4;
            this.f5516b = d(r3);
        }

        public int a(Rational r3, Rational r4) {
            if (r3.equals(r4) == false) goto L6;
            return 0;
        L6:
            RectF r32 = d(r3);
            RectF r42 = d(r4);
            boolean r02 = e(r32, this.f5516b);
            boolean r1 = e(r42, this.f5516b);
            if (r02 == false) goto L11;
            if (r1 == false) goto L11;
            return (int) Math.signum(b(r32) - b(r42));
        L11:
            if (r02 == false) goto L14;
            return -1;
        L14:
            if (r1 == false) goto L18;
            return 1;
        L18:
            return -((int) Math.signum(c(r32, this.f5516b) - c(r42, this.f5516b)));
        }

        public final float b(RectF r2) {
            return r2.width() * r2.height();
        }

        public final float c(RectF r4, RectF r5) {
            if (r4.width() >= r5.width()) goto L5;
            float r02 = r4.width();
        L7:
            if (r4.height() >= r5.height()) goto L9;
            float r42 = r4.height();
        L11:
            return r02 * r42;
        L9:
            r42 = r5.height();
            goto L11
        L5:
            r02 = r5.width();
            goto L7
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Object r1, Object r2) {
            return a((Rational) r1, (Rational) r2);
        }

        public final RectF d(Rational r6) {
            if (r6.floatValue() != this.f5517c.floatValue()) goto L7;
            return new RectF(0.0f, 0.0f, this.f5517c.getNumerator(), this.f5517c.getDenominator());
        L7:
            if (r6.floatValue() <= this.f5517c.floatValue()) goto L11;
            return new RectF(0.0f, 0.0f, this.f5517c.getNumerator(), (r6.getDenominator() * this.f5517c.getNumerator()) / r6.getNumerator());
        L11:
            return new RectF(0.0f, 0.0f, (r6.getNumerator() * this.f5517c.getDenominator()) / r6.getDenominator(), this.f5517c.getDenominator());
        }

        public final boolean e(RectF r3, RectF r4) {
            if (r3.width() >= r4.width()) goto L5;
            return false;
        L5:
            if (r3.height() < r4.height()) goto L10;
            return true;
        L10:
            return false;
        }
    }

    static {
        f5512a = new Rational(4, 3);
        f5513b = new Rational(3, 4);
        f5514c = new Rational(16, 9);
        d = new Rational(9, 16);
    }

    public static boolean a(Size r1, Rational r2) {
        return b(r1, r2, androidx.camera.core.internal.utils.c.f5722c);
    }

    public static boolean b(Size r4, Rational r5, Size r6) {
        if (r5 != null) goto L6;
        return false;
    L6:
        if (r5.equals(new Rational(r4.getWidth(), r4.getHeight())) == false) goto L10;
        return true;
    L10:
        if (androidx.camera.core.internal.utils.c.b(r4) >= androidx.camera.core.internal.utils.c.b(r6)) goto L12;
        return false;
    L12:
        return c(r4, r5);
    }

    public static boolean c(Size r5, Rational r6) {
        int r02 = r5.getWidth();
        int r52 = r5.getHeight();
        Rational r1 = new Rational(r6.getDenominator(), r6.getNumerator());
        int r2 = r02 % 16;
        if (r2 == 0) goto L5;
    L14:
        if (r2 != 0) goto L18;
        return d(r52, r02, r6);
    L18:
        if ((r52 % 16) == 0) goto L20;
        return false;
    L20:
        return d(r02, r52, r1);
    L5:
        if ((r52 % 16) != 0) goto L14;
        if (d(Math.max(0, r52 - 16), r02, r6) == false) goto L9;
        return true;
    L9:
        if (d(Math.max(0, r02 - 16), r52, r1) == true) goto L22;
        return false;
    L22:
        return true;
    }

    public static boolean d(int r7, int r8, Rational r9) {
        if ((r8 % 16) != 0) goto L5;
        boolean r02 = true;
    L6:
        androidx.core.util.h.a(r02);
        double r3 = (r7 * r9.getNumerator()) / r9.getDenominator();
        if (r3 > Math.max(0, r8 - 16)) goto L9;
    L11:
        return false;
    L9:
        if (r3 >= (r8 + 16)) goto L11;
        return true;
    L5:
        r02 = false;
        goto L6
    }
}
