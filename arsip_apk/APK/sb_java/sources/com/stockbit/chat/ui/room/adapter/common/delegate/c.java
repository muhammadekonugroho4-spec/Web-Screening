package com.stockbit.chat.ui.room.adapter.common.delegate;

import com.stockbit.usecase.chat.model.chat.EmojiTextType;

/* loaded from: classes7.dex */
public interface c {
    static /* synthetic */ void u(c r02, Object r1, EmojiTextType r2, kotlin.jvm.functions.a r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 2) == 0) goto L6;
        r2 = EmojiTextType.OTHER;
    L6:
        r02.k(r1, r2, r3);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setupTextContent");
    }

    void k(Object r1, EmojiTextType r2, kotlin.jvm.functions.a r3);
}
