package androidx.compose.foundation.lazy;

/* loaded from: classes.dex */
public interface O {

    public static final class a implements kotlin.jvm.functions.l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f8304a = null;

        static {
            f8304a = new a();
        }

        public a() {
        }

        public final Void a(int r1) {
            return null;
        }

        @Override // kotlin.jvm.functions.l
        public /* bridge */ /* synthetic */ Object invoke(Object r1) {
            return a(((Number) r1).intValue());
        }
    }

    static /* synthetic */ void b(O r02, int r1, kotlin.jvm.functions.l r2, kotlin.jvm.functions.l r3, kotlin.jvm.functions.r r4, int r5, Object r6) {
        if (r6 != null) goto L12;
        if ((r5 & 2) == 0) goto L7;
        r2 = null;
    L7:
        if ((r5 & 4) == 0) goto L9;
        r3 = a.f8304a;
    L9:
        r02.e(r1, r2, r3, r4);
        return;
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
    }

    static /* synthetic */ void c(O r1, Object r2, Object r3, kotlin.jvm.functions.q r4, int r5, Object r6) {
        if (r6 != null) goto L12;
        if ((r5 & 1) == 0) goto L7;
        r2 = null;
    L7:
        if ((r5 & 2) == 0) goto L9;
        r3 = null;
    L9:
        r1.a(r2, r3, r4);
        return;
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
    }

    static /* synthetic */ void g(O r1, Object r2, Object r3, kotlin.jvm.functions.r r4, int r5, Object r6) {
        if (r6 != null) goto L12;
        if ((r5 & 1) == 0) goto L7;
        r2 = null;
    L7:
        if ((r5 & 2) == 0) goto L9;
        r3 = null;
    L9:
        r1.f(r2, r3, r4);
        return;
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
    }

    void a(Object r1, Object r2, kotlin.jvm.functions.q r3);

    void e(int r1, kotlin.jvm.functions.l r2, kotlin.jvm.functions.l r3, kotlin.jvm.functions.r r4);

    void f(Object r1, Object r2, kotlin.jvm.functions.r r3);
}
