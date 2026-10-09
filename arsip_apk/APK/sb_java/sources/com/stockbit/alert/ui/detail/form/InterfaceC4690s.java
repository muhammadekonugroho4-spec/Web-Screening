package com.stockbit.alert.ui.detail.form;

import com.stockbit.domain.model.alert.AlertConditionOperatorType;

/* renamed from: com.stockbit.alert.ui.detail.form.s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC4690s {

    /* renamed from: com.stockbit.alert.ui.detail.form.s$a */
    public static final class a implements InterfaceC4690s {

        /* renamed from: a, reason: collision with root package name */
        public final AlertConditionOperatorType f45300a;

        static {
        }

        public a(AlertConditionOperatorType r2) {
            kotlin.jvm.internal.p.l(r2, "newCondition");
            this.f45300a = r2;
        }

        public final AlertConditionOperatorType a() {
            return this.f45300a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (this.f45300a == ((a) r4).f45300a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f45300a.hashCode();
        }

        public String toString() {
            return "ConditionChange(newCondition=" + this.f45300a + ')';
        }
    }

    /* renamed from: com.stockbit.alert.ui.detail.form.s$b */
    public static final class b implements InterfaceC4690s {

        /* renamed from: a, reason: collision with root package name */
        public static final b f45301a = null;

        static {
            f45301a = new b();
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
            return 928533908;
        }

        public String toString() {
            return "TypeClick";
        }
    }
}
