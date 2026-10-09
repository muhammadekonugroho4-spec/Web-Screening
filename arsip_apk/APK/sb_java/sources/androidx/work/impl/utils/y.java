package androidx.work.impl.utils;

import android.net.NetworkRequest;

/* loaded from: classes4.dex */
public final class y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f29607b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final String f29608c = null;

    /* renamed from: a, reason: collision with root package name */
    public final Object f29609a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final String a() {
            return y.a();
        }

        public a() {
        }
    }

    static {
        f29607b = new a(null);
        String r02 = androidx.work.r.i("NetworkRequestCompat");
        kotlin.jvm.internal.p.k(r02, "tagWithPrefix(\"NetworkRequestCompat\")");
        f29608c = r02;
    }

    public y(Object r1) {
        this.f29609a = r1;
    }

    public static final /* synthetic */ String a() {
        return f29608c;
    }

    public final NetworkRequest b() {
        return (NetworkRequest) this.f29609a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof y) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f29609a, ((y) r4).f29609a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        Object r02 = this.f29609a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "NetworkRequestCompat(wrapped=" + this.f29609a + ')';
    }

    public /* synthetic */ y(Object r1, int r2, kotlin.jvm.internal.i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        this(r1);
    }
}
