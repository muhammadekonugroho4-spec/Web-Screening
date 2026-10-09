package androidx.compose.ui.layout;

import java.util.Map;

/* loaded from: classes.dex */
public interface J extends InterfaceC3611p {
    static /* synthetic */ I C1(J r02, int r1, int r2, Map r3, kotlin.jvm.functions.l r4, int r5, Object r6) {
        if (r6 != null) goto L9;
        if ((r5 & 4) == 0) goto L7;
        r3 = kotlin.collections.S.j();
    L7:
        return r02.S1(r1, r2, r3, r4);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
    }

    static /* synthetic */ I d1(J r6, int r7, int r8, Map r9, kotlin.jvm.functions.l r10, kotlin.jvm.functions.l r11, int r12, Object r13) {
        if (r13 != null) goto L12;
        if ((r12 & 4) == 0) goto L6;
        r9 = kotlin.collections.S.j();
    L6:
        Map r3 = r9;
        if ((r12 & 8) == 0) goto L10;
        r10 = null;
    L10:
        return r6.m2(r7, r8, r3, r10, r11);
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
    }

    default I S1(int r7, int r8, Map r9, kotlin.jvm.functions.l r10) {
        return m2(r7, r8, r9, null, r10);
    }

    I m2(int r1, int r2, Map r3, kotlin.jvm.functions.l r4, kotlin.jvm.functions.l r5);
}
