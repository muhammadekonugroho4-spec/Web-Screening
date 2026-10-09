package com.stockbit.lib.security.safetouch.accessibility;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f120447a = null;

        static {
            f120447a = new a();
        }

        public a() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -1560309521;
        }

        public String toString() {
            return "Disabled";
        }
    }

    /* renamed from: com.stockbit.lib.security.safetouch.accessibility.b$b, reason: collision with other inner class name */
    public static final class C1044b implements b {

        /* renamed from: a, reason: collision with root package name */
        public final List f120448a;

        /* renamed from: b, reason: collision with root package name */
        public final List f120449b;

        static {
        }

        public C1044b(List r2, List r3) {
            p.l(r2, "safePackages");
            p.l(r3, "suspiciousPackages");
            this.f120448a = r2;
            this.f120449b = r3;
        }

        public final List a() {
            return this.f120448a;
        }

        public final List b() {
            return this.f120449b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C1044b) == true) goto L8;
            return false;
        L8:
            C1044b r52 = (C1044b) r5;
            if (p.g(this.f120448a, r52.f120448a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f120449b, r52.f120449b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f120448a.hashCode() * 31) + this.f120449b.hashCode();
        }

        public String toString() {
            return "Safe(safePackages=" + this.f120448a + ", suspiciousPackages=" + this.f120449b + ")";
        }
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final List f120450a;

        /* renamed from: b, reason: collision with root package name */
        public final List f120451b;

        /* renamed from: c, reason: collision with root package name */
        public final List f120452c;

        static {
        }

        public c(List r2, List r3, List r4) {
            p.l(r2, "safePackages");
            p.l(r3, "suspiciousPackages");
            p.l(r4, "unsafePackages");
            this.f120450a = r2;
            this.f120451b = r3;
            this.f120452c = r4;
        }

        public final List a() {
            return this.f120450a;
        }

        public final List b() {
            return this.f120451b;
        }

        public final List c() {
            return this.f120452c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (p.g(this.f120450a, r52.f120450a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f120451b, r52.f120451b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f120452c, r52.f120452c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f120450a.hashCode() * 31) + this.f120451b.hashCode()) * 31) + this.f120452c.hashCode();
        }

        public String toString() {
            return "Suspicious(safePackages=" + this.f120450a + ", suspiciousPackages=" + this.f120451b + ", unsafePackages=" + this.f120452c + ")";
        }
    }

    public static final class d implements b {

        /* renamed from: a, reason: collision with root package name */
        public final List f120453a;

        /* renamed from: b, reason: collision with root package name */
        public final List f120454b;

        /* renamed from: c, reason: collision with root package name */
        public final List f120455c;

        static {
        }

        public d(List r2, List r3, List r4) {
            p.l(r2, "safePackages");
            p.l(r3, "suspiciousPackages");
            p.l(r4, "unsafePackages");
            this.f120453a = r2;
            this.f120454b = r3;
            this.f120455c = r4;
        }

        public final List a() {
            return this.f120453a;
        }

        public final List b() {
            return this.f120454b;
        }

        public final List c() {
            return this.f120455c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof d) == true) goto L8;
            return false;
        L8:
            d r52 = (d) r5;
            if (p.g(this.f120453a, r52.f120453a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f120454b, r52.f120454b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f120455c, r52.f120455c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f120453a.hashCode() * 31) + this.f120454b.hashCode()) * 31) + this.f120455c.hashCode();
        }

        public String toString() {
            return "Unsafe(safePackages=" + this.f120453a + ", suspiciousPackages=" + this.f120454b + ", unsafePackages=" + this.f120455c + ")";
        }
    }
}
