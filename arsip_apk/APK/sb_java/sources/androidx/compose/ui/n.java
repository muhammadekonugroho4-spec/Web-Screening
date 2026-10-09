package androidx.compose.ui;

import kotlin.coroutines.i;

/* loaded from: classes.dex */
public interface n extends i.b {

    /* renamed from: j0, reason: collision with root package name */
    public static final b f18452j0 = null;

    public static final class a {
        public static Object a(n r02, Object r1, kotlin.jvm.functions.p r2) {
            return i.b.a.a(r02, r1, r2);
        }

        public static i.b b(n r02, i.c r1) {
            return i.b.a.b(r02, r1);
        }

        public static kotlin.coroutines.i c(n r02, i.c r1) {
            return i.b.a.c(r02, r1);
        }

        public static kotlin.coroutines.i d(n r02, kotlin.coroutines.i r1) {
            return i.b.a.d(r02, r1);
        }
    }

    public static final class b implements i.c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f18453a = null;

        static {
            f18453a = new b();
        }

        public b() {
        }
    }

    static {
        f18452j0 = b.f18453a;
    }

    float f();

    @Override // kotlin.coroutines.i.b
    default i.c getKey() {
        return f18452j0;
    }
}
