package com.stockbit.tipping.ui.claim;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class a {

    /* renamed from: com.stockbit.tipping.ui.claim.a$a, reason: collision with other inner class name */
    public static final class C1325a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f145906a;

        public C1325a(String r2) {
            p.l(r2, "amount");
            super(null);
            this.f145906a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1325a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f145906a, ((C1325a) r4).f145906a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f145906a.hashCode();
        }

        public String toString() {
            return "OnClaimTipping(amount=" + this.f145906a + ')';
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f145907a;

        public b(String r2) {
            p.l(r2, "amount");
            super(null);
            this.f145907a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f145907a, ((b) r4).f145907a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f145907a.hashCode();
        }

        public String toString() {
            return "OnSuccessTipping(amount=" + this.f145907a + ')';
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
