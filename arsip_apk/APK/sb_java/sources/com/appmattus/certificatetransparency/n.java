package com.appmattus.certificatetransparency;

import com.appmattus.certificatetransparency.loglist.d;
import com.appmattus.certificatetransparency.m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public interface n {

    /* renamed from: a, reason: collision with root package name */
    public static final a f32352a = null;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f32353a = null;

        static {
            f32353a = new a();
        }

        public a() {
        }

        public static final /* synthetic */ List a(a r02, Map r1) {
            return r02.b(r1);
        }

        public final List b(Map r5) {
            ArrayList r02 = new ArrayList(r5.size());
            Iterator r52 = r5.entrySet().iterator();
        L4:
            if (r52.hasNext() == false) goto L6;
            Map.Entry r1 = (Map.Entry) r52.next();
            r02.add(((String) r1.getKey()) + ':' + r1.getValue());
            goto L4
        L6:
            return r02;
        }
    }

    public interface b extends n {

        public static final class a implements b {

            /* renamed from: b, reason: collision with root package name */
            public final d.b f32354b;

            public a(d.b r2) {
                p.l(r2, "logListResult");
                this.f32354b = r2;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof a) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f32354b, ((a) r4).f32354b) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f32354b.hashCode();
            }

            public String toString() {
                return "Failure: Unable to load log servers with " + this.f32354b;
            }
        }

        /* renamed from: com.appmattus.certificatetransparency.n$b$b, reason: collision with other inner class name */
        public static final class C0314b implements b {

            /* renamed from: b, reason: collision with root package name */
            public static final C0314b f32355b = null;

            static {
                f32355b = new C0314b();
            }

            public C0314b() {
            }

            public String toString() {
                return "Failure: No certificates";
            }
        }

        public static final class c implements b {

            /* renamed from: b, reason: collision with root package name */
            public static final c f32356b = null;

            static {
                f32356b = new c();
            }

            public c() {
            }

            public String toString() {
                return "Failure: This certificate does not have any Signed Certificate Timestamps in it.";
            }
        }

        public static final class d implements b {

            /* renamed from: b, reason: collision with root package name */
            public final Map f32357b;

            /* renamed from: c, reason: collision with root package name */
            public final int f32358c;

            public d(Map r2, int r3) {
                p.l(r2, "scts");
                this.f32357b = r2;
                this.f32358c = r3;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof d) == true) goto L8;
                return false;
            L8:
                d r52 = (d) r5;
                if (p.g(this.f32357b, r52.f32357b) == true) goto L12;
                return false;
            L12:
                if (this.f32358c == r52.f32358c) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                return (this.f32357b.hashCode() * 31) + Integer.hashCode(this.f32358c);
            }

            public String toString() {
                Collection r02 = this.f32357b.values();
                ArrayList r1 = new ArrayList();
                Iterator r03 = r02.iterator();
            L4:
                if (r03.hasNext() == false) goto L8;
                Object r2 = r03.next();
                if ((r2 instanceof m.a) == false) goto L4;
                r1.add(r2);
                goto L4
            L8:
                HashSet r04 = new HashSet();
                ArrayList r22 = new ArrayList();
                Iterator r12 = r1.iterator();
            L10:
                if (r12.hasNext() == false) goto L15;
                Object r3 = r12.next();
                if (r04.add(((m.a) r3).a()) == false) goto L10;
                r22.add(r3);
                goto L10
            L15:
                return "Failure: Too few distinct operators, required " + this.f32358c + ", found " + r22.size() + " in " + a.a(n.f32352a, this.f32357b);
            }
        }

        public static final class e implements b {

            /* renamed from: b, reason: collision with root package name */
            public final Map f32359b;

            /* renamed from: c, reason: collision with root package name */
            public final int f32360c;

            public e(Map r2, int r3) {
                p.l(r2, "scts");
                this.f32359b = r2;
                this.f32360c = r3;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof e) == true) goto L8;
                return false;
            L8:
                e r52 = (e) r5;
                if (p.g(this.f32359b, r52.f32359b) == true) goto L12;
                return false;
            L12:
                if (this.f32360c == r52.f32360c) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                return (this.f32359b.hashCode() * 31) + Integer.hashCode(this.f32360c);
            }

            public String toString() {
                Map r02 = this.f32359b;
                int r2 = 0;
                if (r02.isEmpty() == true) goto L12;
                Iterator r03 = r02.entrySet().iterator();
            L7:
                if (r03.hasNext() == false) goto L12;
                if ((((Map.Entry) r03.next()).getValue() instanceof m.a) == false) goto L7;
                r2 = r2 + 1;
            L12:
                return "Failure: Too few trusted SCTs, required " + this.f32360c + ", found " + r2 + " in " + a.a(n.f32352a, this.f32359b);
            }
        }

        public static final class f implements b {

            /* renamed from: b, reason: collision with root package name */
            public final IOException f32361b;

            public f(IOException r2) {
                p.l(r2, "ioException");
                this.f32361b = r2;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof f) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f32361b, ((f) r4).f32361b) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f32361b.hashCode();
            }

            public String toString() {
                return "Failure: IOException " + this.f32361b;
            }
        }
    }

    public interface c extends n {

        public static final class a implements c {

            /* renamed from: b, reason: collision with root package name */
            public final String f32362b;

            public a(String r2) {
                p.l(r2, "host");
                this.f32362b = r2;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof a) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f32362b, ((a) r4).f32362b) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f32362b.hashCode();
            }

            public String toString() {
                return "Success: SCT not enabled for " + this.f32362b;
            }
        }

        public static final class b implements c {

            /* renamed from: b, reason: collision with root package name */
            public final d.a f32363b;

            public b(d.a r2) {
                p.l(r2, "logListResult");
                this.f32363b = r2;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof b) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f32363b, ((b) r4).f32363b) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f32363b.hashCode();
            }

            public String toString() {
                return "Success: SCT checks disabled as stale log list";
            }
        }

        /* renamed from: com.appmattus.certificatetransparency.n$c$c, reason: collision with other inner class name */
        public static final class C0315c implements c {

            /* renamed from: b, reason: collision with root package name */
            public final c f32364b;

            /* renamed from: c, reason: collision with root package name */
            public final com.appmattus.certificatetransparency.loglist.d f32365c;

            public C0315c(c r2, com.appmattus.certificatetransparency.loglist.d r3) {
                p.l(r2, "originalVerificationResult");
                p.l(r3, "originalLogListResult");
                this.f32364b = r2;
                this.f32365c = r3;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof C0315c) == true) goto L8;
                return false;
            L8:
                C0315c r52 = (C0315c) r5;
                if (p.g(this.f32364b, r52.f32364b) == true) goto L12;
                return false;
            L12:
                if (p.g(this.f32365c, r52.f32365c) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                return (this.f32364b.hashCode() * 31) + this.f32365c.hashCode();
            }

            public String toString() {
                return "StaleNetwork(originalVerificationResult=" + this.f32364b + ", originalLogListResult=" + this.f32365c + ')';
            }
        }

        public static final class d implements c {

            /* renamed from: b, reason: collision with root package name */
            public final Map f32366b;

            public d(Map r2) {
                p.l(r2, "scts");
                this.f32366b = r2;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof d) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f32366b, ((d) r4).f32366b) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f32366b.hashCode();
            }

            public String toString() {
                return "Success: SCT trusted logs " + a.a(n.f32352a, this.f32366b);
            }
        }
    }

    static {
        f32352a = a.f32353a;
    }
}
