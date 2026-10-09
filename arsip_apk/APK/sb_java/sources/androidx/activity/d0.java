package androidx.activity;

import android.content.res.Resources;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: e, reason: collision with root package name */
    public static final a f2196e = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f2197a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2198b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2199c;
    public final kotlin.jvm.functions.l d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public static /* synthetic */ boolean a(Resources r02) {
            return d(r02);
        }

        public static /* synthetic */ d0 c(a r02, int r1, int r2, kotlin.jvm.functions.l r3, int r4, Object r5) {
            if ((r4 & 4) == 0) goto L6;
            r3 = new c0();
        L6:
            return r02.b(r1, r2, r3);
        }

        public static final boolean d(Resources r1) {
            kotlin.jvm.internal.p.l(r1, "resources");
            if ((r1.getConfiguration().uiMode & 48) != 32) goto L6;
            return true;
        L6:
            return false;
        }

        public final d0 b(int r8, int r9, kotlin.jvm.functions.l r10) {
            kotlin.jvm.internal.p.l(r10, "detectDarkMode");
            return new d0(r8, r9, 0, r10, null);
        }

        public a() {
        }
    }

    static {
        f2196e = new a(null);
    }

    public /* synthetic */ d0(int r1, int r2, int r3, kotlin.jvm.functions.l r4, kotlin.jvm.internal.i r5) {
        this(r1, r2, r3, r4);
    }

    public final kotlin.jvm.functions.l a() {
        return this.d;
    }

    public final int b() {
        return this.f2199c;
    }

    public final int c(boolean r1) {
        if (r1 == false) goto L6;
        return this.f2198b;
    L6:
        return this.f2197a;
    }

    public final int d(boolean r2) {
        if (this.f2199c != 0) goto L6;
        return 0;
    L6:
        if (r2 == false) goto L10;
        return this.f2198b;
    L10:
        return this.f2197a;
    }

    public d0(int r1, int r2, int r3, kotlin.jvm.functions.l r4) {
        this.f2197a = r1;
        this.f2198b = r2;
        this.f2199c = r3;
        this.d = r4;
    }
}
