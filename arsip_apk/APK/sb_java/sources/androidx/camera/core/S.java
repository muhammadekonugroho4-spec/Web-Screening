package androidx.camera.core;

import androidx.camera.core.impl.R0;
import androidx.camera.core.impl.utils.ExifData;

/* loaded from: classes.dex */
public interface S {
    R0 a();

    default int b() {
        return 0;
    }

    void c(ExifData.b r1);

    long getTimestamp();
}
