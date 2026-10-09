package androidx.compose.ui.layout;

/* renamed from: androidx.compose.ui.layout.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3601f {

    /* renamed from: a, reason: collision with root package name */
    public static final a f18343a = null;

    /* renamed from: androidx.compose.ui.layout.f$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f18344a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final InterfaceC3601f f18345b = null;

        /* renamed from: c, reason: collision with root package name */
        public static final InterfaceC3601f f18346c = null;
        public static final InterfaceC3601f d = null;

        /* renamed from: e, reason: collision with root package name */
        public static final InterfaceC3601f f18347e = null;

        /* renamed from: f, reason: collision with root package name */
        public static final InterfaceC3601f f18348f = null;

        /* renamed from: g, reason: collision with root package name */
        public static final C3604i f18349g = null;

        /* renamed from: h, reason: collision with root package name */
        public static final InterfaceC3601f f18350h = null;

        /* renamed from: androidx.compose.ui.layout.f$a$a, reason: collision with other inner class name */
        public static final class C0129a implements InterfaceC3601f {
            public C0129a() {
            }

            @Override // androidx.compose.ui.layout.InterfaceC3601f
            public long a(long r3, long r5) {
                float r32 = AbstractC3602g.a(r3, r5);
                return p0.a((Float.floatToRawIntBits(r32) << 32) | (4294967295L & Float.floatToRawIntBits(r32)));
            }
        }

        /* renamed from: androidx.compose.ui.layout.f$a$b */
        public static final class b implements InterfaceC3601f {
            public b() {
            }

            @Override // androidx.compose.ui.layout.InterfaceC3601f
            public long a(long r5, long r7) {
                float r1 = Float.intBitsToFloat((int) (r7 >> 32)) / Float.intBitsToFloat((int) (r5 >> 32));
                float r72 = Float.intBitsToFloat((int) (r7 & 4294967295L)) / Float.intBitsToFloat((int) (r5 & 4294967295L));
                return p0.a((Float.floatToRawIntBits(r1) << 32) | (Float.floatToRawIntBits(r72) & 4294967295L));
            }
        }

        /* renamed from: androidx.compose.ui.layout.f$a$c */
        public static final class c implements InterfaceC3601f {
            public c() {
            }

            @Override // androidx.compose.ui.layout.InterfaceC3601f
            public long a(long r4, long r6) {
                return p0.a((Float.floatToRawIntBits(Float.intBitsToFloat((int) (r6 & 4294967295L)) / Float.intBitsToFloat((int) (r4 & 4294967295L))) << 32) | (Float.floatToRawIntBits(r6) & 4294967295L));
            }
        }

        /* renamed from: androidx.compose.ui.layout.f$a$d */
        public static final class d implements InterfaceC3601f {
            public d() {
            }

            @Override // androidx.compose.ui.layout.InterfaceC3601f
            public long a(long r3, long r5) {
                return p0.a((Float.floatToRawIntBits(Float.intBitsToFloat((int) (r5 >> 32)) / Float.intBitsToFloat((int) (r3 >> 32))) << 32) | (Float.floatToRawIntBits(r5) & 4294967295L));
            }
        }

        /* renamed from: androidx.compose.ui.layout.f$a$e */
        public static final class e implements InterfaceC3601f {
            public e() {
            }

            @Override // androidx.compose.ui.layout.InterfaceC3601f
            public long a(long r3, long r5) {
                float r32 = AbstractC3602g.b(r3, r5);
                return p0.a((Float.floatToRawIntBits(r32) << 32) | (4294967295L & Float.floatToRawIntBits(r32)));
            }
        }

        /* renamed from: androidx.compose.ui.layout.f$a$f, reason: collision with other inner class name */
        public static final class C0130f implements InterfaceC3601f {
            public C0130f() {
            }

            @Override // androidx.compose.ui.layout.InterfaceC3601f
            public long a(long r7, long r9) {
                if (Float.intBitsToFloat((int) (r7 >> 32)) <= Float.intBitsToFloat((int) (r9 >> 32))) goto L5;
            L8:
                float r72 = AbstractC3602g.b(r7, r9);
                return p0.a((Float.floatToRawIntBits(r72) << 32) | (Float.floatToRawIntBits(r72) & 4294967295L));
            L5:
                if (Float.intBitsToFloat((int) (r7 & 4294967295L)) > Float.intBitsToFloat((int) (r9 & 4294967295L))) goto L8;
                return p0.a((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L));
            }
        }

        static {
            f18344a = new a();
            f18345b = new C0129a();
            f18346c = new e();
            d = new c();
            f18347e = new d();
            f18348f = new C0130f();
            f18349g = new C3604i(1.0f);
            f18350h = new b();
        }

        public a() {
        }

        public final InterfaceC3601f a() {
            return f18345b;
        }

        public final InterfaceC3601f b() {
            return f18350h;
        }

        public final InterfaceC3601f c() {
            return d;
        }

        public final InterfaceC3601f d() {
            return f18347e;
        }

        public final InterfaceC3601f e() {
            return f18346c;
        }

        public final InterfaceC3601f f() {
            return f18348f;
        }

        public final C3604i g() {
            return f18349g;
        }
    }

    static {
        f18343a = a.f18344a;
    }

    long a(long r1, long r3);
}
