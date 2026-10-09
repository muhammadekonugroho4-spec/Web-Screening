package com.stockbit.usecase.personalamend.resource.changepassword;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import com.stockbit.features.model.OTPChannelValue;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface a {

    /* renamed from: com.stockbit.usecase.personalamend.resource.changepassword.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1570a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f159158a;

        /* renamed from: com.stockbit.usecase.personalamend.resource.changepassword.a$a$a, reason: collision with other inner class name */
        public static final class C1571a extends AbstractC1570a {

            /* renamed from: b, reason: collision with root package name */
            public final String f159159b;

            public C1571a(String r2) {
                p.l(r2, "token");
                super(r2, null);
                this.f159159b = r2;
            }

            public String a() {
                return this.f159159b;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof C1571a) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f159159b, ((C1571a) r4).f159159b) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f159159b.hashCode();
            }

            public String toString() {
                return "ChallengeConfirmCurrentPassword(token=" + this.f159159b + ")";
            }
        }

        /* renamed from: com.stockbit.usecase.personalamend.resource.changepassword.a$a$b */
        public static final class b extends AbstractC1570a {

            /* renamed from: b, reason: collision with root package name */
            public final String f159160b;

            public b(String r2) {
                p.l(r2, "token");
                super(r2, null);
                this.f159160b = r2;
            }

            public String a() {
                return this.f159160b;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof b) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f159160b, ((b) r4).f159160b) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f159160b.hashCode();
            }

            public String toString() {
                return "ChallengeConfirmNewPassword(token=" + this.f159160b + ")";
            }
        }

        /* renamed from: com.stockbit.usecase.personalamend.resource.changepassword.a$a$c */
        public static final class c extends AbstractC1570a {

            /* renamed from: b, reason: collision with root package name */
            public final String f159161b;

            public c(String r2) {
                p.l(r2, "token");
                super(r2, null);
                this.f159161b = r2;
            }

            public String a() {
                return this.f159161b;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof c) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f159161b, ((c) r4).f159161b) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f159161b.hashCode();
            }

            public String toString() {
                return "ChallengeFaceMatching(token=" + this.f159161b + ")";
            }
        }

        /* renamed from: com.stockbit.usecase.personalamend.resource.changepassword.a$a$d */
        public static final class d extends AbstractC1570a {

            /* renamed from: b, reason: collision with root package name */
            public final boolean f159162b;

            /* renamed from: c, reason: collision with root package name */
            public final OTPChannelValue f159163c;
            public final List d;

            /* renamed from: e, reason: collision with root package name */
            public final String f159164e;

            public d(boolean r2, OTPChannelValue r3, List r4, String r5) {
                p.l(r3, "default");
                p.l(r4, "otpChannels");
                p.l(r5, "token");
                super(r5, null);
                this.f159162b = r2;
                this.f159163c = r3;
                this.d = r4;
                this.f159164e = r5;
            }

            public final OTPChannelValue a() {
                return this.f159163c;
            }

            public final boolean b() {
                return this.f159162b;
            }

            public final List c() {
                return this.d;
            }

            public String d() {
                return this.f159164e;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof d) == true) goto L8;
                return false;
            L8:
                d r52 = (d) r5;
                if (this.f159162b == r52.f159162b) goto L12;
                return false;
            L12:
                if (p.g(this.f159163c, r52.f159163c) == true) goto L15;
                return false;
            L15:
                if (p.g(this.d, r52.d) == true) goto L18;
                return false;
            L18:
                if (p.g(this.f159164e, r52.f159164e) == true) goto L20;
                return false;
            L20:
                return true;
            }

            public int hashCode() {
                return (((((Boolean.hashCode(this.f159162b) * 31) + this.f159163c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f159164e.hashCode();
            }

            public String toString() {
                return "ChallengeOTP(lostPhoneFlowEnabled=" + this.f159162b + ", default=" + this.f159163c + ", otpChannels=" + this.d + ", token=" + this.f159164e + ")";
            }
        }

        /* renamed from: com.stockbit.usecase.personalamend.resource.changepassword.a$a$e */
        public static final class e extends AbstractC1570a {

            /* renamed from: b, reason: collision with root package name */
            public final String f159165b;

            public e(String r2) {
                p.l(r2, "token");
                super(r2, null);
                this.f159165b = r2;
            }

            public String a() {
                return this.f159165b;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof e) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f159165b, ((e) r4).f159165b) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f159165b.hashCode();
            }

            public String toString() {
                return "ChallengeRequestNewPassword(token=" + this.f159165b + ")";
            }
        }

        /* renamed from: com.stockbit.usecase.personalamend.resource.changepassword.a$a$f */
        public static final class f extends AbstractC1570a {

            /* renamed from: b, reason: collision with root package name */
            public final String f159166b;

            /* renamed from: c, reason: collision with root package name */
            public final String f159167c;

            public f(String r2, String r3) {
                p.l(r2, "token");
                p.l(r3, "username");
                super(r2, null);
                this.f159166b = r2;
                this.f159167c = r3;
            }

            public final String a() {
                return this.f159167c;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof f) == true) goto L8;
                return false;
            L8:
                f r52 = (f) r5;
                if (p.g(this.f159166b, r52.f159166b) == true) goto L12;
                return false;
            L12:
                if (p.g(this.f159167c, r52.f159167c) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                return (this.f159166b.hashCode() * 31) + this.f159167c.hashCode();
            }

            public String toString() {
                return "ChallengeSuccess(token=" + this.f159166b + ", username=" + this.f159167c + ")";
            }
        }

        /* renamed from: com.stockbit.usecase.personalamend.resource.changepassword.a$a$g */
        public static final class g extends AbstractC1570a {

            /* renamed from: b, reason: collision with root package name */
            public final String f159168b;

            /* renamed from: c, reason: collision with root package name */
            public final String f159169c;

            public g(String r2, String r3) {
                p.l(r2, "token");
                p.l(r3, "verificationToken");
                super(r2, null);
                this.f159168b = r2;
                this.f159169c = r3;
            }

            public String a() {
                return this.f159168b;
            }

            public final String b() {
                return this.f159169c;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof g) == true) goto L8;
                return false;
            L8:
                g r52 = (g) r5;
                if (p.g(this.f159168b, r52.f159168b) == true) goto L12;
                return false;
            L12:
                if (p.g(this.f159169c, r52.f159169c) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                return (this.f159168b.hashCode() * 31) + this.f159169c.hashCode();
            }

            public String toString() {
                return "ChallengeVaas(token=" + this.f159168b + ", verificationToken=" + this.f159169c + ")";
            }
        }

        public /* synthetic */ AbstractC1570a(String r1, i r2) {
            this(r1);
        }

        public AbstractC1570a(String r1) {
            this.f159158a = r1;
        }
    }

    public static abstract class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f159170a;

        /* renamed from: com.stockbit.usecase.personalamend.resource.changepassword.a$b$a, reason: collision with other inner class name */
        public static final class C1572a extends b {

            /* renamed from: b, reason: collision with root package name */
            public final DomainExodusException f159171b;

            public C1572a(DomainExodusException r2) {
                p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                super(r2, null);
                this.f159171b = r2;
            }

            @Override // com.stockbit.usecase.personalamend.resource.changepassword.a.b
            public DomainExodusException a() {
                return this.f159171b;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof C1572a) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f159171b, ((C1572a) r4).f159171b) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f159171b.hashCode();
            }

            public String toString() {
                return "General(error=" + this.f159171b + ")";
            }
        }

        /* renamed from: com.stockbit.usecase.personalamend.resource.changepassword.a$b$b, reason: collision with other inner class name */
        public static final class C1573b extends b {

            /* renamed from: b, reason: collision with root package name */
            public final DomainExodusException f159172b;

            public C1573b(DomainExodusException r2) {
                p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                super(r2, null);
                this.f159172b = r2;
            }

            @Override // com.stockbit.usecase.personalamend.resource.changepassword.a.b
            public DomainExodusException a() {
                return this.f159172b;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof C1573b) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f159172b, ((C1573b) r4).f159172b) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f159172b.hashCode();
            }

            public String toString() {
                return "InvalidSession(error=" + this.f159172b + ")";
            }
        }

        public /* synthetic */ b(DomainExodusException r1, i r2) {
            this(r1);
        }

        public abstract DomainExodusException a();

        public b(DomainExodusException r1) {
            this.f159170a = r1;
        }
    }
}
