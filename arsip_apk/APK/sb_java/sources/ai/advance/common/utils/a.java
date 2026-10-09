package ai.advance.common.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static Bitmap.Config f1741a;

    /* renamed from: b, reason: collision with root package name */
    public static Integer f1742b;

    /* renamed from: c, reason: collision with root package name */
    public static Integer f1743c;

    static {
        f1741a = Bitmap.Config.RGB_565;
        f1742b = null;
        f1743c = null;
    }

    public static Bitmap a(byte[] r2, BitmapFactory.Options r3) {
        ByteArrayInputStream r02 = new ByteArrayInputStream(r2);
        Bitmap r22 = (Bitmap) new SoftReference(BitmapFactory.decodeStream(r02, null, r3)).get();
        r02.close();     // Catch: Exception -> L5
    L4:
        return r22;
    }

    public static Bitmap b(ByteArrayOutputStream r2) {
        BitmapFactory.Options r02 = new BitmapFactory.Options();
        r02.inPreferredConfig = f1741a;
        return c(r2, r02);
    }

    public static Bitmap c(ByteArrayOutputStream r1, BitmapFactory.Options r2) {
        Bitmap r22 = a(r1.toByteArray(), r2);
        r1.close();     // Catch: Exception -> L5
    L4:
        return r22;
    }

    public static byte[] d(Bitmap r1) {
        ByteBuffer r02 = ByteBuffer.allocate(r1.getByteCount());
        r1.copyPixelsToBuffer(r02);
        return r02.array();
    }

    public static Bitmap e(byte[] r6, int r7, int r8, int r9, boolean r10, boolean r11) {
        YuvImage r02 = new YuvImage(r6, 17, r7, r8, null);
        ByteArrayOutputStream r62 = new ByteArrayOutputStream();
        r02.compressToJpeg(new Rect(0, 0, r7, r8), 80, r62);
        Bitmap r63 = b(r62);
        if (r10 == false) goto L9;
        if (r11 == false) goto L6;
        int r72 = SubsamplingScaleImageView.ORIENTATION_180;
    L7:
        r9 = r9 - r72;
        goto L9
    L6:
        r72 = 360;
    L9:
        return f(r63, r9);
    }

    public static Bitmap f(Bitmap r7, float r8) {
        if (r8 != 0.0f) goto L5;
        return r7;
    L5:
        if (r7 != null) goto L8;
        return null;
    L8:
        int r3 = r7.getWidth();
        int r4 = r7.getHeight();
        Matrix r5 = new Matrix();
        r5.setRotate(r8);
        Bitmap r72 = Bitmap.createBitmap(r7, 0, 0, r3, r4, r5, false);
        r7.recycle();
        return r72;
    }
}
