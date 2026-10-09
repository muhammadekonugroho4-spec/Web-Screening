package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface W extends AutoCloseable {

    public interface a {
        ByteBuffer g();

        int h();

        int i();
    }

    a[] S();

    void Y0(Rect r1);

    @Override // java.lang.AutoCloseable
    void close();

    int getHeight();

    int getWidth();

    S m0();

    int q();

    Image z1();
}
