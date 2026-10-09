package com.stockbit.component.foreignflow.model;

import java.time.LocalDate;

/* loaded from: classes7.dex */
public interface e {

    public static final class a implements e {

        /* renamed from: a, reason: collision with root package name */
        public final ForeignFlowDatePresetType f71949a;

        static {
        }

        public a(ForeignFlowDatePresetType r2) {
            kotlin.jvm.internal.p.l(r2, "value");
            this.f71949a = r2;
        }

        public final ForeignFlowDatePresetType a() {
            return this.f71949a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (this.f71949a == ((a) r4).f71949a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f71949a.hashCode();
        }

        public String toString() {
            return "Preset(value=" + this.f71949a + ')';
        }
    }

    public static final class b implements e {

        /* renamed from: a, reason: collision with root package name */
        public final LocalDate f71950a;

        /* renamed from: b, reason: collision with root package name */
        public final LocalDate f71951b;

        static {
        }

        public b(LocalDate r2, LocalDate r3) {
            kotlin.jvm.internal.p.l(r2, "startDate");
            kotlin.jvm.internal.p.l(r3, "endDate");
            this.f71950a = r2;
            this.f71951b = r3;
        }

        public final LocalDate a() {
            return this.f71951b;
        }

        public final LocalDate b() {
            return this.f71950a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (kotlin.jvm.internal.p.g(this.f71950a, r52.f71950a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f71951b, r52.f71951b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f71950a.hashCode() * 31) + this.f71951b.hashCode();
        }

        public String toString() {
            return "Range(startDate=" + this.f71950a + ", endDate=" + this.f71951b + ')';
        }
    }

    public static final class c implements e {

        /* renamed from: a, reason: collision with root package name */
        public final LocalDate f71952a;

        static {
        }

        public c(LocalDate r2) {
            kotlin.jvm.internal.p.l(r2, "value");
            this.f71952a = r2;
        }

        public final LocalDate a() {
            return this.f71952a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f71952a, ((c) r4).f71952a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f71952a.hashCode();
        }

        public String toString() {
            return "SingleDate(value=" + this.f71952a + ')';
        }
    }
}
