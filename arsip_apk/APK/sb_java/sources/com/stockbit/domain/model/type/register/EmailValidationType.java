package com.stockbit.domain.model.type.register;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\n\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\r"}, d2 = {"Lcom/stockbit/domain/model/type/register/EmailValidationType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "VERIFIED", "UNVERIFIED", "isVerified", "", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum EmailValidationType extends Enum<EmailValidationType> {
    public static final a Companion = null;
    public static final EmailValidationType UNVERIFIED = null;
    public static final EmailValidationType VERIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EmailValidationType[] f86392a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86393b = null;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final EmailValidationType a(String r6) {
            p.l(r6, "value");
            EmailValidationType[] r02 = EmailValidationType.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            EmailValidationType r3 = r02[r2];
            if (p.g(r3.getValue(), r6) == true) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return EmailValidationType.UNVERIFIED;
        L8:
            r3 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        VERIFIED = new EmailValidationType("VERIFIED", 0, "verified");
        UNVERIFIED = new EmailValidationType("UNVERIFIED", 1, "unverified");
        EmailValidationType[] r02 = a();
        f86392a = r02;
        f86393b = b.a(r02);
        Companion = new a(null);
    }

    EmailValidationType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ EmailValidationType[] a() {
        return new EmailValidationType[]{VERIFIED, UNVERIFIED};
    }

    public static kotlin.enums.a getEntries() {
        return f86393b;
    }

    public static EmailValidationType valueOf(String r1) {
        return (EmailValidationType) Enum.valueOf(EmailValidationType.class, r1);
    }

    public static EmailValidationType[] values() {
        return (EmailValidationType[]) f86392a.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public final boolean isVerified() {
        if (this != VERIFIED) goto L6;
        return true;
    L6:
        return false;
    }
}
