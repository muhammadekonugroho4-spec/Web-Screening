package com.tinder.scarlet.internal.servicemethod;

import com.tinder.scarlet.e;
import io.reactivex.exceptions.CompositeException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Map f173738a;

    /* renamed from: b, reason: collision with root package name */
    public final List f173739b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Type f173740a;

        /* renamed from: b, reason: collision with root package name */
        public final Annotation[] f173741b;

        public a(Type r2, Annotation[] r3) {
            p.l(r2, "type");
            p.l(r3, "annotations");
            this.f173740a = r2;
            this.f173741b = r3;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L5;
            return true;
        L5:
            if (r5 == null) goto L7;
            Class<?> r1 = r5.getClass();
        L9:
            if (p.g(a.class, r1) == true) goto L11;
            return false;
        L11:
            if (r5 == null) goto L20;
            a r52 = (a) r5;
            if (p.g(this.f173740a, r52.f173740a) == true) goto L16;
            return false;
        L16:
            if (Arrays.equals(this.f173741b, r52.f173741b) == true) goto L18;
            return false;
        L18:
            return true;
        L20:
            throw new NullPointerException("null cannot be cast to non-null type com.tinder.scarlet.internal.servicemethod.MessageAdapterResolver.MessageAdapterKey");
        L7:
            r1 = null;
            goto L9
        }

        public int hashCode() {
            return (this.f173740a.hashCode() * 31) + Arrays.hashCode(this.f173741b);
        }

        public String toString() {
            return "MessageAdapterKey(type=" + this.f173740a + ", annotations=" + Arrays.toString(this.f173741b) + ")";
        }
    }

    public b(List r2) {
        p.l(r2, "messageAdapterFactories");
        this.f173739b = r2;
        this.f173738a = new LinkedHashMap();
    }

    public final com.tinder.scarlet.e a(Type r5, Annotation[] r6) {
        ArrayList r02 = new ArrayList();
        Iterator r1 = this.f173739b.iterator();
    L4:
        if (r1.hasNext() == false) goto L13;
        com.tinder.scarlet.e r2 = ((e.a) r1.next()).a(r5, r6);     // Catch: Throwable -> L11
        if (r2 != null) goto L8;
        throw new NullPointerException("null cannot be cast to non-null type com.tinder.scarlet.MessageAdapter<kotlin.Any>");     // Catch: Throwable -> L11
    L8:
        return r2;
    L11:
        th = move-exception;
        r02.add(th);
        goto L4
    L13:
        Object[] r03 = r02.toArray(new Throwable[0]);
        if (r03 == null) goto L16;
        Throwable[] r04 = (Throwable[]) r03;
        throw new IllegalStateException("Cannot resolve message adapter for type: " + r5 + ", annotations: " + r6 + '.', new CompositeException((Throwable[]) Arrays.copyOf(r04, r04.length)));
    L16:
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final com.tinder.scarlet.e b(Type r3, Annotation[] r4) {
        p.l(r3, "type");
        p.l(r4, "annotations");
        a r02 = new a(r3, r4);
        if (this.f173738a.containsKey(r02) == false) goto L6;
        Object r32 = this.f173738a.get(r02);
        p.i(r32);
        return (com.tinder.scarlet.e) r32;
    L6:
        com.tinder.scarlet.e r33 = a(r3, r4);
        this.f173738a.put(r02, r33);
        return r33;
    }
}
