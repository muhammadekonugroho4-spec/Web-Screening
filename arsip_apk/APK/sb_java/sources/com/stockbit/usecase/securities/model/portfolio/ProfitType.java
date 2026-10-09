package com.stockbit.usecase.securities.model.portfolio;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/stockbit/usecase/securities/model/portfolio/ProfitType;", "", "sign", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getSign", "()Ljava/lang/String;", "GAIN", "LOSS", "NEUTRAL", "Companion", "usecase-securities"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum ProfitType extends Enum<ProfitType> {
    public static final a Companion = null;
    public static final ProfitType GAIN = null;
    public static final ProfitType LOSS = null;
    public static final ProfitType NEUTRAL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ProfitType[] f161704a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f161705b = null;
    private final String sign;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final ProfitType a(double r4) {
            if (r4 >= 0.0d) goto L7;
            return ProfitType.LOSS;
        L7:
            if (r4 <= 0.0d) goto L11;
            return ProfitType.GAIN;
        L11:
            return ProfitType.NEUTRAL;
        }

        public final ProfitType b(String r5) {
            kotlin.jvm.internal.p.l(r5, "value");
            if (kotlin.text.B.g0(r5, "-", false, 2, null) == false) goto L7;
            return ProfitType.LOSS;
        L7:
            if (kotlin.text.B.g0(r5, "+", false, 2, null) == false) goto L11;
            return ProfitType.GAIN;
        L11:
            return ProfitType.NEUTRAL;
        }

        public a() {
        }
    }

    static {
        GAIN = new ProfitType("GAIN", 0, "+");
        LOSS = new ProfitType("LOSS", 1, "-");
        NEUTRAL = new ProfitType("NEUTRAL", 2, "");
        ProfitType[] r02 = a();
        f161704a = r02;
        f161705b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    ProfitType(String r1, int r2, String r3) {
        this.sign = r3;
    }

    public static final /* synthetic */ ProfitType[] a() {
        return new ProfitType[]{GAIN, LOSS, NEUTRAL};
    }

    public static kotlin.enums.a getEntries() {
        return f161705b;
    }

    public static ProfitType valueOf(String r1) {
        return (ProfitType) Enum.valueOf(ProfitType.class, r1);
    }

    public static ProfitType[] values() {
        return (ProfitType[]) f161704a.clone();
    }

    public final String getSign() {
        return this.sign;
    }
}
