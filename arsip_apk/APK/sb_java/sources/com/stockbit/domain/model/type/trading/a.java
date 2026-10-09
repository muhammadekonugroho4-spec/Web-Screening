package com.stockbit.domain.model.type.trading;

import javax.crypto.Cipher;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f86510a;

    /* renamed from: com.stockbit.domain.model.type.trading.a$a, reason: collision with other inner class name */
    public static final class C0799a extends a {

        /* renamed from: b, reason: collision with root package name */
        public final Cipher f86511b;

        public C0799a(Cipher r3) {
            p.l(r3, "cipher");
            super("Biometric", null);
            this.f86511b = r3;
        }

        public final Cipher a() {
            return this.f86511b;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C0799a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f86511b, ((C0799a) r4).f86511b) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f86511b.hashCode();
        }

        public String toString() {
            return "Biometric(cipher=" + this.f86511b + ')';
        }
    }

    public static final class b extends a {

        /* renamed from: b, reason: collision with root package name */
        public final String f86512b;

        public b(String r3) {
            p.l(r3, "pin");
            super("PIN", null);
            this.f86512b = r3;
        }

        public final String a() {
            return this.f86512b;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f86512b, ((b) r4).f86512b) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f86512b.hashCode();
        }

        public String toString() {
            return "Pin(pin=" + this.f86512b + ')';
        }
    }

    public /* synthetic */ a(String r1, i r2) {
        this(r1);
    }

    public a(String r1) {
        this.f86510a = r1;
    }
}
