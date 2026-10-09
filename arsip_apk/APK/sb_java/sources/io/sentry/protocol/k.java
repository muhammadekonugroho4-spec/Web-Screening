package io.sentry.protocol;

import com.google.firebase.messaging.Constants;
import com.stockbit.screener.ScreenerEntryPoint;
import io.sentry.InterfaceC11587f1;
import io.sentry.InterfaceC11592g1;
import io.sentry.InterfaceC11631o0;
import io.sentry.InterfaceC11696y0;
import io.sentry.Q;
import io.sentry.util.AbstractC11673b;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class k implements InterfaceC11696y0 {

    /* renamed from: a, reason: collision with root package name */
    public final transient Thread f176566a;

    /* renamed from: b, reason: collision with root package name */
    public String f176567b;

    /* renamed from: c, reason: collision with root package name */
    public String f176568c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f176569e;

    /* renamed from: f, reason: collision with root package name */
    public Map f176570f;

    /* renamed from: g, reason: collision with root package name */
    public Map f176571g;

    /* renamed from: h, reason: collision with root package name */
    public Boolean f176572h;

    /* renamed from: i, reason: collision with root package name */
    public Integer f176573i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f176574j;

    /* renamed from: k, reason: collision with root package name */
    public Boolean f176575k;

    /* renamed from: l, reason: collision with root package name */
    public Map f176576l;

    public static final class a implements InterfaceC11631o0 {
        public a() {
        }

        @Override // io.sentry.InterfaceC11631o0
        public /* bridge */ /* synthetic */ Object a(InterfaceC11587f1 r1, Q r2) {
            return b(r1, r2);
        }

        public k b(InterfaceC11587f1 r6, Q r7) {
            k r02 = new k();
            r6.beginObject();
            HashMap r1 = null;
        L4:
            if (r6.peek() != JsonToken.NAME) goto L62;
            String r2 = r6.nextName();
            r2.getClass();
            char r3 = 65535;
            switch(r2.hashCode()) {
                case -1724546052: goto L45;
                case -268203253: goto L41;
                case 3076010: goto L37;
                case 3347973: goto L33;
                case 3575610: goto L29;
                case 692803388: goto L25;
                case 989128517: goto L21;
                case 1032012154: goto L17;
                case 1297152568: goto L13;
                case 2070327504: goto L9;
                default: goto L48;
            };
        L48:
            switch(r3) {
                case 0: goto L61;
                case 1: goto L60;
                case 2: goto L59;
                case 3: goto L58;
                case 4: goto L57;
                case 5: goto L56;
                case 6: goto L55;
                case 7: goto L54;
                case 8: goto L53;
                case 9: goto L52;
                default: goto L49;
            };
        L52:
            k.i(r02, r6.h1());
            goto L4
        L53:
            k.c(r02, r6.b0());
            goto L4
        L54:
            k.j(r02, r6.G());
            goto L4
        L55:
            k.g(r02, r6.G());
            goto L4
        L56:
            k.d(r02, r6.G());
            goto L4
        L57:
            k.a(r02, r6.b0());
            goto L4
        L58:
            k.e(r02, AbstractC11673b.c((Map) r6.B1()));
            goto L4
        L59:
            k.f(r02, AbstractC11673b.c((Map) r6.B1()));
            goto L4
        L60:
            k.h(r02, r6.h1());
            goto L4
        L61:
            k.b(r02, r6.b0());
            goto L4
        L49:
            if (r1 != null) goto L51;
            r1 = new HashMap();
        L51:
            r6.o1(r7, r1, r2);
            goto L4
        L9:
            if (r2.equals(ScreenerEntryPoint.KEY_PARENT_ID) == false) goto L48;
            r3 = '\t';
            goto L48
        L13:
            if (r2.equals("help_link") == false) goto L48;
            r3 = '\b';
            goto L48
        L17:
            if (r2.equals("is_exception_group") == false) goto L48;
            r3 = 7;
            goto L48
        L21:
            if (r2.equals("synthetic") == false) goto L48;
            r3 = 6;
            goto L48
        L25:
            if (r2.equals("handled") == false) goto L48;
            r3 = 5;
            goto L48
        L29:
            if (r2.equals("type") == false) goto L48;
            r3 = 4;
            goto L48
        L33:
            if (r2.equals("meta") == false) goto L48;
            r3 = 3;
            goto L48
        L37:
            if (r2.equals(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) == false) goto L48;
            r3 = 2;
            goto L48
        L41:
            if (r2.equals("exception_id") == false) goto L48;
            r3 = 1;
            goto L48
        L45:
            if (r2.equals("description") == false) goto L48;
            r3 = 0;
            goto L48
        L62:
            r6.endObject();
            r02.s(r1);
            return r02;
        }
    }

    public k() {
        this(null);
    }

    public static /* synthetic */ String a(k r02, String r1) {
        r02.f176567b = r1;
        return r1;
    }

    public static /* synthetic */ String b(k r02, String r1) {
        r02.f176568c = r1;
        return r1;
    }

    public static /* synthetic */ String c(k r02, String r1) {
        r02.d = r1;
        return r1;
    }

    public static /* synthetic */ Boolean d(k r02, Boolean r1) {
        r02.f176569e = r1;
        return r1;
    }

    public static /* synthetic */ Map e(k r02, Map r1) {
        r02.f176570f = r1;
        return r1;
    }

    public static /* synthetic */ Map f(k r02, Map r1) {
        r02.f176571g = r1;
        return r1;
    }

    public static /* synthetic */ Boolean g(k r02, Boolean r1) {
        r02.f176572h = r1;
        return r1;
    }

    public static /* synthetic */ Integer h(k r02, Integer r1) {
        r02.f176573i = r1;
        return r1;
    }

    public static /* synthetic */ Integer i(k r02, Integer r1) {
        r02.f176574j = r1;
        return r1;
    }

    public static /* synthetic */ Boolean j(k r02, Boolean r1) {
        r02.f176575k = r1;
        return r1;
    }

    public String k() {
        return this.f176567b;
    }

    public Boolean l() {
        return this.f176569e;
    }

    public void m(Integer r1) {
        this.f176573i = r1;
    }

    public void n(Boolean r1) {
        this.f176569e = r1;
    }

    public void o(Map r1) {
        this.f176570f = AbstractC11673b.d(r1);
    }

    public void p(Integer r1) {
        this.f176574j = r1;
    }

    public void q(Boolean r1) {
        this.f176572h = r1;
    }

    public void r(String r1) {
        this.f176567b = r1;
    }

    public void s(Map r1) {
        this.f176576l = r1;
    }

    @Override // io.sentry.InterfaceC11696y0
    public void serialize(InterfaceC11592g1 r4, Q r5) {
        r4.beginObject();
        if (this.f176567b == null) goto L6;
        r4.e("type").a(this.f176567b);
    L6:
        if (this.f176568c == null) goto L9;
        r4.e("description").a(this.f176568c);
    L9:
        if (this.d == null) goto L12;
        r4.e("help_link").a(this.d);
    L12:
        if (this.f176569e == null) goto L15;
        r4.e("handled").k(this.f176569e);
    L15:
        if (this.f176570f == null) goto L18;
        r4.e("meta").j(r5, this.f176570f);
    L18:
        if (this.f176571g == null) goto L21;
        r4.e(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).j(r5, this.f176571g);
    L21:
        if (this.f176572h == null) goto L24;
        r4.e("synthetic").k(this.f176572h);
    L24:
        if (this.f176573i == null) goto L27;
        r4.e("exception_id").j(r5, this.f176573i);
    L27:
        if (this.f176574j == null) goto L30;
        r4.e(ScreenerEntryPoint.KEY_PARENT_ID).j(r5, this.f176574j);
    L30:
        if (this.f176575k == null) goto L32;
        r4.e("is_exception_group").k(this.f176575k);
    L32:
        Map r02 = this.f176576l;
        if (r02 == null) goto L38;
        Iterator r03 = r02.keySet().iterator();
    L36:
        if (r03.hasNext() == false) goto L38;
        String r1 = (String) r03.next();
        Object r2 = this.f176576l.get(r1);
        r4.e(r1).j(r5, r2);
    L38:
        r4.endObject();
    }

    public k(Thread r1) {
        this.f176566a = r1;
    }
}
