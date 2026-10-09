package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public class a extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final float f19799a;

    static {
    }

    public a(float r1) {
        this.f19799a = r1;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint r4) {
        r4.baselineShift += (int) Math.ceil(r4.ascent() * this.f19799a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint r4) {
        r4.baselineShift += (int) Math.ceil(r4.ascent() * this.f19799a);
    }
}
