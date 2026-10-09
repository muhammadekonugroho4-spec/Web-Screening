package com.koushikdutta.ion;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* loaded from: classes6.dex */
public class e implements com.koushikdutta.ion.bitmap.h {
    public static final Paint d = null;

    /* renamed from: a, reason: collision with root package name */
    public final ScaleMode f41775a;

    /* renamed from: b, reason: collision with root package name */
    public final int f41776b;

    /* renamed from: c, reason: collision with root package name */
    public final int f41777c;

    static {
        d = new Paint(2);
    }

    public e(int r1, int r2, ScaleMode r3) {
        this.f41776b = r1;
        this.f41777c = r2;
        if (r3 != null) goto L6;
        this.f41775a = ScaleMode.FitXY;
        return;
    L6:
        this.f41775a = r3;
    }

    @Override // com.koushikdutta.ion.bitmap.h
    public String a() {
        return this.f41775a.name() + this.f41776b + "x" + this.f41777c;
    }

    @Override // com.koushikdutta.ion.bitmap.h
    public Bitmap b(Bitmap r13) {
        Bitmap.Config r02 = r13.getConfig();
        if (r02 != null) goto L5;
        r02 = Bitmap.Config.ARGB_8888;
    L5:
        int r1 = this.f41776b;
        int r2 = this.f41777c;
        if (r1 > 0) goto L8;
        r1 = (int) ((r13.getWidth() / r13.getHeight()) * r2);
    L10:
        float r4 = r1;
        float r5 = r2;
        RectF r3 = new RectF(0.0f, 0.0f, r4, r5);
        ScaleMode r7 = this.f41775a;
        ScaleMode r8 = ScaleMode.CenterInside;
        if (r7 != r8) goto L18;
        if (r1 > r13.getWidth()) goto L15;
    L16:
        r7 = ScaleMode.FitCenter;
        goto L18
    L15:
        if (r2 <= r13.getHeight()) goto L16;
    L18:
        if (r7 != r8) goto L21;
        float r42 = (r1 - r13.getWidth()) / 2.0f;
        float r52 = (r2 - r13.getHeight()) / 2.0f;
        r3.set(r42, r52, r13.getWidth() + r42, r13.getHeight() + r52);
    L31:
        if (r3.width() == r13.getWidth()) goto L33;
    L39:
        Bitmap r03 = Bitmap.createBitmap(r1, r2, r02);
        new Canvas(r03).drawBitmap(r13, null, r3, d);
        return r03;
    L33:
        if (r3.height() != r13.getHeight()) goto L39;
        if (r3.top != 0.0f) goto L39;
        if (r3.left != 0.0f) goto L39;
    L38:
        return r13;
    L21:
        if (r7 == ScaleMode.FitXY) goto L31;
        float r82 = r4 / r13.getWidth();
        float r10 = r5 / r13.getHeight();
        if (r7 != ScaleMode.CenterCrop) goto L25;
        float r72 = Math.max(r82, r10);
    L27:
        if (r72 == 0.0f) goto L38;
        float r102 = r13.getHeight() * r72;
        float r73 = (r4 - (r13.getWidth() * r72)) / 2.0f;
        float r83 = (r5 - r102) / 2.0f;
        r3.set(r73, r83, r4 - r73, r5 - r83);
        goto L31
    L25:
        r72 = Math.min(r82, r10);
        goto L27
    L8:
        if (r2 > 0) goto L10;
        r2 = (int) ((r13.getHeight() / r13.getWidth()) * r1);
        goto L10
    }
}
