package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: A, reason: collision with root package name */
    public static final C1904b f179136A = null;

    /* renamed from: B, reason: collision with root package name */
    public static final C1904b f179137B = null;

    /* renamed from: C, reason: collision with root package name */
    public static final C1904b f179138C = null;

    /* renamed from: D, reason: collision with root package name */
    public static final C1904b f179139D = null;

    /* renamed from: E, reason: collision with root package name */
    public static final C1904b f179140E = null;

    /* renamed from: F, reason: collision with root package name */
    public static final C1904b f179141F = null;

    /* renamed from: G, reason: collision with root package name */
    public static final C1904b f179142G = null;

    /* renamed from: H, reason: collision with root package name */
    public static final C1904b f179143H = null;

    /* renamed from: I, reason: collision with root package name */
    public static final C1904b f179144I = null;

    /* renamed from: J, reason: collision with root package name */
    public static final C1904b f179145J = null;

    /* renamed from: K, reason: collision with root package name */
    public static final C1904b f179146K = null;

    /* renamed from: L, reason: collision with root package name */
    public static final C1904b f179147L = null;

    /* renamed from: M, reason: collision with root package name */
    public static final C1904b f179148M = null;

    /* renamed from: N, reason: collision with root package name */
    public static final C1904b f179149N = null;

    /* renamed from: O, reason: collision with root package name */
    public static final C1904b f179150O = null;

    /* renamed from: a, reason: collision with root package name */
    public static final C1904b f179151a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final C1904b f179152b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final C1904b f179153c = null;
    public static final d d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final d f179154e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final d f179155f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final C1904b f179156g = null;

    /* renamed from: h, reason: collision with root package name */
    public static final C1904b f179157h = null;

    /* renamed from: i, reason: collision with root package name */
    public static final C1904b f179158i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final C1904b f179159j = null;

    /* renamed from: k, reason: collision with root package name */
    public static final C1904b f179160k = null;

    /* renamed from: l, reason: collision with root package name */
    public static final C1904b f179161l = null;

    /* renamed from: m, reason: collision with root package name */
    public static final C1904b f179162m = null;

    /* renamed from: n, reason: collision with root package name */
    public static final C1904b f179163n = null;

    /* renamed from: o, reason: collision with root package name */
    public static final d f179164o = null;

    /* renamed from: p, reason: collision with root package name */
    public static final C1904b f179165p = null;

    /* renamed from: q, reason: collision with root package name */
    public static final C1904b f179166q = null;

    /* renamed from: r, reason: collision with root package name */
    public static final C1904b f179167r = null;

    /* renamed from: s, reason: collision with root package name */
    public static final C1904b f179168s = null;

    /* renamed from: t, reason: collision with root package name */
    public static final C1904b f179169t = null;

    /* renamed from: u, reason: collision with root package name */
    public static final C1904b f179170u = null;

    /* renamed from: v, reason: collision with root package name */
    public static final C1904b f179171v = null;

    /* renamed from: w, reason: collision with root package name */
    public static final C1904b f179172w = null;

    /* renamed from: x, reason: collision with root package name */
    public static final C1904b f179173x = null;

    /* renamed from: y, reason: collision with root package name */
    public static final C1904b f179174y = null;

    /* renamed from: z, reason: collision with root package name */
    public static final C1904b f179175z = null;

    public static /* synthetic */ class a {
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b, reason: collision with other inner class name */
    public static class C1904b extends d {
        public C1904b(int r3) {
            super(r3, 1, null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d
        public /* bridge */ /* synthetic */ Object d(int r1) {
            return f(r1);
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d
        public /* bridge */ /* synthetic */ int e(Object r1) {
            return g((Boolean) r1);
        }

        public Boolean f(int r3) {
            boolean r1 = true;
            if ((r3 & (1 << this.f179177a)) != 0) goto L7;
            r1 = false;
        L7:
            return Boolean.valueOf(r1);
        }

        public int g(Boolean r2) {
            if (r2.booleanValue() == true) goto L5;
            return 0;
        L5:
            return 1 << this.f179177a;
        }
    }

    public static class c extends d {

        /* renamed from: c, reason: collision with root package name */
        public final h.a[] f179176c;

        public c(int r3, h.a[] r4) {
            super(r3, g(r4), null);
            this.f179176c = r4;
        }

        private static /* synthetic */ void f(int r2) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"}));
        }

        public static int g(Object[] r4) {
            if (r4 != null) goto L4;
            f(0);
        L4:
            int r02 = r4.length - 1;
            if (r02 != 0) goto L7;
            return 1;
        L7:
            int r2 = 31;
        L8:
            if (r2 < 0) goto L15;
            if (((1 << r2) & r02) != 0) goto L12;
            r2 = r2 - 1;
            goto L8
        L12:
            return r2 + 1;
        L15:
            throw new IllegalStateException("Empty enum: " + r4.getClass());
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d
        public /* bridge */ /* synthetic */ Object d(int r1) {
            return h(r1);
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d
        public /* bridge */ /* synthetic */ int e(Object r1) {
            return i((h.a) r1);
        }

        public h.a h(int r6) {
            int r02 = (1 << this.f179178b) - 1;
            int r1 = this.f179177a;
            int r62 = (r6 & (r02 << r1)) >> r1;
            h.a[] r03 = this.f179176c;
            int r12 = r03.length;
            int r2 = 0;
        L3:
            if (r2 >= r12) goto L8;
            h.a r3 = r03[r2];
            if (r3.getNumber() == r62) goto L6;
            r2 = r2 + 1;
            goto L3
        L6:
            return r3;
        L8:
            return null;
        }

        public int i(h.a r2) {
            return r2.getNumber() << this.f179177a;
        }
    }

    public static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f179177a;

        /* renamed from: b, reason: collision with root package name */
        public final int f179178b;

        public /* synthetic */ d(int r1, int r2, a r3) {
            this(r1, r2);
        }

        public static d a(d r1, h.a[] r2) {
            return new c(r1.f179177a + r1.f179178b, r2);
        }

        public static C1904b b(d r1) {
            return new C1904b(r1.f179177a + r1.f179178b);
        }

        public static C1904b c() {
            return new C1904b(0);
        }

        public abstract Object d(int r1);

        public abstract int e(Object r1);

        public d(int r1, int r2) {
            this.f179177a = r1;
            this.f179178b = r2;
        }
    }

    static {
        C1904b r02 = d.c();
        f179151a = r02;
        f179152b = d.b(r02);
        C1904b r03 = d.c();
        f179153c = r03;
        d r1 = d.a(r03, ProtoBuf$Visibility.values());
        d = r1;
        d r2 = d.a(r1, ProtoBuf$Modality.values());
        f179154e = r2;
        d r3 = d.a(r2, ProtoBuf$Class.Kind.values());
        f179155f = r3;
        C1904b r32 = d.b(r3);
        f179156g = r32;
        C1904b r33 = d.b(r32);
        f179157h = r33;
        C1904b r34 = d.b(r33);
        f179158i = r34;
        C1904b r35 = d.b(r34);
        f179159j = r35;
        C1904b r36 = d.b(r35);
        f179160k = r36;
        f179161l = d.b(r36);
        C1904b r12 = d.b(r1);
        f179162m = r12;
        f179163n = d.b(r12);
        d r13 = d.a(r2, ProtoBuf$MemberKind.values());
        f179164o = r13;
        C1904b r37 = d.b(r13);
        f179165p = r37;
        C1904b r38 = d.b(r37);
        f179166q = r38;
        C1904b r39 = d.b(r38);
        f179167r = r39;
        C1904b r310 = d.b(r39);
        f179168s = r310;
        C1904b r311 = d.b(r310);
        f179169t = r311;
        C1904b r312 = d.b(r311);
        f179170u = r312;
        C1904b r313 = d.b(r312);
        f179171v = r313;
        f179172w = d.b(r313);
        C1904b r14 = d.b(r13);
        f179173x = r14;
        C1904b r15 = d.b(r14);
        f179174y = r15;
        C1904b r16 = d.b(r15);
        f179175z = r16;
        C1904b r17 = d.b(r16);
        f179136A = r17;
        C1904b r18 = d.b(r17);
        f179137B = r18;
        C1904b r19 = d.b(r18);
        f179138C = r19;
        C1904b r110 = d.b(r19);
        f179139D = r110;
        C1904b r111 = d.b(r110);
        f179140E = r111;
        f179141F = d.b(r111);
        C1904b r04 = d.b(r03);
        f179142G = r04;
        C1904b r05 = d.b(r04);
        f179143H = r05;
        f179144I = d.b(r05);
        C1904b r06 = d.b(r2);
        f179145J = r06;
        C1904b r07 = d.b(r06);
        f179146K = r07;
        f179147L = d.b(r07);
        C1904b r08 = d.c();
        f179148M = r08;
        f179149N = d.b(r08);
        f179150O = d.c();
    }

    public static /* synthetic */ void a(int r5) {
        Object[] r02 = new Object[3];
        if (r5 == 1) goto L18;
        if (r5 != 2) goto L6;
        r02[0] = "kind";
    L19:
        r02[1] = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags";
        switch(r5) {
            case 3: goto L25;
            case 4: goto L24;
            case 5: goto L24;
            case 6: goto L24;
            case 7: goto L23;
            case 8: goto L23;
            case 9: goto L23;
            case 10: goto L22;
            case 11: goto L22;
            default: goto L21;
        };
    L21:
        r02[2] = "getClassFlags";
    L27:
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", r02));
    L22:
        r02[2] = "getAccessorFlags";
        goto L27
    L23:
        r02[2] = "getPropertyFlags";
        goto L27
    L24:
        r02[2] = "getFunctionFlags";
        goto L27
    L25:
        r02[2] = "getConstructorFlags";
        goto L27
    L6:
        if (r5 == 5) goto L18;
        if (r5 != 6) goto L10;
    L16:
        r02[0] = "memberKind";
        goto L19
    L10:
        if (r5 == 8) goto L18;
        if (r5 == 9) goto L16;
        if (r5 == 11) goto L18;
        r02[0] = "visibility";
    L18:
        r02[0] = "modality";
        goto L19
    }

    public static int b(boolean r1, ProtoBuf$Visibility r2, ProtoBuf$Modality r3, boolean r4, boolean r5, boolean r6) {
        if (r2 != null) goto L4;
        a(10);
    L4:
        if (r3 != null) goto L7;
        a(11);
    L7:
        return ((((f179153c.g(Boolean.valueOf(r1)) | f179154e.e(r3)) | d.e(r2)) | f179145J.g(Boolean.valueOf(r4))) | f179146K.g(Boolean.valueOf(r5))) | f179147L.g(Boolean.valueOf(r6));
    }
}
