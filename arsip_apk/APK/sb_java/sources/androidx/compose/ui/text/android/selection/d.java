package androidx.compose.ui.text.android.selection;

import android.text.TextPaint;

/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f19788a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f19789b;

    static {
    }

    public d(CharSequence r1, TextPaint r2) {
        this.f19788a = r1;
        this.f19789b = r2;
    }

    @Override // androidx.compose.ui.text.android.selection.b
    public int e(int r8) {
        TextPaint r02 = this.f19789b;
        CharSequence r1 = this.f19788a;
        return c.a(r02, r1, 0, r1.length(), false, r8, 0);
    }

    @Override // androidx.compose.ui.text.android.selection.b
    public int f(int r8) {
        TextPaint r02 = this.f19789b;
        CharSequence r1 = this.f19788a;
        return c.a(r02, r1, 0, r1.length(), false, r8, 2);
    }
}
