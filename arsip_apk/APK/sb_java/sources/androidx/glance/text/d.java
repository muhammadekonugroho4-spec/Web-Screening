package androidx.glance.text;

import com.google.firebase.perf.util.Constants;
import com.stockbit.protobuf.securities.transactional.datafeed.v1.datafeed.ErrorCode;
import kotlin.jvm.internal.i;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final a f25435b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f25436c = 0;
    public static final int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f25437e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f25438a;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final int a() {
            return d.a();
        }

        public final int b() {
            return d.b();
        }

        public a() {
        }
    }

    static {
        f25435b = new a(null);
        f25436c = d(ErrorCode.ERROR_CODE_BAD_REQUEST_VALUE);
        d = d(500);
        f25437e = d(Constants.FROZEN_FRAME_TIME);
    }

    public /* synthetic */ d(int r1) {
        this.f25438a = r1;
    }

    public static final /* synthetic */ int a() {
        return f25437e;
    }

    public static final /* synthetic */ int b() {
        return d;
    }

    public static final /* synthetic */ d c(int r1) {
        return new d(r1);
    }

    public static int d(int r02) {
        return r02;
    }

    public static boolean e(int r2, Object r3) {
        if ((r3 instanceof d) == true) goto L6;
        return false;
    L6:
        if (r2 == ((d) r3).i()) goto L8;
        return false;
    L8:
        return true;
    }

    public static final boolean f(int r02, int r1) {
        if (r02 != r1) goto L5;
        return true;
    L5:
        return false;
    }

    public static int g(int r02) {
        return Integer.hashCode(r02);
    }

    public static String h(int r2) {
        return "FontWeight(value=" + r2 + ')';
    }

    public boolean equals(Object r2) {
        return e(this.f25438a, r2);
    }

    public int hashCode() {
        return g(this.f25438a);
    }

    public final /* synthetic */ int i() {
        return this.f25438a;
    }

    public String toString() {
        return h(this.f25438a);
    }
}
