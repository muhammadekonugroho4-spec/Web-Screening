package com.journeyapps.barcodescanner;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.zxing.PlanarYUVLuminanceSource;
import java.io.ByteArrayOutputStream;

/* loaded from: classes6.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f41189a;

    /* renamed from: b, reason: collision with root package name */
    public int f41190b;

    /* renamed from: c, reason: collision with root package name */
    public int f41191c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f41192e;

    /* renamed from: f, reason: collision with root package name */
    public Rect f41193f;

    public n(byte[] r2, int r3, int r4, int r5, int r6) {
        this.f41189a = r2;
        this.f41190b = r3;
        this.f41191c = r4;
        this.f41192e = r6;
        this.d = r5;
        if ((r3 * r4) > r2.length) goto L6;
        return;
    L6:
        throw new IllegalArgumentException("Image data does not match the resolution. " + r3 + "x" + r4 + " > " + r2.length);
    }

    public static byte[] e(byte[] r3, int r4, int r5) {
        int r42 = r4 * r5;
        byte[] r52 = new byte[r42];
        int r02 = r42 - 1;
        int r1 = 0;
    L3:
        if (r1 >= r42) goto L5;
        r52[r02] = r3[r1];
        r02 = r02 - 1;
        r1 = r1 + 1;
        goto L3
    L5:
        return r52;
    }

    public static byte[] f(byte[] r5, int r6, int r7) {
        int r02 = r6 * r7;
        byte[] r1 = new byte[r02];
        int r03 = r02 - 1;
        int r2 = 0;
    L3:
        if (r2 >= r6) goto L8;
        int r3 = r7 - 1;
    L5:
        if (r3 < 0) goto L7;
        r1[r03] = r5[(r3 * r6) + r2];
        r03 = r03 - 1;
        r3 = r3 - 1;
        goto L5
    L7:
        r2 = r2 + 1;
        goto L3
    L8:
        return r1;
    }

    public static byte[] g(byte[] r5, int r6, int r7) {
        byte[] r02 = new byte[r6 * r7];
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r1 >= r6) goto L8;
        int r3 = r7 - 1;
    L5:
        if (r3 < 0) goto L7;
        r02[r2] = r5[(r3 * r6) + r1];
        r2 = r2 + 1;
        r3 = r3 - 1;
        goto L5
    L7:
        r1 = r1 + 1;
        goto L3
    L8:
        return r02;
    }

    public static byte[] h(int r1, byte[] r2, int r3, int r4) {
        if (r1 == 90) goto L14;
        if (r1 == 180) goto L12;
        if (r1 == 270) goto L10;
        return r2;
    L10:
        return f(r2, r3, r4);
    L12:
        return e(r2, r3, r4);
    L14:
        return g(r2, r3, r4);
    }

    public PlanarYUVLuminanceSource a() {
        byte[] r5 = h(this.f41192e, this.f41189a, this.f41190b, this.f41191c);
        if (d() == false) goto L6;
        int r6 = this.f41191c;
        int r7 = this.f41190b;
        Rect r02 = this.f41193f;
        return new PlanarYUVLuminanceSource(r5, r6, r7, r02.left, r02.top, r02.width(), this.f41193f.height(), false);
    L6:
        int r62 = this.f41190b;
        int r72 = this.f41191c;
        Rect r03 = this.f41193f;
        return new PlanarYUVLuminanceSource(r5, r62, r72, r03.left, r03.top, r03.width(), this.f41193f.height(), false);
    }

    public Bitmap b(int r2) {
        return c(this.f41193f, r2);
    }

    public final Bitmap c(Rect r10, int r11) {
        if (d() == false) goto L5;
        r10 = new Rect(r10.top, r10.left, r10.bottom, r10.right);
    L5:
        YuvImage r02 = new YuvImage(this.f41189a, this.d, this.f41190b, this.f41191c, null);
        ByteArrayOutputStream r1 = new ByteArrayOutputStream();
        r02.compressToJpeg(r10, 90, r1);
        byte[] r102 = r1.toByteArray();
        BitmapFactory.Options r03 = new BitmapFactory.Options();
        r03.inSampleSize = r11;
        Bitmap r2 = BitmapFactory.decodeByteArray(r102, 0, r102.length, r03);
        if (this.f41192e == 0) goto L9;
        Matrix r7 = new Matrix();
        r7.postRotate(this.f41192e);
        return Bitmap.createBitmap(r2, 0, 0, r2.getWidth(), r2.getHeight(), r7, false);
    L9:
        return r2;
    }

    public boolean d() {
        if ((this.f41192e % SubsamplingScaleImageView.ORIENTATION_180) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public void i(Rect r1) {
        this.f41193f = r1;
    }
}
