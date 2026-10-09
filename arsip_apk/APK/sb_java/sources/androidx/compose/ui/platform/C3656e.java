package androidx.compose.ui.platform;

/* renamed from: androidx.compose.ui.platform.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3656e extends AbstractC3648a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f19329c = null;
    public static final int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static C3656e f19330e;

    /* renamed from: androidx.compose.ui.platform.e$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final C3656e a() {
            if (C3656e.g() != null) goto L5;
            C3656e.h(new C3656e(null));
        L5:
            C3656e r02 = C3656e.g();
            kotlin.jvm.internal.p.j(r02, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
            return r02;
        }

        public a() {
        }
    }

    static {
        f19329c = new a(null);
        d = 8;
    }

    public /* synthetic */ C3656e(kotlin.jvm.internal.i r1) {
        this();
    }

    public static final /* synthetic */ C3656e g() {
        return f19330e;
    }

    public static final /* synthetic */ void h(C3656e r02) {
        f19330e = r02;
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
        if (r5 >= r02) goto L15;
        if (d().charAt(r5) != '\n') goto L15;
        if (j(r5) == true) goto L15;
        r5 = r5 + 1;
    L15:
        if (r5 < r02) goto L17;
        return null;
    L17:
        int r1 = r5 + 1;
    L18:
        if (r1 >= r02) goto L23;
        if (i(r1) == true) goto L23;
        r1 = r1 + 1;
    L23:
        return c(r5, r1);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3658f
    public int[] b(int r4) {
        int r02 = d().length();
        if (r02 > 0) goto L5;
        return null;
    L5:
        if (r4 > 0) goto L7;
        return null;
    L7:
        if (r4 <= r02) goto L9;
        r4 = r02;
    L9:
        if (r4 <= 0) goto L15;
        if (d().charAt(r4 - 1) != '\n') goto L15;
        if (i(r4) == true) goto L15;
        r4 = r4 - 1;
    L15:
        if (r4 > 0) goto L17;
        return null;
    L17:
        int r03 = r4 - 1;
    L18:
        if (r03 <= 0) goto L23;
        if (j(r03) == true) goto L23;
        r03 = r03 - 1;
    L23:
        return c(r03, r4);
    }

    public final boolean i(int r3) {
        if (r3 > 0) goto L4;
        return false;
    L4:
        if (d().charAt(r3 - 1) != '\n') goto L6;
        return false;
    L6:
        if (r3 != d().length()) goto L8;
        return true;
    L8:
        if (d().charAt(r3) != '\n') goto L15;
        return true;
    L15:
        return false;
    }

    public final boolean j(int r4) {
        if (d().charAt(r4) != '\n') goto L5;
        return false;
    L5:
        if (r4 != 0) goto L7;
    L8:
        return true;
    L7:
        if (d().charAt(r4 - 1) == '\n') goto L8;
        return false;
    }

    public C3656e() {
    }
}
