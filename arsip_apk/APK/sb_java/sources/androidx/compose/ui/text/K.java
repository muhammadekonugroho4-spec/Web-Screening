package androidx.compose.ui.text;

/* loaded from: classes.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    public static final a f19649a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final int f19650b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f19651c = 0;
    public static final int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f19652e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f19653f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f19654g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f19655h = 0;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final int a() {
            return K.a();
        }

        public final int b() {
            return K.b();
        }

        public final int c() {
            return K.c();
        }

        public final int d() {
            return K.d();
        }

        public final int e() {
            return K.e();
        }

        public final int f() {
            return K.f();
        }

        public final int g() {
            return K.g();
        }

        public a() {
        }
    }

    static {
        f19649a = new a(null);
        f19650b = h(1);
        f19651c = h(2);
        d = h(3);
        f19652e = h(4);
        f19653f = h(5);
        f19654g = h(6);
        f19655h = h(7);
    }

    public static final /* synthetic */ int a() {
        return f19650b;
    }

    public static final /* synthetic */ int b() {
        return d;
    }

    public static final /* synthetic */ int c() {
        return f19652e;
    }

    public static final /* synthetic */ int d() {
        return f19654g;
    }

    public static final /* synthetic */ int e() {
        return f19655h;
    }

    public static final /* synthetic */ int f() {
        return f19653f;
    }

    public static final /* synthetic */ int g() {
        return f19651c;
    }

    public static int h(int r02) {
        return r02;
    }

    public static final boolean i(int r02, int r1) {
        if (r02 != r1) goto L5;
        return true;
    L5:
        return false;
    }

    public static int j(int r02) {
        return Integer.hashCode(r02);
    }

    public static String k(int r1) {
        if (i(r1, f19650b) == false) goto L7;
        return "AboveBaseline";
    L7:
        if (i(r1, f19651c) == false) goto L11;
        return "Top";
    L11:
        if (i(r1, d) == false) goto L15;
        return "Bottom";
    L15:
        if (i(r1, f19652e) == false) goto L19;
        return "Center";
    L19:
        if (i(r1, f19653f) == false) goto L23;
        return "TextTop";
    L23:
        if (i(r1, f19654g) == false) goto L27;
        return "TextBottom";
    L27:
        if (i(r1, f19655h) == false) goto L30;
        return "TextCenter";
    L30:
        return "Invalid";
    }
}
