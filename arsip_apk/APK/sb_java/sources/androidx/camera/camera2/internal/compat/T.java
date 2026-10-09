package androidx.camera.camera2.internal.compat;

import android.content.Context;
import java.util.Set;

/* loaded from: classes.dex */
public class T extends S {
    public T(Context r1) {
        super(r1);
    }

    @Override // androidx.camera.camera2.internal.compat.U, androidx.camera.camera2.internal.compat.P.b
    public Set f() {
        return this.f4277a.getConcurrentCameraIds();
    L4:
        e = move-exception;
        throw CameraAccessExceptionCompat.e(e);
    }
}
