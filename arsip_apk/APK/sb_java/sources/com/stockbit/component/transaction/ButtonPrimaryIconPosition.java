package com.stockbit.component.transaction;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/component/transaction/ButtonPrimaryIconPosition;", "", "<init>", "(Ljava/lang/String;I)V", "START", "END", "transaction_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum ButtonPrimaryIconPosition extends Enum<ButtonPrimaryIconPosition> {
    public static final ButtonPrimaryIconPosition END = null;
    public static final ButtonPrimaryIconPosition START = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ButtonPrimaryIconPosition[] f77421a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f77422b = null;

    static {
        START = new ButtonPrimaryIconPosition("START", 0);
        END = new ButtonPrimaryIconPosition("END", 1);
        ButtonPrimaryIconPosition[] r02 = a();
        f77421a = r02;
        f77422b = kotlin.enums.b.a(r02);
    }

    ButtonPrimaryIconPosition(String r1, int r2) {
    }

    public static final /* synthetic */ ButtonPrimaryIconPosition[] a() {
        return new ButtonPrimaryIconPosition[]{START, END};
    }

    public static kotlin.enums.a getEntries() {
        return f77422b;
    }

    public static ButtonPrimaryIconPosition valueOf(String r1) {
        return (ButtonPrimaryIconPosition) Enum.valueOf(ButtonPrimaryIconPosition.class, r1);
    }

    public static ButtonPrimaryIconPosition[] values() {
        return (ButtonPrimaryIconPosition[]) f77421a.clone();
    }
}
