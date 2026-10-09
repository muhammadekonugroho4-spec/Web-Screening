package com.stockbit.alert.ui.mainlist.active;

/* loaded from: classes6.dex */
public interface a0 {

    public static final class a implements a0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f45519a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f45520b;

        static {
        }

        public a(String r2, boolean r3) {
            kotlin.jvm.internal.p.l(r2, "message");
            this.f45519a = r2;
            this.f45520b = r3;
        }

        public final String a() {
            return this.f45519a;
        }

        public final boolean b() {
            return this.f45520b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (kotlin.jvm.internal.p.g(this.f45519a, r52.f45519a) == true) goto L12;
            return false;
        L12:
            if (this.f45520b == r52.f45520b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f45519a.hashCode() * 31) + Boolean.hashCode(this.f45520b);
        }

        public String toString() {
            return "ShowToast(message=" + this.f45519a + ", isError=" + this.f45520b + ')';
        }
    }
}
