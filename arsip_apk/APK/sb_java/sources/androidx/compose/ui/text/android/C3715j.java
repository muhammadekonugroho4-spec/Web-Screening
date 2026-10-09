package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: androidx.compose.ui.text.android.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3715j {

    /* renamed from: a, reason: collision with root package name */
    public static final C3715j f19779a = null;

    static {
        f19779a = new C3715j();
    }

    public C3715j() {
    }

    public static final BoringLayout a(CharSequence r1, TextPaint r2, int r3, Layout.Alignment r4, float r5, float r6, BoringLayout.Metrics r7, boolean r8, boolean r9, TextUtils.TruncateAt r10, int r11) {
        return AbstractC3714i.a(r1, r2, r3, r4, r5, r6, r7, r8, r10, r11, r9);
    }

    public static final BoringLayout.Metrics b(CharSequence r2, TextPaint r3, TextDirectionHeuristic r4) {
        return AbstractC3712g.a(r2, r3, r4, true, null);
    }

    public static final boolean c(BoringLayout r02) {
        return AbstractC3713h.a(r02);
    }
}
