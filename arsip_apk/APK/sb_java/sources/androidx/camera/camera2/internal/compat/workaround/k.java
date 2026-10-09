package androidx.camera.camera2.internal.compat.workaround;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.core.impl.SurfaceConfig;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final ExtraCroppingQuirk f4403a;

    public k() {
        this((ExtraCroppingQuirk) androidx.camera.camera2.internal.compat.quirk.e.b(ExtraCroppingQuirk.class));
    }

    public Size a(Size r5) {
        ExtraCroppingQuirk r02 = this.f4403a;
        if (r02 == null) goto L7;
        Size r03 = r02.d(SurfaceConfig.ConfigType.PRIV);
        if (r03 == null) goto L7;
        if ((r03.getWidth() * r03.getHeight()) <= (r5.getWidth() * r5.getHeight())) goto L11;
        return r03;
    L11:
        return r5;
    L7:
        return r5;
    }

    public k(ExtraCroppingQuirk r1) {
        this.f4403a = r1;
    }
}
