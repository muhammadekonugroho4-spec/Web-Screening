package androidx.compose.ui.graphics;

import android.graphics.Matrix;

/* loaded from: classes.dex */
public abstract class O {
    public static final void a(Matrix r21, float[] r22) {
        float r1 = r22[0];
        float r3 = r22[1];
        float r5 = r22[2];
        float r7 = r22[3];
        float r9 = r22[4];
        float r11 = r22[5];
        float r13 = r22[6];
        float r15 = r22[7];
        float r17 = r22[8];
        float r18 = r22[12];
        float r19 = r22[13];
        float r20 = r22[15];
        r22[0] = r1;
        r22[1] = r9;
        r22[2] = r18;
        r22[3] = r3;
        r22[4] = r11;
        r22[5] = r19;
        r22[6] = r7;
        r22[7] = r15;
        r22[8] = r20;
        r21.setValues(r22);
        r22[0] = r1;
        r22[1] = r3;
        r22[2] = r5;
        r22[3] = r7;
        r22[4] = r9;
        r22[5] = r11;
        r22[6] = r13;
        r22[7] = r15;
        r22[8] = r17;
    }

    public static final void b(float[] r19, Matrix r20) {
        r20.getValues(r19);
        float r2 = r19[0];
        float r4 = r19[1];
        float r6 = r19[2];
        float r8 = r19[3];
        float r10 = r19[4];
        float r12 = r19[5];
        float r14 = r19[6];
        float r16 = r19[7];
        float r18 = r19[8];
        r19[0] = r2;
        r19[1] = r8;
        r19[2] = 0.0f;
        r19[3] = r14;
        r19[4] = r4;
        r19[5] = r10;
        r19[6] = 0.0f;
        r19[7] = r16;
        r19[8] = 0.0f;
        r19[9] = 0.0f;
        r19[10] = 1.0f;
        r19[11] = 0.0f;
        r19[12] = r6;
        r19[13] = r12;
        r19[14] = 0.0f;
        r19[15] = r18;
    }
}
