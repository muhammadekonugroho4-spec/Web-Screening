package androidx.compose.ui.text.android.selection;

import androidx.compose.ui.text.android.D;
import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final a f19792e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final int f19793f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f19794a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19795b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19796c;
    public final BreakIterator d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final boolean a(int r2) {
            int r22 = Character.getType(r2);
            if (r22 != 23) goto L5;
            return true;
        L5:
            if (r22 != 20) goto L7;
            return true;
        L7:
            if (r22 != 22) goto L9;
            return true;
        L9:
            if (r22 != 30) goto L11;
            return true;
        L11:
            if (r22 != 29) goto L13;
            return true;
        L13:
            if (r22 != 24) goto L15;
            return true;
        L15:
            if (r22 == 21) goto L26;
            return false;
        L26:
            return true;
        }

        public a() {
        }
    }

    static {
        f19792e = new a(null);
        f19793f = 8;
    }

    public i(CharSequence r4, int r5, int r6, Locale r7) {
        this.f19794a = r4;
        boolean r02 = true;
        if (r5 >= 0) goto L5;
    L7:
        boolean r2 = false;
    L8:
        if (r2 == true) goto L10;
        androidx.compose.ui.text.internal.a.a("input start index is outside the CharSequence");
    L10:
        if (r6 >= 0) goto L12;
    L14:
        r02 = false;
    L15:
        if (r02 == true) goto L17;
        androidx.compose.ui.text.internal.a.a("input end index is outside the CharSequence");
    L17:
        BreakIterator r72 = BreakIterator.getWordInstance(r7);
        this.d = r72;
        this.f19795b = Math.max(0, r5 - 50);
        this.f19796c = Math.min(r4.length(), r6 + 50);
        r72.setText(new D(r4, r5, r6));
        return;
    L12:
        if (r6 > r4.length()) goto L14;
    L5:
        if (r5 > r4.length()) goto L7;
        r2 = true;
        goto L8
    }

    public final void a(int r4) {
        int r02 = this.f19795b;
        boolean r2 = false;
        if (r4 > this.f19796c) goto L6;
        if (r02 > r4) goto L6;
        r2 = true;
    L6:
        if (r2 == true) goto L9;
        androidx.compose.ui.text.internal.a.a("Invalid offset: " + r4 + ". Valid range is [" + this.f19795b + " , " + this.f19796c + ']');
        return;
    }

    public final int b(int r2, boolean r3) {
        a(r2);
        if (l(r2) == false) goto L13;
        if (j(r2) == false) goto L11;
        if (h(r2) == false) goto L9;
        if (r3 == true) goto L11;
    L9:
        return r2;
    L11:
        return q(r2);
    L13:
        if (h(r2) == true) goto L15;
        return -1;
    L15:
        return q(r2);
    }

    public final int c(int r2, boolean r3) {
        a(r2);
        if (h(r2) == false) goto L13;
        if (j(r2) == false) goto L11;
        if (l(r2) == false) goto L9;
        if (r3 == true) goto L11;
    L9:
        return r2;
    L11:
        return p(r2);
    L13:
        if (l(r2) == true) goto L15;
        return -1;
    L15:
        return p(r2);
    }

    public final int d(int r2) {
        return c(r2, true);
    }

    public final int e(int r2) {
        return b(r2, true);
    }

    public final int f(int r2) {
        a(r2);
    L4:
        if (r2 == (-1)) goto L8;
        if (o(r2) == true) goto L8;
        r2 = q(r2);
    L8:
        return r2;
    }

    public final int g(int r2) {
        a(r2);
    L4:
        if (r2 == (-1)) goto L8;
        if (n(r2) == true) goto L8;
        r2 = p(r2);
    L8:
        return r2;
    }

    public final boolean h(int r4) {
        int r02 = this.f19795b + 1;
        if (r4 > this.f19796c) goto L18;
        if (r02 <= r4) goto L6;
        return false;
    L6:
        if (Character.isLetterOrDigit(Character.codePointBefore(this.f19794a, r4)) == false) goto L8;
        return true;
    L8:
        int r42 = r4 - 1;
        if (Character.isSurrogate(this.f19794a.charAt(r42)) == false) goto L12;
        return true;
    L12:
        if (androidx.emoji2.text.g.k() == false) goto L21;
        androidx.emoji2.text.g r03 = androidx.emoji2.text.g.c();
        if (r03.g() == 1) goto L16;
        return false;
    L16:
        if (r03.f(this.f19794a, r42) == (-1)) goto L23;
        return true;
    L23:
        return false;
    L21:
        return false;
    L18:
        return false;
    }

    public final boolean i(int r3) {
        int r02 = this.f19795b + 1;
        if (r3 > this.f19796c) goto L7;
        if (r02 > r3) goto L9;
        int r32 = Character.codePointBefore(this.f19794a, r3);
        return f19792e.a(r32);
    L9:
        return false;
    L7:
        return false;
    }

    public final boolean j(int r3) {
        a(r3);
        if (this.d.isBoundary(r3) == true) goto L5;
        return false;
    L5:
        if (l(r3) == false) goto L11;
        if (l(r3 - 1) == false) goto L11;
        if (l(r3 + 1) == false) goto L11;
        return false;
    L11:
        if (r3 > 0) goto L13;
    L18:
        return true;
    L13:
        if (r3 >= (this.f19794a.length() - 1)) goto L18;
        if (k(r3) == false) goto L17;
        return false;
    L17:
        if (k(r3 + 1) == false) goto L18;
        return false;
    }

    public final boolean k(int r5) {
        int r1 = r5 - 1;
        Character.UnicodeBlock r02 = Character.UnicodeBlock.of(this.f19794a.charAt(r1));
        Character.UnicodeBlock r2 = Character.UnicodeBlock.HIRAGANA;
        if (p.g(r02, r2) == false) goto L7;
        if (p.g(Character.UnicodeBlock.of(this.f19794a.charAt(r5)), Character.UnicodeBlock.KATAKANA) == false) goto L7;
        return true;
    L7:
        if (p.g(Character.UnicodeBlock.of(this.f19794a.charAt(r5)), r2) == true) goto L9;
        return false;
    L9:
        if (p.g(Character.UnicodeBlock.of(this.f19794a.charAt(r1)), Character.UnicodeBlock.KATAKANA) == false) goto L15;
        return true;
    L15:
        return false;
    }

    public final boolean l(int r4) {
        int r02 = this.f19795b;
        if (r4 >= this.f19796c) goto L18;
        if (r02 <= r4) goto L6;
        return false;
    L6:
        if (Character.isLetterOrDigit(Character.codePointAt(this.f19794a, r4)) == false) goto L9;
        return true;
    L9:
        if (Character.isSurrogate(this.f19794a.charAt(r4)) == false) goto L12;
        return true;
    L12:
        if (androidx.emoji2.text.g.k() == false) goto L21;
        androidx.emoji2.text.g r03 = androidx.emoji2.text.g.c();
        if (r03.g() == 1) goto L16;
        return false;
    L16:
        if (r03.f(this.f19794a, r4) == (-1)) goto L23;
        return true;
    L23:
        return false;
    L21:
        return false;
    L18:
        return false;
    }

    public final boolean m(int r3) {
        int r02 = this.f19795b;
        if (r3 >= this.f19796c) goto L7;
        if (r02 > r3) goto L9;
        int r32 = Character.codePointAt(this.f19794a, r3);
        return f19792e.a(r32);
    L9:
        return false;
    L7:
        return false;
    }

    public final boolean n(int r2) {
        if (m(r2) == false) goto L5;
        return false;
    L5:
        if (i(r2) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final boolean o(int r2) {
        if (m(r2) == true) goto L5;
        return false;
    L5:
        if (i(r2) == true) goto L10;
        return true;
    L10:
        return false;
    }

    public final int p(int r2) {
        a(r2);
        int r22 = this.d.following(r2);
        if (l(r22 - 1) == true) goto L5;
        return r22;
    L5:
        if (l(r22) == true) goto L7;
        return r22;
    L7:
        if (k(r22) == false) goto L9;
        return r22;
    L9:
        return p(r22);
    }

    public final int q(int r2) {
        a(r2);
        int r22 = this.d.preceding(r2);
        if (l(r22) == true) goto L5;
        return r22;
    L5:
        if (h(r22) == true) goto L7;
        return r22;
    L7:
        if (k(r22) == false) goto L9;
        return r22;
    L9:
        return q(r22);
    }
}
