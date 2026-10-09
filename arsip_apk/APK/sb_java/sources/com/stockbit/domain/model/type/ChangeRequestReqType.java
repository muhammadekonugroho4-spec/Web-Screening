package com.stockbit.domain.model.type;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stockbit/domain/model/type/ChangeRequestReqType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SETTING", "OPEN_ACCOUNT", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum ChangeRequestReqType extends Enum<ChangeRequestReqType> {
    public static final ChangeRequestReqType OPEN_ACCOUNT = null;
    public static final ChangeRequestReqType SETTING = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ChangeRequestReqType[] f86166a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86167b = null;
    private final String value;

    static {
        SETTING = new ChangeRequestReqType("SETTING", 0, "CHANGE_TOKEN_REQ_TYPE_EDIT");
        OPEN_ACCOUNT = new ChangeRequestReqType("OPEN_ACCOUNT", 1, "CHANGE_TOKEN_REQ_TYPE_OPEN");
        ChangeRequestReqType[] r02 = a();
        f86166a = r02;
        f86167b = kotlin.enums.b.a(r02);
    }

    ChangeRequestReqType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ ChangeRequestReqType[] a() {
        return new ChangeRequestReqType[]{SETTING, OPEN_ACCOUNT};
    }

    public static kotlin.enums.a getEntries() {
        return f86167b;
    }

    public static ChangeRequestReqType valueOf(String r1) {
        return (ChangeRequestReqType) Enum.valueOf(ChangeRequestReqType.class, r1);
    }

    public static ChangeRequestReqType[] values() {
        return (ChangeRequestReqType[]) f86166a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
