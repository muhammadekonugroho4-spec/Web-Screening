package androidx.camera.core.internal.compat;

import android.media.Image;
import android.media.ImageWriter;
import android.view.Surface;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class a {
    public static ImageWriter a(Surface r02, int r1) {
        return d.c(r02, r1);
    }

    public static void b(ImageWriter r02, Image r1) {
        d.d(r02, r1);
    }

    public static void c(ImageWriter r02, ImageWriter.OnImageReleasedListener r1, Executor r2) {
        d.e(r02, r1, r2);
    }
}
