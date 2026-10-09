package androidx.compose.ui.text.android.selection;

import java.text.BreakIterator;

/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f19790a;

    /* renamed from: b, reason: collision with root package name */
    public final BreakIterator f19791b;

    static {
    }

    public e(CharSequence r2) {
        this.f19790a = r2;
        BreakIterator r02 = BreakIterator.getCharacterInstance();
        r02.setText(r2.toString());
        this.f19791b = r02;
    }

    @Override // androidx.compose.ui.text.android.selection.b
    public int e(int r2) {
        return this.f19791b.following(r2);
    }

    @Override // androidx.compose.ui.text.android.selection.b
    public int f(int r2) {
        return this.f19791b.preceding(r2);
    }
}
