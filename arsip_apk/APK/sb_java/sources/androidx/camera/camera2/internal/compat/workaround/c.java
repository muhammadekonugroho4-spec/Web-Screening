package androidx.camera.camera2.internal.compat.workaround;

import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.core.impl.G0;

/* loaded from: classes.dex */
public abstract class c {
    public static boolean a(G0 r1) {
        if (r1.a(LegacyCameraOutputConfigNullPointerQuirk.class) == false) goto L5;
        return true;
    L5:
        if (r1.a(CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk.class) == true) goto L11;
        return false;
    L11:
        return true;
    }
}
