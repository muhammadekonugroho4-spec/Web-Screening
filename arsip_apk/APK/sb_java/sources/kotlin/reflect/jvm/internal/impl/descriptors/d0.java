package kotlin.reflect.jvm.internal.impl.descriptors;

import com.google.android.gms.common.internal.ImagesContract;
import com.huawei.hms.android.SystemUtils;
import java.util.Map;

/* loaded from: classes3.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f178062a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f178063b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final h f178064c = null;

    public static final class a extends e0 {

        /* renamed from: c, reason: collision with root package name */
        public static final a f178065c = null;

        static {
            f178065c = new a();
        }

        public a() {
            super("inherited", false);
        }
    }

    public static final class b extends e0 {

        /* renamed from: c, reason: collision with root package name */
        public static final b f178066c = null;

        static {
            f178066c = new b();
        }

        public b() {
            super("internal", false);
        }
    }

    public static final class c extends e0 {

        /* renamed from: c, reason: collision with root package name */
        public static final c f178067c = null;

        static {
            f178067c = new c();
        }

        public c() {
            super("invisible_fake", false);
        }
    }

    public static final class d extends e0 {

        /* renamed from: c, reason: collision with root package name */
        public static final d f178068c = null;

        static {
            f178068c = new d();
        }

        public d() {
            super(ImagesContract.LOCAL, false);
        }
    }

    public static final class e extends e0 {

        /* renamed from: c, reason: collision with root package name */
        public static final e f178069c = null;

        static {
            f178069c = new e();
        }

        public e() {
            super("private", false);
        }
    }

    public static final class f extends e0 {

        /* renamed from: c, reason: collision with root package name */
        public static final f f178070c = null;

        static {
            f178070c = new f();
        }

        public f() {
            super("private_to_this", false);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e0
        public String b() {
            return "private/*private to this*/";
        }
    }

    public static final class g extends e0 {

        /* renamed from: c, reason: collision with root package name */
        public static final g f178071c = null;

        static {
            f178071c = new g();
        }

        public g() {
            super("protected", true);
        }
    }

    public static final class h extends e0 {

        /* renamed from: c, reason: collision with root package name */
        public static final h f178072c = null;

        static {
            f178072c = new h();
        }

        public h() {
            super("public", true);
        }
    }

    public static final class i extends e0 {

        /* renamed from: c, reason: collision with root package name */
        public static final i f178073c = null;

        static {
            f178073c = new i();
        }

        public i() {
            super(SystemUtils.UNKNOWN, false);
        }
    }

    static {
        f178062a = new d0();
        Map r02 = kotlin.collections.Q.c();
        r02.put(f.f178070c, 0);
        r02.put(e.f178069c, 0);
        r02.put(b.f178066c, 1);
        r02.put(g.f178071c, 1);
        h r1 = h.f178072c;
        r02.put(r1, 2);
        f178063b = kotlin.collections.Q.b(r02);
        f178064c = r1;
    }

    public d0() {
    }

    public final Integer a(e0 r2, e0 r3) {
        kotlin.jvm.internal.p.l(r2, "first");
        kotlin.jvm.internal.p.l(r3, "second");
        if (r2 == r3) goto L5;
        Map r02 = f178063b;
        Integer r22 = (Integer) r02.get(r2);
        Integer r32 = (Integer) r02.get(r3);
        if (r22 == null) goto L14;
        if (r32 != null) goto L10;
        return null;
    L10:
        if (kotlin.jvm.internal.p.g(r22, r32) == false) goto L13;
        return null;
    L13:
        return Integer.valueOf(r22.intValue() - r32.intValue());
    L14:
        return null;
    L5:
        return 0;
    }

    public final boolean b(e0 r2) {
        kotlin.jvm.internal.p.l(r2, "visibility");
        if (r2 != e.f178069c) goto L5;
        return true;
    L5:
        if (r2 == f.f178070c) goto L11;
        return false;
    L11:
        return true;
    }
}
