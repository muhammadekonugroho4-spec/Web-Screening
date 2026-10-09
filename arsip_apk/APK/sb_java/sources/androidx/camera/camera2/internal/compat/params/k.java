package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* loaded from: classes.dex */
public abstract class k extends o {
    public k(Object r1) {
        super(r1);
    }

    @Override // androidx.camera.camera2.internal.compat.params.j.a
    public Surface a() {
        return ((OutputConfiguration) i()).getSurface();
    }

    @Override // androidx.camera.camera2.internal.compat.params.j.a
    public abstract Object i();
}
