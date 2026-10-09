package androidx.navigation;

import android.net.Uri;

/* loaded from: classes4.dex */
public final class D0 {

    /* renamed from: a, reason: collision with root package name */
    public static final D0 f25947a = null;

    static {
        f25947a = new D0();
    }

    public D0() {
    }

    public static /* synthetic */ String c(D0 r02, String r1, String r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = null;
    L6:
        return r02.b(r1, r2);
    }

    public final String a(String r2) {
        kotlin.jvm.internal.p.l(r2, "s");
        String r22 = Uri.decode(r2);
        kotlin.jvm.internal.p.k(r22, "decode(...)");
        return r22;
    }

    public final String b(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "s");
        String r22 = Uri.encode(r2, r3);
        kotlin.jvm.internal.p.k(r22, "encode(...)");
        return r22;
    }

    public final Uri d(String r2) {
        kotlin.jvm.internal.p.l(r2, "uriString");
        Uri r22 = Uri.parse(r2);
        kotlin.jvm.internal.p.k(r22, "parse(...)");
        return r22;
    }
}
