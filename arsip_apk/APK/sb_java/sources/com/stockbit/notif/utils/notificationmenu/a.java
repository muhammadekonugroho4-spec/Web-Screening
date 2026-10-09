package com.stockbit.notif.utils.notificationmenu;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes10.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public AppCompatImageView f122954a;

    public a(View r2) {
        if (r2 == null) goto L5;
        AppCompatImageView r22 = (AppCompatImageView) r2.findViewById(com.stockbit.notif.e.f122774g);
    L6:
        this.f122954a = r22;
        return;
    L5:
        r22 = null;
        goto L6
    }

    @Override // com.stockbit.notif.utils.notificationmenu.c
    public View a() {
        return this.f122954a;
    }
}
