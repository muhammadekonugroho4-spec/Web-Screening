package com.stockbit.component.photoview.imageview;

import android.view.View;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f73918a = null;

    static {
        f73918a = new a();
    }

    public a() {
    }

    public static final void a(View r2, Runnable r3) {
        p.l(r2, "view");
        p.l(r3, "runnable");
        r2.postDelayed(r3, 16);
    }
}
