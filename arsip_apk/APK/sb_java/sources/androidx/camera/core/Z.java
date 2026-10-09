package androidx.camera.core;

import android.graphics.Matrix;
import androidx.camera.core.impl.R0;
import androidx.camera.core.impl.utils.ExifData;

/* loaded from: classes.dex */
public abstract class Z implements S {
    public Z() {
    }

    public static S d(R0 r7, long r8, int r10, Matrix r11, int r12) {
        return new C2220h(r7, r8, r10, r11, r12);
    }

    @Override // androidx.camera.core.S
    public abstract R0 a();

    @Override // androidx.camera.core.S
    public abstract int b();

    @Override // androidx.camera.core.S
    public void c(ExifData.b r2) {
        r2.m(e());
    }

    public abstract int e();

    public abstract Matrix f();

    @Override // androidx.camera.core.S
    public abstract long getTimestamp();
}
