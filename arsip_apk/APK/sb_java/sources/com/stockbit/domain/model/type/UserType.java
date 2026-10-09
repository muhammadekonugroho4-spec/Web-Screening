package com.stockbit.domain.model.type;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stockbit/domain/model/type/UserType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "OFFICIAL", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum UserType extends Enum<UserType> {
    public static final UserType OFFICIAL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ UserType[] f86264a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86265b = null;
    private final String value;

    static {
        OFFICIAL = new UserType("OFFICIAL", 0, "OFFICIAL");
        UserType[] r02 = a();
        f86264a = r02;
        f86265b = kotlin.enums.b.a(r02);
    }

    UserType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ UserType[] a() {
        return new UserType[]{OFFICIAL};
    }

    public static kotlin.enums.a getEntries() {
        return f86265b;
    }

    public static UserType valueOf(String r1) {
        return (UserType) Enum.valueOf(UserType.class, r1);
    }

    public static UserType[] values() {
        return (UserType[]) f86264a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
