package androidx.compose.ui.text.android;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f19726a = true;

    static {
    }

    public static final /* synthetic */ boolean a() {
        return f19726a;
    }

    public static final /* synthetic */ boolean b(float r02, CharSequence r1, TextPaint r2) {
        return d(r02, r1, r2);
    }

    public static final /* synthetic */ CharSequence c(CharSequence r02) {
        return e(r02);
    }

    public static final boolean d(float r1, CharSequence r2, TextPaint r3) {
        if (r1 != 0.0f) goto L6;
        return false;
    L6:
        if ((r2 instanceof Spanned) == false) goto L12;
        Spanned r22 = (Spanned) r2;
        if (O.a(r22, androidx.compose.ui.text.android.style.f.class) == false) goto L10;
        return true;
    L10:
        if (O.a(r22, androidx.compose.ui.text.android.style.e.class) == false) goto L12;
        return true;
    L12:
        if (r3.getLetterSpacing() != 0.0f) goto L19;
        return false;
    L19:
        return true;
    }

    public static final CharSequence e(CharSequence r6) {
        if ((r6 instanceof Spanned) == false) goto L22;
        Spanned r02 = (Spanned) r6;
        if (O.a(r02, CharacterStyle.class) == false) goto L22;
        int r3 = 0;
        CharacterStyle[] r03 = (CharacterStyle[]) r02.getSpans(0, r6.length(), CharacterStyle.class);
        if (r03 == null) goto L22;
        if (r03.length == 0) goto L22;
        int r1 = r03.length;
        SpannableString r2 = null;
    L13:
        if (r3 >= r1) goto L20;
        CharacterStyle r4 = r03[r3];
        if ((r4 instanceof MetricAffectingSpan) == true) goto L19;
        if (r2 != null) goto L18;
        r2 = new SpannableString(r6);
    L18:
        r2.removeSpan(r4);
    L19:
        r3 = r3 + 1;
        goto L13
    L20:
        if (r2 == null) goto L22;
        return r2;
    L22:
        return r6;
    }
}
