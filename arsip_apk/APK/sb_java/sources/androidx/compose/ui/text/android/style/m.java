package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public class m extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final float f19832a;

    static {
    }

    public m(float r1) {
        this.f19832a = r1;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint r3) {
        r3.setTextSkewX(this.f19832a + r3.getTextSkewX());
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint r3) {
        r3.setTextSkewX(this.f19832a + r3.getTextSkewX());
    }
}
