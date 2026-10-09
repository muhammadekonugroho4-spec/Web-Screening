package com.clevertap.android.sdk.customviews;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatImageView;
import com.clevertap.android.sdk.Logger;

/* loaded from: classes4.dex */
public final class CloseImageView extends AppCompatImageView {

    /* renamed from: a, reason: collision with root package name */
    public final int f33771a;

    @SuppressLint({"ResourceType"})
    public CloseImageView(Context r1) {
        super(r1);
        this.f33771a = c(40);
        setId(199272);
    }

    private int c(int r3) {
        return (int) TypedValue.applyDimension(1, r3, getResources().getDisplayMetrics());
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas r6) {
        super.onDraw(r6);
        Context r02 = getContext();     // Catch: Throwable -> L7
        int r1 = r02.getResources().getIdentifier("ct_close", "drawable", r02.getPackageName());     // Catch: Throwable -> L7
        Bitmap r03 = BitmapFactory.decodeResource(r02.getResources(), r1, null);     // Catch: Throwable -> L7
        if (r03 == null) goto L9;
        int r12 = this.f33771a;     // Catch: Throwable -> L7
        r6.drawBitmap(Bitmap.createScaledBitmap(r03, r12, r12, true), 0.0f, 0.0f, new Paint());     // Catch: Throwable -> L7
        return;
    L9:
        Logger.v("Unable to find inapp notif close button image");     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        Logger.v("Error displaying the inapp notif close button image:", th);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int r1, int r2) {
        int r12 = this.f33771a;
        setMeasuredDimension(r12, r12);
    }

    @SuppressLint({"ResourceType"})
    public CloseImageView(Context r1, AttributeSet r2) {
        super(r1, r2);
        this.f33771a = c(40);
        setId(199272);
    }

    @SuppressLint({"ResourceType"})
    public CloseImageView(Context r1, AttributeSet r2, int r3) {
        super(r1, r2, r3);
        this.f33771a = c(40);
        setId(199272);
    }
}
