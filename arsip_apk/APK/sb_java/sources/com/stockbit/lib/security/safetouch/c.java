package com.stockbit.lib.security.safetouch;

import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public interface c {

    public static final class a implements c {

        /* renamed from: c, reason: collision with root package name */
        public static final int f120460c = 0;

        /* renamed from: a, reason: collision with root package name */
        public final String f120461a;

        /* renamed from: b, reason: collision with root package name */
        public final kotlin.jvm.functions.a f120462b;

        static {
        }

        public a(String r2, kotlin.jvm.functions.a r3) {
            p.l(r2, "tagAction");
            p.l(r3, "blockAction");
            this.f120461a = r2;
            this.f120462b = r3;
        }

        public final kotlin.jvm.functions.a a() {
            return this.f120462b;
        }

        public final String b() {
            return this.f120461a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f120461a, r52.f120461a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f120462b, r52.f120462b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f120461a.hashCode() * 31) + this.f120462b.hashCode();
        }

        public String toString() {
            return "Block(tagAction=" + this.f120461a + ", blockAction=" + this.f120462b + ")";
        }
    }

    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f120463a = null;

        static {
            f120463a = new b();
        }

        public b() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -463961541;
        }

        public String toString() {
            return "None";
        }
    }

    /* renamed from: com.stockbit.lib.security.safetouch.c$c, reason: collision with other inner class name */
    public static final class C1046c implements c {

        /* renamed from: b, reason: collision with root package name */
        public static final int f120464b = 0;

        /* renamed from: a, reason: collision with root package name */
        public final String f120465a;

        static {
        }

        public C1046c(String r2) {
            p.l(r2, "tagAction");
            this.f120465a = r2;
        }

        public final String a() {
            return this.f120465a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1046c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f120465a, ((C1046c) r4).f120465a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f120465a.hashCode();
        }

        public String toString() {
            return "Track(tagAction=" + this.f120465a + ")";
        }
    }
}
