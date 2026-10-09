package androidx.compose.ui.text.font;

import androidx.compose.runtime.o2;

/* renamed from: androidx.compose.ui.text.font.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3754i {

    /* renamed from: b, reason: collision with root package name */
    public static final a f19912b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final Q f19913c = null;
    public static final D d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final D f19914e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final D f19915f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final D f19916g = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f19917a;

    /* renamed from: androidx.compose.ui.text.font.i$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final D a() {
            return AbstractC3754i.a();
        }

        public final Q b() {
            return AbstractC3754i.b();
        }

        public final D c() {
            return AbstractC3754i.d();
        }

        public final D d() {
            return AbstractC3754i.e();
        }

        public final D e() {
            return AbstractC3754i.f();
        }

        public a() {
        }
    }

    /* renamed from: androidx.compose.ui.text.font.i$b */
    public interface b {
        static /* synthetic */ o2 b(b r02, AbstractC3754i r1, z r2, int r3, int r4, int r5, Object r6) {
            if (r6 != null) goto L18;
            if ((r5 & 1) == 0) goto L7;
            r1 = null;
        L7:
            if ((r5 & 2) == 0) goto L10;
            r2 = z.f19942b.e();
        L10:
            if ((r5 & 4) == 0) goto L13;
            r3 = C3765u.f19932b.b();
        L13:
            if ((r5 & 8) == 0) goto L16;
            r4 = C3766v.f19935b.a();
        L16:
            return r02.a(r1, r2, r3, r4);
        L18:
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
        }

        o2 a(AbstractC3754i r1, z r2, int r3, int r4);
    }

    static {
        f19912b = new a(null);
        f19913c = new C3751f();
        d = new D("sans-serif", "FontFamily.SansSerif");
        f19914e = new D("serif", "FontFamily.Serif");
        f19915f = new D("monospace", "FontFamily.Monospace");
        f19916g = new D("cursive", "FontFamily.Cursive");
    }

    public /* synthetic */ AbstractC3754i(boolean r1, kotlin.jvm.internal.i r2) {
        this(r1);
    }

    public static final /* synthetic */ D a() {
        return f19916g;
    }

    public static final /* synthetic */ Q b() {
        return f19913c;
    }

    public static final /* synthetic */ D d() {
        return f19915f;
    }

    public static final /* synthetic */ D e() {
        return d;
    }

    public static final /* synthetic */ D f() {
        return f19914e;
    }

    public AbstractC3754i(boolean r1) {
        this.f19917a = r1;
    }
}
