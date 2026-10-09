package com.stockbit.feature.trusteddevice.ui.remove.completion;

import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public interface d {

    public static final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        public final String f118591a;

        static {
        }

        public a(String r2) {
            p.l(r2, "message");
            this.f118591a = r2;
        }

        public final String a() {
            return this.f118591a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f118591a, ((a) r4).f118591a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f118591a.hashCode();
        }

        public String toString() {
            return "RemoveTrustedDeviceFailed(message=" + this.f118591a + ')';
        }
    }

    public static final class b implements d {

        /* renamed from: a, reason: collision with root package name */
        public static final b f118592a = null;

        static {
            f118592a = new b();
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
            return -2144440979;
        }

        public String toString() {
            return "RemoveTrustedDeviceSuccess";
        }
    }
}
