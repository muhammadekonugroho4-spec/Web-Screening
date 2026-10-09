package io.sentry;

import io.sentry.vendor.gson.stream.JsonToken;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: io.sentry.t0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11663t0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f176774a;

    /* renamed from: io.sentry.t0$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f176775a = null;

        static {
            int[] r02 = new int[JsonToken.values().length];
            f176775a = r02;
            r02[JsonToken.BEGIN_ARRAY.ordinal()] = 1;     // Catch: NoSuchFieldError -> L14
        L26:
            f176775a[JsonToken.END_ARRAY.ordinal()] = 2;     // Catch: NoSuchFieldError -> L15
        L32:
            f176775a[JsonToken.BEGIN_OBJECT.ordinal()] = 3;     // Catch: NoSuchFieldError -> L16
        L42:
            f176775a[JsonToken.END_OBJECT.ordinal()] = 4;     // Catch: NoSuchFieldError -> L17
        L28:
            f176775a[JsonToken.NAME.ordinal()] = 5;     // Catch: NoSuchFieldError -> L18
        L34:
            f176775a[JsonToken.STRING.ordinal()] = 6;     // Catch: NoSuchFieldError -> L19
        L36:
            f176775a[JsonToken.NUMBER.ordinal()] = 7;     // Catch: NoSuchFieldError -> L20
        L38:
            f176775a[JsonToken.BOOLEAN.ordinal()] = 8;     // Catch: NoSuchFieldError -> L21
        L24:
            f176775a[JsonToken.NULL.ordinal()] = 9;     // Catch: NoSuchFieldError -> L22
        L30:
            f176775a[JsonToken.END_DOCUMENT.ordinal()] = 10;     // Catch: NoSuchFieldError -> L23
            return;
        }
    }

    /* renamed from: io.sentry.t0$b */
    public interface b {
        Object a();
    }

    /* renamed from: io.sentry.t0$c */
    public interface c {
        Object getValue();
    }

    /* renamed from: io.sentry.t0$d */
    public static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f176776a;

        public d() {
            this.f176776a = new ArrayList();
        }

        @Override // io.sentry.C11663t0.c
        public Object getValue() {
            return this.f176776a;
        }

        public /* synthetic */ d(a r1) {
            this();
        }
    }

    /* renamed from: io.sentry.t0$e */
    public static final class e implements c {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f176777a;

        public e() {
            this.f176777a = new HashMap();
        }

        @Override // io.sentry.C11663t0.c
        public Object getValue() {
            return this.f176777a;
        }

        public /* synthetic */ e(a r1) {
            this();
        }
    }

    /* renamed from: io.sentry.t0$f */
    public static final class f implements c {

        /* renamed from: a, reason: collision with root package name */
        public final String f176778a;

        public f(String r1) {
            this.f176778a = r1;
        }

        @Override // io.sentry.C11663t0.c
        public Object getValue() {
            return this.f176778a;
        }
    }

    /* renamed from: io.sentry.t0$g */
    public static final class g implements c {

        /* renamed from: a, reason: collision with root package name */
        public final Object f176779a;

        public g(Object r1) {
            this.f176779a = r1;
        }

        @Override // io.sentry.C11663t0.c
        public Object getValue() {
            return this.f176779a;
        }
    }

    public C11663t0() {
        this.f176774a = new ArrayList();
    }

    public static /* synthetic */ Object a() {
        return null;
    }

    public static /* synthetic */ Object b(C11669u0 r02) {
        return Boolean.valueOf(r02.c());
    }

    public static /* synthetic */ Object c(C11663t0 r02, C11669u0 r1) {
        return r02.j(r1);
    }

    public static /* synthetic */ Object d(C11669u0 r02) {
        return r02.nextString();
    }

    public Object e(C11669u0 r1) {
        k(r1);
        c r12 = f();
        if (r12 != null) goto L5;
        return null;
    L5:
        return r12.getValue();
    }

    public final c f() {
        if (this.f176774a.isEmpty() == false) goto L7;
        return null;
    L7:
        return (c) this.f176774a.get(r0.size() - 1);
    }

    public final boolean g() {
        if (i() == false) goto L6;
        return true;
    L6:
        c r02 = f();
        l();
        if ((f() instanceof f) == false) goto L14;
        f r1 = (f) f();
        l();
        e r2 = (e) f();
        if (r1 == null) goto L21;
        if (r02 == null) goto L22;
        if (r2 == null) goto L23;
        r2.f176777a.put(r1.f176778a, r02.getValue());
        return false;
    L23:
        return false;
    L22:
        return false;
    L21:
        return false;
    L14:
        if ((f() instanceof d) == false) goto L25;
        d r12 = (d) f();
        if (r02 == null) goto L26;
        if (r12 == null) goto L27;
        r12.f176776a.add(r02.getValue());
        return false;
    L27:
        return false;
    L26:
        return false;
    L25:
        return false;
    }

    public final boolean h(b r3) {
        Object r32 = r3.a();
        if (f() != null) goto L8;
        if (r32 == null) goto L8;
        m(new g(r32));
        return true;
    L8:
        if ((f() instanceof f) == false) goto L11;
        f r02 = (f) f();
        l();
        ((e) f()).f176777a.put(r02.f176778a, r32);
        return false;
    L11:
        if ((f() instanceof d) == false) goto L16;
        ((d) f()).f176776a.add(r32);
        return false;
    L16:
        return false;
    }

    public final boolean i() {
        if (this.f176774a.size() != 1) goto L5;
        return true;
    L5:
        return false;
    }

    public final Object j(C11669u0 r3) {
        return Integer.valueOf(r3.nextInt());
    L4:
        return Double.valueOf(r3.nextDouble());
    L7:
        return Long.valueOf(r3.nextLong());
    }

    public final void k(final C11669u0 r3) {
        a r1 = null;
        switch(a.f176775a[r3.peek().ordinal()]) {
            case 1: goto L14;
            case 2: goto L13;
            case 3: goto L12;
            case 4: goto L11;
            case 5: goto L10;
            case 6: goto L9;
            case 7: goto L8;
            case 8: goto L7;
            case 9: goto L6;
            case 10: goto L5;
            default: goto L15;
        };
    L5:
        boolean r02 = true;
    L16:
        if (r02 == true) goto L19;
        k(r3);
        return;
    L19:
        return;
    L6:
        r3.f();
        r02 = h(new C11658s0());
        goto L16
    L7:
        r02 = h(new C11653r0(r3));
        goto L16
    L8:
        r02 = h(new C11649q0(this, r3));
        goto L16
    L9:
        r02 = h(new C11636p0(r3));
        goto L16
    L10:
        m(new f(r3.nextName()));
        goto L15
    L11:
        r3.endObject();
        r02 = g();
        goto L16
    L12:
        r3.beginObject();
        m(new e(r1));
        goto L15
    L13:
        r3.endArray();
        r02 = g();
        goto L16
    L14:
        r3.beginArray();
        m(new d(r1));
    L15:
        r02 = false;
        goto L16
    }

    public final void l() {
        if (this.f176774a.isEmpty() == false) goto L5;
        return;
    L5:
        this.f176774a.remove(r0.size() - 1);
    }

    public final void m(c r2) {
        this.f176774a.add(r2);
    }
}
