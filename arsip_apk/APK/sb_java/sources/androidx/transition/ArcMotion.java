package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes4.dex */
public class ArcMotion extends PathMotion {

    /* renamed from: g, reason: collision with root package name */
    public static final float f28240g = 0.0f;

    /* renamed from: a, reason: collision with root package name */
    public float f28241a;

    /* renamed from: b, reason: collision with root package name */
    public float f28242b;

    /* renamed from: c, reason: collision with root package name */
    public float f28243c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f28244e;

    /* renamed from: f, reason: collision with root package name */
    public float f28245f;

    static {
        f28240g = (float) Math.tan(Math.toRadians(35.0d));
    }

    public ArcMotion(Context r5, AttributeSet r6) {
        super(r5, r6);
        this.f28241a = 0.0f;
        this.f28242b = 0.0f;
        this.f28243c = 70.0f;
        this.d = 0.0f;
        this.f28244e = 0.0f;
        this.f28245f = f28240g;
        TypedArray r52 = r5.obtainStyledAttributes(r6, AbstractC4171s.f28470j);
        XmlPullParser r62 = (XmlPullParser) r6;
        c(androidx.core.content.res.l.f(r52, r62, "minimumVerticalAngle", 1, 0.0f));
        b(androidx.core.content.res.l.f(r52, r62, "minimumHorizontalAngle", 0, 0.0f));
        a(androidx.core.content.res.l.f(r52, r62, "maximumAngle", 2, 70.0f));
        r52.recycle();
    }

    public static float d(float r2) {
        if (r2 < 0.0f) goto L9;
        if (r2 > 90.0f) goto L9;
        return (float) Math.tan(Math.toRadians(r2 / 2.0f));
    L9:
        throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
    }

    public void a(float r1) {
        this.f28243c = r1;
        this.f28245f = d(r1);
    }

    public void b(float r1) {
        this.f28241a = r1;
        this.d = d(r1);
    }

    public void c(float r1) {
        this.f28242b = r1;
        this.f28244e = d(r1);
    }

    @Override // androidx.transition.PathMotion
    public Path getPath(float r12, float r13, float r14, float r15) {
        Path r02 = new Path();
        r02.moveTo(r12, r13);
        float r1 = r14 - r12;
        float r2 = r15 - r13;
        float r3 = (r1 * r1) + (r2 * r2);
        float r4 = (r12 + r14) / 2.0f;
        float r6 = (r13 + r15) / 2.0f;
        float r7 = 0.25f * r3;
        if (r13 <= r15) goto L5;
        boolean r8 = true;
    L7:
        if (Math.abs(r1) >= Math.abs(r2)) goto L14;
        float r16 = Math.abs(r3 / (r2 * 2.0f));
        if (r8 == false) goto L11;
        float r17 = r16 + r15;
        float r22 = r14;
    L12:
        float r32 = this.f28244e;
    L13:
        float r82 = (r7 * r32) * r32;
        float r33 = r4 - r22;
        float r9 = r6 - r17;
        float r34 = (r33 * r33) + (r9 * r9);
        float r92 = this.f28245f;
        float r72 = (r7 * r92) * r92;
        if (r34 < r82) goto L27;
        if (r34 <= r72) goto L25;
        r82 = r72;
        goto L27
    L25:
        r82 = 0.0f;
    L27:
        if (r82 == 0.0f) goto L29;
        float r35 = (float) Math.sqrt(r82 / r34);
        r22 = ((r22 - r4) * r35) + r4;
        r17 = r6 + (r35 * (r17 - r6));
    L29:
        r02.cubicTo((r12 + r22) / 2.0f, (r13 + r17) / 2.0f, (r22 + r14) / 2.0f, (r17 + r15) / 2.0f, r14, r15);
        return r02;
    L11:
        r17 = r16 + r13;
        r22 = r12;
        goto L12
    L14:
        float r36 = r3 / (r1 * 2.0f);
        if (r8 == false) goto L17;
        r17 = r13;
        r22 = r36 + r12;
    L18:
        r32 = this.d;
        goto L13
    L17:
        r22 = r14 - r36;
        r17 = r15;
        goto L18
    L5:
        r8 = false;
        goto L7
    }
}
