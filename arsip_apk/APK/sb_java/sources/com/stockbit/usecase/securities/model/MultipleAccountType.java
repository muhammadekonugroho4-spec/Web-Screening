package com.stockbit.usecase.securities.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/usecase/securities/model/MultipleAccountType;", "", "<init>", "(Ljava/lang/String;I)V", "MAIN_ACCOUNT", "SUB_ACCOUNT", "TOTAL_ACCOUNT", "usecase-securities"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum MultipleAccountType extends Enum<MultipleAccountType> {
    public static final MultipleAccountType MAIN_ACCOUNT = null;
    public static final MultipleAccountType SUB_ACCOUNT = null;
    public static final MultipleAccountType TOTAL_ACCOUNT = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ MultipleAccountType[] f160324a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f160325b = null;

    static {
        MAIN_ACCOUNT = new MultipleAccountType("MAIN_ACCOUNT", 0);
        SUB_ACCOUNT = new MultipleAccountType("SUB_ACCOUNT", 1);
        TOTAL_ACCOUNT = new MultipleAccountType("TOTAL_ACCOUNT", 2);
        MultipleAccountType[] r02 = a();
        f160324a = r02;
        f160325b = kotlin.enums.b.a(r02);
    }

    MultipleAccountType(String r1, int r2) {
    }

    public static final /* synthetic */ MultipleAccountType[] a() {
        return new MultipleAccountType[]{MAIN_ACCOUNT, SUB_ACCOUNT, TOTAL_ACCOUNT};
    }

    public static kotlin.enums.a getEntries() {
        return f160325b;
    }

    public static MultipleAccountType valueOf(String r1) {
        return (MultipleAccountType) Enum.valueOf(MultipleAccountType.class, r1);
    }

    public static MultipleAccountType[] values() {
        return (MultipleAccountType[]) f160324a.clone();
    }
}
