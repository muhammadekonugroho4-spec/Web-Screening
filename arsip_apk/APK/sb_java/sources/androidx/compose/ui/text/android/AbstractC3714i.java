package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: androidx.compose.ui.text.android.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3714i {
    public static /* synthetic */ BoringLayout a(CharSequence r12, TextPaint r13, int r14, Layout.Alignment r15, float r16, float r17, BoringLayout.Metrics r18, boolean r19, TextUtils.TruncateAt r20, int r21, boolean r22) {
        return new BoringLayout(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22);
    }
}
