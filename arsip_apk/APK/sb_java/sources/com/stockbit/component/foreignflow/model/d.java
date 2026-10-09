package com.stockbit.component.foreignflow.model;

import com.google.firebase.messaging.Constants;
import com.stockbit.component.foreignflow.utils.ForeignFlowFormatter;
import java.time.LocalDate;

/* loaded from: classes7.dex */
public interface d {

    public static final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        public final LocalDate f71946a;

        /* renamed from: b, reason: collision with root package name */
        public final LocalDate f71947b;

        static {
        }

        public a(LocalDate r2, LocalDate r3) {
            kotlin.jvm.internal.p.l(r2, Constants.MessagePayloadKeys.FROM);
            kotlin.jvm.internal.p.l(r3, "to");
            this.f71946a = r2;
            this.f71947b = r3;
        }

        public final LocalDate a() {
            return this.f71946a;
        }

        public final LocalDate b() {
            return this.f71947b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (kotlin.jvm.internal.p.g(this.f71946a, r52.f71946a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f71947b, r52.f71947b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        @Override // com.stockbit.component.foreignflow.model.d
        public String getLabel() {
            StringBuilder r02 = new StringBuilder();
            ForeignFlowFormatter r1 = ForeignFlowFormatter.f72049a;
            r02.append(r1.b(this.f71946a));
            r02.append(" - ");
            r02.append(r1.b(this.f71947b));
            return r02.toString();
        }

        public int hashCode() {
            return (this.f71946a.hashCode() * 31) + this.f71947b.hashCode();
        }

        public String toString() {
            return "Range(from=" + this.f71946a + ", to=" + this.f71947b + ')';
        }
    }

    public static final class b implements d {

        /* renamed from: a, reason: collision with root package name */
        public final LocalDate f71948a;

        static {
        }

        public b(LocalDate r2) {
            kotlin.jvm.internal.p.l(r2, com.clevertap.android.sdk.Constants.KEY_DATE);
            this.f71948a = r2;
        }

        public final LocalDate a() {
            return this.f71948a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f71948a, ((b) r4).f71948a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        @Override // com.stockbit.component.foreignflow.model.d
        public String getLabel() {
            return ForeignFlowFormatter.f72049a.b(this.f71948a);
        }

        public int hashCode() {
            return this.f71948a.hashCode();
        }

        public String toString() {
            return "SingleDate(date=" + this.f71948a + ')';
        }
    }

    String getLabel();
}
