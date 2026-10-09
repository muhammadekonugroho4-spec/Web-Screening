package com.stockbit.domain.model.type.securities;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/stockbit/domain/model/type/securities/PaymentLimitMethod;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TradingBalance", "TradingLimit", "DayTrade", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum PaymentLimitMethod extends Enum<PaymentLimitMethod> {
    public static final a Companion = null;
    public static final PaymentLimitMethod DayTrade = null;
    public static final PaymentLimitMethod TradingBalance = null;
    public static final PaymentLimitMethod TradingLimit = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PaymentLimitMethod[] f86429a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86430b = null;
    private final int value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        TradingBalance = new PaymentLimitMethod("TradingBalance", 0, 0);
        TradingLimit = new PaymentLimitMethod("TradingLimit", 1, 1);
        DayTrade = new PaymentLimitMethod("DayTrade", 2, 2);
        PaymentLimitMethod[] r02 = a();
        f86429a = r02;
        f86430b = b.a(r02);
        Companion = new a(null);
    }

    PaymentLimitMethod(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static final /* synthetic */ PaymentLimitMethod[] a() {
        return new PaymentLimitMethod[]{TradingBalance, TradingLimit, DayTrade};
    }

    public static kotlin.enums.a getEntries() {
        return f86430b;
    }

    public static PaymentLimitMethod valueOf(String r1) {
        return (PaymentLimitMethod) Enum.valueOf(PaymentLimitMethod.class, r1);
    }

    public static PaymentLimitMethod[] values() {
        return (PaymentLimitMethod[]) f86429a.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
