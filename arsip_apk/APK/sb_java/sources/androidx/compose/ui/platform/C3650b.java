package androidx.compose.ui.platform;

import java.text.BreakIterator;
import java.util.Locale;

/* renamed from: androidx.compose.ui.platform.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3650b extends AbstractC3648a {
    public static final a d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final int f19299e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static C3650b f19300f;

    /* renamed from: c, reason: collision with root package name */
    public BreakIterator f19301c;

    /* renamed from: androidx.compose.ui.platform.b$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final C3650b a(Locale r3) {
            if (C3650b.g() != null) goto L5;
            C3650b.h(new C3650b(r3, null));
        L5:
            C3650b r32 = C3650b.g();
            kotlin.jvm.internal.p.j(r32, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
            return r32;
        }

        public a() {
        }
    }

    static {
        d = new a(null);
        f19299e = 8;
    }

    public /* synthetic */ C3650b(Locale r1, kotlin.jvm.internal.i r2) {
        this(r1);
    }

    public static final /* synthetic */ C3650b g() {
        return f19300f;
    }

    public static final /* synthetic */ void h(C3650b r02) {
        f19300f = r02;
    }

    @Override // androidx.compose.ui.platform.InterfaceC3658f
    public int[] a(int r5) {
        int r02 = d().length();
        if (r02 > 0) goto L5;
        return null;
    L5:
        if (r5 < r02) goto L7;
        return null;
    L7:
        if (r5 >= 0) goto L9;
        r5 = 0;
    L9:
        BreakIterator r03 = this.f19301c;
        if (r03 != null) goto L13;
        kotlin.jvm.internal.p.D("impl");
        r03 = null;
    L13:
        if (r03.isBoundary(r5) == true) goto L20;
        BreakIterator r04 = this.f19301c;
        if (r04 != null) goto L17;
        kotlin.jvm.internal.p.D("impl");
        r04 = null;
    L17:
        r5 = r04.following(r5);
        if (r5 != (-1)) goto L9;
        return null;
    L20:
        BreakIterator r05 = this.f19301c;
        if (r05 != null) goto L23;
        kotlin.jvm.internal.p.D("impl");
        r05 = null;
    L23:
        int r06 = r05.following(r5);
        if (r06 != (-1)) goto L27;
        return null;
    L27:
        return c(r5, r06);
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
        if (r5 <= r02) goto L9;
        r5 = r02;
    L9:
        BreakIterator r03 = this.f19301c;
        if (r03 != null) goto L13;
        kotlin.jvm.internal.p.D("impl");
        r03 = null;
    L13:
        if (r03.isBoundary(r5) == true) goto L20;
        BreakIterator r04 = this.f19301c;
        if (r04 != null) goto L17;
        kotlin.jvm.internal.p.D("impl");
        r04 = null;
    L17:
        r5 = r04.preceding(r5);
        if (r5 != (-1)) goto L9;
        return null;
    L20:
        BreakIterator r05 = this.f19301c;
        if (r05 != null) goto L23;
        kotlin.jvm.internal.p.D("impl");
        r05 = null;
    L23:
        int r06 = r05.preceding(r5);
        if (r06 != (-1)) goto L27;
        return null;
    L27:
        return c(r06, r5);
    }

    @Override // androidx.compose.ui.platform.AbstractC3648a
    public void e(String r2) {
        super.e(r2);
        BreakIterator r02 = this.f19301c;
        if (r02 != null) goto L5;
        kotlin.jvm.internal.p.D("impl");
        r02 = null;
    L5:
        r02.setText(r2);
    }

    public final void i(Locale r1) {
        this.f19301c = BreakIterator.getCharacterInstance(r1);
    }

    public C3650b(Locale r1) {
        i(r1);
    }
}
