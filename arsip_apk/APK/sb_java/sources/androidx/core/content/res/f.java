package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class f {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f22766a;

        /* renamed from: b, reason: collision with root package name */
        public final float[] f22767b;

        public a(List r5, List r6) {
            int r02 = r5.size();
            this.f22766a = new int[r02];
            this.f22767b = new float[r02];
            int r1 = 0;
        L3:
            if (r1 >= r02) goto L5;
            this.f22766a[r1] = ((Integer) r5.get(r1)).intValue();
            this.f22767b[r1] = ((Float) r6.get(r1)).floatValue();
            r1 = r1 + 1;
            goto L3
        }

        public a(int r1, int r2) {
            this.f22766a = new int[]{r1, r2};
            this.f22767b = new float[]{0.0f, 1.0f};
        }

        public a(int r1, int r2, int r3) {
            this.f22766a = new int[]{r1, r2, r3};
            this.f22767b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }

    public static a a(a r02, int r1, int r2, boolean r3, int r4) {
        if (r02 == null) goto L4;
        return r02;
    L4:
        if (r3 == false) goto L8;
        return new a(r1, r4, r2);
    L8:
        return new a(r1, r2);
    }

    public static Shader b(Resources r20, XmlPullParser r21, AttributeSet r22, Resources.Theme r23) {
        String r1 = r21.getName();
        if (r1.equals("gradient") == false) goto L19;
        TypedArray r12 = l.k(r20, r23, r22, androidx.core.i.f22916B);
        float r9 = l.f(r12, r21, "startX", androidx.core.i.f22925K, 0.0f);
        float r10 = l.f(r12, r21, "startY", androidx.core.i.f22926L, 0.0f);
        float r11 = l.f(r12, r21, "endX", androidx.core.i.f22927M, 0.0f);
        float r122 = l.f(r12, r21, "endY", androidx.core.i.f22928N, 0.0f);
        float r14 = l.f(r12, r21, "centerX", androidx.core.i.f22920F, 0.0f);
        float r15 = l.f(r12, r21, "centerY", androidx.core.i.f22921G, 0.0f);
        int r5 = l.g(r12, r21, "type", androidx.core.i.f22919E, 0);
        int r6 = l.b(r12, r21, "startColor", androidx.core.i.f22917C, 0);
        boolean r7 = l.j(r21, "centerColor");
        int r2 = l.b(r12, r21, "centerColor", androidx.core.i.f22924J, 0);
        int r3 = l.b(r12, r21, "endColor", androidx.core.i.f22918D, 0);
        int r4 = l.g(r12, r21, "tileMode", androidx.core.i.f22923I, 0);
        float r8 = l.f(r12, r21, "gradientRadius", androidx.core.i.f22922H, 0.0f);
        r12.recycle();
        a r02 = a(c(r20, r21, r22, r23), r6, r3, r7, r2);
        if (r5 == 1) goto L13;
        if (r5 == 2) goto L11;
        return new LinearGradient(r9, r10, r11, r122, r02.f22766a, r02.f22767b, d(r4));
    L11:
        return new SweepGradient(r14, r15, r02.f22766a, r02.f22767b);
    L13:
        if (r8 <= 0.0f) goto L17;
        return new RadialGradient(r14, r15, r8, r02.f22766a, r02.f22767b, d(r4));
    L17:
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    L19:
        throw new XmlPullParserException(r21.getPositionDescription() + ": invalid gradient color tag " + r1);
    }

    public static a c(Resources r8, XmlPullParser r9, AttributeSet r10, Resources.Theme r11) {
        int r02 = r9.getDepth() + 1;
        ArrayList r2 = new ArrayList(20);
        ArrayList r4 = new ArrayList(20);
    L3:
        int r3 = r9.next();
        if (r3 == 1) goto L23;
        int r5 = r9.getDepth();
        if (r5 >= r02) goto L10;
        if (r3 == 3) goto L23;
    L10:
        if (r3 != 2) goto L3;
        if (r5 > r02) goto L3;
        if (r9.getName().equals("item") == false) goto L3;
        TypedArray r32 = l.k(r8, r11, r10, androidx.core.i.f22929O);
        boolean r52 = r32.hasValue(androidx.core.i.f22930P);
        boolean r6 = r32.hasValue(androidx.core.i.f22931Q);
        if (r52 == false) goto L21;
        if (r6 == false) goto L21;
        int r53 = r32.getColor(androidx.core.i.f22930P, 0);
        float r62 = r32.getFloat(androidx.core.i.f22931Q, 0.0f);
        r32.recycle();
        r4.add(Integer.valueOf(r53));
        r2.add(Float.valueOf(r62));
    L21:
        throw new XmlPullParserException(r9.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
    L23:
        if (r4.size() > 0) goto L25;
        return null;
    L25:
        return new a(r4, r2);
    }

    public static Shader.TileMode d(int r1) {
        if (r1 == 1) goto L11;
        if (r1 == 2) goto L9;
        return Shader.TileMode.CLAMP;
    L9:
        return Shader.TileMode.MIRROR;
    L11:
        return Shader.TileMode.REPEAT;
    }
}
