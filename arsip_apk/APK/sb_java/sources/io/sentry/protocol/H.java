package io.sentry.protocol;

import io.sentry.InterfaceC11587f1;
import io.sentry.InterfaceC11592g1;
import io.sentry.InterfaceC11631o0;
import io.sentry.InterfaceC11696y0;
import io.sentry.Q;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class H implements InterfaceC11696y0 {

    /* renamed from: a, reason: collision with root package name */
    public String f176504a;

    /* renamed from: b, reason: collision with root package name */
    public String f176505b;

    /* renamed from: c, reason: collision with root package name */
    public String f176506c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public Double f176507e;

    /* renamed from: f, reason: collision with root package name */
    public Double f176508f;

    /* renamed from: g, reason: collision with root package name */
    public Double f176509g;

    /* renamed from: h, reason: collision with root package name */
    public Double f176510h;

    /* renamed from: i, reason: collision with root package name */
    public String f176511i;

    /* renamed from: j, reason: collision with root package name */
    public Double f176512j;

    /* renamed from: k, reason: collision with root package name */
    public List f176513k;

    /* renamed from: l, reason: collision with root package name */
    public Map f176514l;

    public static final class a implements InterfaceC11631o0 {
        public a() {
        }

        @Override // io.sentry.InterfaceC11631o0
        public /* bridge */ /* synthetic */ Object a(InterfaceC11587f1 r1, Q r2) {
            return b(r1, r2);
        }

        public H b(InterfaceC11587f1 r6, Q r7) {
            H r02 = new H();
            r6.beginObject();
            HashMap r1 = null;
        L4:
            if (r6.peek() != JsonToken.NAME) goto L67;
            String r2 = r6.nextName();
            r2.getClass();
            char r3 = 65535;
            switch(r2.hashCode()) {
                case -1784982718: goto L49;
                case -1618432855: goto L45;
                case -1221029593: goto L41;
                case 120: goto L37;
                case 121: goto L33;
                case 114586: goto L29;
                case 3575610: goto L25;
                case 92909918: goto L21;
                case 113126854: goto L17;
                case 1659526655: goto L13;
                case 1941332754: goto L9;
                default: goto L52;
            };
        L52:
            switch(r3) {
                case 0: goto L66;
                case 1: goto L65;
                case 2: goto L64;
                case 3: goto L63;
                case 4: goto L62;
                case 5: goto L61;
                case 6: goto L60;
                case 7: goto L59;
                case 8: goto L58;
                case 9: goto L57;
                case 10: goto L56;
                default: goto L53;
            };
        L56:
            H.j(r02, r6.b0());
            goto L4
        L57:
            H.b(r02, r6.t0(r7, this));
            goto L4
        L58:
            H.f(r02, r6.R0());
            goto L4
        L59:
            H.k(r02, r6.R0());
            goto L4
        L60:
            H.c(r02, r6.b0());
            goto L4
        L61:
            H.e(r02, r6.b0());
            goto L4
        L62:
            H.i(r02, r6.R0());
            goto L4
        L63:
            H.h(r02, r6.R0());
            goto L4
        L64:
            H.g(r02, r6.R0());
            goto L4
        L65:
            H.d(r02, r6.b0());
            goto L4
        L66:
            H.a(r02, r6.b0());
            goto L4
        L53:
            if (r1 != null) goto L55;
            r1 = new HashMap();
        L55:
            r6.o1(r7, r1, r2);
            goto L4
        L9:
            if (r2.equals("visibility") == false) goto L52;
            r3 = '\n';
            goto L52
        L13:
            if (r2.equals("children") == false) goto L52;
            r3 = '\t';
            goto L52
        L17:
            if (r2.equals("width") == false) goto L52;
            r3 = '\b';
            goto L52
        L21:
            if (r2.equals("alpha") == false) goto L52;
            r3 = 7;
            goto L52
        L25:
            if (r2.equals("type") == false) goto L52;
            r3 = 6;
            goto L52
        L29:
            if (r2.equals("tag") == false) goto L52;
            r3 = 5;
            goto L52
        L33:
            if (r2.equals("y") == false) goto L52;
            r3 = 4;
            goto L52
        L37:
            if (r2.equals("x") == false) goto L52;
            r3 = 3;
            goto L52
        L41:
            if (r2.equals("height") == false) goto L52;
            r3 = 2;
            goto L52
        L45:
            if (r2.equals("identifier") == false) goto L52;
            r3 = 1;
            goto L52
        L49:
            if (r2.equals("rendering_system") == false) goto L52;
            r3 = 0;
            goto L52
        L67:
            r6.endObject();
            r02.t(r1);
            return r02;
        }
    }

    public H() {
    }

    public static /* synthetic */ String a(H r02, String r1) {
        r02.f176504a = r1;
        return r1;
    }

    public static /* synthetic */ List b(H r02, List r1) {
        r02.f176513k = r1;
        return r1;
    }

    public static /* synthetic */ String c(H r02, String r1) {
        r02.f176505b = r1;
        return r1;
    }

    public static /* synthetic */ String d(H r02, String r1) {
        r02.f176506c = r1;
        return r1;
    }

    public static /* synthetic */ String e(H r02, String r1) {
        r02.d = r1;
        return r1;
    }

    public static /* synthetic */ Double f(H r02, Double r1) {
        r02.f176507e = r1;
        return r1;
    }

    public static /* synthetic */ Double g(H r02, Double r1) {
        r02.f176508f = r1;
        return r1;
    }

    public static /* synthetic */ Double h(H r02, Double r1) {
        r02.f176509g = r1;
        return r1;
    }

    public static /* synthetic */ Double i(H r02, Double r1) {
        r02.f176510h = r1;
        return r1;
    }

    public static /* synthetic */ String j(H r02, String r1) {
        r02.f176511i = r1;
        return r1;
    }

    public static /* synthetic */ Double k(H r02, Double r1) {
        r02.f176512j = r1;
        return r1;
    }

    public List l() {
        return this.f176513k;
    }

    public String m() {
        return this.d;
    }

    public void n(Double r1) {
        this.f176512j = r1;
    }

    public void o(List r1) {
        this.f176513k = r1;
    }

    public void p(Double r1) {
        this.f176508f = r1;
    }

    public void q(String r1) {
        this.f176506c = r1;
    }

    public void r(String r1) {
        this.d = r1;
    }

    public void s(String r1) {
        this.f176505b = r1;
    }

    @Override // io.sentry.InterfaceC11696y0
    public void serialize(InterfaceC11592g1 r4, Q r5) {
        r4.beginObject();
        if (this.f176504a == null) goto L6;
        r4.e("rendering_system").a(this.f176504a);
    L6:
        if (this.f176505b == null) goto L9;
        r4.e("type").a(this.f176505b);
    L9:
        if (this.f176506c == null) goto L12;
        r4.e("identifier").a(this.f176506c);
    L12:
        if (this.d == null) goto L15;
        r4.e("tag").a(this.d);
    L15:
        if (this.f176507e == null) goto L18;
        r4.e("width").i(this.f176507e);
    L18:
        if (this.f176508f == null) goto L21;
        r4.e("height").i(this.f176508f);
    L21:
        if (this.f176509g == null) goto L24;
        r4.e("x").i(this.f176509g);
    L24:
        if (this.f176510h == null) goto L27;
        r4.e("y").i(this.f176510h);
    L27:
        if (this.f176511i == null) goto L30;
        r4.e("visibility").a(this.f176511i);
    L30:
        if (this.f176512j == null) goto L32;
        r4.e("alpha").i(this.f176512j);
    L32:
        List r02 = this.f176513k;
        if (r02 != null) goto L35;
    L37:
        Map r03 = this.f176514l;
        if (r03 == null) goto L43;
        Iterator r04 = r03.keySet().iterator();
    L41:
        if (r04.hasNext() == false) goto L43;
        String r1 = (String) r04.next();
        Object r2 = this.f176514l.get(r1);
        r4.e(r1).j(r5, r2);
    L43:
        r4.endObject();
        return;
    L35:
        if (r02.isEmpty() == true) goto L37;
        r4.e("children").j(r5, this.f176513k);
        goto L37
    }

    public void t(Map r1) {
        this.f176514l = r1;
    }

    public void u(String r1) {
        this.f176511i = r1;
    }

    public void v(Double r1) {
        this.f176507e = r1;
    }

    public void w(Double r1) {
        this.f176509g = r1;
    }

    public void x(Double r1) {
        this.f176510h = r1;
    }
}
