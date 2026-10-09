package id.zelory.compressor;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes2.dex */
public abstract class b {
    public static int a(BitmapFactory.Options r3, int r4, int r5) {
        int r02 = r3.outHeight;
        int r32 = r3.outWidth;
        int r1 = 1;
        if (r02 > r5) goto L7;
        if (r32 > r4) goto L7;
        return 1;
    L7:
        int r03 = r02 / 2;
        int r33 = r32 / 2;
    L9:
        if ((r03 / r1) < r5) goto L13;
        if ((r33 / r1) < r4) goto L13;
        r1 = r1 * 2;
    L13:
        return r1;
    }

    public static File b(File r2, int r3, int r4, Bitmap.CompressFormat r5, int r6, String r7) {
        File r02 = new File(r7).getParentFile();
        if (r02.exists() == true) goto L5;
        r02.mkdirs();
    L5:
        FileOutputStream r03 = null;
        FileOutputStream r1 = new FileOutputStream(r7);     // Catch: Throwable -> L12
        c(r2, r3, r4).compress(r5, r6, r1);     // Catch: Throwable -> L10
        r1.flush();
        r1.close();
        return new File(r7);
    L10:
        th = th;
        r03 = r1;
    L13:
        if (r03 == null) goto L15;
        r03.flush();
        r03.close();
    L15:
        throw th;
    L12:
        th = th;
        goto L13
    }

    public static Bitmap c(File r8, int r9, int r10) {
        BitmapFactory.Options r02 = new BitmapFactory.Options();
        r02.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(r8.getAbsolutePath(), r02);
        r02.inSampleSize = a(r02, r9, r10);
        r02.inJustDecodeBounds = false;
        Bitmap r1 = BitmapFactory.decodeFile(r8.getAbsolutePath(), r02);
        int r82 = new ExifInterface(r8.getAbsolutePath()).getAttributeInt("Orientation", 0);
        Matrix r6 = new Matrix();
        if (r82 != 6) goto L6;
        r6.postRotate(90.0f);
    L12:
        return Bitmap.createBitmap(r1, 0, 0, r1.getWidth(), r1.getHeight(), r6, true);
    L6:
        if (r82 != 3) goto L9;
        r6.postRotate(180.0f);
        goto L12
    L9:
        if (r82 != 8) goto L12;
        r6.postRotate(270.0f);
        goto L12
    }
}
