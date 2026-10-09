package com.stockbit.component.dialog.period;

import java.time.LocalDate;

/* loaded from: classes7.dex */
public abstract class H {

    /* renamed from: b, reason: collision with root package name */
    public static final int f70454b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f70455a;

    public static final class a extends H {

        /* renamed from: c, reason: collision with root package name */
        public final String f70456c;

        static {
        }

        public a(String r2) {
            kotlin.jvm.internal.p.l(r2, "textPeriod");
            super(r2, null);
            this.f70456c = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f70456c, ((a) r4).f70456c) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f70456c.hashCode();
        }

        public String toString() {
            return "All(textPeriod=" + this.f70456c + ')';
        }

        public /* synthetic */ a(String r1, int r2, kotlin.jvm.internal.i r3) {
            if ((r2 & 1) == 0) goto L5;
            r1 = "All Time";
        L5:
            this(r1);
        }
    }

    public static final class b extends H {

        /* renamed from: c, reason: collision with root package name */
        public final String f70457c;
        public final LocalDate d;

        /* renamed from: e, reason: collision with root package name */
        public final LocalDate f70458e;

        static {
        }

        public b(String r2, LocalDate r3, LocalDate r4) {
            kotlin.jvm.internal.p.l(r2, "textPeriod");
            kotlin.jvm.internal.p.l(r3, "startDate");
            kotlin.jvm.internal.p.l(r4, "endDate");
            super(r2, null);
            this.f70457c = r2;
            this.d = r3;
            this.f70458e = r4;
        }

        public static /* synthetic */ b d(b r02, String r1, LocalDate r2, LocalDate r3, int r4, Object r5) {
            if ((r4 & 1) == 0) goto L6;
            r1 = r02.f70457c;
        L6:
            if ((r4 & 2) == 0) goto L9;
            r2 = r02.d;
        L9:
            if ((r4 & 4) == 0) goto L12;
            r3 = r02.f70458e;
        L12:
            return r02.c(r1, r2, r3);
        }

        public final b c(String r2, LocalDate r3, LocalDate r4) {
            kotlin.jvm.internal.p.l(r2, "textPeriod");
            kotlin.jvm.internal.p.l(r3, "startDate");
            kotlin.jvm.internal.p.l(r4, "endDate");
            return new b(r2, r3, r4);
        }

        public final LocalDate e() {
            return this.f70458e;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (kotlin.jvm.internal.p.g(this.f70457c, r52.f70457c) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f70458e, r52.f70458e) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public final LocalDate f() {
            return this.d;
        }

        public int hashCode() {
            return (((this.f70457c.hashCode() * 31) + this.d.hashCode()) * 31) + this.f70458e.hashCode();
        }

        public String toString() {
            return "Custom(textPeriod=" + this.f70457c + ", startDate=" + this.d + ", endDate=" + this.f70458e + ')';
        }

        public /* synthetic */ b(String r1, LocalDate r2, LocalDate r3, int r4, kotlin.jvm.internal.i r5) {
            if ((r4 & 1) == 0) goto L5;
            r1 = "Custom";
        L5:
            this(r1, r2, r3);
        }
    }

    public static final class c extends H {

        /* renamed from: c, reason: collision with root package name */
        public final String f70459c;

        static {
        }

        public c(String r2) {
            kotlin.jvm.internal.p.l(r2, "textPeriod");
            super(r2, null);
            this.f70459c = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f70459c, ((c) r4).f70459c) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f70459c.hashCode();
        }

        public String toString() {
            return "OneMonth(textPeriod=" + this.f70459c + ')';
        }

        public /* synthetic */ c(String r1, int r2, kotlin.jvm.internal.i r3) {
            if ((r2 & 1) == 0) goto L5;
            r1 = "Last 1 Month";
        L5:
            this(r1);
        }
    }

    public static final class d extends H {

        /* renamed from: c, reason: collision with root package name */
        public final String f70460c;

        static {
        }

        public d(String r2) {
            kotlin.jvm.internal.p.l(r2, "textPeriod");
            super(r2, null);
            this.f70460c = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f70460c, ((d) r4).f70460c) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f70460c.hashCode();
        }

        public String toString() {
            return "OneYear(textPeriod=" + this.f70460c + ')';
        }

        public /* synthetic */ d(String r1, int r2, kotlin.jvm.internal.i r3) {
            if ((r2 & 1) == 0) goto L5;
            r1 = "Last 1 Year";
        L5:
            this(r1);
        }
    }

    public static final class e extends H {

        /* renamed from: c, reason: collision with root package name */
        public final String f70461c;

        static {
        }

        public e(String r2) {
            kotlin.jvm.internal.p.l(r2, "textPeriod");
            super(r2, null);
            this.f70461c = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof e) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f70461c, ((e) r4).f70461c) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f70461c.hashCode();
        }

        public String toString() {
            return "ThreeMonth(textPeriod=" + this.f70461c + ')';
        }

        public /* synthetic */ e(String r1, int r2, kotlin.jvm.internal.i r3) {
            if ((r2 & 1) == 0) goto L5;
            r1 = "Last 3 Months";
        L5:
            this(r1);
        }
    }

    public static final class f extends H {

        /* renamed from: c, reason: collision with root package name */
        public final String f70462c;

        static {
        }

        public f(String r2) {
            kotlin.jvm.internal.p.l(r2, "textPeriod");
            super(r2, null);
            this.f70462c = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof f) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f70462c, ((f) r4).f70462c) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f70462c.hashCode();
        }

        public String toString() {
            return "ThreeYear(textPeriod=" + this.f70462c + ')';
        }

        public /* synthetic */ f(String r1, int r2, kotlin.jvm.internal.i r3) {
            if ((r2 & 1) == 0) goto L5;
            r1 = "Last 3 Years";
        L5:
            this(r1);
        }
    }

    public static final class g extends H {

        /* renamed from: c, reason: collision with root package name */
        public final String f70463c;

        static {
        }

        public g(String r2) {
            kotlin.jvm.internal.p.l(r2, "textPeriod");
            super(r2, null);
            this.f70463c = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof g) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f70463c, ((g) r4).f70463c) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f70463c.hashCode();
        }

        public String toString() {
            return "YearToDate(textPeriod=" + this.f70463c + ')';
        }

        public /* synthetic */ g(String r1, int r2, kotlin.jvm.internal.i r3) {
            if ((r2 & 1) == 0) goto L5;
            r1 = "Year to Date";
        L5:
            this(r1);
        }
    }

    static {
    }

    public /* synthetic */ H(String r1, kotlin.jvm.internal.i r2) {
        this(r1);
    }

    public final String a() {
        return this.f70455a;
    }

    public final boolean b(H r2) {
        kotlin.jvm.internal.p.l(r2, "other");
        if (getClass() != r2.getClass()) goto L6;
        return true;
    L6:
        return false;
    }

    public H(String r1) {
        this.f70455a = r1;
    }
}
