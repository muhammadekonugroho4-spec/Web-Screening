package com.stockbit.domain.model.type.securities;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/stockbit/domain/model/type/securities/TradingOrderlistStatusType;", "", "value", "", Constants.KEY_TITLE, "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getValue", "()I", "getTitle", "()Ljava/lang/String;", "GTA", "GTC", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum TradingOrderlistStatusType extends Enum<TradingOrderlistStatusType> {
    public static final a Companion = null;
    public static final TradingOrderlistStatusType GTA = null;
    public static final TradingOrderlistStatusType GTC = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TradingOrderlistStatusType[] f86449a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86450b = null;
    private final String title;
    private final int value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        GTA = new TradingOrderlistStatusType("GTA", 0, 0, "DAY");
        GTC = new TradingOrderlistStatusType("GTC", 1, 1, "GTC");
        TradingOrderlistStatusType[] r02 = a();
        f86449a = r02;
        f86450b = b.a(r02);
        Companion = new a(null);
    }

    TradingOrderlistStatusType(String r1, int r2, int r3, String r4) {
        this.value = r3;
        this.title = r4;
    }

    public static final /* synthetic */ TradingOrderlistStatusType[] a() {
        return new TradingOrderlistStatusType[]{GTA, GTC};
    }

    public static kotlin.enums.a getEntries() {
        return f86450b;
    }

    public static TradingOrderlistStatusType valueOf(String r1) {
        return (TradingOrderlistStatusType) Enum.valueOf(TradingOrderlistStatusType.class, r1);
    }

    public static TradingOrderlistStatusType[] values() {
        return (TradingOrderlistStatusType[]) f86449a.clone();
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getValue() {
        return this.value;
    }
}
