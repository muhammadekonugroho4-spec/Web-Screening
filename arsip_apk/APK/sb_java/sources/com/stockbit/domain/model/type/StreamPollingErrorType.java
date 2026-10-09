package com.stockbit.domain.model.type;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/domain/model/type/StreamPollingErrorType;", "", "<init>", "(Ljava/lang/String;I)V", "EXPIRED_DATE_PASSED", "REQUIRED_FIELD_EMPTY", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum StreamPollingErrorType extends Enum<StreamPollingErrorType> {
    public static final StreamPollingErrorType EXPIRED_DATE_PASSED = null;
    public static final StreamPollingErrorType REQUIRED_FIELD_EMPTY = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ StreamPollingErrorType[] f86250a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86251b = null;

    static {
        EXPIRED_DATE_PASSED = new StreamPollingErrorType("EXPIRED_DATE_PASSED", 0);
        REQUIRED_FIELD_EMPTY = new StreamPollingErrorType("REQUIRED_FIELD_EMPTY", 1);
        StreamPollingErrorType[] r02 = a();
        f86250a = r02;
        f86251b = kotlin.enums.b.a(r02);
    }

    StreamPollingErrorType(String r1, int r2) {
    }

    public static final /* synthetic */ StreamPollingErrorType[] a() {
        return new StreamPollingErrorType[]{EXPIRED_DATE_PASSED, REQUIRED_FIELD_EMPTY};
    }

    public static kotlin.enums.a getEntries() {
        return f86251b;
    }

    public static StreamPollingErrorType valueOf(String r1) {
        return (StreamPollingErrorType) Enum.valueOf(StreamPollingErrorType.class, r1);
    }

    public static StreamPollingErrorType[] values() {
        return (StreamPollingErrorType[]) f86250a.clone();
    }
}
