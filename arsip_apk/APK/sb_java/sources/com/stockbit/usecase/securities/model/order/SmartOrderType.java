package com.stockbit.usecase.securities.model.order;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lcom/stockbit/usecase/securities/model/order/SmartOrderType;", "", Constants.KEY_ID, "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getValue", "TP", "SL", "AB", "LIT", "LIT_SELL", "TS", "BO", "VTO", "Companion", "usecase-securities"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum SmartOrderType extends Enum<SmartOrderType> {
    public static final SmartOrderType AB = null;
    public static final SmartOrderType BO = null;
    public static final a Companion = null;
    public static final SmartOrderType LIT = null;
    public static final SmartOrderType LIT_SELL = null;
    public static final SmartOrderType SL = null;
    public static final SmartOrderType TP = null;
    public static final SmartOrderType TS = null;
    public static final SmartOrderType VTO = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SmartOrderType[] f161206a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f161207b = null;

    /* renamed from: id, reason: collision with root package name */
    private final String f161208id;
    private final String value;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        TP = new SmartOrderType("TP", 0, "TP", "Take Profit");
        SL = new SmartOrderType("SL", 1, "SL", "Stop Loss");
        AB = new SmartOrderType("AB", 2, "AB", "Auto Buy");
        LIT = new SmartOrderType("LIT", 3, "LIT", "Limit If Touched");
        LIT_SELL = new SmartOrderType("LIT_SELL", 4, "LIT_SELL", "Limit If Touched");
        TS = new SmartOrderType("TS", 5, "TS", "Trailing Stop");
        BO = new SmartOrderType("BO", 6, "BO", "Bracket Order");
        VTO = new SmartOrderType("VTO", 7, "VTO", "Volume Trigger Order");
        SmartOrderType[] r02 = a();
        f161206a = r02;
        f161207b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    SmartOrderType(String r1, int r2, String r3, String r4) {
        this.f161208id = r3;
        this.value = r4;
    }

    public static final /* synthetic */ SmartOrderType[] a() {
        return new SmartOrderType[]{TP, SL, AB, LIT, LIT_SELL, TS, BO, VTO};
    }

    public static kotlin.enums.a getEntries() {
        return f161207b;
    }

    public static SmartOrderType valueOf(String r1) {
        return (SmartOrderType) Enum.valueOf(SmartOrderType.class, r1);
    }

    public static SmartOrderType[] values() {
        return (SmartOrderType[]) f161206a.clone();
    }

    public final String getId() {
        return this.f161208id;
    }

    public final String getValue() {
        return this.value;
    }
}
