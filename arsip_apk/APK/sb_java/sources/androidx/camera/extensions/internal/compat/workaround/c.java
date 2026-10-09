package androidx.camera.extensions.internal.compat.workaround;

import android.media.ImageWriter;
import android.view.Surface;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static /* bridge */ /* synthetic */ ImageWriter a(Surface r02, int r1, int r2) {
        return ImageWriter.newInstance(r02, r1, r2);
    }
}
