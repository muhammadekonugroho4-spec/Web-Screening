package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* loaded from: classes.dex */
public final class g implements LineHeightSpan {

    /* renamed from: a, reason: collision with root package name */
    public final float f19804a;

    static {
    }

    public g(float r1) {
        this.f19804a = r1;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence r3, int r4, int r5, int r6, int r7, Paint.FontMetricsInt r8) {
        int r32 = i.a(r8);
        if (r32 > 0) goto L5;
        return;
    L5:
        int r42 = (int) Math.ceil(this.f19804a);
        int r33 = (int) Math.ceil(r8.descent * ((r42 * 1.0f) / r32));
        r8.descent = r33;
        r8.ascent = r33 - r42;
    }
}
