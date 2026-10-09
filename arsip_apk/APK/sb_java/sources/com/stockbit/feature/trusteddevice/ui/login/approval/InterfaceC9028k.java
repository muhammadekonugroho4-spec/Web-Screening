package com.stockbit.feature.trusteddevice.ui.login.approval;

/* renamed from: com.stockbit.feature.trusteddevice.ui.login.approval.k, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC9028k {

    /* renamed from: com.stockbit.feature.trusteddevice.ui.login.approval.k$a */
    public static final class a implements InterfaceC9028k {

        /* renamed from: a, reason: collision with root package name */
        public static final a f118290a = null;

        static {
            f118290a = new a();
        }

        public a() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 799129678;
        }

        public String toString() {
            return "ShowInvalidSignDialog";
        }
    }

    /* renamed from: com.stockbit.feature.trusteddevice.ui.login.approval.k$b */
    public static final class b implements InterfaceC9028k {

        /* renamed from: a, reason: collision with root package name */
        public final String f118291a;

        static {
        }

        public b(String r2) {
            kotlin.jvm.internal.p.l(r2, "message");
            this.f118291a = r2;
        }

        public final String a() {
            return this.f118291a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f118291a, ((b) r4).f118291a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f118291a.hashCode();
        }

        public String toString() {
            return "ShowToastAndGoBack(message=" + this.f118291a + ')';
        }
    }
}
