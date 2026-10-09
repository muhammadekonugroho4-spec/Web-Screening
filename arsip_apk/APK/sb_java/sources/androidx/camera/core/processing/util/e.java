package androidx.camera.core.processing.util;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class e {
    public e() {
    }

    public static e h(int r7, int r8, Rect r9, Size r10, int r11, boolean r12) {
        return i(r7, r8, r9, r10, r11, r12, false);
    }

    public static e i(int r9, int r10, Rect r11, Size r12, int r13, boolean r14, boolean r15) {
        return new b(UUID.randomUUID(), r9, r10, r11, r12, r13, r14, r15);
    }

    public abstract Rect a();

    public abstract int b();

    public abstract int c();

    public abstract Size d();

    public abstract int e();

    public abstract UUID f();

    public abstract boolean g();

    public abstract boolean j();
}
