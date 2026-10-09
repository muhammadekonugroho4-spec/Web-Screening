package com.stockbit.domain.model.type;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/domain/model/type/EmailVerificationType;", "", "<init>", "(Ljava/lang/String;I)V", "FORGOT_PASSWORD", "FORGOT_PIN", "AMEND_BANK", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum EmailVerificationType extends Enum<EmailVerificationType> {
    public static final EmailVerificationType AMEND_BANK = null;
    public static final EmailVerificationType FORGOT_PASSWORD = null;
    public static final EmailVerificationType FORGOT_PIN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EmailVerificationType[] f86184a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86185b = null;

    static {
        FORGOT_PASSWORD = new EmailVerificationType("FORGOT_PASSWORD", 0);
        FORGOT_PIN = new EmailVerificationType("FORGOT_PIN", 1);
        AMEND_BANK = new EmailVerificationType("AMEND_BANK", 2);
        EmailVerificationType[] r02 = a();
        f86184a = r02;
        f86185b = kotlin.enums.b.a(r02);
    }

    EmailVerificationType(String r1, int r2) {
    }

    public static final /* synthetic */ EmailVerificationType[] a() {
        return new EmailVerificationType[]{FORGOT_PASSWORD, FORGOT_PIN, AMEND_BANK};
    }

    public static kotlin.enums.a getEntries() {
        return f86185b;
    }

    public static EmailVerificationType valueOf(String r1) {
        return (EmailVerificationType) Enum.valueOf(EmailVerificationType.class, r1);
    }

    public static EmailVerificationType[] values() {
        return (EmailVerificationType[]) f86184a.clone();
    }
}
