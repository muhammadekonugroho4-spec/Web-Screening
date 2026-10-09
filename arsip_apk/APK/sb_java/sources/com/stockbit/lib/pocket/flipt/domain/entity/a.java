package com.stockbit.lib.pocket.flipt.domain.entity;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f120363a;

    /* renamed from: b, reason: collision with root package name */
    public final List f120364b;

    /* renamed from: c, reason: collision with root package name */
    public final long f120365c;

    /* renamed from: com.stockbit.lib.pocket.flipt.domain.entity.a$a, reason: collision with other inner class name */
    public static final class C1042a {

        /* renamed from: a, reason: collision with root package name */
        public final String f120366a;

        /* renamed from: b, reason: collision with root package name */
        public final C1043a f120367b;

        /* renamed from: c, reason: collision with root package name */
        public final c f120368c;
        public final b d;

        /* renamed from: com.stockbit.lib.pocket.flipt.domain.entity.a$a$a, reason: collision with other inner class name */
        public static final class C1043a {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f120369a;

            /* renamed from: b, reason: collision with root package name */
            public final String f120370b;

            /* renamed from: c, reason: collision with root package name */
            public final String f120371c;
            public final long d;

            /* renamed from: e, reason: collision with root package name */
            public final String f120372e;

            /* renamed from: f, reason: collision with root package name */
            public final String f120373f;

            public C1043a(boolean r2, String r3, String r4, long r5, String r7, String r8) {
                p.l(r3, "reason");
                p.l(r4, "requestId");
                p.l(r7, "timestamp");
                p.l(r8, "flagKey");
                this.f120369a = r2;
                this.f120370b = r3;
                this.f120371c = r4;
                this.d = r5;
                this.f120372e = r7;
                this.f120373f = r8;
            }

            public final boolean a() {
                return this.f120369a;
            }

            public final String b() {
                return this.f120373f;
            }

            public boolean equals(Object r8) {
                if (this != r8) goto L6;
                return true;
            L6:
                if ((r8 instanceof C1043a) == true) goto L8;
                return false;
            L8:
                C1043a r82 = (C1043a) r8;
                if (this.f120369a == r82.f120369a) goto L12;
                return false;
            L12:
                if (p.g(this.f120370b, r82.f120370b) == true) goto L15;
                return false;
            L15:
                if (p.g(this.f120371c, r82.f120371c) == true) goto L18;
                return false;
            L18:
                if (this.d == r82.d) goto L21;
                return false;
            L21:
                if (p.g(this.f120372e, r82.f120372e) == true) goto L24;
                return false;
            L24:
                if (p.g(this.f120373f, r82.f120373f) == true) goto L26;
                return false;
            L26:
                return true;
            }

            public int hashCode() {
                return (((((((((Boolean.hashCode(this.f120369a) * 31) + this.f120370b.hashCode()) * 31) + this.f120371c.hashCode()) * 31) + Long.hashCode(this.d)) * 31) + this.f120372e.hashCode()) * 31) + this.f120373f.hashCode();
            }

            public String toString() {
                return "BooleanEntity(enabled=" + this.f120369a + ", reason=" + this.f120370b + ", requestId=" + this.f120371c + ", requestDurationMillis=" + this.d + ", timestamp=" + this.f120372e + ", flagKey=" + this.f120373f + ")";
            }
        }

        /* renamed from: com.stockbit.lib.pocket.flipt.domain.entity.a$a$b */
        public static final class b {

            /* renamed from: a, reason: collision with root package name */
            public final String f120374a;

            /* renamed from: b, reason: collision with root package name */
            public final String f120375b;

            /* renamed from: c, reason: collision with root package name */
            public final String f120376c;

            public b(String r2, String r3, String r4) {
                p.l(r2, "flagKey");
                p.l(r3, "namespaceKey");
                p.l(r4, "reason");
                this.f120374a = r2;
                this.f120375b = r3;
                this.f120376c = r4;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof b) == true) goto L8;
                return false;
            L8:
                b r52 = (b) r5;
                if (p.g(this.f120374a, r52.f120374a) == true) goto L12;
                return false;
            L12:
                if (p.g(this.f120375b, r52.f120375b) == true) goto L15;
                return false;
            L15:
                if (p.g(this.f120376c, r52.f120376c) == true) goto L17;
                return false;
            L17:
                return true;
            }

            public int hashCode() {
                return (((this.f120374a.hashCode() * 31) + this.f120375b.hashCode()) * 31) + this.f120376c.hashCode();
            }

            public String toString() {
                return "ErrorEntity(flagKey=" + this.f120374a + ", namespaceKey=" + this.f120375b + ", reason=" + this.f120376c + ")";
            }
        }

        /* renamed from: com.stockbit.lib.pocket.flipt.domain.entity.a$a$c */
        public static final class c {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f120377a;

            /* renamed from: b, reason: collision with root package name */
            public final List f120378b;

            /* renamed from: c, reason: collision with root package name */
            public final String f120379c;
            public final String d;

            /* renamed from: e, reason: collision with root package name */
            public final Map f120380e;

            /* renamed from: f, reason: collision with root package name */
            public final String f120381f;

            /* renamed from: g, reason: collision with root package name */
            public final long f120382g;

            /* renamed from: h, reason: collision with root package name */
            public final String f120383h;

            /* renamed from: i, reason: collision with root package name */
            public final String f120384i;

            public c(boolean r2, List r3, String r4, String r5, Map r6, String r7, long r8, String r10, String r11) {
                p.l(r3, "segmentKeys");
                p.l(r4, "reason");
                p.l(r5, "variantKey");
                p.l(r6, "variantAttachment");
                p.l(r7, "requestId");
                p.l(r10, "timestamp");
                p.l(r11, "flagKey");
                this.f120377a = r2;
                this.f120378b = r3;
                this.f120379c = r4;
                this.d = r5;
                this.f120380e = r6;
                this.f120381f = r7;
                this.f120382g = r8;
                this.f120383h = r10;
                this.f120384i = r11;
            }

            public boolean equals(Object r8) {
                if (this != r8) goto L6;
                return true;
            L6:
                if ((r8 instanceof c) == true) goto L8;
                return false;
            L8:
                c r82 = (c) r8;
                if (this.f120377a == r82.f120377a) goto L12;
                return false;
            L12:
                if (p.g(this.f120378b, r82.f120378b) == true) goto L15;
                return false;
            L15:
                if (p.g(this.f120379c, r82.f120379c) == true) goto L18;
                return false;
            L18:
                if (p.g(this.d, r82.d) == true) goto L21;
                return false;
            L21:
                if (p.g(this.f120380e, r82.f120380e) == true) goto L24;
                return false;
            L24:
                if (p.g(this.f120381f, r82.f120381f) == true) goto L27;
                return false;
            L27:
                if (this.f120382g == r82.f120382g) goto L30;
                return false;
            L30:
                if (p.g(this.f120383h, r82.f120383h) == true) goto L33;
                return false;
            L33:
                if (p.g(this.f120384i, r82.f120384i) == true) goto L35;
                return false;
            L35:
                return true;
            }

            public int hashCode() {
                return (((((((((((((((Boolean.hashCode(this.f120377a) * 31) + this.f120378b.hashCode()) * 31) + this.f120379c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f120380e.hashCode()) * 31) + this.f120381f.hashCode()) * 31) + Long.hashCode(this.f120382g)) * 31) + this.f120383h.hashCode()) * 31) + this.f120384i.hashCode();
            }

            public String toString() {
                return "VariantEntity(match=" + this.f120377a + ", segmentKeys=" + this.f120378b + ", reason=" + this.f120379c + ", variantKey=" + this.d + ", variantAttachment=" + this.f120380e + ", requestId=" + this.f120381f + ", requestDurationMillis=" + this.f120382g + ", timestamp=" + this.f120383h + ", flagKey=" + this.f120384i + ")";
            }
        }

        public C1042a(String r2, C1043a r3, c r4, b r5) {
            p.l(r2, "type");
            this.f120366a = r2;
            this.f120367b = r3;
            this.f120368c = r4;
            this.d = r5;
        }

        public final C1043a a() {
            return this.f120367b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C1042a) == true) goto L8;
            return false;
        L8:
            C1042a r52 = (C1042a) r5;
            if (p.g(this.f120366a, r52.f120366a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f120367b, r52.f120367b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f120368c, r52.f120368c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            int r02 = this.f120366a.hashCode() * 31;
            C1043a r1 = this.f120367b;
            int r2 = 0;
            if (r1 != null) goto L5;
            int r12 = 0;
        L6:
            int r03 = (r02 + r12) * 31;
            c r13 = this.f120368c;
            if (r13 != null) goto L9;
            int r14 = 0;
        L10:
            int r04 = (r03 + r14) * 31;
            b r15 = this.d;
            if (r15 == null) goto L15;
            r2 = r15.hashCode();
        L15:
            return r04 + r2;
        L9:
            r14 = r13.hashCode();
            goto L10
        L5:
            r12 = r1.hashCode();
            goto L6
        }

        public String toString() {
            return "ResponseEntity(type=" + this.f120366a + ", booleanResponse=" + this.f120367b + ", variantResponse=" + this.f120368c + ", errorResponse=" + this.d + ")";
        }
    }

    public a(String r2, List r3, long r4) {
        p.l(r2, "requestId");
        p.l(r3, "responses");
        this.f120363a = r2;
        this.f120364b = r3;
        this.f120365c = r4;
    }

    public final List a() {
        return this.f120364b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (p.g(this.f120363a, r82.f120363a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f120364b, r82.f120364b) == true) goto L15;
        return false;
    L15:
        if (this.f120365c == r82.f120365c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f120363a.hashCode() * 31) + this.f120364b.hashCode()) * 31) + Long.hashCode(this.f120365c);
    }

    public String toString() {
        return "FliptBatchEntity(requestId=" + this.f120363a + ", responses=" + this.f120364b + ", requestDurationMillis=" + this.f120365c + ")";
    }
}
