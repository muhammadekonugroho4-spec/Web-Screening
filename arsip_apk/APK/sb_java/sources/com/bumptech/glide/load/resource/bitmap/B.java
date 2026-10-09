package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes4.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    public static final Paint f33025a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final Paint f33026b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final Paint f33027c = null;
    public static final Set d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final Lock f33028e = null;

    public class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f33029a;

        public a(int r1) {
            this.f33029a = r1;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.B.b
        public void a(Canvas r3, Paint r4, RectF r5) {
            int r02 = this.f33029a;
            r3.drawRoundRect(r5, r02, r02, r4);
        }
    }

    public interface b {
        void a(Canvas r1, Paint r2, RectF r3);
    }

    public static final class c implements Lock {
        public c() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() {
        }

        @Override // java.util.concurrent.locks.Lock
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long r1, TimeUnit r3) {
            return true;
        }
    }

    static {
        f33025a = new Paint(6);
        f33026b = new Paint(7);
        HashSet r02 = new HashSet(Arrays.asList(new String[]{"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"}));
        d = r02;
        if (r02.contains(Build.MODEL) == false) goto L5;
        Lock r03 = new ReentrantLock();
    L6:
        f33028e = r03;
        Paint r04 = new Paint(7);
        f33027c = r04;
        r04.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        return;
    L5:
        r03 = new c();
        goto L6
    }

    public static void a(Bitmap r2, Bitmap r3, Matrix r4) {
        Lock r02 = f33028e;
        r02.lock();
        Canvas r1 = new Canvas(r3);     // Catch: Throwable -> L6
        r1.drawBitmap(r2, r4, f33025a);     // Catch: Throwable -> L6
        e(r1);     // Catch: Throwable -> L6
        r02.unlock();
        return;
    L6:
        th = move-exception;
        f33028e.unlock();
        throw th;
    }

    public static Bitmap b(com.bumptech.glide.load.engine.bitmap_recycle.d r7, Bitmap r8, int r9, int r10) {
        if (r8.getWidth() == r9) goto L5;
    L7:
        Matrix r02 = new Matrix();
        float r3 = 0.0f;
        if ((r8.getWidth() * r10) <= (r8.getHeight() * r9)) goto L10;
        float r1 = r10 / r8.getHeight();
        r3 = (r9 - (r8.getWidth() * r1)) * 0.5f;
        float r2 = 0.0f;
    L11:
        r02.setScale(r1, r1);
        r02.postTranslate((int) (r3 + 0.5f), (int) (r2 + 0.5f));
        Bitmap r72 = r7.d(r9, r10, k(r8));
        q(r8, r72);
        a(r8, r72, r02);
        return r72;
    L10:
        r1 = r9 / r8.getWidth();
        r2 = (r10 - (r8.getHeight() * r1)) * 0.5f;
        goto L11
    L5:
        if (r8.getHeight() != r10) goto L7;
        return r8;
    }

    public static Bitmap c(com.bumptech.glide.load.engine.bitmap_recycle.d r3, Bitmap r4, int r5, int r6) {
        if (r4.getWidth() > r5) goto L11;
        if (r4.getHeight() > r6) goto L11;
        if (Log.isLoggable("TransformationUtils", 2) == false) goto L9;
        Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
    L9:
        return r4;
    L11:
        if (Log.isLoggable("TransformationUtils", 2) == false) goto L14;
        Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
    L14:
        return f(r3, r4, r5, r6);
    }

    public static Bitmap d(com.bumptech.glide.load.engine.bitmap_recycle.d r6, Bitmap r7, int r8, int r9) {
        int r82 = Math.min(r8, r9);
        float r92 = r82;
        float r1 = r92 / 2.0f;
        float r2 = r7.getWidth();
        float r3 = r7.getHeight();
        float r4 = Math.max(r92 / r2, r92 / r3);
        float r22 = r2 * r4;
        float r42 = r4 * r3;
        float r32 = (r92 - r22) / 2.0f;
        float r93 = (r92 - r42) / 2.0f;
        RectF r02 = new RectF(r32, r93, r22 + r32, r42 + r93);
        Bitmap r94 = g(r6, r7);
        Bitmap r83 = r6.d(r82, r82, h(r7));
        r83.setHasAlpha(true);
        Lock r23 = f33028e;
        r23.lock();
        Canvas r33 = new Canvas(r83);     // Catch: Throwable -> L8
        r33.drawCircle(r1, r1, r1, f33026b);     // Catch: Throwable -> L8
        r33.drawBitmap(r94, null, r02, f33027c);     // Catch: Throwable -> L8
        e(r33);     // Catch: Throwable -> L8
        r23.unlock();
        if (r94.equals(r7) == true) goto L7;
        r6.c(r94);
    L7:
        return r83;
    L8:
        th = move-exception;
        f33028e.unlock();
        throw th;
    }

    public static void e(Canvas r1) {
        r1.setBitmap(null);
    }

    public static Bitmap f(com.bumptech.glide.load.engine.bitmap_recycle.d r6, Bitmap r7, int r8, int r9) {
        if (r7.getWidth() == r8) goto L5;
    L10:
        float r02 = Math.min(r8 / r7.getWidth(), r9 / r7.getHeight());
        int r3 = Math.round(r7.getWidth() * r02);
        int r4 = Math.round(r7.getHeight() * r02);
        if (r7.getWidth() == r3) goto L13;
    L18:
        Bitmap r62 = r6.d((int) (r7.getWidth() * r02), (int) (r7.getHeight() * r02), k(r7));
        q(r7, r62);
        if (Log.isLoggable("TransformationUtils", 2) == false) goto L21;
        Log.v("TransformationUtils", "request: " + r8 + "x" + r9);
        Log.v("TransformationUtils", "toFit:   " + r7.getWidth() + "x" + r7.getHeight());
        Log.v("TransformationUtils", "toReuse: " + r62.getWidth() + "x" + r62.getHeight());
        StringBuilder r82 = new StringBuilder();
        r82.append("minPct:   ");
        r82.append(r02);
        Log.v("TransformationUtils", r82.toString());
    L21:
        Matrix r83 = new Matrix();
        r83.setScale(r02, r02);
        a(r7, r62, r83);
        return r62;
    L13:
        if (r7.getHeight() != r4) goto L18;
        if (Log.isLoggable("TransformationUtils", 2) == false) goto L17;
        Log.v("TransformationUtils", "adjusted target size matches input, returning input");
    L17:
        return r7;
    L5:
        if (r7.getHeight() != r9) goto L10;
        if (Log.isLoggable("TransformationUtils", 2) == false) goto L17;
        Log.v("TransformationUtils", "requested target size matches input, returning input");
        return r7;
    }

    public static Bitmap g(com.bumptech.glide.load.engine.bitmap_recycle.d r3, Bitmap r4) {
        Bitmap.Config r02 = h(r4);
        if (r02.equals(r4.getConfig()) == false) goto L5;
        return r4;
    L5:
        Bitmap r32 = r3.d(r4.getWidth(), r4.getHeight(), r02);
        new Canvas(r32).drawBitmap(r4, 0.0f, 0.0f, null);
        return r32;
    }

    public static Bitmap.Config h(Bitmap r1) {
        Bitmap.Config r02 = Bitmap.Config.RGBA_F16;
        if (r02.equals(r1.getConfig()) == false) goto L6;
        return r02;
    L6:
        return Bitmap.Config.ARGB_8888;
    }

    public static Lock i() {
        return f33028e;
    }

    public static int j(int r02) {
        switch(r02) {
            case 3: goto L9;
            case 4: goto L9;
            case 5: goto L7;
            case 6: goto L7;
            case 7: goto L5;
            case 8: goto L5;
            default: goto L3;
        };
    L3:
        return 0;
    L5:
        return SubsamplingScaleImageView.ORIENTATION_270;
    L7:
        return 90;
    L9:
        return SubsamplingScaleImageView.ORIENTATION_180;
    }

    public static Bitmap.Config k(Bitmap r1) {
        if (r1.getConfig() == null) goto L7;
        return r1.getConfig();
    L7:
        return Bitmap.Config.ARGB_8888;
    }

    public static void l(int r5, Matrix r6) {
        switch(r5) {
            case 2: goto L17;
            case 3: goto L15;
            case 4: goto L13;
            case 5: goto L11;
            case 6: goto L9;
            case 7: goto L7;
            case 8: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        r6.setRotate(-90.0f);
        return;
    L7:
        r6.setRotate(-90.0f);
        r6.postScale(-1.0f, 1.0f);
        return;
    L9:
        r6.setRotate(90.0f);
        return;
    L11:
        r6.setRotate(90.0f);
        r6.postScale(-1.0f, 1.0f);
        return;
    L13:
        r6.setRotate(180.0f);
        r6.postScale(-1.0f, 1.0f);
        return;
    L15:
        r6.setRotate(180.0f);
        return;
    L17:
        r6.setScale(-1.0f, 1.0f);
    }

    public static boolean m(int r02) {
        switch(r02) {
            case 2: goto L5;
            case 3: goto L5;
            case 4: goto L5;
            case 5: goto L5;
            case 6: goto L5;
            case 7: goto L5;
            case 8: goto L5;
            default: goto L3;
        };
    L3:
        return false;
    L5:
        return true;
    }

    public static Bitmap n(com.bumptech.glide.load.engine.bitmap_recycle.d r4, Bitmap r5, int r6) {
        if (m(r6) == true) goto L5;
        return r5;
    L5:
        Matrix r02 = new Matrix();
        l(r6, r02);
        RectF r62 = new RectF(0.0f, 0.0f, r5.getWidth(), r5.getHeight());
        r02.mapRect(r62);
        Bitmap r42 = r4.d(Math.round(r62.width()), Math.round(r62.height()), k(r5));
        r02.postTranslate(-r62.left, -r62.top);
        r42.setHasAlpha(r5.hasAlpha());
        a(r5, r42, r02);
        return r42;
    }

    public static Bitmap o(com.bumptech.glide.load.engine.bitmap_recycle.d r2, Bitmap r3, int r4) {
        if (r4 <= 0) goto L4;
        boolean r02 = true;
    L5:
        com.bumptech.glide.util.k.a(r02, "roundingRadius must be greater than 0.");
        return p(r2, r3, new a(r4));
    L4:
        r02 = false;
        goto L5
    }

    public static Bitmap p(com.bumptech.glide.load.engine.bitmap_recycle.d r8, Bitmap r9, b r10) {
        Bitmap.Config r02 = h(r9);
        Bitmap r1 = g(r8, r9);
        Bitmap r03 = r8.d(r1.getWidth(), r1.getHeight(), r02);
        r03.setHasAlpha(true);
        Shader.TileMode r4 = Shader.TileMode.CLAMP;
        BitmapShader r3 = new BitmapShader(r1, r4, r4);
        Paint r42 = new Paint();
        r42.setAntiAlias(true);
        r42.setShader(r3);
        RectF r2 = new RectF(0.0f, 0.0f, r03.getWidth(), r03.getHeight());
        Lock r32 = f33028e;
        r32.lock();
        Canvas r5 = new Canvas(r03);     // Catch: Throwable -> L8
        r5.drawColor(0, PorterDuff.Mode.CLEAR);     // Catch: Throwable -> L8
        r10.a(r5, r42, r2);     // Catch: Throwable -> L8
        e(r5);     // Catch: Throwable -> L8
        r32.unlock();
        if (r1.equals(r9) == true) goto L7;
        r8.c(r1);
    L7:
        return r03;
    L8:
        th = move-exception;
        f33028e.unlock();
        throw th;
    }

    public static void q(Bitmap r02, Bitmap r1) {
        r1.setHasAlpha(r02.hasAlpha());
    }
}
