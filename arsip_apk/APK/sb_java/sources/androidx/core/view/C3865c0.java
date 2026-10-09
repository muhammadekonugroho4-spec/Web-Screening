package androidx.core.view;

import android.view.MotionEvent;

/* renamed from: androidx.core.view.c0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3865c0 {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f23210a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f23211b;

    /* renamed from: c, reason: collision with root package name */
    public float f23212c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f23213e;

    public C3865c0() {
        this.f23210a = new float[20];
        this.f23211b = new long[20];
        this.f23212c = 0.0f;
        this.d = 0;
        this.f23213e = 0;
    }

    public static float f(float r3) {
        if (r3 >= 0.0f) goto L5;
        float r02 = -1.0f;
    L7:
        return r02 * ((float) Math.sqrt(Math.abs(r3) * 2.0f));
    L5:
        r02 = 1.0f;
        goto L7
    }

    public void a(MotionEvent r7) {
        long r02 = r7.getEventTime();
        if (this.d != 0) goto L5;
    L7:
        int r2 = (this.f23213e + 1) % 20;
        this.f23213e = r2;
        int r4 = this.d;
        if (r4 == 20) goto L10;
        this.d = r4 + 1;
    L10:
        this.f23210a[r2] = r7.getAxisValue(26);
        this.f23211b[this.f23213e] = r02;
        return;
    L5:
        if ((r02 - this.f23211b[this.f23213e]) <= 40) goto L7;
        b();
        goto L7
    }

    public final void b() {
        this.d = 0;
        this.f23212c = 0.0f;
    }

    public void c(int r2, float r3) {
        float r02 = e() * r2;
        this.f23212c = r02;
        if (r02 >= (-Math.abs(r3))) goto L7;
        this.f23212c = -Math.abs(r3);
        return;
    L7:
        if (this.f23212c <= Math.abs(r3)) goto L10;
        this.f23212c = Math.abs(r3);
        return;
    }

    public float d(int r2) {
        if (r2 == 26) goto L7;
        return 0.0f;
    L7:
        return this.f23212c;
    }

    public final float e() {
        int r02 = this.d;
        if (r02 >= 2) goto L5;
        return 0.0f;
    L5:
        int r3 = this.f23213e;
        int r4 = ((r3 + 20) - (r02 - 1)) % 20;
        long r6 = this.f23211b[r3];
    L6:
        long[] r03 = this.f23211b;
        long r8 = r03[r4];
        if ((r6 - r8) <= 100) goto L9;
        this.d--;
        r4 = (r4 + 1) % 20;
        goto L6
    L9:
        int r32 = this.d;
        if (r32 >= 2) goto L12;
        return 0.0f;
    L12:
        if (r32 != 2) goto L18;
        int r42 = (r4 + 1) % 20;
        if (r8 != r03[r42]) goto L17;
        return 0.0f;
    L17:
        return this.f23210a[r42] / (r2 - r8);
    L18:
        int r04 = 0;
        float r2 = 0.0f;
        int r1 = 0;
    L20:
        if (r04 >= (this.d - 1)) goto L29;
        int r33 = r04 + r4;
        long[] r62 = this.f23211b;
        long r7 = r62[r33 % 20];
        int r34 = (r33 + 1) % 20;
        if (r62[r34] == r7) goto L27;
        r1 = r1 + 1;
        float r63 = f(r2);
        float r9 = this.f23210a[r34] / (this.f23211b[r34] - r7);
        r2 = r2 + ((r9 - r63) * Math.abs(r9));
        if (r1 != 1) goto L27;
        r2 = r2 * 0.5f;
    L27:
        r04 = r04 + 1;
        goto L20
    L29:
        return f(r2);
    }
}
