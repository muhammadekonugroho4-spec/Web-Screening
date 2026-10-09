package com.stockbit.usecase.brokerflow.lock.model;

import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.brokerflow.lock.model.a$a, reason: collision with other inner class name */
    public static final class C1418a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final List f154955a;

        public C1418a(List r2) {
            p.l(r2, "brokerCodes");
            super(null);
            this.f154955a = r2;
        }

        public final List a() {
            return this.f154955a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1418a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f154955a, ((C1418a) r4).f154955a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f154955a.hashCode();
        }

        public String toString() {
            return "Add(brokerCodes=" + this.f154955a + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f154956a = null;

        static {
            f154956a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f154957a;

        public c(String r2) {
            p.l(r2, "brokerCode");
            super(null);
            this.f154957a = r2;
        }

        public final String a() {
            return this.f154957a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f154957a, ((c) r4).f154957a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f154957a.hashCode();
        }

        public String toString() {
            return "Remove(brokerCode=" + this.f154957a + ")";
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f154958a;

        /* renamed from: b, reason: collision with root package name */
        public final List f154959b;

        public d(boolean r2, List r3) {
            p.l(r3, "brokers");
            super(null);
            this.f154958a = r2;
            this.f154959b = r3;
        }

        public final List a() {
            return this.f154959b;
        }

        public final boolean b() {
            return this.f154958a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof d) == true) goto L8;
            return false;
        L8:
            d r52 = (d) r5;
            if (this.f154958a == r52.f154958a) goto L12;
            return false;
        L12:
            if (p.g(this.f154959b, r52.f154959b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f154958a) * 31) + this.f154959b.hashCode();
        }

        public String toString() {
            return "Toggle(enabled=" + this.f154958a + ", brokers=" + this.f154959b + ")";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
