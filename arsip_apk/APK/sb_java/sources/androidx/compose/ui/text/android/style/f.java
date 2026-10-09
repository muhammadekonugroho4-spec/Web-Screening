package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class f extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final float f19803a;

    static {
    }

    public f(float r1) {
        this.f19803a = r1;
    }

    public final void a(TextPaint r3) {
        float r02 = r3.getTextSize() * r3.getTextScaleX();
        if (r02 != 0.0f) goto L5;
        return;
    L5:
        r3.setLetterSpacing(this.f19803a / r02);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint r1) {
        a(r1);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint r1) {
        a(r1);
    }
}
