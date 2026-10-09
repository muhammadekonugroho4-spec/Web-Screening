package com.stockbit.feature.transaction.util.compose;

import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public interface j {

    public static final class a implements j {

        /* renamed from: a, reason: collision with root package name */
        public final Object f116725a;

        static {
        }

        public a(Object r1) {
            this.f116725a = r1;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f116725a, ((a) r4).f116725a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        @Override // com.stockbit.feature.transaction.util.compose.j
        public Object getValue() {
            return this.f116725a;
        }

        public int hashCode() {
            Object r02 = this.f116725a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "Api(value=" + this.f116725a + ')';
        }
    }

    public static final class b implements j {

        /* renamed from: a, reason: collision with root package name */
        public final Object f116726a;

        static {
        }

        public b(Object r1) {
            this.f116726a = r1;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f116726a, ((b) r4).f116726a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        @Override // com.stockbit.feature.transaction.util.compose.j
        public Object getValue() {
            return this.f116726a;
        }

        public int hashCode() {
            Object r02 = this.f116726a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "UserInput(value=" + this.f116726a + ')';
        }
    }

    Object getValue();
}
