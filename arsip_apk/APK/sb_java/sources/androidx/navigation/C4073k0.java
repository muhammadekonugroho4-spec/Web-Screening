package androidx.navigation;

import android.net.Uri;

/* renamed from: androidx.navigation.k0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4073k0 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f26384a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26385b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26386c;

    /* renamed from: androidx.navigation.k0$a */
    public static final class a {
        public static final C0219a d = null;

        /* renamed from: a, reason: collision with root package name */
        public Uri f26387a;

        /* renamed from: b, reason: collision with root package name */
        public String f26388b;

        /* renamed from: c, reason: collision with root package name */
        public String f26389c;

        /* renamed from: androidx.navigation.k0$a$a, reason: collision with other inner class name */
        public static final class C0219a {
            public /* synthetic */ C0219a(kotlin.jvm.internal.i r1) {
                this();
            }

            public final a a(Uri r3) {
                kotlin.jvm.internal.p.l(r3, "uri");
                a r02 = new a(null);
                r02.b(r3);
                return r02;
            }

            public C0219a() {
            }
        }

        static {
            d = new C0219a(null);
        }

        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final C4073k0 a() {
            return new C4073k0(this.f26387a, this.f26388b, this.f26389c);
        }

        public final a b(Uri r2) {
            kotlin.jvm.internal.p.l(r2, "uri");
            this.f26387a = r2;
            return this;
        }

        public a() {
        }
    }

    public C4073k0(Uri r1, String r2, String r3) {
        this.f26384a = r1;
        this.f26385b = r2;
        this.f26386c = r3;
    }

    public String a() {
        return this.f26385b;
    }

    public String b() {
        return this.f26386c;
    }

    public Uri c() {
        return this.f26384a;
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder();
        r02.append("NavDeepLinkRequest");
        r02.append("{");
        if (c() == null) goto L6;
        r02.append(" uri=");
        r02.append(String.valueOf(c()));
    L6:
        if (a() == null) goto L9;
        r02.append(" action=");
        r02.append(a());
    L9:
        if (b() == null) goto L11;
        r02.append(" mimetype=");
        r02.append(b());
    L11:
        r02.append(" }");
        String r03 = r02.toString();
        kotlin.jvm.internal.p.k(r03, "toString(...)");
        return r03;
    }
}
