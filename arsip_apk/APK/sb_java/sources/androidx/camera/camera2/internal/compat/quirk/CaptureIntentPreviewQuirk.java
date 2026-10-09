package androidx.camera.camera2.internal.compat.quirk;

import androidx.camera.core.impl.D0;
import androidx.camera.core.impl.G0;
import java.util.Iterator;

/* loaded from: classes.dex */
public interface CaptureIntentPreviewQuirk extends D0 {
    static boolean c(G0 r1) {
        Iterator r12 = r1.c(CaptureIntentPreviewQuirk.class).iterator();
    L4:
        if (r12.hasNext() == false) goto L9;
        if (((CaptureIntentPreviewQuirk) r12.next()).a() == false) goto L4;
        return true;
    L9:
        return false;
    }

    default boolean a() {
        return true;
    }
}
