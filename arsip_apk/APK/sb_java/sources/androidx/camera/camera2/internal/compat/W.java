package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;

/* loaded from: classes.dex */
public class W extends X {
    public W(StreamConfigurationMap r1) {
        super(r1);
    }

    @Override // androidx.camera.camera2.internal.compat.V.a
    public long b(int r2, Size r3) {
        return this.f4285a.getOutputMinFrameDuration(r2, r3);
    }

    @Override // androidx.camera.camera2.internal.compat.V.a
    public Size[] c(int r2) {
        return this.f4285a.getOutputSizes(r2);
    }
}
