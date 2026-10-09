package androidx.constraintlayout.core.motion.utils;

import com.clevertap.android.sdk.Constants;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public androidx.constraintlayout.core.motion.utils.b f21098a;

    /* renamed from: b, reason: collision with root package name */
    public b f21099b;

    /* renamed from: c, reason: collision with root package name */
    public String f21100c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public String f21101e;

    /* renamed from: f, reason: collision with root package name */
    public int f21102f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f21103g;

    public class a implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f21104a;

        public a(e r1) {
            this.f21104a = r1;
        }

        public int a(c r1, c r2) {
            throw null;
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Object r1, Object r2) {
            a.a.a.a.c.f.a(r1);
            a.a.a.a.c.f.a(r2);
            return a(null, null);
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f21105a;

        /* renamed from: b, reason: collision with root package name */
        public h f21106b;

        /* renamed from: c, reason: collision with root package name */
        public final int f21107c;
        public final int d;

        /* renamed from: e, reason: collision with root package name */
        public final int f21108e;

        /* renamed from: f, reason: collision with root package name */
        public float[] f21109f;

        /* renamed from: g, reason: collision with root package name */
        public double[] f21110g;

        /* renamed from: h, reason: collision with root package name */
        public float[] f21111h;

        /* renamed from: i, reason: collision with root package name */
        public float[] f21112i;

        /* renamed from: j, reason: collision with root package name */
        public float[] f21113j;

        /* renamed from: k, reason: collision with root package name */
        public float[] f21114k;

        /* renamed from: l, reason: collision with root package name */
        public int f21115l;

        /* renamed from: m, reason: collision with root package name */
        public androidx.constraintlayout.core.motion.utils.b f21116m;

        /* renamed from: n, reason: collision with root package name */
        public double[] f21117n;

        /* renamed from: o, reason: collision with root package name */
        public double[] f21118o;

        /* renamed from: p, reason: collision with root package name */
        public float f21119p;

        public b(int r3, String r4, int r5, int r6) {
            h r02 = new h();
            this.f21106b = r02;
            this.f21107c = 0;
            this.d = 1;
            this.f21108e = 2;
            this.f21115l = r3;
            this.f21105a = r5;
            r02.g(r3, r4);
            this.f21109f = new float[r6];
            this.f21110g = new double[r6];
            this.f21111h = new float[r6];
            this.f21112i = new float[r6];
            this.f21113j = new float[r6];
            this.f21114k = new float[r6];
        }

        public double a(float r14) {
            androidx.constraintlayout.core.motion.utils.b r02 = this.f21116m;
            if (r02 == null) goto L5;
            double r4 = r14;
            r02.g(r4, this.f21118o);
            this.f21116m.d(r4, this.f21117n);
        L6:
            double r5 = r14;
            double r11 = this.f21106b.e(r5, this.f21117n[1]);
            double r3 = this.f21106b.d(r5, this.f21117n[1], this.f21118o[1]);
            double[] r142 = this.f21118o;
            return (r142[0] + (r11 * r142[2])) + (r3 * this.f21117n[2]);
        L5:
            double[] r03 = this.f21118o;
            r03[0] = 0.0d;
            r03[1] = 0.0d;
            r03[2] = 0.0d;
            goto L6
        }

        public double b(float r10) {
            androidx.constraintlayout.core.motion.utils.b r02 = this.f21116m;
            if (r02 == null) goto L5;
            r02.d(r10, this.f21117n);
        L6:
            double[] r03 = this.f21117n;
            return r03[0] + (this.f21106b.e(r10, r03[1]) * this.f21117n[2]);
        L5:
            double[] r04 = this.f21117n;
            r04[0] = this.f21112i[0];
            r04[1] = this.f21113j[0];
            r04[2] = this.f21109f[0];
            goto L6
        }

        public void c(float r10) {
            this.f21119p = r10;
            double[][] r102 = (double[][]) Array.newInstance(Double.TYPE, new int[]{this.f21110g.length, 3});
            float[] r1 = this.f21109f;
            this.f21117n = new double[r1.length + 2];
            this.f21118o = new double[r1.length + 2];
            if (this.f21110g[0] <= 0.0d) goto L5;
            this.f21106b.a(0.0d, this.f21111h[0]);
        L5:
            double[] r12 = this.f21110g;
            int r4 = r12.length - 1;
            if (r12[r4] >= 1.0d) goto L8;
            this.f21106b.a(1.0d, this.f21111h[r4]);
        L8:
            int r13 = 0;
        L10:
            if (r13 >= r102.length) goto L12;
            double[] r42 = r102[r13];
            r42[0] = this.f21112i[r13];
            r42[1] = this.f21113j[r13];
            r42[2] = this.f21109f[r13];
            this.f21106b.a(this.f21110g[r13], this.f21111h[r13]);
            r13 = r13 + 1;
            goto L10
        L12:
            this.f21106b.f();
            double[] r02 = this.f21110g;
            if (r02.length <= 1) goto L16;
            this.f21116m = androidx.constraintlayout.core.motion.utils.b.a(0, r02, r102);
            return;
        L16:
            this.f21116m = null;
        }
    }

    public static class c {
    }

    public e() {
        this.d = 0;
        this.f21101e = null;
        this.f21102f = 0;
        this.f21103g = new ArrayList();
    }

    public float a(float r3) {
        return (float) this.f21099b.b(r3);
    }

    public float b(float r3) {
        return (float) this.f21099b.a(r3);
    }

    public void c(String r1) {
        this.f21100c = r1;
    }

    public void d(float r9) {
        int r02 = this.f21103g.size();
        if (r02 != 0) goto L5;
        return;
    L5:
        Collections.sort(this.f21103g, new a(this));
        double[] r1 = new double[r02];
        double[][] r2 = (double[][]) Array.newInstance(Double.TYPE, new int[]{r02, 3});
        this.f21099b = new b(this.d, this.f21101e, this.f21102f, r02);
        Iterator r03 = this.f21103g.iterator();
        if (r03.hasNext() == true) goto L9;
        this.f21099b.c(r9);
        this.f21098a = androidx.constraintlayout.core.motion.utils.b.a(0, r1, r2);
        return;
    L9:
        a.a.a.a.c.f.a(r03.next());
        throw null;
    }

    public boolean e() {
        if (this.f21102f != 1) goto L5;
        return true;
    L5:
        return false;
    }

    public String toString() {
        String r02 = this.f21100c;
        new DecimalFormat("##.##");
        Iterator r1 = this.f21103g.iterator();
        if (r1.hasNext() == true) goto L5;
        return r02;
    L5:
        a.a.a.a.c.f.a(r1.next());
        StringBuilder r12 = new StringBuilder();
        r12.append(r02);
        r12.append(Constants.AES_PREFIX);
        throw null;
    }
}
