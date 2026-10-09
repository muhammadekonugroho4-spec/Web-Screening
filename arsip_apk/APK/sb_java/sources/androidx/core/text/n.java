package androidx.core.text;

import java.util.Locale;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final m f23067a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final m f23068b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final m f23069c = null;
    public static final m d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final m f23070e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final m f23071f = null;

    public static class a implements c {

        /* renamed from: b, reason: collision with root package name */
        public static final a f23072b = null;

        /* renamed from: a, reason: collision with root package name */
        public final boolean f23073a;

        static {
            f23072b = new a(true);
        }

        public a(boolean r1) {
            this.f23073a = r1;
        }

        @Override // androidx.core.text.n.c
        public int a(CharSequence r5, int r6, int r7) {
            int r72 = r7 + r6;
            boolean r1 = false;
        L3:
            if (r6 >= r72) goto L16;
            int r2 = n.a(Character.getDirectionality(r5.charAt(r6)));
            if (r2 == 0) goto L13;
            if (r2 != 1) goto L15;
            if (this.f23073a == false) goto L10;
        L11:
            r1 = true;
            goto L15
        L10:
            return 1;
        L15:
            r6 = r6 + 1;
            r1 = r1;
            goto L3
        L13:
            if (this.f23073a == false) goto L11;
            return 0;
        L16:
            if (r1 == true) goto L18;
            return 2;
        L18:
            return this.f23073a ? 1 : 0;
        }
    }

    public static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f23074a = null;

        static {
            f23074a = new b();
        }

        public b() {
        }

        @Override // androidx.core.text.n.c
        public int a(CharSequence r3, int r4, int r5) {
            int r52 = r5 + r4;
            int r1 = 2;
        L3:
            if (r4 >= r52) goto L6;
            if (r1 != 2) goto L6;
            r1 = n.b(Character.getDirectionality(r3.charAt(r4)));
            r4 = r4 + 1;
        L6:
            return r1;
        }
    }

    public interface c {
        int a(CharSequence r1, int r2, int r3);
    }

    public static abstract class d implements m {

        /* renamed from: a, reason: collision with root package name */
        public final c f23075a;

        public d(c r1) {
            this.f23075a = r1;
        }

        @Override // androidx.core.text.m
        public boolean a(CharSequence r2, int r3, int r4) {
            if (r2 == null) goto L14;
            if (r3 < 0) goto L14;
            if (r4 < 0) goto L14;
            if ((r2.length() - r4) < r3) goto L14;
            if (this.f23075a != null) goto L12;
            return b();
        L12:
            return c(r2, r3, r4);
        L14:
            throw new IllegalArgumentException();
        }

        public abstract boolean b();

        public final boolean c(CharSequence r2, int r3, int r4) {
            int r22 = this.f23075a.a(r2, r3, r4);
            if (r22 == 0) goto L9;
            if (r22 != 1) goto L6;
            return false;
        L6:
            return b();
        L9:
            return true;
        }
    }

    public static class e extends d {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f23076b;

        public e(c r1, boolean r2) {
            super(r1);
            this.f23076b = r2;
        }

        @Override // androidx.core.text.n.d
        public boolean b() {
            return this.f23076b;
        }
    }

    public static class f extends d {

        /* renamed from: b, reason: collision with root package name */
        public static final f f23077b = null;

        static {
            f23077b = new f();
        }

        public f() {
            super(null);
        }

        @Override // androidx.core.text.n.d
        public boolean b() {
            if (o.a(Locale.getDefault()) != 1) goto L5;
            return true;
        L5:
            return false;
        }
    }

    static {
        f23067a = new e(null, false);
        f23068b = new e(null, true);
        b r1 = b.f23074a;
        f23069c = new e(r1, false);
        d = new e(r1, true);
        f23070e = new e(a.f23072b, false);
        f23071f = f.f23077b;
    }

    public static int a(int r1) {
        if (r1 == 0) goto L10;
        if (r1 != 1) goto L6;
        return 0;
    L6:
        if (r1 == 2) goto L11;
        return 2;
    L11:
        return 0;
    L10:
        return 1;
    }

    public static int b(int r2) {
        if (r2 == 0) goto L11;
        if (r2 != 1) goto L6;
        return 0;
    L6:
        if (r2 == 2) goto L12;
        switch(r2) {
            case 14: goto L11;
            case 15: goto L11;
            case 16: goto L13;
            case 17: goto L13;
            default: goto L8;
        };
    L8:
        return 2;
    L13:
        return 0;
    L12:
        return 0;
    L11:
        return 1;
    }
}
