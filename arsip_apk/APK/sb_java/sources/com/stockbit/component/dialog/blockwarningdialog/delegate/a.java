package com.stockbit.component.dialog.blockwarningdialog.delegate;

import com.stockbit.component.dialog.blockwarningdialog.BlockWarningActionType;

/* loaded from: classes7.dex */
public interface a {
    static /* synthetic */ void Z0(a r6, BlockWarningActionType r7, boolean r8, boolean r9, kotlin.jvm.functions.a r10, kotlin.jvm.functions.a r11, int r12, Object r13) {
        if (r13 != null) goto L15;
        if ((r12 & 2) == 0) goto L6;
        r8 = false;
    L6:
        boolean r2 = r8;
        if ((r12 & 4) == 0) goto L9;
        r9 = true;
    L9:
        boolean r3 = r9;
        if ((r12 & 8) == 0) goto L12;
        r10 = null;
    L12:
        r6.t0(r7, r2, r3, r10, r11);
        return;
    L15:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showBlockWarningBottomSheet");
    }

    void t0(BlockWarningActionType r1, boolean r2, boolean r3, kotlin.jvm.functions.a r4, kotlin.jvm.functions.a r5);
}
