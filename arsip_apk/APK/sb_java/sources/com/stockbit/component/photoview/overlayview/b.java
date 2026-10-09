package com.stockbit.component.photoview.overlayview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f73979a = null;

    static {
        f73979a = new b();
    }

    public b() {
    }

    public final Paint a(Context r3) {
        p.l(r3, "context");
        int r32 = r3.getResources().getDimensionPixelSize(com.stockbit.component.photoview.a.f73798a);
        Paint r02 = new Paint();
        r02.setAntiAlias(true);
        r02.setColor(Color.parseColor("#FFCBCBCB"));
        r02.setStrokeWidth(r32);
        r02.setStyle(Paint.Style.STROKE);
        return r02;
    }
}
