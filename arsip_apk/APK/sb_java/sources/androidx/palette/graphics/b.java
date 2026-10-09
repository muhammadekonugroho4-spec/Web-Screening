package androidx.palette.graphics;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.SparseBooleanArray;
import androidx.collection.C2337a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    public static final c f27076f = null;

    /* renamed from: a, reason: collision with root package name */
    public final List f27077a;

    /* renamed from: b, reason: collision with root package name */
    public final List f27078b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f27079c;
    public final SparseBooleanArray d;

    /* renamed from: e, reason: collision with root package name */
    public final d f27080e;

    public static class a implements c {
        public a() {
        }

        @Override // androidx.palette.graphics.b.c
        public boolean a(int r1, float[] r2) {
            if (d(r2) == false) goto L5;
            return false;
        L5:
            if (b(r2) == false) goto L7;
            return false;
        L7:
            if (c(r2) == true) goto L13;
            return true;
        L13:
            return false;
        }

        public final boolean b(float[] r2) {
            if (r2[2] > 0.05f) goto L6;
            return true;
        L6:
            return false;
        }

        public final boolean c(float[] r4) {
            float r1 = r4[0];
            if (r1 >= 10.0f) goto L5;
        L9:
            return false;
        L5:
            if (r1 > 37.0f) goto L9;
            if (r4[1] > 0.82f) goto L9;
            return true;
        }

        public final boolean d(float[] r2) {
            if (r2[2] < 0.95f) goto L6;
            return true;
        L6:
            return false;
        }
    }

    /* renamed from: androidx.palette.graphics.b$b, reason: collision with other inner class name */
    public static final class C0234b {

        /* renamed from: a, reason: collision with root package name */
        public final List f27081a;

        /* renamed from: b, reason: collision with root package name */
        public final Bitmap f27082b;

        /* renamed from: c, reason: collision with root package name */
        public final List f27083c;
        public int d;

        /* renamed from: e, reason: collision with root package name */
        public int f27084e;

        /* renamed from: f, reason: collision with root package name */
        public int f27085f;

        /* renamed from: g, reason: collision with root package name */
        public final List f27086g;

        /* renamed from: h, reason: collision with root package name */
        public Rect f27087h;

        public C0234b(Bitmap r4) {
            ArrayList r02 = new ArrayList();
            this.f27083c = r02;
            this.d = 16;
            this.f27084e = 12544;
            this.f27085f = -1;
            ArrayList r1 = new ArrayList();
            this.f27086g = r1;
            if (r4 == null) goto L9;
            if (r4.isRecycled() == true) goto L9;
            r1.add(b.f27076f);
            this.f27082b = r4;
            this.f27081a = null;
            r02.add(androidx.palette.graphics.c.f27096e);
            r02.add(androidx.palette.graphics.c.f27097f);
            r02.add(androidx.palette.graphics.c.f27098g);
            r02.add(androidx.palette.graphics.c.f27099h);
            r02.add(androidx.palette.graphics.c.f27100i);
            r02.add(androidx.palette.graphics.c.f27101j);
            return;
        L9:
            throw new IllegalArgumentException("Bitmap is not valid");
        }

        public b a() {
            Bitmap r02 = this.f27082b;
            if (r02 == null) goto L16;
            Bitmap r03 = c(r02);
            Rect r1 = this.f27087h;
            if (r03 == this.f27082b) goto L8;
            if (r1 == null) goto L8;
            double r2 = r03.getWidth() / this.f27082b.getWidth();
            r1.left = (int) Math.floor(r1.left * r2);
            r1.top = (int) Math.floor(r1.top * r2);
            r1.right = Math.min((int) Math.ceil(r1.right * r2), r03.getWidth());
            r1.bottom = Math.min((int) Math.ceil(r1.bottom * r2), r03.getHeight());
        L8:
            int[] r22 = b(r03);
            int r3 = this.d;
            if (this.f27086g.isEmpty() == false) goto L11;
            c[] r4 = null;
        L12:
            androidx.palette.graphics.a r12 = new androidx.palette.graphics.a(r22, r3, r4);
            if (r03 == this.f27082b) goto L15;
            r03.recycle();
        L15:
            List r04 = r12.d();
        L18:
            b r13 = new b(r04, this.f27083c);
            r13.c();
            return r13;
        L11:
            List r42 = this.f27086g;
            r4 = (c[]) r42.toArray(new c[r42.size()]);
            goto L12
        L16:
            r04 = this.f27081a;
            if (r04 != null) goto L18;
            throw new AssertionError();
        }

        public final int[] b(Bitmap r9) {
            int r3 = r9.getWidth();
            int r7 = r9.getHeight();
            int[] r1 = new int[r3 * r7];
            r9.getPixels(r1, 0, r3, 0, 0, r3, r7);
            Rect r92 = this.f27087h;
            if (r92 != null) goto L5;
            return r1;
        L5:
            int r93 = r92.width();
            int r02 = this.f27087h.height();
            int[] r2 = new int[r93 * r02];
            int r4 = 0;
        L6:
            if (r4 >= r02) goto L8;
            Rect r5 = this.f27087h;
            System.arraycopy(r1, ((r5.top + r4) * r3) + r5.left, r2, r4 * r93, r93);
            r4 = r4 + 1;
            goto L6
        L8:
            return r2;
        }

        public final Bitmap c(Bitmap r6) {
            double r1 = -1.0d;
            if (this.f27084e <= 0) goto L8;
            int r02 = r6.getWidth() * r6.getHeight();
            int r3 = this.f27084e;
            if (r02 <= r3) goto L13;
            r1 = Math.sqrt(r3 / r02);
        L13:
            if (r1 > 0.0d) goto L16;
            return r6;
        L16:
            return Bitmap.createScaledBitmap(r6, (int) Math.ceil(r6.getWidth() * r1), (int) Math.ceil(r6.getHeight() * r1), false);
        L8:
            if (this.f27085f <= 0) goto L13;
            int r03 = Math.max(r6.getWidth(), r6.getHeight());
            int r32 = this.f27085f;
            if (r03 <= r32) goto L13;
            r1 = r32 / r03;
            goto L13
        }
    }

    public interface c {
        boolean a(int r1, float[] r2);
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f27088a;

        /* renamed from: b, reason: collision with root package name */
        public final int f27089b;

        /* renamed from: c, reason: collision with root package name */
        public final int f27090c;
        public final int d;

        /* renamed from: e, reason: collision with root package name */
        public final int f27091e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f27092f;

        /* renamed from: g, reason: collision with root package name */
        public int f27093g;

        /* renamed from: h, reason: collision with root package name */
        public int f27094h;

        /* renamed from: i, reason: collision with root package name */
        public float[] f27095i;

        public d(int r2, int r3) {
            this.f27088a = Color.red(r2);
            this.f27089b = Color.green(r2);
            this.f27090c = Color.blue(r2);
            this.d = r2;
            this.f27091e = r3;
        }

        public final void a() {
            if (this.f27092f == true) goto L23;
            int r02 = androidx.core.graphics.d.g(-1, this.d, 4.5f);
            int r3 = androidx.core.graphics.d.g(-1, this.d, 3.0f);
            if (r02 == (-1)) goto L9;
            if (r3 == (-1)) goto L9;
            this.f27094h = androidx.core.graphics.d.p(-1, r02);
            this.f27093g = androidx.core.graphics.d.p(-1, r3);
            this.f27092f = true;
            return;
        L9:
            int r2 = androidx.core.graphics.d.g(-16777216, this.d, 4.5f);
            int r4 = androidx.core.graphics.d.g(-16777216, this.d, 3.0f);
            if (r2 == (-1)) goto L14;
            if (r4 == (-1)) goto L14;
            this.f27094h = androidx.core.graphics.d.p(-16777216, r2);
            this.f27093g = androidx.core.graphics.d.p(-16777216, r4);
            this.f27092f = true;
            return;
        L14:
            if (r02 == (-1)) goto L16;
            int r03 = androidx.core.graphics.d.p(-1, r02);
        L17:
            this.f27094h = r03;
            if (r3 == (-1)) goto L20;
            int r04 = androidx.core.graphics.d.p(-1, r3);
        L21:
            this.f27093g = r04;
            this.f27092f = true;
            return;
        L20:
            r04 = androidx.core.graphics.d.p(-16777216, r4);
            goto L21
        L16:
            r03 = androidx.core.graphics.d.p(-16777216, r2);
            goto L17
        }

        public int b() {
            a();
            return this.f27094h;
        }

        public float[] c() {
            if (this.f27095i != null) goto L5;
            this.f27095i = new float[3];
        L5:
            androidx.core.graphics.d.a(this.f27088a, this.f27089b, this.f27090c, this.f27095i);
            return this.f27095i;
        }

        public int d() {
            return this.f27091e;
        }

        public int e() {
            return this.d;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if (r5 != null) goto L8;
        L15:
            return false;
        L8:
            if (d.class != r5.getClass()) goto L15;
            d r52 = (d) r5;
            if (this.f27091e != r52.f27091e) goto L15;
            if (this.d != r52.d) goto L15;
            return true;
        }

        public int f() {
            a();
            return this.f27093g;
        }

        public int hashCode() {
            return (this.d * 31) + this.f27091e;
        }

        public String toString() {
            return d.class.getSimpleName() + " [RGB: #" + Integer.toHexString(e()) + "] [HSL: " + Arrays.toString(c()) + "] [Population: " + this.f27091e + "] [Title Text: #" + Integer.toHexString(f()) + "] [Body Text: #" + Integer.toHexString(b()) + ']';
        }
    }

    static {
        f27076f = new a();
    }

    public b(List r1, List r2) {
        this.f27077a = r1;
        this.f27078b = r2;
        this.d = new SparseBooleanArray();
        this.f27079c = new C2337a();
        this.f27080e = a();
    }

    public static C0234b b(Bitmap r1) {
        return new C0234b(r1);
    }

    public final d a() {
        int r02 = this.f27077a.size();
        int r1 = Integer.MIN_VALUE;
        d r2 = null;
        int r3 = 0;
    L3:
        if (r3 >= r02) goto L8;
        d r4 = (d) this.f27077a.get(r3);
        if (r4.d() <= r1) goto L7;
        r1 = r4.d();
        r2 = r4;
    L7:
        r3 = r3 + 1;
        goto L3
    L8:
        return r2;
    }

    public void c() {
        int r02 = this.f27078b.size();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L5;
        androidx.palette.graphics.c r2 = (androidx.palette.graphics.c) this.f27078b.get(r1);
        r2.k();
        this.f27079c.put(r2, e(r2));
        r1 = r1 + 1;
        goto L3
    L5:
        this.d.clear();
    }

    public final float d(d r8, androidx.palette.graphics.c r9) {
        float[] r02 = r8.c();
        d r1 = this.f27080e;
        if (r1 == null) goto L5;
        int r12 = r1.d();
    L6:
        float r4 = 0.0f;
        if (r9.g() <= 0.0f) goto L9;
        float r3 = r9.g() * (1.0f - Math.abs(r02[1] - r9.i()));
    L11:
        if (r9.a() <= 0.0f) goto L13;
        float r2 = r9.a() * (1.0f - Math.abs(r02[2] - r9.h()));
    L15:
        if (r9.f() <= 0.0f) goto L18;
        r4 = r9.f() * (r8.d() / r12);
    L18:
        return (r3 + r2) + r4;
    L13:
        r2 = 0.0f;
        goto L15
    L9:
        r3 = 0.0f;
        goto L11
    L5:
        r12 = 1;
        goto L6
    }

    public final d e(androidx.palette.graphics.c r4) {
        d r02 = g(r4);
        if (r02 != null) goto L5;
    L7:
        return r02;
    L5:
        if (r4.j() == false) goto L7;
        this.d.append(r02.e(), true);
        goto L7
    }

    public d f() {
        return this.f27080e;
    }

    public final d g(androidx.palette.graphics.c r8) {
        int r02 = this.f27077a.size();
        float r1 = 0.0f;
        d r2 = null;
        int r3 = 0;
    L3:
        if (r3 >= r02) goto L12;
        d r4 = (d) this.f27077a.get(r3);
        if (h(r4, r8) == false) goto L11;
        float r5 = d(r4, r8);
        if (r2 != null) goto L9;
    L10:
        r2 = r4;
        r1 = r5;
        goto L11
    L9:
        if (r5 > r1) goto L10;
    L11:
        r3 = r3 + 1;
        goto L3
    L12:
        return r2;
    }

    public final boolean h(d r6, androidx.palette.graphics.c r7) {
        float[] r02 = r6.c();
        if (r02[1] >= r7.e()) goto L5;
        return false;
    L5:
        if (r02[1] <= r7.c()) goto L7;
        return false;
    L7:
        if (r02[2] >= r7.d()) goto L9;
        return false;
    L9:
        if (r02[2] <= r7.b()) goto L11;
        return false;
    L11:
        if (this.d.get(r6.e()) == true) goto L18;
        return true;
    L18:
        return false;
    }
}
