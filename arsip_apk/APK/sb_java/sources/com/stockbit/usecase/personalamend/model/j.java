package com.stockbit.usecase.personalamend.model;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final List f159065a;

    public static abstract class a {

        /* renamed from: com.stockbit.usecase.personalamend.model.j$a$a, reason: collision with other inner class name */
        public static final class C1550a extends a {

            /* renamed from: a, reason: collision with root package name */
            public final String f159066a;

            public C1550a(String r2) {
                p.l(r2, "target");
                super(r2, null);
                this.f159066a = r2;
            }

            public final String a() {
                return this.f159066a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof C1550a) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f159066a, ((C1550a) r4).f159066a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f159066a.hashCode();
            }

            public String toString() {
                return "Email(target=" + this.f159066a + ")";
            }
        }

        public /* synthetic */ a(String r1, kotlin.jvm.internal.i r2) {
            this(r1);
        }

        public a(String r1) {
        }
    }

    public j(List r2) {
        p.l(r2, "otpRecipients");
        this.f159065a = r2;
    }

    public final List a() {
        return this.f159065a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof j) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f159065a, ((j) r4).f159065a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f159065a.hashCode();
    }

    public String toString() {
        return "OtpRecipientUIState(otpRecipients=" + this.f159065a + ")";
    }
}
