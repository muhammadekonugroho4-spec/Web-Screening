package io.sentry.protocol.profiling;

import io.sentry.InterfaceC11587f1;
import io.sentry.InterfaceC11592g1;
import io.sentry.InterfaceC11631o0;
import io.sentry.InterfaceC11696y0;
import io.sentry.Q;
import io.sentry.protocol.A;
import io.sentry.protocol.profiling.b;
import io.sentry.protocol.profiling.c;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class a implements InterfaceC11696y0 {

    /* renamed from: a, reason: collision with root package name */
    public List f176606a;

    /* renamed from: b, reason: collision with root package name */
    public List f176607b;

    /* renamed from: c, reason: collision with root package name */
    public List f176608c;
    public Map d;

    /* renamed from: e, reason: collision with root package name */
    public Map f176609e;

    /* renamed from: io.sentry.protocol.profiling.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C1853a {
    }

    public static final class b implements InterfaceC11631o0 {
        public b() {
        }

        @Override // io.sentry.InterfaceC11631o0
        public /* bridge */ /* synthetic */ Object a(InterfaceC11587f1 r1, Q r2) {
            return b(r1, r2);
        }

        public a b(InterfaceC11587f1 r7, Q r8) {
            r7.beginObject();
            a r02 = new a();
            C1853a r1 = null;
            ConcurrentHashMap r2 = null;
        L4:
            if (r7.peek() != JsonToken.NAME) goto L40;
            String r3 = r7.nextName();
            r3.getClass();
            char r4 = 65535;
            switch(r3.hashCode()) {
                case -1266514778: goto L21;
                case -892498197: goto L17;
                case 1864843273: goto L13;
                case 2061486532: goto L9;
                default: goto L24;
            };
        L24:
            switch(r4) {
                case 0: goto L37;
                case 1: goto L34;
                case 2: goto L31;
                case 3: goto L28;
                default: goto L25;
            };
        L28:
            Map r32 = r7.n1(r8, new c.a());
            if (r32 == null) goto L4;
            a.c(r02, r32);
            goto L4
        L31:
            List r33 = r7.t0(r8, new b.a());
            if (r33 == null) goto L4;
            a.b(r02, r33);
            goto L4
        L34:
            List r34 = (List) r7.K(r8, new c(r1));
            if (r34 == null) goto L4;
            a.d(r02, r34);
            goto L4
        L37:
            List r35 = r7.t0(r8, new A.a());
            if (r35 == null) goto L4;
            a.a(r02, r35);
            goto L4
        L25:
            if (r2 != null) goto L27;
            r2 = new ConcurrentHashMap();
        L27:
            r7.o1(r8, r2, r3);
            goto L4
        L9:
            if (r3.equals("thread_metadata") == false) goto L24;
            r4 = 3;
            goto L24
        L13:
            if (r3.equals("samples") == false) goto L24;
            r4 = 2;
            goto L24
        L17:
            if (r3.equals("stacks") == false) goto L24;
            r4 = 1;
            goto L24
        L21:
            if (r3.equals("frames") == false) goto L24;
            r4 = 0;
            goto L24
        L40:
            r02.e(r2);
            r7.endObject();
            return r02;
        }
    }

    public static final class c implements InterfaceC11631o0 {
        public c() {
        }

        @Override // io.sentry.InterfaceC11631o0
        public /* bridge */ /* synthetic */ Object a(InterfaceC11587f1 r1, Q r2) {
            return b(r1, r2);
        }

        public List b(InterfaceC11587f1 r3, Q r4) {
            ArrayList r42 = new ArrayList();
            r3.beginArray();
        L4:
            if (r3.hasNext() == false) goto L10;
            ArrayList r02 = new ArrayList();
            r3.beginArray();
        L7:
            if (r3.hasNext() == false) goto L9;
            r02.add(Integer.valueOf(r3.nextInt()));
            goto L7
        L9:
            r3.endArray();
            r42.add(r02);
            goto L4
        L10:
            r3.endArray();
            return r42;
        }

        public /* synthetic */ c(C1853a r1) {
            this();
        }
    }

    public a() {
        this.f176606a = new ArrayList();
        this.f176607b = new ArrayList();
        this.f176608c = new ArrayList();
        this.d = new HashMap();
    }

    public static /* synthetic */ List a(a r02, List r1) {
        r02.f176608c = r1;
        return r1;
    }

    public static /* synthetic */ List b(a r02, List r1) {
        r02.f176606a = r1;
        return r1;
    }

    public static /* synthetic */ Map c(a r02, Map r1) {
        r02.d = r1;
        return r1;
    }

    public static /* synthetic */ List d(a r02, List r1) {
        r02.f176607b = r1;
        return r1;
    }

    public void e(Map r1) {
        this.f176609e = r1;
    }

    @Override // io.sentry.InterfaceC11696y0
    public void serialize(InterfaceC11592g1 r4, Q r5) {
        r4.beginObject();
        r4.e("samples").j(r5, this.f176606a);
        r4.e("stacks").j(r5, this.f176607b);
        r4.e("frames").j(r5, this.f176608c);
        r4.e("thread_metadata").j(r5, this.d);
        Map r02 = this.f176609e;
        if (r02 == null) goto L8;
        Iterator r03 = r02.keySet().iterator();
    L6:
        if (r03.hasNext() == false) goto L8;
        String r1 = (String) r03.next();
        Object r2 = this.f176609e.get(r1);
        r4.e(r1).j(r5, r2);
    L8:
        r4.endObject();
    }
}
