package com.stockbit.domain.model.valueobject.securities;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/domain/model/valueobject/securities/JagoBindingType;", "", "<init>", "(Ljava/lang/String;I)V", "BINDING", "LOADING", "ERROR", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum JagoBindingType extends Enum<JagoBindingType> {
    public static final JagoBindingType BINDING = null;
    public static final JagoBindingType ERROR = null;
    public static final JagoBindingType LOADING = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ JagoBindingType[] f86976a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86977b = null;

    static {
        BINDING = new JagoBindingType("BINDING", 0);
        LOADING = new JagoBindingType("LOADING", 1);
        ERROR = new JagoBindingType("ERROR", 2);
        JagoBindingType[] r02 = a();
        f86976a = r02;
        f86977b = kotlin.enums.b.a(r02);
    }

    JagoBindingType(String r1, int r2) {
    }

    public static final /* synthetic */ JagoBindingType[] a() {
        return new JagoBindingType[]{BINDING, LOADING, ERROR};
    }

    public static kotlin.enums.a getEntries() {
        return f86977b;
    }

    public static JagoBindingType valueOf(String r1) {
        return (JagoBindingType) Enum.valueOf(JagoBindingType.class, r1);
    }

    public static JagoBindingType[] values() {
        return (JagoBindingType[]) f86976a.clone();
    }
}
