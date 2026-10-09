package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;

/* loaded from: classes.dex */
public class AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk implements CaptureIntentPreviewQuirk {
    public AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk() {
    }

    public static boolean d() {
        if ("samsung".equalsIgnoreCase(Build.BRAND) == true) goto L5;
        return false;
    L5:
        if (Build.DEVICE.equalsIgnoreCase("m55xq") == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean e() {
        return d();
    }

    @Override // androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk
    public boolean a() {
        return d();
    }
}
