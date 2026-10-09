package androidx.compose.ui.node;

/* loaded from: classes.dex */
public abstract class U {
    public static final /* synthetic */ void a(int[] r02, int r1, int r2) {
        i(r02, r1, r2);
    }

    public static final void b(C3641v r7, InterfaceC3633m r8) {
        int r02 = 0;
        int r1 = 0;
        int r2 = 0;
    L4:
        if (r02 >= r7.c()) goto L13;
        int r4 = r02 + 2;
        int r3 = r7.b(r02) - r7.b(r4);
        int r5 = r7.b(r02 + 1) - r7.b(r4);
        int r42 = r7.b(r4);
        r02 = r02 + 3;
    L6:
        if (r1 >= r3) goto L8;
        r8.b(r2, r1);
        r1 = r1 + 1;
    L8:
        if (r2 >= r5) goto L10;
        r8.c(r2);
        r2 = r2 + 1;
    L10:
        int r32 = r42 - 1;
        if (r42 <= 0) goto L4;
        r8.d(r1, r2);
        r1 = r1 + 1;
        r2 = r2 + 1;
        r42 = r32;
        goto L10
    }

    public static final boolean c(int r17, int r18, int r19, int r20, InterfaceC3633m r21, int[] r22, int[] r23, int r24, int[] r25) {
        int r4 = (r18 - r17) - (r20 - r19);
        if ((r4 & 1) != 0) goto L5;
        boolean r5 = true;
    L6:
        int r8 = -r24;
        int r9 = r8;
    L7:
        if (r9 > r24) goto L40;
        if (r9 == r8) goto L14;
        if (r9 != r24) goto L11;
    L13:
        int r10 = AbstractC3623c.b(r23, r9 - 1);
        int r11 = r10 - 1;
    L15:
        int r12 = r20 - ((r18 - r11) - r9);
        if (r24 == 0) goto L18;
        int r13 = 1;
    L19:
        if (r11 != r10) goto L21;
        int r14 = 1;
    L22:
        int r132 = (r13 & r14) + r12;
    L23:
        if (r11 <= r17) goto L29;
        if (r12 <= r19) goto L29;
        if (r21.a(r11 - 1, r12 - 1) == false) goto L29;
        r11 = r11 - 1;
        r12 = r12 - 1;
    L29:
        AbstractC3623c.d(r23, r9, r11);
        if (r5 == false) goto L39;
        int r142 = r4 - r9;
        if (r142 < r8) goto L39;
        if (r142 > r24) goto L39;
        if (AbstractC3623c.b(r22, r142) < r11) goto L39;
        f(r11, r12, r10, r132, true, r25);
        return true;
    L39:
        r9 = r9 + 2;
        goto L7
    L21:
        r14 = 0;
        goto L22
    L18:
        r13 = 0;
        goto L19
    L11:
        if (AbstractC3623c.b(r23, r9 + 1) >= AbstractC3623c.b(r23, r9 - 1)) goto L13;
    L14:
        r10 = AbstractC3623c.b(r23, r9 + 1);
        r11 = r10;
        goto L15
    L40:
        return false;
    L5:
        r5 = false;
        goto L6
    }

    public static final C3641v d(int r19, int r20, InterfaceC3633m r21) {
        char r3 = 1;
        int r2 = ((r19 + r20) + 1) / 2;
        C3641v r5 = new C3641v(r2 * 3);
        C3641v r6 = new C3641v(r2 * 4);
        r6.h(0, r19, 0, r20);
        int r22 = (r2 * 2) + 1;
        int[] r14 = AbstractC3623c.a(new int[r22]);
        int[] r15 = AbstractC3623c.a(new int[r22]);
        int[] r16 = p0.b(new int[5]);
    L4:
        if (r6.d() == false) goto L12;
        int r12 = r6.f();
        int r11 = r6.f();
        int r10 = r6.f();
        int r9 = r6.f();
        int[] r8 = r16;
        if (h(r9, r10, r11, r12, r21, r14, r15, r16) == true) goto L7;
        r16 = r8;
        goto L4
    L7:
        char r18 = r3;
        if (Math.min(r8[2] - r8[0], r8[3] - r8[r3]) <= 0) goto L10;
        p0.a(r8, r5);
    L10:
        r6.h(r9, r8[0], r11, r8[r18]);
        r6.h(r8[2], r10, r8[3], r12);
        r16 = r8;
        r3 = r18;
        goto L4
    L12:
        r5.k();
        r5.g(r19, r20, 0);
        return r5;
    }

