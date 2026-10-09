package com.stockbit.company.utils.lazyload;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f68758a;

    /* renamed from: com.stockbit.company.utils.lazyload.a$a, reason: collision with other inner class name */
    public static final class C0694a {

        /* renamed from: a, reason: collision with root package name */
        public final String f68759a;

        /* renamed from: b, reason: collision with root package name */
        public final int f68760b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f68761c;

        public C0694a(String r2, int r3, boolean r4) {
            p.l(r2, Constants.KEY_KEY);
            this.f68759a = r2;
            this.f68760b = r3;
            this.f68761c = r4;
        }

        public final String a() {
            return this.f68759a;
        }

        public final boolean b() {
            return this.f68761c;
        }

        public final int c() {
            return this.f68760b;
        }

        public final void d(boolean r1) {
            this.f68761c = r1;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C0694a) == true) goto L8;
            return false;
        L8:
            C0694a r52 = (C0694a) r5;
            if (p.g(this.f68759a, r52.f68759a) == true) goto L12;
            return false;
        L12:
            if (this.f68760b == r52.f68760b) goto L15;
            return false;
        L15:
            if (this.f68761c == r52.f68761c) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f68759a.hashCode() * 31) + Integer.hashCode(this.f68760b)) * 31) + Boolean.hashCode(this.f68761c);
        }

        public String toString() {
            return "TriggerAndTask(key=" + this.f68759a + ", triggerThreshold=" + this.f68760b + ", pause=" + this.f68761c + ')';
        }
    }

    static {
    }

    public a() {
        this.f68758a = new ArrayList();
    }

    public void a(int r8, Pair... r9) {
        p.l(r9, "executions");
        int r02 = r9.length;
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L21;
        Pair r2 = r9[r1];
        String r3 = (String) r2.a();
        kotlin.jvm.functions.a r22 = (kotlin.jvm.functions.a) r2.b();
        Iterator r4 = this.f68758a.iterator();
    L6:
        if (r4.hasNext() == false) goto L10;
        Object r5 = r4.next();
        if (p.g(((C0694a) r5).a(), r3) == false) goto L6;
    L11:
        C0694a r52 = (C0694a) r5;
        if (r52 == null) goto L20;
        if (r52.b() == true) goto L20;
        if (r8 <= r52.c()) goto L20;
        r22.invoke();
        if (r52 == null) goto L20;
        r52.d(true);
    L20:
        r1 = r1 + 1;
        goto L3
    L10:
        r5 = null;
        goto L11
    }

    public void b(Pair... r9) {
        p.l(r9, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        List r02 = this.f68758a;
        ArrayList r1 = new ArrayList(r9.length);
        int r2 = r9.length;
        int r4 = 0;
    L3:
        if (r4 >= r2) goto L5;
        Pair r5 = r9[r4];
        r1.add(new C0694a((String) r5.a(), ((Number) r5.b()).intValue(), false));
        r4 = r4 + 1;
        goto L3
    L5:
        r02.addAll(r1);
    }

    public void c() {
        Iterator r02 = this.f68758a.iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        ((C0694a) r02.next()).d(false);
        goto L4
    }
}
