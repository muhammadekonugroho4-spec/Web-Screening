package androidx.sqlite.db;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class a implements f {

    /* renamed from: c, reason: collision with root package name */
    public static final C0253a f28076c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f28077a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f28078b;

    /* renamed from: androidx.sqlite.db.a$a, reason: collision with other inner class name */
    public static final class C0253a {
        public /* synthetic */ C0253a(i r1) {
            this();
        }

        public final void a(e r3, int r4, Object r5) {
            if (r5 != null) goto L6;
            r3.o(r4);
            return;
        L6:
            if ((r5 instanceof byte[]) == false) goto L10;
            r3.e0(r4, (byte[]) r5);
            return;
        L10:
            if ((r5 instanceof Float) == false) goto L14;
            r3.p(r4, ((Number) r5).floatValue());
            return;
        L14:
            if ((r5 instanceof Double) == false) goto L18;
            r3.p(r4, ((Number) r5).doubleValue());
            return;
        L18:
            if ((r5 instanceof Long) == false) goto L22;
            r3.m(r4, ((Number) r5).longValue());
            return;
        L22:
            if ((r5 instanceof Integer) == false) goto L26;
            r3.m(r4, ((Number) r5).intValue());
            return;
        L26:
            if ((r5 instanceof Short) == false) goto L30;
            r3.m(r4, ((Number) r5).shortValue());
            return;
        L30:
            if ((r5 instanceof Byte) == false) goto L34;
            r3.m(r4, ((Number) r5).byteValue());
            return;
        L34:
            if ((r5 instanceof String) == false) goto L38;
            r3.U(r4, (String) r5);
            return;
        L38:
            if ((r5 instanceof Boolean) == false) goto L46;
            if (((Boolean) r5).booleanValue() == false) goto L42;
            long r02 = 1;
        L43:
            r3.m(r4, r02);
            return;
        L42:
            r02 = 0;
            goto L43
        L46:
            throw new IllegalArgumentException("Cannot bind " + r5 + " at index " + r4 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
        }

        public final void b(e r4, Object[] r5) {
            p.l(r4, "statement");
            if (r5 == null) goto L8;
            int r02 = r5.length;
            int r1 = 0;
        L6:
            if (r1 >= r02) goto L10;
            Object r2 = r5[r1];
            r1 = r1 + 1;
            a(r4, r1, r2);
            goto L6
        L10:
            return;
        }

        public C0253a() {
        }
    }

    static {
        f28076c = new C0253a(null);
    }

    public a(String r2, Object[] r3) {
        p.l(r2, "query");
        this.f28077a = r2;
        this.f28078b = r3;
    }

    @Override // androidx.sqlite.db.f
    public String c() {
        return this.f28077a;
    }

    @Override // androidx.sqlite.db.f
    public void f(e r3) {
        p.l(r3, "statement");
        f28076c.b(r3, this.f28078b);
    }

    public a(String r2) {
        p.l(r2, "query");
        this(r2, null);
    }
}
