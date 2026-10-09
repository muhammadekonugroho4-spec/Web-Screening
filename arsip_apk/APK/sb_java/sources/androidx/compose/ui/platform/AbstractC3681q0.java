package androidx.compose.ui.platform;

/* renamed from: androidx.compose.ui.platform.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3681q0 {
    public static final boolean a(float[] r49, float[] r50) {
        if (r49.length < 16) goto L16;
        if (r50.length < 16) goto L16;
        float r2 = r49[0];
        float r5 = r49[1];
        float r7 = r49[2];
        float r9 = r49[3];
        float r11 = r49[4];
        float r13 = r49[5];
        float r15 = r49[6];
        float r17 = r49[7];
        float r3 = r49[8];
        float r4 = r49[9];
        float r23 = r49[10];
        float r25 = r49[11];
        float r6 = r49[12];
        float r29 = r49[13];
        float r31 = r49[14];
        float r02 = r49[15];
        float r33 = (r2 * r13) - (r5 * r11);
        float r34 = (r2 * r15) - (r7 * r11);
        float r35 = (r2 * r17) - (r9 * r11);
        float r36 = (r5 * r15) - (r7 * r13);
        float r37 = (r5 * r17) - (r9 * r13);
        float r38 = (r7 * r17) - (r9 * r15);
        float r39 = (r3 * r29) - (r4 * r6);
        float r40 = (r3 * r31) - (r23 * r6);
        float r41 = (r3 * r02) - (r25 * r6);
        float r42 = (r4 * r31) - (r23 * r29);
        float r43 = (r4 * r02) - (r25 * r29);
        float r44 = (r23 * r02) - (r25 * r31);
        float r45 = (((((r33 * r44) - (r34 * r43)) + (r35 * r42)) + (r36 * r41)) - (r37 * r40)) + (r38 * r39);
        if (r45 == 0.0f) goto L11;
        float r47 = 1.0f / r45;
        r50[0] = (((r13 * r44) - (r15 * r43)) + (r17 * r42)) * r47;
        r50[1] = ((((-r5) * r44) + (r7 * r43)) - (r9 * r42)) * r47;
        r50[2] = (((r29 * r38) - (r31 * r37)) + (r02 * r36)) * r47;
        r50[3] = ((((-r4) * r38) + (r23 * r37)) - (r25 * r36)) * r47;
        float r8 = -r11;
        r50[4] = (((r8 * r44) + (r15 * r41)) - (r17 * r40)) * r47;
        r50[5] = (((r44 * r2) - (r7 * r41)) + (r9 * r40)) * r47;
        float r10 = -r6;
        r50[6] = (((r10 * r38) + (r31 * r35)) - (r02 * r34)) * r47;
        r50[7] = (((r38 * r3) - (r23 * r35)) + (r25 * r34)) * r47;
        r50[8] = (((r11 * r43) - (r13 * r41)) + (r17 * r39)) * r47;
        r50[9] = ((((-r2) * r43) + (r41 * r5)) - (r9 * r39)) * r47;
        r50[10] = (((r6 * r37) - (r29 * r35)) + (r02 * r33)) * r47;
        r50[11] = ((((-r3) * r37) + (r35 * r4)) - (r25 * r33)) * r47;
        r50[12] = (((r8 * r42) + (r13 * r40)) - (r15 * r39)) * r47;
        r50[13] = (((r2 * r42) - (r5 * r40)) + (r7 * r39)) * r47;
        r50[14] = (((r10 * r36) + (r29 * r34)) - (r31 * r33)) * r47;
        r50[15] = (((r3 * r36) - (r4 * r34)) + (r23 * r33)) * r47;
    L11:
        if (r45 != 0.0f) goto L13;
        boolean r32 = true;
    L15:
        return !r32;
    L13:
        r32 = false;
    L16:
        return false;
    }
}
