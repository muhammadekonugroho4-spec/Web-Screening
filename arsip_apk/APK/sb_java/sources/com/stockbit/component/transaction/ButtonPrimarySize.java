package com.stockbit.component.transaction;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/component/transaction/ButtonPrimarySize;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "MEDIUM", "SMALL", "transaction_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum ButtonPrimarySize extends Enum<ButtonPrimarySize> {
    public static final ButtonPrimarySize DEFAULT = null;
    public static final ButtonPrimarySize MEDIUM = null;
    public static final ButtonPrimarySize SMALL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ButtonPrimarySize[] f77423a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f77424b = null;

    static {
        DEFAULT = new ButtonPrimarySize("DEFAULT", 0);
        MEDIUM = new ButtonPrimarySize("MEDIUM", 1);
        SMALL = new ButtonPrimarySize("SMALL", 2);
        ButtonPrimarySize[] r02 = a();
        f77423a = r02;
        f77424b = kotlin.enums.b.a(r02);
    }

    ButtonPrimarySize(String r1, int r2) {
    }

    public static final /* synthetic */ ButtonPrimarySize[] a() {
        return new ButtonPrimarySize[]{DEFAULT, MEDIUM, SMALL};
    }

    public static kotlin.enums.a getEntries() {
        return f77424b;
    }

    public static ButtonPrimarySize valueOf(String r1) {
        return (ButtonPrimarySize) Enum.valueOf(ButtonPrimarySize.class, r1);
    }

    public static ButtonPrimarySize[] values() {
        return (ButtonPrimarySize[]) f77423a.clone();
    }
}
