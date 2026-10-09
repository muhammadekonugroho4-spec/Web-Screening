package com.stockbit.domain.model.type.securities;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/domain/model/type/securities/LoginSecuritiesButtonType;", "", "<init>", "(Ljava/lang/String;I)V", "LOGIN", "REGISTER", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum LoginSecuritiesButtonType extends Enum<LoginSecuritiesButtonType> {
    public static final LoginSecuritiesButtonType LOGIN = null;
    public static final LoginSecuritiesButtonType REGISTER = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ LoginSecuritiesButtonType[] f86427a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f86428b = null;

    static {
        LOGIN = new LoginSecuritiesButtonType("LOGIN", 0);
        REGISTER = new LoginSecuritiesButtonType("REGISTER", 1);
        LoginSecuritiesButtonType[] r02 = a();
        f86427a = r02;
        f86428b = b.a(r02);
    }

    LoginSecuritiesButtonType(String r1, int r2) {
    }

    public static final /* synthetic */ LoginSecuritiesButtonType[] a() {
        return new LoginSecuritiesButtonType[]{LOGIN, REGISTER};
    }

    public static a getEntries() {
        return f86428b;
    }

    public static LoginSecuritiesButtonType valueOf(String r1) {
        return (LoginSecuritiesButtonType) Enum.valueOf(LoginSecuritiesButtonType.class, r1);
    }

    public static LoginSecuritiesButtonType[] values() {
        return (LoginSecuritiesButtonType[]) f86427a.clone();
    }
}
