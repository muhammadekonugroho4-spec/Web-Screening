package androidx.compose.ui.tooling.animation.states;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0142a f20504b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final String f20505c = null;
    public static final String d = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f20506a;

    /* renamed from: androidx.compose.ui.tooling.animation.states.a$a, reason: collision with other inner class name */
    public static final class C0142a {
        public /* synthetic */ C0142a(i r1) {
            this();
        }

        public final String a() {
            return a.a();
        }

        public final String b() {
            return a.b();
        }

        public C0142a() {
        }
    }

    static {
        f20504b = new C0142a(null);
        f20505c = d("Enter");
        d = d("Exit");
    }

    public /* synthetic */ a(String r1) {
        this.f20506a = r1;
    }

    public static final /* synthetic */ String a() {
        return f20505c;
    }

    public static final /* synthetic */ String b() {
        return d;
    }

    public static final /* synthetic */ a c(String r1) {
        return new a(r1);
    }

    public static String d(String r02) {
        return r02;
    }

    public static boolean e(String r2, Object r3) {
        if ((r3 instanceof a) == true) goto L6;
        return false;
    L6:
        if (p.g(r2, ((a) r3).i()) == true) goto L8;
        return false;
    L8:
        return true;
    }

    public static final boolean f(String r02, String r1) {
        return p.g(r02, r1);
    }

    public static int g(String r02) {
        return r02.hashCode();
    }

    public static String h(String r02) {
        return r02;
    }

    public boolean equals(Object r2) {
        return e(this.f20506a, r2);
    }

    public int hashCode() {
        return g(this.f20506a);
    }

    public final /* synthetic */ String i() {
        return this.f20506a;
    }

    public String toString() {
        return h(this.f20506a);
    }
}
