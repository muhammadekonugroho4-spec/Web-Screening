package androidx.camera.camera2.internal.compat.workaround;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import androidx.camera.core.impl.G0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4425a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4426b;

    public y(G0 r2) {
        this.f4425a = CaptureIntentPreviewQuirk.c(r2);
        this.f4426b = r2.a(ImageCaptureFailedForVideoSnapshotQuirk.class);
    }

    public Map a(int r3) {
        if (r3 != 3) goto L9;
        if (this.f4425a == false) goto L9;
        HashMap r32 = new HashMap();
        r32.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
        return Collections.unmodifiableMap(r32);
    L9:
        if (r3 != 4) goto L15;
        if (this.f4426b == false) goto L15;
        HashMap r33 = new HashMap();
        r33.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
        return Collections.unmodifiableMap(r33);
    L15:
        return Collections.EMPTY_MAP;
    }
}
