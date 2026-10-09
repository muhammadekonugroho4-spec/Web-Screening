package com.stockbit.stream.listener;

import com.stockbit.domain.model.entity.stream.PollingOption;

/* loaded from: classes11.dex */
public interface f {
    static /* synthetic */ void a(f r6, long r7, PollingOption r9, int r10, String r11, int r12, Object r13) {
        if (r13 != null) goto L9;
        if ((r12 & 8) == 0) goto L6;
        r11 = "";
    L6:
        r6.y(r7, r9, r10, r11);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onPollingOptionClicked");
    }

    void y(long r1, PollingOption r3, int r4, String r5);
}
