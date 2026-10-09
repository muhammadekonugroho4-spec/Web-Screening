package androidx.compose.ui.node;

/* loaded from: classes.dex */
public abstract class s0 {
    public static final C3635o a(float r7, float r8, float r9, float r10) {
        return new C3635o(r7, r8, r9, r10, true, null);
    }

    public static final long b(int r7, int r8, int r9, int r10) {
        boolean r02 = true;
        if (r7 < 0) goto L6;
        if (r7 >= 32768) goto L6;
        boolean r3 = true;
    L7:
        if (r3 == true) goto L9;
        androidx.compose.ui.internal.a.a("Start must be in the range of 0 .. 32767");
    L9:
        if (r8 < 0) goto L12;
        if (r8 >= 32768) goto L12;
        boolean r32 = true;
    L13:
        if (r32 == true) goto L15;
        androidx.compose.ui.internal.a.a("Top must be in the range of 0 .. 32767");
    L15:
        if (r9 < 0) goto L18;
        if (r9 >= 32768) goto L18;
        boolean r33 = true;
    L19:
        if (r33 == true) goto L21;
        androidx.compose.ui.internal.a.a("End must be in the range of 0 .. 32767");
    L21:
        if (r10 < 0) goto L24;
        if (r10 >= 32768) goto L24;
    L25:
        if (r02 == true) goto L28;
        androidx.compose.ui.internal.a.a("Bottom must be in the range of 0 .. 32767");
    L28:
        return r0.d(r0.f18811a.c(r7, r8, r9, r10, true));
    L24:
        r02 = false;
    L18:
        r33 = false;
    L12:
        r32 = false;
    L6:
        r3 = false;
        goto L7
    }

    public static /* synthetic */ long c(int r1, int r2, int r3, int r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = 0;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = 0;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = 0;
    L15:
        return b(r1, r2, r3, r4);
    }
}
