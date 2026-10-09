package androidx.transition;

import java.util.Arrays;

/* loaded from: classes4.dex */
public class H {

    /* renamed from: a, reason: collision with root package name */
    public long[] f28337a;

    /* renamed from: b, reason: collision with root package name */
    public float[] f28338b;

    /* renamed from: c, reason: collision with root package name */
    public int f28339c;

    public H() {
        long[] r1 = new long[20];
        this.f28337a = r1;
        this.f28338b = new float[20];
        this.f28339c = 0;
        Arrays.fill(r1, Long.MIN_VALUE);
    }

    public void a(long r3, float r5) {
        int r02 = (this.f28339c + 1) % 20;
        this.f28339c = r02;
        this.f28337a[r02] = r3;
        this.f28338b[r02] = r5;
    }

    public float b() {
        int r02 = this.f28339c;
        if (r02 == 0) goto L5;
    L7:
        long r5 = this.f28337a[r02];
        int r4 = 0;
        long r7 = r5;
    L8:
        long r10 = this.f28337a[r02];
        if (r10 == Long.MIN_VALUE) goto L23;
        float r9 = r5 - r10;
        float r72 = Math.abs(r10 - r7);
        if (r9 > 100.0f) goto L23;
        if (r72 > 40.0f) goto L23;
        if (r02 != 0) goto L18;
        r02 = 20;
    L18:
        r02 = r02 - 1;
        r4 = r4 + 1;
        if (r4 >= 20) goto L23;
        r7 = r10;
    L23:
        if (r4 >= 2) goto L26;
        return 0.0f;
    L26:
        if (r4 != 2) goto L37;
        int r03 = this.f28339c;
        if (r03 != 0) goto L30;
        int r2 = 19;
    L31:
        long[] r42 = this.f28337a;
        float r43 = r42[r03] - r42[r2];
        if (r43 != 0.0f) goto L34;
        return 0.0f;
    L34:
        float[] r3 = this.f28338b;
        float r04 = (r3[r03] - r3[r2]) / r43;
    L36:
        return r04 * 1000.0f;
    L30:
        r2 = r03 - 1;
        goto L31
    L37:
        int r05 = this.f28339c;
        int r22 = ((r05 - r4) + 21) % 20;
        int r06 = (r05 + 21) % 20;
        long r52 = this.f28337a[r22];
        float r44 = this.f28338b[r22];
        int r23 = r22 + 1;
        int r73 = r23 % 20;
        float r8 = 0.0f;
    L38:
        if (r73 == r06) goto L47;
        long r102 = this.f28337a[r73];
        float r92 = r102 - r52;
        if (r92 == 0.0f) goto L46;
        float r53 = this.f28338b[r73];
        float r45 = (r53 - r44) / r92;
        r8 = r8 + ((r45 - c(r8)) * Math.abs(r45));
        if (r73 != r23) goto L45;
        r8 = r8 * 0.5f;
    L45:
        r44 = r53;
        r52 = r102;
    L46:
        r73 = (r73 + 1) % 20;
        goto L38
    L47:
        r04 = c(r8);
        goto L36
    L5:
        if (this.f28337a[r02] != Long.MIN_VALUE) goto L7;
        return 0.0f;
    }

    public final float c(float r5) {
        return (float) (Math.signum(r5) * Math.sqrt(Math.abs(r5) * 2.0f));
    }
}
