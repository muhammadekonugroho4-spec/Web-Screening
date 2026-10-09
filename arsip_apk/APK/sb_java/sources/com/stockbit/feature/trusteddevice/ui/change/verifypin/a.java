package com.stockbit.feature.trusteddevice.ui.change.verifypin;

import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public interface a {

    /* renamed from: com.stockbit.feature.trusteddevice.ui.change.verifypin.a$a, reason: collision with other inner class name */
    public static final class C1024a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f118156a;

        static {
        }

        public C1024a(String r2) {
            p.l(r2, "message");
            this.f118156a = r2;
        }

        public final String a() {
            return this.f118156a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1024a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f118156a, ((C1024a) r4).f118156a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f118156a.hashCode();
        }

        public String toString() {
            return "BackToLinkedDeviceWithError(message=" + this.f118156a + ')';
        }
    }
}
