package androidx.compose.ui.graphics.colorspace;

/* renamed from: androidx.compose.ui.graphics.colorspace.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3502c {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f17236a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17237b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17238c;

    /* renamed from: androidx.compose.ui.graphics.colorspace.c$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        d = new a(null);
    }

    public /* synthetic */ AbstractC3502c(String r1, long r2, int r4, kotlin.jvm.internal.i r5) {
        this(r1, r2, r4);
    }

    public final int a() {
        return AbstractC3501b.f(this.f17237b);
    }

    public final int b() {
        return this.f17238c;
    }

    public abstract float c(int r1);

    public abstract float d(int r1);

    public final long e() {
        return this.f17237b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L18:
        return false;
    L8:
        if (getClass() != r5.getClass()) goto L18;
        AbstractC3502c r52 = (AbstractC3502c) r5;
        if (this.f17238c == r52.f17238c) goto L14;
        return false;
    L14:
        if (kotlin.jvm.internal.p.g(this.f17236a, r52.f17236a) == true) goto L17;
        return false;
    L17:
        return AbstractC3501b.e(this.f17237b, r52.f17237b);
    }

    public final String f() {
        return this.f17236a;
    }

    public boolean g() {
        return false;
    }

    public abstract long h(float r1, float r2, float r3);

    public int hashCode() {
        return (((this.f17236a.hashCode() * 31) + AbstractC3501b.g(this.f17237b)) * 31) + this.f17238c;
    }

    public abstract float i(float r1, float r2, float r3);

    public abstract long j(float r1, float r2, float r3, float r4, AbstractC3502c r5);

    public String toString() {
        return this.f17236a + " (id=" + this.f17238c + ", model=" + AbstractC3501b.h(this.f17237b) + ')';
    }

    public AbstractC3502c(String r1, long r2, int r4) {
        this.f17236a = r1;
        this.f17237b = r2;
        this.f17238c = r4;
        if (r1.length() == 0) goto L12;
        if (r4 < (-1)) goto L10;
        if (r4 > 63) goto L10;
        return;
    L10:
        throw new IllegalArgumentException("The id must be between -1 and 63");
    L12:
        throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
    }
}
