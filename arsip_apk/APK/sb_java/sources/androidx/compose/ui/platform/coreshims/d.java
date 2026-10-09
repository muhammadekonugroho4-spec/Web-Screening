package androidx.compose.ui.platform.coreshims;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.compose.ui.contentcapture.m;

/* loaded from: classes.dex */
public abstract class d {

    public static class a {
        public static AutofillId a(View r02) {
            return r02.getAutofillId();
        }
    }

    public static class b {
        public static ContentCaptureSession a(View r02) {
            return r02.getContentCaptureSession();
        }
    }

    public static class c {
        public static void a(View r02, int r1) {
            r02.setImportantForContentCapture(r1);
        }
    }

    public static androidx.compose.ui.platform.coreshims.a a(View r02) {
        return androidx.compose.ui.platform.coreshims.a.b(a.a(r02));
    }

    public static m b(View r3) {
        if (Build.VERSION.SDK_INT < 29) goto L9;
        ContentCaptureSession r02 = b.a(r3);
        if (r02 != null) goto L8;
        return null;
    L8:
        return androidx.compose.ui.platform.coreshims.c.f(r02, r3);
    L9:
        return null;
    }

    public static void c(View r2, int r3) {
        if (Build.VERSION.SDK_INT < 30) goto L6;
        c.a(r2, r3);
        return;
    }
}
