package androidx.compose.ui.graphics;

import androidx.collection.C2343g;

/* renamed from: androidx.compose.ui.graphics.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3510d0 {
    public static final /* synthetic */ int a(float r02, float[] r1, int r2) {
        return g(r02, r1, r2);
    }

    public static final long b(float r5, float r6, float r7, float r8, float[] r9, int r10) {
        float r02 = (r6 - r5) * 3.0f;
        float r2 = (r7 - r6) * 3.0f;
        float r3 = (r8 - r7) * 3.0f;
        int r1 = f(r02, r2, r3, r9, r10);
        float r03 = (r2 - r02) * 2.0f;
        float r32 = (r3 - r2) * 2.0f;
        float r22 = (-r03) / (r32 - r03);
        int r12 = r1 + a(r22, r9, r10 + r1);
        float r102 = Math.min(r5, r8);
        float r04 = Math.max(r5, r8);
        int r23 = 0;
    L3:
        if (r23 >= r12) goto L6;
        float r33 = d(r5, r6, r7, r8, r9[r23]);
        r102 = Math.min(r102, r33);
        r04 = Math.max(r04, r33);
        r23 = r23 + 1;
        goto L3
    L6:
        return C2343g.b(r102, r04);
    }

    public static final float c(float r2, float r3, float r4) {
        float r1 = (r2 - r3) + 0.33333334f;
        float r12 = r1 * r4;
        return ((((r12 + (r3 - (2.0f * r2))) * r4) + r2) * 3.0f) * r4;
    }

    public static final float d(float r2, float r3, float r4, float r5, float r6) {
        float r52 = (r5 + ((r3 - r4) * 3.0f)) - r2;
        float r42 = ((r4 - (2.0f * r3)) + r2) * 3.0f;
        float r53 = ((r52 * r6) + r42) * r6;
        return ((r53 + ((r3 - r2) * 3.0f)) * r6) + r2;
    }

    public static final float e(float r21, float r22, float r23, float r24) {
        double r3 = r21;
        double r5 = ((r3 - (r22 * 2.0d)) + r23) * 3.0d;
        double r11 = (r22 - r21) * 3.0d;
        double r13 = ((-r21) + ((r22 - r23) * 3.0d)) + r24;
        float r16 = 1.0f;
        float r19 = 0.0f;
        if (Math.abs(r13 - 0.0d) < 1.0E-7d) goto L5;
        double r52 = r5 / r13;
        double r112 = r11 / r13;
        double r32 = r3 / r13;
        double r132 = ((r112 * 3.0d) - (r52 * r52)) / 9.0d;
        double r7 = (((((2.0d * r52) * r52) * r52) - ((9.0d * r52) * r112)) + (r32 * 27.0d)) / 54.0d;
        double r113 = (r132 * r132) * r132;
        double r2 = (r7 * r7) + r113;
        double r53 = r52 / 3.0d;
        if (r2 >= 0.0d) goto L92;
        double r25 = Math.sqrt(-r113);
        double r72 = (-r7) / r25;
        if (r72 >= (-1.0d)) goto L52;
        r72 = -1.0d;
    L52:
        if (r72 <= 1.0d) goto L54;
        r72 = 1.0d;
    L54:
        double r73 = Math.acos(r72);
        double r02 = androidx.compose.ui.util.d.a((float) r25) * 2.0f;
        float r26 = (float) ((Math.cos(r73 / 3.0d) * r02) - r53);
        if (r26 >= 0.0f) goto L57;
        float r33 = 0.0f;
    L59:
        if (r33 <= 1.0f) goto L62;
        r33 = 1.0f;
    L62:
        if (Math.abs(r33 - r26) <= 1.05E-6f) goto L65;
        r33 = Float.NaN;
    L65:
        if (Float.isNaN(r33) == true) goto L67;
        return r33;
    L67:
        float r27 = (float) ((Math.cos((6.283185307179586d + r73) / 3.0d) * r02) - r53);
        if (r27 >= 0.0f) goto L70;
        float r34 = 0.0f;
    L72:
        if (r34 <= 1.0f) goto L75;
        r34 = 1.0f;
    L75:
        if (Math.abs(r34 - r27) <= 1.05E-6f) goto L78;
        r34 = Float.NaN;
    L78:
        if (Float.isNaN(r34) == true) goto L80;
        return r34;
    L80:
        float r03 = (float) ((r02 * Math.cos((r73 + 12.566370614359172d) / 3.0d)) - r53);
        if (r03 < 0.0f) goto L85;
        r19 = r03;
    L85:
        if (r19 > 1.0f) goto L89;
        r16 = r19;
    L89:
        if (Math.abs(r16 - r03) <= 1.05E-6f) goto L91;
        return Float.NaN;
    L91:
        return r16;
    L70:
        r34 = r27;
        goto L72
    L57:
        r33 = r26;
        goto L59
    L92:
        if (r2 != 0.0d) goto L118;
        float r04 = -androidx.compose.ui.util.d.a((float) r7);
        float r28 = (float) r53;
        float r1 = (2.0f * r04) - r28;
        if (r1 >= 0.0f) goto L96;
        float r35 = 0.0f;
    L98:
        if (r35 <= 1.0f) goto L101;
        r35 = 1.0f;
    L101:
        if (Math.abs(r35 - r1) <= 1.05E-6f) goto L104;
        r35 = Float.NaN;
    L104:
        if (Float.isNaN(r35) == true) goto L106;
        return r35;
    L106:
        float r05 = (-r04) - r28;
        if (r05 < 0.0f) goto L111;
        r19 = r05;
    L111:
        if (r19 > 1.0f) goto L115;
        r16 = r19;
    L115:
        if (Math.abs(r16 - r05) <= 1.05E-6f) goto L117;
        return Float.NaN;
    L117:
        return r16;
    L96:
        r35 = r1;
        goto L98
    L118:
        double r06 = Math.sqrt(r2);
        float r07 = (float) ((androidx.compose.ui.util.d.a((float) ((-r7) + r06)) - androidx.compose.ui.util.d.a((float) (r7 + r06))) - r53);
        if (r07 < 0.0f) goto L123;
        r19 = r07;
    L123:
        if (r19 > 1.0f) goto L127;
        r16 = r19;
    L127:
        if (Math.abs(r16 - r07) <= 1.05E-6f) goto L129;
        return Float.NaN;
    L129:
        return r16;
    L5:
        if (Math.abs(r5 - 0.0d) < 1.0E-7d) goto L7;
        double r08 = Math.sqrt((r11 * r11) - ((4.0d * r5) * r3));
        double r54 = r5 * 2.0d;
        float r29 = (float) ((r08 - r11) / r54);
        if (r29 >= 0.0f) goto L24;
        float r36 = 0.0f;
    L26:
        if (r36 <= 1.0f) goto L29;
        r36 = 1.0f;
    L29:
        if (Math.abs(r36 - r29) <= 1.05E-6f) goto L32;
        r36 = Float.NaN;
    L32:
        if (Float.isNaN(r36) == true) goto L34;
        return r36;
    L34:
        float r09 = (float) (((-r11) - r08) / r54);
        if (r09 < 0.0f) goto L39;
        r19 = r09;
    L39:
        if (r19 > 1.0f) goto L43;
        r16 = r19;
    L43:
        if (Math.abs(r16 - r09) <= 1.05E-6f) goto L45;
        return Float.NaN;
    L45:
        return r16;
    L24:
        r36 = r29;
        goto L26
    L7:
        if (Math.abs(r11 - 0.0d) >= 1.0E-7d) goto L9;
        return Float.NaN;
    L9:
        float r010 = (float) ((-r3) / r11);
        if (r010 < 0.0f) goto L14;
        r19 = r010;
    L14:
        if (r19 > 1.0f) goto L18;
        r16 = r19;
    L18:
        if (Math.abs(r16 - r010) <= 1.05E-6f) goto L20;
        return Float.NaN;
    L20:
        return r16;
    }

    public static final int f(float r17, float r18, float r19, float[] r20, int r21) {
        double r3 = r17;
        double r5 = r18;
        double r7 = r19;
        double r11 = r5 * 2.0d;
        double r13 = (r3 - r11) + r7;
        if (r13 == 0.0d) goto L5;
        double r72 = -Math.sqrt((r5 * r5) - (r7 * r3));
        double r32 = (-r3) + r5;
        int r1 = g((float) ((-(r72 + r32)) / r13), r20, r21);
        int r12 = r1 + g((float) ((r72 - r32) / r13), r20, r21 + r1);
        if (r12 <= 1) goto L20;
        float r33 = r20[r21];
        int r4 = r21 + 1;
        float r52 = r20[r4];
        if (r33 <= r52) goto L17;
        r20[r21] = r52;
        r20[r4] = r33;
        return r12;
    L17:
        if (r33 == r52) goto L19;
        return r12;
    L19:
        return r12 - 1;
    L20:
        return r12;
    L5:
        if (r5 != r7) goto L9;
        return 0;
    L9:
        return g((float) ((r11 - r7) / (r11 - (r7 * 2.0d))), r20, r21);
    }

    public static final int g(float r3, float[] r4, int r5) {
        float r02 = 0.0f;
        if (r3 < 0.0f) goto L7;
        r02 = r3;
    L7:
        if (r02 <= 1.0f) goto L10;
        r02 = 1.0f;
    L10:
        if (Math.abs(r02 - r3) <= 1.05E-6f) goto L12;
        r02 = Float.NaN;
    L12:
        r4[r5] = r02;
        return !Float.isNaN(r02) ? 1 : 0;
    }
}
