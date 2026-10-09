package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
public final class l extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final int f19829a;

    /* renamed from: b, reason: collision with root package name */
    public final float f19830b;

    /* renamed from: c, reason: collision with root package name */
    public final float f19831c;
    public final float d;

    static {
    }

    public l(int r1, float r2, float r3, float r4) {
        this.f19829a = r1;
        this.f19830b = r2;
        this.f19831c = r3;
        this.d = r4;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint r5) {
        r5.setShadowLayer(this.d, this.f19830b, this.f19831c, this.f19829a);
    }
}
