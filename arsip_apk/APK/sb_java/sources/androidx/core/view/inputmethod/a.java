package androidx.core.view.inputmethod;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import androidx.core.util.h;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f23252a = null;

    /* renamed from: androidx.core.view.inputmethod.a$a, reason: collision with other inner class name */
    public static class C0175a {
        public static void a(EditorInfo r02, CharSequence r1, int r2) {
            r02.setInitialSurroundingSubText(r1, r2);
        }
    }

    public static class b {
        public static void a(EditorInfo r02, boolean r1) {
            r02.setStylusHandwritingEnabled(r1);
        }
    }

    static {
        f23252a = new String[0];
    }

    public static boolean a(CharSequence r1, int r2, int r3) {
        if (r3 == 0) goto L10;
        if (r3 == 1) goto L8;
        return false;
    L8:
        return Character.isHighSurrogate(r1.charAt(r2));
    L10:
        return Character.isLowSurrogate(r1.charAt(r2));
    }

    public static boolean b(int r1) {
        int r12 = r1 & 4095;
        if (r12 != 129) goto L5;
        return true;
    L5:
        if (r12 != 225) goto L7;
        return true;
    L7:
        if (r12 == 18) goto L14;
        return false;
    L14:
        return true;
    }

    public static void c(EditorInfo r02, String[] r1) {
        r02.contentMimeTypes = r1;
    }

    public static void d(EditorInfo r5, CharSequence r6, int r7) {
        h.g(r6);
        if (Build.VERSION.SDK_INT < 30) goto L6;
        C0175a.a(r5, r6, r7);
        return;
    L6:
        int r02 = r5.initialSelStart;
        int r1 = r5.initialSelEnd;
        if (r02 <= r1) goto L9;
        int r2 = r1 - r7;
    L10:
        if (r02 <= r1) goto L12;
        int r03 = r02 - r7;
    L13:
        int r12 = r6.length();
        if (r7 < 0) goto L28;
        if (r2 < 0) goto L28;
        if (r03 > r12) goto L28;
        if (b(r5.inputType) == false) goto L23;
        g(r5, null, 0, 0);
        return;
    L23:
        if (r12 > 2048) goto L26;
        g(r5, r6, r2, r03);
        return;
    L26:
        h(r5, r6, r2, r03);
        return;
    L28:
        g(r5, null, 0, 0);
        return;
    L12:
        r03 = r1 - r7;
        goto L13
    L9:
        r2 = r02 - r7;
        goto L10
    }

    public static void e(EditorInfo r3, CharSequence r4) {
        if (Build.VERSION.SDK_INT < 30) goto L6;
        C0175a.a(r3, r4, 0);
        return;
    L6:
        d(r3, r4, 0);
    }

    public static void f(EditorInfo r2, boolean r3) {
        if (Build.VERSION.SDK_INT < 35) goto L6;
        b.a(r2, r3);
    L6:
        if (r2.extras != null) goto L8;
        r2.extras = new Bundle();
    L8:
        r2.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", r3);
    }

    public static void g(EditorInfo r2, CharSequence r3, int r4, int r5) {
        if (r2.extras != null) goto L5;
        r2.extras = new Bundle();
    L5:
        if (r3 == null) goto L7;
        SpannableStringBuilder r02 = new SpannableStringBuilder(r3);
    L8:
        r2.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", r02);
        r2.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", r4);
        r2.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", r5);
        return;
    L7:
        r02 = null;
        goto L8
    }

    public static void h(EditorInfo r10, CharSequence r11, int r12, int r13) {
        int r1 = r13 - r12;
        if (r1 <= 1024) goto L5;
        int r2 = 0;
    L6:
        int r5 = 2048 - r2;
        int r4 = Math.min(r11.length() - r13, r5 - Math.min(r12, (int) (r5 * 0.8d)));
        int r52 = Math.min(r12, r5 - r4);
        int r122 = r12 - r52;
        if (a(r11, r122, 0) == false) goto L10;
        r122 = r122 + 1;
        r52 = r52 - 1;
    L10:
        if (a(r11, (r13 + r4) - 1, 1) == false) goto L12;
        r4 = r4 - 1;
    L12:
        int r6 = (r52 + r2) + r4;
        if (r2 == r1) goto L15;
        CharSequence r112 = TextUtils.concat(new CharSequence[]{r11.subSequence(r122, r122 + r52), r11.subSequence(r13, r4 + r13)});
    L16:
        g(r10, r112, r52, r2 + r52);
        return;
    L15:
        r112 = r11.subSequence(r122, r6 + r122);
        goto L16
    L5:
        r2 = r1;
        goto L6
    }
}
