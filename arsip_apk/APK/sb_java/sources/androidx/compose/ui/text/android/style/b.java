package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class b extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final String f19800a;

    static {
    }

    public b(String r1) {
        this.f19800a = r1;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint r2) {
        r2.setFontFeatureSettings(this.f19800a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint r2) {
        r2.setFontFeatureSettings(this.f19800a);
    }
}
