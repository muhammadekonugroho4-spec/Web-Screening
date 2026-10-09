package androidx.compose.foundation.content;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0063a f7265b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final a f7266c = null;
    public static final a d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final a f7267e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final a f7268f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final a f7269g = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f7270a;

    /* renamed from: androidx.compose.foundation.content.a$a, reason: collision with other inner class name */
    public static final class C0063a {
        public /* synthetic */ C0063a(i r1) {
            this();
        }

        public final a a() {
            return a.a();
        }

        public final a b() {
            return a.b();
        }

        public C0063a() {
        }
    }

    static {
        f7265b = new C0063a(null);
        f7266c = new a("text/*");
        d = new a("text/plain");
        f7267e = new a("text/html");
        f7268f = new a("image/*");
        f7269g = new a("*/*");
    }

    public a(String r1) {
        this.f7270a = r1;
    }

    public static final /* synthetic */ a a() {
        return f7269g;
    }

    public static final /* synthetic */ a b() {
        return f7266c;
    }

    public final String c() {
        return this.f7270a;
    }

    public boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof a) == true) goto L10;
        return false;
    L10:
        return p.g(this.f7270a, ((a) r2).f7270a);
    }

    public int hashCode() {
        return this.f7270a.hashCode();
    }

    public String toString() {
        return "MediaType(representation='" + this.f7270a + "')";
    }
}
