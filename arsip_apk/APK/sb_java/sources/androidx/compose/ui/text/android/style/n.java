package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
public final class n extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f19833a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19834b;

    static {
    }

    public n(boolean r1, boolean r2) {
        this.f19833a = r1;
        this.f19834b = r2;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint r2) {
        r2.setUnderlineText(this.f19833a);
        r2.setStrikeThruText(this.f19834b);
    }
}
