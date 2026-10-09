package com.stockbit.domain.model.type.securities;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/domain/model/type/securities/ButtonType;", "", "<init>", "(Ljava/lang/String;I)V", "BUY_TYPE", "SELL_TYPE", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum ButtonType extends Enum<ButtonType> {
    public static final ButtonType BUY_TYPE = null;
    public static final ButtonType SELL_TYPE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ButtonType[] f86417a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f86418b = null;

    static {
        BUY_TYPE = new ButtonType("BUY_TYPE", 0);
        SELL_TYPE = new ButtonType("SELL_TYPE", 1);
        ButtonType[] r02 = a();
        f86417a = r02;
        f86418b = b.a(r02);
    }

    ButtonType(String r1, int r2) {
    }

    public static final /* synthetic */ ButtonType[] a() {
        return new ButtonType[]{BUY_TYPE, SELL_TYPE};
    }

    public static a getEntries() {
        return f86418b;
    }

    public static ButtonType valueOf(String r1) {
        return (ButtonType) Enum.valueOf(ButtonType.class, r1);
    }

    public static ButtonType[] values() {
        return (ButtonType[]) f86417a.clone();
    }
}
