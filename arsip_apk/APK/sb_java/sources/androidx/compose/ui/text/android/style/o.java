package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class o extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final Typeface f19835a;

    static {
    }

    public o(Typeface r1) {
        this.f19835a = r1;
    }

    public final void a(Paint r2) {
        r2.setTypeface(this.f19835a);
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
