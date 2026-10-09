package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;

/* renamed from: androidx.compose.ui.text.android.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3712g {
    public static /* bridge */ /* synthetic */ BoringLayout.Metrics a(CharSequence r02, TextPaint r1, TextDirectionHeuristic r2, boolean r3, BoringLayout.Metrics r4) {
        return BoringLayout.isBoring(r02, r1, r2, r3, r4);
    }
}
