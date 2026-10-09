package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC11777v;
import kotlin.collections.F;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final a f179683c = null;
    public static int d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f179684e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f179685f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f179686g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f179687h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final int f179688i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static final int f179689j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final int f179690k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final int f179691l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f179692m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static final int f179693n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static final d f179694o = null;

    /* renamed from: p, reason: collision with root package name */
    public static final d f179695p = null;

    /* renamed from: q, reason: collision with root package name */
    public static final d f179696q = null;

    /* renamed from: r, reason: collision with root package name */
    public static final d f179697r = null;

    /* renamed from: s, reason: collision with root package name */
    public static final d f179698s = null;

    /* renamed from: t, reason: collision with root package name */
    public static final d f179699t = null;

    /* renamed from: u, reason: collision with root package name */
    public static final d f179700u = null;

    /* renamed from: v, reason: collision with root package name */
    public static final d f179701v = null;

    /* renamed from: w, reason: collision with root package name */
    public static final d f179702w = null;

    /* renamed from: x, reason: collision with root package name */
    public static final d f179703x = null;

    /* renamed from: y, reason: collision with root package name */
    public static final List f179704y = null;

    /* renamed from: z, reason: collision with root package name */
    public static final List f179705z = null;

    /* renamed from: a, reason: collision with root package name */
    public final List f179706a;

    /* renamed from: b, reason: collision with root package name */
    public final int f179707b;

    public static final class a {

        /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.d$a$a, reason: collision with other inner class name */
        public static final class C1914a {

            /* renamed from: a, reason: collision with root package name */
            public final int f179708a;

            /* renamed from: b, reason: collision with root package name */
            public final String f179709b;

            public C1914a(int r2, String r3) {
                p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
                this.f179708a = r2;
                this.f179709b = r3;
            }

            public final int a() {
                return this.f179708a;
            }

            public final String b() {
                return this.f179709b;
            }
        }

        public /* synthetic */ a(i r1) {
            this();
        }

        public static final /* synthetic */ int a(a r02) {
            return r02.j();
        }

        public final int b() {
            return d.b();
        }

        public final int c() {
            return d.c();
        }

        public final int d() {
            return d.d();
        }

        public final int e() {
            return d.e();
        }

        public final int f() {
            return d.g();
        }

        public final int g() {
            return d.h();
        }

        public final int h() {
            return d.i();
        }

        public final int i() {
            return d.j();
        }

        public final int j() {
            int r02 = d.f();
            d.k(d.f() << 1);
            return r02;
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        a r02 = new a(null);
        f179683c = r02;
        d = 1;
        int r3 = a.a(r02);
        f179684e = r3;
        int r4 = a.a(r02);
        f179685f = r4;
        int r5 = a.a(r02);
        f179686g = r5;
        int r6 = a.a(r02);
        f179687h = r6;
        int r7 = a.a(r02);
        f179688i = r7;
        int r8 = a.a(r02);
        f179689j = r8;
        int r03 = a.a(r02) - 1;
        f179690k = r03;
        int r2 = (r3 | r4) | r5;
        f179691l = r2;
        int r9 = (r4 | r7) | r8;
        f179692m = r9;
        int r10 = r7 | r8;
        f179693n = r10;
        int r12 = 2;
        f179694o = new d(r03, 0 == true ? 1 : 0, r12, 0 == true ? 1 : 0);
        f179695p = new d(r10, 0 == true ? 1 : 0, r12, 0 == true ? 1 : 0);
        f179696q = new d(r3, 0 == true ? 1 : 0, r12, 0 == true ? 1 : 0);
        f179697r = new d(r4, 0 == true ? 1 : 0, r12, 0 == true ? 1 : 0);
        f179698s = new d(r5, 0 == true ? 1 : 0, r12, 0 == true ? 1 : 0);
        f179699t = new d(r2, 0 == true ? 1 : 0, r12, 0 == true ? 1 : 0);
        f179700u = new d(r6, 0 == true ? 1 : 0, r12, 0 == true ? 1 : 0);
        f179701v = new d(r7, 0 == true ? 1 : 0, r12, 0 == true ? 1 : 0);
        f179702w = new d(r8, 0 == true ? 1 : 0, r12, 0 == true ? 1 : 0);
        f179703x = new d(r9, 0 == true ? 1 : 0, r12, 0 == true ? 1 : 0);
        Field[] r22 = d.class.getFields();
        p.k(r22, "T::class.java.fields");
        ArrayList r42 = new ArrayList();
        int r52 = r22.length;
        int r62 = 0;
        int r72 = 0;
    L3:
        if (r72 >= r52) goto L8;
        Field r82 = r22[r72];
        if (Modifier.isStatic(r82.getModifiers()) == false) goto L7;
        r42.add(r82);
    L7:
        r72 = r72 + 1;
        goto L3
    L8:
        ArrayList r23 = new ArrayList();
        Iterator r43 = r42.iterator();
    L10:
        if (r43.hasNext() == false) goto L20;
        Field r53 = (Field) r43.next();
        Object r83 = r53.get(null);
        if ((r83 instanceof d) == false) goto L14;
        d r84 = (d) r83;
    L15:
        if (r84 == null) goto L17;
        int r85 = r84.f179707b;
        String r54 = r53.getName();
        p.k(r54, "field.name");
        a.C1914a r92 = new a.C1914a(r85, r54);
    L18:
        if (r92 == null) goto L10;
        r23.add(r92);
        goto L10
    L17:
        r92 = null;
        goto L18
    L14:
        r84 = null;
        goto L15
    L20:
        f179704y = r23;
        Field[] r04 = d.class.getFields();
        p.k(r04, "T::class.java.fields");
        ArrayList r24 = new ArrayList();
        int r32 = r04.length;
    L21:
        if (r62 >= r32) goto L26;
        Field r44 = r04[r62];
        if (Modifier.isStatic(r44.getModifiers()) == false) goto L25;
        r24.add(r44);
    L25:
        r62 = r62 + 1;
        goto L21
    L26:
        ArrayList r05 = new ArrayList();
        Iterator r25 = r24.iterator();
    L28:
        if (r25.hasNext() == false) goto L32;
        Object r33 = r25.next();
        if (p.g(((Field) r33).getType(), Integer.TYPE) == false) goto L28;
        r05.add(r33);
        goto L28
    L32:
        ArrayList r26 = new ArrayList();
        Iterator r06 = r05.iterator();
    L34:
        if (r06.hasNext() == false) goto L41;
        Field r34 = (Field) r06.next();
        Object r45 = r34.get(null);
        p.j(r45, "null cannot be cast to non-null type kotlin.Int");
        int r46 = ((Integer) r45).intValue();
        if (r46 != ((-r46) & r46)) goto L38;
        String r35 = r34.getName();
        p.k(r35, "field.name");
        a.C1914a r55 = new a.C1914a(r46, r35);
    L39:
        if (r55 == null) goto L34;
        r26.add(r55);
        goto L34
    L38:
        r55 = null;
        goto L39
    L41:
        f179705z = r26;
    }

    public d(int r2, List r3) {
        p.l(r3, "excludes");
        this.f179706a = r3;
        Iterator r32 = r3.iterator();
    L4:
        if (r32.hasNext() == false) goto L6;
        r2 = r2 & (~((c) r32.next()).a());
        goto L4
    L6:
        this.f179707b = r2;
    }

    public static final /* synthetic */ int b() {
        return f179690k;
    }

    public static final /* synthetic */ int c() {
        return f179691l;
    }

    public static final /* synthetic */ int d() {
        return f179688i;
    }

    public static final /* synthetic */ int e() {
        return f179684e;
    }

    public static final /* synthetic */ int f() {
        return d;
    }

    public static final /* synthetic */ int g() {
        return f179687h;
    }

    public static final /* synthetic */ int h() {
        return f179685f;
    }

    public static final /* synthetic */ int i() {
        return f179686g;
    }

    public static final /* synthetic */ int j() {
        return f179689j;
    }

    public static final /* synthetic */ void k(int r02) {
        d = r02;
    }

    public final boolean a(int r2) {
        if ((r2 & this.f179707b) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L5;
        return true;
    L5:
        if (r5 == null) goto L7;
        Class<?> r1 = r5.getClass();
    L9:
        if (p.g(d.class, r1) == true) goto L11;
        return false;
    L11:
        p.j(r5, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        d r52 = (d) r5;
        if (p.g(this.f179706a, r52.f179706a) == true) goto L15;
        return false;
    L15:
        if (this.f179707b == r52.f179707b) goto L17;
        return false;
    L17:
        return true;
    L7:
        r1 = null;
        goto L9
    }

    public int hashCode() {
        return (this.f179706a.hashCode() * 31) + this.f179707b;
    }

    public final List l() {
        return this.f179706a;
    }

    public final int m() {
        return this.f179707b;
    }

    public final d n(int r3) {
        int r32 = r3 & this.f179707b;
        if (r32 != 0) goto L7;
        return null;
    L7:
        return new d(r32, this.f179706a);
    }

    public String toString() {
        Iterator r02 = f179704y.iterator();
    L4:
        if (r02.hasNext() == false) goto L8;
        Object r1 = r02.next();
        if (((a.C1914a) r1).a() != this.f179707b) goto L4;
    L9:
        a.C1914a r12 = (a.C1914a) r1;
        if (r12 == null) goto L12;
        String r03 = r12.b();
    L13:
        if (r03 != null) goto L25;
        List r04 = f179705z;
        ArrayList r3 = new ArrayList();
        Iterator r05 = r04.iterator();
    L16:
        if (r05.hasNext() == false) goto L23;
        a.C1914a r13 = (a.C1914a) r05.next();
        if (a(r13.a()) == false) goto L20;
        String r14 = r13.b();
    L21:
        if (r14 == null) goto L16;
        r3.add(r14);
        goto L16
    L20:
        r14 = null;
        goto L21
    L23:
        r03 = F.D0(r3, " | ", null, null, 0, null, null, 62, null);
    L25:
        return "DescriptorKindFilter(" + r03 + ", " + this.f179706a + ')';
    L12:
        r03 = null;
        goto L13
    L8:
        r1 = null;
        goto L9
    }

    public /* synthetic */ d(int r1, List r2, int r3, i r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = AbstractC11777v.o();
    L5:
        this(r1, r2);
    }
}
