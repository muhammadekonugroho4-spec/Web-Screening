package androidx.compose.ui.text.android;

import android.graphics.RectF;
import android.text.Layout;
import android.text.SegmentFinder;

/* renamed from: androidx.compose.ui.text.android.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3707b {
    public static /* bridge */ /* synthetic */ int[] a(Layout r02, RectF r1, SegmentFinder r2, Layout.TextInclusionStrategy r3) {
        return r02.getRangeForRect(r1, r2, r3);
    }
}
