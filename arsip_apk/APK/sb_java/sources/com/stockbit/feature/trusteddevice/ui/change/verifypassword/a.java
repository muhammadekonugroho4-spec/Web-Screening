package com.stockbit.feature.trusteddevice.ui.change.verifypassword;

import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public interface a {

    /* renamed from: com.stockbit.feature.trusteddevice.ui.change.verifypassword.a$a, reason: collision with other inner class name */
    public static final class C1023a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f118129a;

        static {
        }

        public C1023a(String r2) {
            p.l(r2, "message");
            this.f118129a = r2;
        }

        public final String a() {
            return this.f118129a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1023a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f118129a, ((C1023a) r4).f118129a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f118129a.hashCode();
        }

        public String toString() {
            return "BackToLinkedDeviceWithError(message=" + this.f118129a + ')';
        }
    }
}
