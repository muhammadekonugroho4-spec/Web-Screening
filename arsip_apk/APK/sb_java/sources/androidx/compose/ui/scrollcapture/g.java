package androidx.compose.ui.scrollcapture;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureTarget;
import android.view.View;

/* loaded from: classes.dex */
public abstract /* synthetic */ class g {
    public static /* synthetic */ ScrollCaptureTarget a(View r1, Rect r2, Point r3, ScrollCaptureCallback r4) {
        return new ScrollCaptureTarget(r1, r2, r3, r4);
    }
}
