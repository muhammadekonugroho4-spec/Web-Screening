package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.P;

/* loaded from: classes.dex */
public interface a0 {
    void a();

    void b(Bitmap r1);

    void c(ImageCaptureException r1);

    void d(androidx.camera.core.W r1);

    boolean e();

    void f();

    void g(P.i r1);

    void h(ImageCaptureException r1);

    void onCaptureProcessProgressed(int r1);
}
