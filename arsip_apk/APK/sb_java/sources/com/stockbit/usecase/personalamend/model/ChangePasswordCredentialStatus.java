package com.stockbit.usecase.personalamend.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/usecase/personalamend/model/ChangePasswordCredentialStatus;", "", "<init>", "(Ljava/lang/String;I)V", "CHANGE_PASSWORD_STATUS_NONE", "CHANGE_PASSWORD_STATUS_REMIND", "CHANGE_PASSWORD_STATUS_ENFORCE", "usecase-personal-amend"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum ChangePasswordCredentialStatus extends Enum<ChangePasswordCredentialStatus> {
    public static final ChangePasswordCredentialStatus CHANGE_PASSWORD_STATUS_ENFORCE = null;
    public static final ChangePasswordCredentialStatus CHANGE_PASSWORD_STATUS_NONE = null;
    public static final ChangePasswordCredentialStatus CHANGE_PASSWORD_STATUS_REMIND = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ChangePasswordCredentialStatus[] f159004a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f159005b = null;

    static {
        CHANGE_PASSWORD_STATUS_NONE = new ChangePasswordCredentialStatus("CHANGE_PASSWORD_STATUS_NONE", 0);
        CHANGE_PASSWORD_STATUS_REMIND = new ChangePasswordCredentialStatus("CHANGE_PASSWORD_STATUS_REMIND", 1);
        CHANGE_PASSWORD_STATUS_ENFORCE = new ChangePasswordCredentialStatus("CHANGE_PASSWORD_STATUS_ENFORCE", 2);
        ChangePasswordCredentialStatus[] r02 = a();
        f159004a = r02;
        f159005b = kotlin.enums.b.a(r02);
    }

    ChangePasswordCredentialStatus(String r1, int r2) {
    }

    public static final /* synthetic */ ChangePasswordCredentialStatus[] a() {
        return new ChangePasswordCredentialStatus[]{CHANGE_PASSWORD_STATUS_NONE, CHANGE_PASSWORD_STATUS_REMIND, CHANGE_PASSWORD_STATUS_ENFORCE};
    }

    public static kotlin.enums.a getEntries() {
        return f159005b;
    }

    public static ChangePasswordCredentialStatus valueOf(String r1) {
        return (ChangePasswordCredentialStatus) Enum.valueOf(ChangePasswordCredentialStatus.class, r1);
    }

    public static ChangePasswordCredentialStatus[] values() {
        return (ChangePasswordCredentialStatus[]) f159004a.clone();
    }
}
