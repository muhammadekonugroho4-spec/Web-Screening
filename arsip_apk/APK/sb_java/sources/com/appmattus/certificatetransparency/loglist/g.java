package com.appmattus.certificatetransparency.loglist;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public interface g {

    public interface a extends g {

        /* renamed from: com.appmattus.certificatetransparency.loglist.g$a$a, reason: collision with other inner class name */
        public static final class C0313a implements a {

            /* renamed from: a, reason: collision with root package name */
            public final NoSuchAlgorithmException f32340a;

            public C0313a(NoSuchAlgorithmException r2) {
                p.l(r2, "exception");
                this.f32340a = r2;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof C0313a) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f32340a, ((C0313a) r4).f32340a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f32340a.hashCode();
            }

            public String toString() {
                return "Invalid signature (public key) with " + com.appmattus.certificatetransparency.internal.utils.c.a(this.f32340a);
            }
        }

        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            public final InvalidKeyException f32341a;

            public b(InvalidKeyException r2) {
                p.l(r2, "exception");
                this.f32341a = r2;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof b) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f32341a, ((b) r4).f32341a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f32341a.hashCode();
            }

            public String toString() {
                return "Invalid signature (public key) with " + com.appmattus.certificatetransparency.internal.utils.c.a(this.f32341a);
            }
        }

        public static final class c implements a {

            /* renamed from: a, reason: collision with root package name */
            public static final c f32342a = null;

            static {
                f32342a = new c();
            }

            public c() {
            }

            public String toString() {
                return "Invalid signature";
            }
        }

        public static final class d implements a {

            /* renamed from: a, reason: collision with root package name */
            public final SignatureException f32343a;

            public d(SignatureException r2) {
                p.l(r2, "exception");
                this.f32343a = r2;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof d) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f32343a, ((d) r4).f32343a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f32343a.hashCode();
            }

            public String toString() {
                return "Invalid signature (public key) with " + com.appmattus.certificatetransparency.internal.utils.c.a(this.f32343a);
            }
        }
    }

    public static final class b implements g {

        /* renamed from: a, reason: collision with root package name */
        public static final b f32344a = null;

        static {
            f32344a = new b();
        }

        public b() {
        }

        public String toString() {
            return "Valid signature";
        }
    }
}