    public static final void e(int r02, int r1, InterfaceC3633m r2) {
        b(d(r02, r1, r2), r2);
    }

    public static final void f(int r2, int r3, int r4, int r5, boolean r6, int[] r7) {
        if (r7.length >= 5) goto L5;
        return;
    L5:
        r7[0] = r2;
        r7[1] = r3;
        r7[2] = r4;
        r7[3] = r5;
        r7[4] = r6 ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public static final boolean g(int r17, int r18, int r19, int r20, InterfaceC3633m r21, int[] r22, int[] r23, int r24, int[] r25) {
        int r4 = (r18 - r17) - (r20 - r19);
        int r6 = 1;
        if ((Math.abs(r4) & 1) != 1) goto L5;
        boolean r5 = true;
    L6:
        int r8 = -r24;
        int r9 = r8;
    L7:
        if (r9 > r24) goto L42;
        if (r9 == r8) goto L14;
        if (r9 != r24) goto L11;
    L13:
        int r10 = AbstractC3623c.b(r22, r9 - 1);
        int r11 = r10 + 1;
    L15:
        int r12 = (r19 + (r11 - r17)) - r9;
        if (r24 == 0) goto L18;
        int r13 = r6;
    L19:
        if (r11 != r10) goto L21;
        int r14 = r6;
    L22:
        int r132 = r12 - (r13 & r14);
    L23:
        if (r11 >= r18) goto L29;
        if (r12 >= r20) goto L29;
        if (r21.a(r11, r12) == false) goto L29;
        r11 = r11 + 1;
        r12 = r12 + 1;
    L29:
        AbstractC3623c.d(r22, r9, r11);
        if (r5 == false) goto L40;
        int r15 = r4 - r9;
        ?? r16 = r6;
        r16 = r16;
        if (r15 < (r8 + 1)) goto L41;
        r16 = r16;
        if (r15 > (r24 - 1)) goto L41;
        if (AbstractC3623c.b(r23, r15) > r11) goto L41;
        f(r10, r132, r11, r12, false, r25);
        return r16;
    L41:
        r9 = r9 + 2;
        r6 = r16;
        goto L7
    L40:
        r16 = r6;
        goto L41
    L21:
        r14 = 0;
        goto L22
    L18:
        r13 = 0;
        goto L19
    L11:
        if (AbstractC3623c.b(r22, r9 + 1) <= AbstractC3623c.b(r22, r9 - 1)) goto L13;
    L14:
        r10 = AbstractC3623c.b(r22, r9 + 1);
        r11 = r10;
        goto L15
    L42:
        return false;
    L5:
        r5 = false;
        goto L6
    }

    public static final boolean h(int r13, int r14, int r15, int r16, InterfaceC3633m r17, int[] r18, int[] r19, int[] r20) {
        int r02 = r14 - r13;
        int r1 = r16 - r15;
        if (r02 < 1) goto L15;
        if (r1 < 1) goto L15;
        int r03 = ((r02 + r1) + 1) / 2;
        int[] r9 = r18;
        AbstractC3623c.d(r9, 1, r13);
        int[] r10 = r19;
        AbstractC3623c.d(r10, 1, r14);
        int r11 = 0;
    L7:
        if (r11 >= r03) goto L15;
        if (g(r13, r14, r15, r16, r17, r9, r10, r11, r20) == true) goto L10;
        if (c(r13, r14, r15, r16, r17, r18, r19, r11, r20) == true) goto L13;
        r11 = r11 + 1;
        r9 = r18;
        r10 = r19;
        goto L7
    L13:
        return true;
    L10:
        return true;
    L15:
        return false;
    }

    public static final void i(int[] r2, int r3, int r4) {
        int r02 = r2[r3];
        r2[r3] = r2[r4];
        r2[r4] = r02;
    }
}
