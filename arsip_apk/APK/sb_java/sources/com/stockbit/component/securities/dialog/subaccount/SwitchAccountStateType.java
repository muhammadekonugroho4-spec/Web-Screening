package com.stockbit.component.securities.dialog.subaccount;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/component/securities/dialog/subaccount/SwitchAccountStateType;", "", "<init>", "(Ljava/lang/String;I)V", "Loading", "Success", "Error", "securities_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum SwitchAccountStateType extends Enum<SwitchAccountStateType> {
    public static final SwitchAccountStateType Error = null;
    public static final SwitchAccountStateType Loading = null;
    public static final SwitchAccountStateType Success = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SwitchAccountStateType[] f76264a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f76265b = null;

    static {
        Loading = new SwitchAccountStateType("Loading", 0);
        Success = new SwitchAccountStateType("Success", 1);
        Error = new SwitchAccountStateType("Error", 2);
        SwitchAccountStateType[] r02 = a();
        f76264a = r02;
        f76265b = kotlin.enums.b.a(r02);
    }

    SwitchAccountStateType(String r1, int r2) {
    }

    public static final /* synthetic */ SwitchAccountStateType[] a() {
        return new SwitchAccountStateType[]{Loading, Success, Error};
    }

    public static kotlin.enums.a getEntries() {
        return f76265b;
    }

    public static SwitchAccountStateType valueOf(String r1) {
        return (SwitchAccountStateType) Enum.valueOf(SwitchAccountStateType.class, r1);
    }

    public static SwitchAccountStateType[] values() {
        return (SwitchAccountStateType[]) f76264a.clone();
    }
}
