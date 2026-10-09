package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes4.dex */
public class PatternPathMotion extends PathMotion {

    /* renamed from: a, reason: collision with root package name */
    public Path f28351a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f28352b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f28353c;

    public PatternPathMotion(Context r3, AttributeSet r4) {
        this.f28352b = new Path();
        this.f28353c = new Matrix();
        TypedArray r32 = r3.obtainStyledAttributes(r4, AbstractC4171s.f28471k);
        String r42 = androidx.core.content.res.l.i(r32, (XmlPullParser) r4, "patternPathData", 0);     // Catch: Throwable -> L8
        if (r42 == null) goto L11;
        b(androidx.core.graphics.g.e(r42));     // Catch: Throwable -> L8
        r32.recycle();
        return;
    L11:
        throw new RuntimeException("pathData must be supplied for patternPathMotion");     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        r32.recycle();
        throw th;
    }

    public static float a(float r02, float r1) {
        return (float) Math.sqrt((r02 * r02) + (r1 * r1));
    }

    public void b(Path r9) {
        PathMeasure r02 = new PathMeasure(r9, false);
        float[] r3 = new float[2];
        r02.getPosTan(r02.getLength(), r3, null);
        float r2 = r3[0];
        float r6 = r3[1];
        r02.getPosTan(0.0f, r3, null);
        float r03 = r3[0];
        float r1 = r3[1];
        if (r03 == r2) goto L5;
    L9:
        this.f28353c.setTranslate(-r03, -r1);
        float r22 = r2 - r03;
        float r62 = r6 - r1;
        float r12 = 1.0f / a(r22, r62);
        this.f28353c.postScale(r12, r12);
        this.f28353c.postRotate((float) Math.toDegrees(-Math.atan2(r62, r22)));
        r9.transform(this.f28353c, this.f28352b);
        this.f28351a = r9;
        return;
    L5:
        if (r1 != r6) goto L9;
        throw new IllegalArgumentException("pattern must not end at the starting point");
    }

    @Override // androidx.transition.PathMotion
    public Path getPath(float r4, float r5, float r6, float r7) {
        float r62 = r6 - r4;
        float r72 = r7 - r5;
        float r02 = a(r62, r72);
        double r63 = Math.atan2(r72, r62);
        this.f28353c.setScale(r02, r02);
        this.f28353c.postRotate((float) Math.toDegrees(r63));
        this.f28353c.postTranslate(r4, r5);
        Path r42 = new Path();
        this.f28352b.transform(this.f28353c, r42);
        return r42;
    }

    public PatternPathMotion(Path r2) {
        this.f28352b = new Path();
        this.f28353c = new Matrix();
        b(r2);
    }
}
