package app.rive.runtime.kotlin.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* loaded from: classes4.dex */
public class Decoder {
    public Decoder() {
    }

    public static int[] decodeToPixels(byte[] r12) {
        BitmapFactory.Options r1 = new BitmapFactory.Options();     // Catch: Exception -> L5
        r1.inMutable = true;     // Catch: Exception -> L5
        r1.inScaled = false;     // Catch: Exception -> L5
        Bitmap r4 = BitmapFactory.decodeByteArray(r12, 0, r12.length, r1);     // Catch: Exception -> L5
        int r7 = r4.getWidth();     // Catch: Exception -> L5
        int r11 = r4.getHeight();     // Catch: Exception -> L5
        int[] r5 = new int[(r7 * r11) + 2];     // Catch: Exception -> L5
        r4.getPixels(r5, 2, r7, 0, 0, r7, r11);     // Catch: Exception -> L5
        r5[0] = r7;     // Catch: Exception -> L5
        r5[1] = r11;     // Catch: Exception -> L5
        return r5;
    L6:
        return new int[0];
    }
}
