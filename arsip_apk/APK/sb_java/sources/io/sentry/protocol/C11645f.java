package io.sentry.protocol;

import io.sentry.InterfaceC11587f1;
import io.sentry.InterfaceC11592g1;
import io.sentry.InterfaceC11631o0;
import io.sentry.InterfaceC11696y0;
import io.sentry.Q;
import io.sentry.protocol.C11644e;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11645f implements InterfaceC11696y0 {

    /* renamed from: a, reason: collision with root package name */
    public List f176543a;

    /* renamed from: b, reason: collision with root package name */
    public Map f176544b;

    /* renamed from: io.sentry.protocol.f$a */
    public static final class a implements InterfaceC11631o0 {
        public a() {
        }

        @Override // io.sentry.InterfaceC11631o0
        public /* bridge */ /* synthetic */ Object a(InterfaceC11587f1 r1, Q r2) {
            return b(r1, r2);
        }

        public C11645f b(InterfaceC11587f1 r5, Q r6) {
            r5.beginObject();
            List r02 = null;
            ConcurrentHashMap r1 = null;
        L4:
            if (r5.peek() != JsonToken.NAME) goto L11;
            String r2 = r5.nextName();
            r2.getClass();
            if (r2.equals("values") == false) goto L7;
            r02 = r5.t0(r6, new C11644e.a());
            goto L4
        L7:
            if (r1 != null) goto L9;
            r1 = new ConcurrentHashMap();
        L9:
            r5.o1(r6, r1, r2);
            goto L4
        L11:
            if (r02 != null) goto L13;
            r02 = new ArrayList();
        L13:
            C11645f r62 = new C11645f(r02);
            r62.b(r1);
            r5.endObject();
            return r62;
        }
    }

    public C11645f(List r1) {
        this.f176543a = r1;
    }

    public List a() {
        return this.f176543a;
    }

    public void b(Map r1) {
        this.f176544b = r1;
    }

    public boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
        return false;
    L7:
        if (C11645f.class == r3.getClass()) goto L10;
        return false;
    L10:
        return io.sentry.util.v.a(this.f176543a, ((C11645f) r3).f176543a);
    }

    public int hashCode() {
        return io.sentry.util.v.b(new Object[]{this.f176543a});
    }

    @Override // io.sentry.InterfaceC11696y0
    public void serialize(InterfaceC11592g1 r4, Q r5) {
        r4.beginObject();
        r4.e("values").j(r5, this.f176543a);
        Map r02 = this.f176544b;
        if (r02 == null) goto L8;
        Iterator r03 = r02.keySet().iterator();
    L6:
        if (r03.hasNext() == false) goto L8;
        String r1 = (String) r03.next();
        Object r2 = this.f176544b.get(r1);
        r4.e(r1).j(r5, r2);
    L8:
        r4.endObject();
    }
}
