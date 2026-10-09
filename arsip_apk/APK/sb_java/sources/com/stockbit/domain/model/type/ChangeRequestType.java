package com.stockbit.domain.model.type;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/stockbit/domain/model/type/ChangeRequestType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PHONE", "EMAIL", "PASSWORD", "BANK", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum ChangeRequestType extends Enum<ChangeRequestType> {
    public static final ChangeRequestType BANK = null;
    public static final ChangeRequestType EMAIL = null;
    public static final ChangeRequestType PASSWORD = null;
    public static final ChangeRequestType PHONE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ChangeRequestType[] f86168a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86169b = null;
    private final String value;

    static {
        PHONE = new ChangeRequestType("PHONE", 0, "CHANGE_TOKEN_TYPE_PHONE");
        EMAIL = new ChangeRequestType("EMAIL", 1, "CHANGE_TOKEN_TYPE_EMAIL");
        PASSWORD = new ChangeRequestType("PASSWORD", 2, "CHANGE_TOKEN_TYPE_PASSWORD");
        BANK = new ChangeRequestType("BANK", 3, "CHANGE_TOKEN_TYPE_BANK");
        ChangeRequestType[] r02 = a();
        f86168a = r02;
        f86169b = kotlin.enums.b.a(r02);
    }

    ChangeRequestType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ ChangeRequestType[] a() {
        return new ChangeRequestType[]{PHONE, EMAIL, PASSWORD, BANK};
    }

    public static kotlin.enums.a getEntries() {
        return f86169b;
    }

    public static ChangeRequestType valueOf(String r1) {
        return (ChangeRequestType) Enum.valueOf(ChangeRequestType.class, r1);
    }

    public static ChangeRequestType[] values() {
        return (ChangeRequestType[]) f86168a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
