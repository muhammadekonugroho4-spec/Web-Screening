package com.stockbit.chat.ui.room.adapter.group.delegate;

import android.view.View;
import android.widget.ImageView;

/* loaded from: classes7.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f57200a;

    /* renamed from: b, reason: collision with root package name */
    public final com.stockbit.chat.ui.room.adapter.common.listener.m f57201b;

    static {
    }

    public Q(ImageView r2, com.stockbit.chat.ui.room.adapter.common.listener.m r3) {
        kotlin.jvm.internal.p.l(r2, "imageView");
        this.f57200a = r2;
        this.f57201b = r3;
    }

    public static /* synthetic */ void a(com.stockbit.usecase.chat.model.chat.message.r r02, Q r1, View r2) {
        c(r02, r1, r2);
    }

    public static final void c(com.stockbit.usecase.chat.model.chat.message.r r02, Q r1, View r2) {
        if (r02.j() == false) goto L10;
        com.stockbit.chat.ui.room.adapter.common.listener.m r12 = r1.f57201b;
        if (r12 == null) goto L9;
        r12.a(r02);
        return;
    L9:
        return;
    }

    public void b(final com.stockbit.usecase.chat.model.chat.message.r r3) {
        kotlin.jvm.internal.p.l(r3, "sender");
        this.f57200a.setOnClickListener(new P(r3, this));
    }
}
