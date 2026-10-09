package com.stockbit.usecase.personalamend.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/usecase/personalamend/model/ForgotPasswordLoginState;", "", "<init>", "(Ljava/lang/String;I)V", "LOGIN", "NON_LOGIN", "usecase-personal-amend"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum ForgotPasswordLoginState extends Enum<ForgotPasswordLoginState> {
    public static final ForgotPasswordLoginState LOGIN = null;
    public static final ForgotPasswordLoginState NON_LOGIN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ForgotPasswordLoginState[] f159010a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f159011b = null;

    static {
        LOGIN = new ForgotPasswordLoginState("LOGIN", 0);
        NON_LOGIN = new ForgotPasswordLoginState("NON_LOGIN", 1);
        ForgotPasswordLoginState[] r02 = a();
        f159010a = r02;
        f159011b = kotlin.enums.b.a(r02);
    }

    ForgotPasswordLoginState(String r1, int r2) {
    }

    public static final /* synthetic */ ForgotPasswordLoginState[] a() {
        return new ForgotPasswordLoginState[]{LOGIN, NON_LOGIN};
    }

    public static kotlin.enums.a getEntries() {
        return f159011b;
    }

    public static ForgotPasswordLoginState valueOf(String r1) {
        return (ForgotPasswordLoginState) Enum.valueOf(ForgotPasswordLoginState.class, r1);
    }

    public static ForgotPasswordLoginState[] values() {
        return (ForgotPasswordLoginState[]) f159010a.clone();
    }
}
