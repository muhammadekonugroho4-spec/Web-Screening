package com.stockbit.usecase.securities.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/usecase/securities/model/SubAccountType;", "", "<init>", "(Ljava/lang/String;I)V", "Regular", "Margin", "usecase-securities"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum SubAccountType extends Enum<SubAccountType> {
    public static final SubAccountType Margin = null;
    public static final SubAccountType Regular = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SubAccountType[] f160332a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f160333b = null;

    static {
        Regular = new SubAccountType("Regular", 0);
        Margin = new SubAccountType("Margin", 1);
        SubAccountType[] r02 = a();
        f160332a = r02;
        f160333b = kotlin.enums.b.a(r02);
    }

    SubAccountType(String r1, int r2) {
    }

    public static final /* synthetic */ SubAccountType[] a() {
        return new SubAccountType[]{Regular, Margin};
    }

    public static kotlin.enums.a getEntries() {
        return f160333b;
    }

    public static SubAccountType valueOf(String r1) {
        return (SubAccountType) Enum.valueOf(SubAccountType.class, r1);
    }

    public static SubAccountType[] values() {
        return (SubAccountType[]) f160332a.clone();
    }
}
