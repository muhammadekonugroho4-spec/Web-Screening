package coil.size;

import coil.size.c;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final a f30238c = null;
    public static final f d = null;

    /* renamed from: a, reason: collision with root package name */
    public final c f30239a;

    /* renamed from: b, reason: collision with root package name */
    public final c f30240b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f30238c = new a(null);
        c.b r1 = c.b.f30235a;
        d = new f(r1, r1);
    }

    public f(c r1, c r2) {
        this.f30239a = r1;
        this.f30240b = r2;
    }

    public final c a() {
        return this.f30240b;
    }

    public final c b() {
        return this.f30239a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f30239a, r52.f30239a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f30240b, r52.f30240b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f30239a.hashCode() * 31) + this.f30240b.hashCode();
    }

    public String toString() {
        return "Size(width=" + this.f30239a + ", height=" + this.f30240b + ')';
    }
}
