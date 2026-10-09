package com.stockbit.feature.transaction.ui.buystockcompose.bottomsheet;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.stockbit.usecase.securities.model.SubAccountType;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class c0 {

    public static final class a extends c0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f110643a;

        static {
        }

        public a(String r2) {
            super(null);
            this.f110643a = r2;
        }

        @Override // com.stockbit.feature.transaction.ui.buystockcompose.bottomsheet.c0
        public String a() {
            return this.f110643a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f110643a, ((a) r4).f110643a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            String r02 = this.f110643a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "Error(toastMessage=" + this.f110643a + ')';
        }
    }

    public static final class b extends c0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f110644a;

        /* renamed from: b, reason: collision with root package name */
        public final List f110645b;

        /* renamed from: c, reason: collision with root package name */
        public final d f110646c;

        static {
        }

        public b(String r2, List r3, d r4) {
            kotlin.jvm.internal.p.l(r3, "regulars");
            super(null);
            this.f110644a = r2;
            this.f110645b = r3;
            this.f110646c = r4;
        }

        @Override // com.stockbit.feature.transaction.ui.buystockcompose.bottomsheet.c0
        public String a() {
            return this.f110644a;
        }

        public final d b() {
            return this.f110646c;
        }

        public final List c() {
            return this.f110645b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (kotlin.jvm.internal.p.g(this.f110644a, r52.f110644a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f110645b, r52.f110645b) == true) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f110646c, r52.f110646c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            String r02 = this.f110644a;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = ((r03 * 31) + this.f110645b.hashCode()) * 31;
            d r2 = this.f110646c;
            if (r2 == null) goto L11;
            r1 = r2.hashCode();
        L11:
            return r04 + r1;
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "Loaded(toastMessage=" + this.f110644a + ", regulars=" + this.f110645b + ", margin=" + this.f110646c + ')';
        }
    }

    public static final class c extends c0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f110647a;

        static {
        }

        public c(String r2) {
            super(null);
            this.f110647a = r2;
        }

        @Override // com.stockbit.feature.transaction.ui.buystockcompose.bottomsheet.c0
        public String a() {
            return this.f110647a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f110647a, ((c) r4).f110647a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            String r02 = this.f110647a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "Loading(toastMessage=" + this.f110647a + ')';
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f110648a;

        /* renamed from: b, reason: collision with root package name */
        public final String f110649b;

        /* renamed from: c, reason: collision with root package name */
        public final String f110650c;
        public final boolean d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f110651e;

        /* renamed from: f, reason: collision with root package name */
        public final SubAccountType f110652f;

        static {
        }

        public d(String r2, String r3, String r4, boolean r5, boolean r6, SubAccountType r7) {
            kotlin.jvm.internal.p.l(r2, Constants.KEY_ID);
            kotlin.jvm.internal.p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
            kotlin.jvm.internal.p.l(r4, "tradingBalance");
            kotlin.jvm.internal.p.l(r7, "subAccountType");
            this.f110648a = r2;
            this.f110649b = r3;
            this.f110650c = r4;
            this.d = r5;
            this.f110651e = r6;
            this.f110652f = r7;
        }

        public final String a() {
            return this.f110648a;
        }

        public final String b() {
            return this.f110649b;
        }

        public final String c() {
            return this.f110650c;
        }

        public final boolean d() {
            return this.d;
        }

        public final boolean e() {
            return this.f110651e;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof d) == true) goto L8;
            return false;
        L8:
            d r52 = (d) r5;
            if (kotlin.jvm.internal.p.g(this.f110648a, r52.f110648a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f110649b, r52.f110649b) == true) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f110650c, r52.f110650c) == true) goto L18;
            return false;
        L18:
            if (this.d == r52.d) goto L21;
            return false;
        L21:
            if (this.f110651e == r52.f110651e) goto L24;
            return false;
        L24:
            if (this.f110652f == r52.f110652f) goto L26;
            return false;
        L26:
            return true;
        }

        public int hashCode() {
            return (((((((((this.f110648a.hashCode() * 31) + this.f110649b.hashCode()) * 31) + this.f110650c.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.f110651e)) * 31) + this.f110652f.hashCode();
        }

        public String toString() {
            return "Option(id=" + this.f110648a + ", name=" + this.f110649b + ", tradingBalance=" + this.f110650c + ", isMain=" + this.d + ", isSelected=" + this.f110651e + ", subAccountType=" + this.f110652f + ')';
        }
    }

    static {
    }

    public /* synthetic */ c0(kotlin.jvm.internal.i r1) {
        this();
    }

    public abstract String a();

    public c0() {
    }
}
