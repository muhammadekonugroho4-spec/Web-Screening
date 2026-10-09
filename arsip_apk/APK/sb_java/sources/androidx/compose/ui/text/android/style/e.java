package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class e extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final float f19802a;

    static {
    }

    public e(float r1) {
        this.f19802a = r1;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint r2) {
        r2.setLetterSpacing(this.f19802a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint r2) {
        r2.setLetterSpacing(this.f19802a);
    }
}
