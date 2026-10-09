package androidx.camera.core.internal.compat;

import android.media.Image;
import android.media.ImageWriter;
import android.view.Surface;
import androidx.camera.core.impl.utils.k;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class d {
    public static /* synthetic */ void a(ImageWriter.OnImageReleasedListener r02, ImageWriter r1) {
        r02.onImageReleased(r1);
    }

    public static /* synthetic */ void b(Executor r1, final ImageWriter.OnImageReleasedListener r2, final ImageWriter r3) {
        r1.execute(new c(r2, r3));
    }

    public static ImageWriter c(Surface r02, int r1) {
        return ImageWriter.newInstance(r02, r1);
    }

    public static void d(ImageWriter r02, Image r1) {
        r02.queueInputImage(r1);
    }

    public static void e(ImageWriter r1, final ImageWriter.OnImageReleasedListener r2, final Executor r3) {
        r1.setOnImageReleasedListener(new b(r3, r2), k.a());
    }
}
