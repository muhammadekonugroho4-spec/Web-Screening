package androidx.compose.ui.platform;

import java.text.BreakIterator;
import java.util.Locale;

/* renamed from: androidx.compose.ui.platform.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3660g extends AbstractC3648a {
    public static final a d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final int f19334e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static C3660g f19335f;

    /* renamed from: c, reason: collision with root package name */
    public BreakIterator f19336c;

    /* renamed from: androidx.compose.ui.platform.g$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final C3660g a(Locale r3) {
            if (C3660g.g() != null) goto L5;
            C3660g.h(new C3660g(r3, null));
        L5:
            C3660g r32 = C3660g.g();
            kotlin.jvm.internal.p.j(r32, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
            return r32;
        }

        public a() {
        }
    }

    static {
        d = new a(null);
        f19334e = 8;
    }

    public /* synthetic */ C3660g(Locale r1, kotlin.jvm.internal.i r2) {
        this(r1);
    }

    public static final /* synthetic */ C3660g g() {
        return f19335f;
    }

    public static final /* synthetic */ void h(C3660g r02) {
        f19335f = r02;
    }

    private final boolean i(int r2) {
        if (r2 > 0) goto L4;
        return false;
    L4:
        if (j(r2 - 1) == true) goto L6;
        return false;
    L6:
        if (r2 != d().length()) goto L8;
        return true;
    L8:
        if (j(r2) == true) goto L15;
        return true;
    L15:
        return false;
    }

    private final boolean k(int r2) {
        if (j(r2) == true) goto L5;
        return false;
    L5:
        if (r2 != 0) goto L7;
    L8:
        return true;
    L7:
        if (j(r2 - 1) == false) goto L8;
        return false;
    }

    private final void l(Locale r1) {
        this.f19336c = BreakIterator.getWordInstance(r1);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3658f
    public int[] a(int r5) {
        if (d().length() > 0) goto L6;
        return null;
    L6:
        if (r5 < d().length()) goto L8;
        return null;
    L8:
        if (r5 >= 0) goto L11;
        r5 = 0;
    L11:
        if (j(r5) == true) goto L20;
        if (k(r5) == true) goto L20;
        BreakIterator r02 = this.f19336c;
        if (r02 != null) goto L17;
        kotlin.jvm.internal.p.D("impl");
        r02 = null;
    L17:
        r5 = r02.following(r5);
        if (r5 != (-1)) goto L11;
        return null;
    L20:
        BreakIterator r03 = this.f19336c;
        if (r03 != null) goto L23;
        kotlin.jvm.internal.p.D("impl");
        r03 = null;
    L23:
        int r04 = r03.following(r5);
        if (r04 != (-1)) goto L26;
    L30:
        return null;
    L26:
        if (i(r04) == false) goto L30;
        return c(r5, r04);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3658f
    public int[] b(int r5) {
        int r02 = d().length();
        if (r02 > 0) goto L5;
        return null;
    L5:
        if (r5 > 0) goto L7;
        return null;
    L7:
        if (r5 <= r02) goto L10;
        r5 = r02;
    L10:
        if (r5 <= 0) goto L21;
        if (j(r5 - 1) == true) goto L21;
        if (i(r5) == true) goto L21;
        BreakIterator r3 = this.f19336c;
        if (r3 != null) goto L18;
        kotlin.jvm.internal.p.D("impl");
        r3 = null;
    L18:
        r5 = r3.preceding(r5);
        if (r5 != (-1)) goto L10;
        return null;
    L21:
        BreakIterator r32 = this.f19336c;
        if (r32 != null) goto L24;
        kotlin.jvm.internal.p.D("impl");
        r32 = null;
    L24:
        int r2 = r32.preceding(r5);
        if (r2 != (-1)) goto L27;
    L31:
        return null;
    L27:
        if (k(r2) == false) goto L31;
        return c(r2, r5);
    }

    @Override // androidx.compose.ui.platform.AbstractC3648a
    public void e(String r2) {
        super.e(r2);
        BreakIterator r02 = this.f19336c;
        if (r02 != null) goto L5;
        kotlin.jvm.internal.p.D("impl");
        r02 = null;
    L5:
        r02.setText(r2);
    }

    public final boolean j(int r2) {
        if (r2 >= 0) goto L4;
        return false;
    L4:
        if (r2 < d().length()) goto L6;
        return false;
    L6:
        return Character.isLetterOrDigit(d().codePointAt(r2));
    }

    public C3660g(Locale r1) {
        l(r1);
    }
}
