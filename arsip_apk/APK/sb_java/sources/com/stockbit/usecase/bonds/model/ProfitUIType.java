package com.stockbit.usecase.bonds.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/stockbit/usecase/bonds/model/ProfitUIType;", "", "sign", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getSign", "()Ljava/lang/String;", "GAIN", "LOSS", "NEUTRAL", "Companion", "usecase-bonds"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum ProfitUIType extends Enum<ProfitUIType> {
    public static final a Companion = null;
    public static final ProfitUIType GAIN = null;
    public static final ProfitUIType LOSS = null;
    public static final ProfitUIType NEUTRAL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ProfitUIType[] f154517a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f154518b = null;
    private final String sign;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final ProfitUIType a(double r4) {
            if (r4 >= 0.0d) goto L7;
            return ProfitUIType.LOSS;
        L7:
            if (r4 <= 0.0d) goto L11;
            return ProfitUIType.GAIN;
        L11:
            return ProfitUIType.NEUTRAL;
        }

        public a() {
        }
    }

    static {
        GAIN = new ProfitUIType("GAIN", 0, "+");
        LOSS = new ProfitUIType("LOSS", 1, "-");
        NEUTRAL = new ProfitUIType("NEUTRAL", 2, "");
        ProfitUIType[] r02 = a();
        f154517a = r02;
        f154518b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    ProfitUIType(String r1, int r2, String r3) {
        this.sign = r3;
    }

    public static final /* synthetic */ ProfitUIType[] a() {
        return new ProfitUIType[]{GAIN, LOSS, NEUTRAL};
    }

    public static kotlin.enums.a getEntries() {
        return f154518b;
    }

    public static ProfitUIType valueOf(String r1) {
        return (ProfitUIType) Enum.valueOf(ProfitUIType.class, r1);
    }

    public static ProfitUIType[] values() {
        return (ProfitUIType[]) f154517a.clone();
    }

    public final String getSign() {
        return this.sign;
    }
}
