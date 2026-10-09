package com.stockbit.usecase.trusteddevice.resource;

import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface j {

    public static final class a implements j {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f164315a;

        public a(DomainExodusException r2) {
            p.l(r2, "exception");
            this.f164315a = r2;
        }

        public final DomainExodusException a() {
            return this.f164315a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164315a, ((a) r4).f164315a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164315a.hashCode();
        }

        public String toString() {
            return "Error(exception=" + this.f164315a + ')';
        }
    }

    public static final class b implements j {

        /* renamed from: a, reason: collision with root package name */
        public static final b f164316a = null;

        static {
            f164316a = new b();
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
            return -1626252243;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c implements j {

        /* renamed from: a, reason: collision with root package name */
        public final String f164317a;

        /* renamed from: b, reason: collision with root package name */
        public final String f164318b;

        public c(String r2, String r3) {
            p.l(r2, "token");
            p.l(r3, "next");
            this.f164317a = r2;
            this.f164318b = r3;
        }

        public final String a() {
            return this.f164318b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (p.g(this.f164317a, r52.f164317a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f164318b, r52.f164318b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f164317a.hashCode() * 31) + this.f164318b.hashCode();
        }

        public String toString() {
            return "Success(token=" + this.f164317a + ", next=" + this.f164318b + ')';
        }
    }
}
