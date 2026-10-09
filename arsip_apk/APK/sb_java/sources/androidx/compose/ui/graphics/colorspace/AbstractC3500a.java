package androidx.compose.ui.graphics.colorspace;

/* renamed from: androidx.compose.ui.graphics.colorspace.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3500a {

    /* renamed from: b, reason: collision with root package name */
    public static final d f17227b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f17228c = 0;
    public static final AbstractC3500a d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC3500a f17229e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC3500a f17230f = null;

    /* renamed from: a, reason: collision with root package name */
    public final float[] f17231a;

    /* renamed from: androidx.compose.ui.graphics.colorspace.a$a, reason: collision with other inner class name */
    public static final class C0119a extends AbstractC3500a {
        public C0119a(float[] r2) {
            super(r2, null);
        }

        public String toString() {
            return "Bradford";
        }
    }

    /* renamed from: androidx.compose.ui.graphics.colorspace.a$b */
    public static final class b extends AbstractC3500a {
        public b(float[] r2) {
            super(r2, null);
        }

        public String toString() {
            return "Ciecat02";
        }
    }

    /* renamed from: androidx.compose.ui.graphics.colorspace.a$c */
    public static final class c extends AbstractC3500a {
        public c(float[] r2) {
            super(r2, null);
        }

        public String toString() {
            return "VonKries";
        }
    }

    /* renamed from: androidx.compose.ui.graphics.colorspace.a$d */
    public static final class d {
        public /* synthetic */ d(kotlin.jvm.internal.i r1) {
            this();
        }

        public final AbstractC3500a a() {
            return AbstractC3500a.a();
        }

        public d() {
        }
    }

    static {
        f17227b = new d(null);
        f17228c = 8;
        d = new C0119a(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});
        f17229e = new c(new float[]{0.40024f, -0.2263f, 0.0f, 0.7076f, 1.16532f, 0.0f, -0.08081f, 0.0457f, 0.91822f});
        f17230f = new b(new float[]{0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f});
    }

    public /* synthetic */ AbstractC3500a(float[] r1, kotlin.jvm.internal.i r2) {
        this(r1);
    }

    public static final /* synthetic */ AbstractC3500a a() {
        return d;
    }

    public final float[] b() {
        return this.f17231a;
    }

    public AbstractC3500a(float[] r1) {
        this.f17231a = r1;
    }
}
