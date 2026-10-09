package com.stockbit.usecase.company.model.keystats.type;

import com.midtrans.sdk.corekit.core.Currency;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/usecase/company/model/keystats/type/KeyStatsCurrencyViewType;", "", "<init>", "(Ljava/lang/String;I)V", Currency.IDR, "USD", "usecase-company"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum KeyStatsCurrencyViewType extends Enum<KeyStatsCurrencyViewType> {
    public static final KeyStatsCurrencyViewType IDR = null;
    public static final KeyStatsCurrencyViewType USD = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ KeyStatsCurrencyViewType[] f156312a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f156313b = null;

    static {
        IDR = new KeyStatsCurrencyViewType(Currency.IDR, 0);
        USD = new KeyStatsCurrencyViewType("USD", 1);
        KeyStatsCurrencyViewType[] r02 = a();
        f156312a = r02;
        f156313b = b.a(r02);
    }

    KeyStatsCurrencyViewType(String r1, int r2) {
    }

    public static final /* synthetic */ KeyStatsCurrencyViewType[] a() {
        return new KeyStatsCurrencyViewType[]{IDR, USD};
    }

    public static a getEntries() {
        return f156313b;
    }

    public static KeyStatsCurrencyViewType valueOf(String r1) {
        return (KeyStatsCurrencyViewType) Enum.valueOf(KeyStatsCurrencyViewType.class, r1);
    }

    public static KeyStatsCurrencyViewType[] values() {
        return (KeyStatsCurrencyViewType[]) f156312a.clone();
    }
}
