package com.stockbit.usecase.securities.model.formula;

import com.stockbit.usecase.securities.model.formula.TradingFormulaUIState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final double f160589a;

    /* renamed from: b, reason: collision with root package name */
    public final b f160590b;

    /* renamed from: c, reason: collision with root package name */
    public final double f160591c;
    public final b d;

    /* renamed from: e, reason: collision with root package name */
    public final double f160592e;

    /* renamed from: f, reason: collision with root package name */
    public final b f160593f;

    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f160594a = null;

        static {
            int[] r02 = new int[TradingFormulaUIState.Type.values().length];
            r02[TradingFormulaUIState.Type.REGULAR.ordinal()] = 1;     // Catch: NoSuchFieldError -> L9
        L13:
            r02[TradingFormulaUIState.Type.BONDS.ordinal()] = 2;     // Catch: NoSuchFieldError -> L10
        L19:
            r02[TradingFormulaUIState.Type.DAY_TRADE.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L15:
            r02[TradingFormulaUIState.Type.NEGO_ORDER.ordinal()] = 4;     // Catch: NoSuchFieldError -> L12
        L7:
            f160594a = r02;
        }
    }

    public c(double r2, b r4, double r5, b r7, double r8, b r10) {
        p.l(r4, "exchange");
        p.l(r7, "dayTradeExchange");
        p.l(r10, "negoOrderExchange");
        this.f160589a = r2;
        this.f160590b = r4;
        this.f160591c = r5;
        this.d = r7;
        this.f160592e = r8;
        this.f160593f = r10;
    }

    public final b a(TradingFormulaUIState.Type r2) {
        p.l(r2, "type");
        int r22 = a.f160594a[r2.ordinal()];
        if (r22 == 1) goto L17;
        if (r22 == 2) goto L17;
        if (r22 == 3) goto L15;
        if (r22 != 4) goto L13;
        return this.f160593f;
    L13:
        throw new NoWhenBranchMatchedException();
    L15:
        return this.d;
    L17:
        return this.f160590b;
    }

    public final double b(TradingFormulaUIState.Type r3) {
        p.l(r3, "type");
        int r32 = a.f160594a[r3.ordinal()];
        if (r32 == 1) goto L17;
        if (r32 == 2) goto L17;
        if (r32 == 3) goto L15;
        if (r32 != 4) goto L13;
        return this.f160592e;
    L13:
        throw new NoWhenBranchMatchedException();
    L15:
        return this.f160591c;
    L17:
        return this.f160589a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof c) == true) goto L8;
        return false;
    L8:
        c r82 = (c) r8;
        if (Double.compare(this.f160589a, r82.f160589a) == 0) goto L12;
        return false;
    L12:
        if (p.g(this.f160590b, r82.f160590b) == true) goto L15;
        return false;
    L15:
        if (Double.compare(this.f160591c, r82.f160591c) == 0) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (Double.compare(this.f160592e, r82.f160592e) == 0) goto L24;
        return false;
    L24:
        if (p.g(this.f160593f, r82.f160593f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        return (((((((((Double.hashCode(this.f160589a) * 31) + this.f160590b.hashCode()) * 31) + Double.hashCode(this.f160591c)) * 31) + this.d.hashCode()) * 31) + Double.hashCode(this.f160592e)) * 31) + this.f160593f.hashCode();
    }

    public String toString() {
        return "PreviewFeeUIState(brokerFee=" + this.f160589a + ", exchange=" + this.f160590b + ", dayTradeBrokerFee=" + this.f160591c + ", dayTradeExchange=" + this.d + ", negoOrderBrokerFee=" + this.f160592e + ", negoOrderExchange=" + this.f160593f + ")";
    }

    public /* synthetic */ c(double r26, b r28, double r29, b r31, double r32, b r34, int r35, i r36) {
        double r1 = 0.0d;
        if ((r35 & 1) == 0) goto L5;
        double r3 = 0.0d;
    L7:
        if ((r35 & 2) == 0) goto L9;
        b r5 = new b(null, null, null, null, null, 0.0d, 0.0d, 0.0d, 0.0d, 511, null);
    L11:
        if ((r35 & 4) == 0) goto L13;
        double r6 = 0.0d;
    L15:
        if ((r35 & 8) == 0) goto L17;
        b r8 = new b(null, null, null, null, null, 0.0d, 0.0d, 0.0d, 0.0d, 511, null);
    L19:
        if ((r35 & 16) != 0) goto L23;
        r1 = r32;
    L23:
        if ((r35 & 32) == 0) goto L26;
        b r352 = new b(null, null, null, null, null, 0.0d, 0.0d, 0.0d, 0.0d, 511, null);
    L27:
        this(r3, r5, r6, r8, r1, r352);
        return;
    L26:
        r352 = r34;
        goto L27
    L17:
        r8 = r31;
        goto L19
    L13:
        r6 = r29;
        goto L15
    L9:
        r5 = r28;
        goto L11
    L5:
        r3 = r26;
        goto L7
    }
}
