package com.stockbit.domain.model.type.stream;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/stockbit/domain/model/type/stream/ShareTradeType;", "", "value", "", "tracker", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getTracker", "ORDER_TYPE_UNSPECIFIED", "ORDER_TYPE_BUY", "ORDER_TYPE_SELL", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum ShareTradeType extends Enum<ShareTradeType> {
    public static final a Companion = null;
    public static final ShareTradeType ORDER_TYPE_BUY = null;
    public static final ShareTradeType ORDER_TYPE_SELL = null;
    public static final ShareTradeType ORDER_TYPE_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ShareTradeType[] f86473a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86474b = null;
    private final String tracker;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final ShareTradeType a(String r1) {
            if (r1 != null) goto L8;
            r1 = "";
        L8:
            return ShareTradeType.valueOf(r1);
        L7:
            return ShareTradeType.ORDER_TYPE_UNSPECIFIED;
        }

        public a() {
        }
    }

    static {
        ORDER_TYPE_UNSPECIFIED = new ShareTradeType("ORDER_TYPE_UNSPECIFIED", 0, "ORDER_TYPE_UNSPECIFIED", "Unspecified");
        ORDER_TYPE_BUY = new ShareTradeType("ORDER_TYPE_BUY", 1, "ORDER_TYPE_BUY", "Buy");
        ORDER_TYPE_SELL = new ShareTradeType("ORDER_TYPE_SELL", 2, "ORDER_TYPE_SELL", "Sell");
        ShareTradeType[] r02 = a();
        f86473a = r02;
        f86474b = b.a(r02);
        Companion = new a(null);
    }

    ShareTradeType(String r1, int r2, String r3, String r4) {
        this.value = r3;
        this.tracker = r4;
    }

    public static final /* synthetic */ ShareTradeType[] a() {
        return new ShareTradeType[]{ORDER_TYPE_UNSPECIFIED, ORDER_TYPE_BUY, ORDER_TYPE_SELL};
    }

    public static kotlin.enums.a getEntries() {
        return f86474b;
    }

    public static ShareTradeType valueOf(String r1) {
        return (ShareTradeType) Enum.valueOf(ShareTradeType.class, r1);
    }

    public static ShareTradeType[] values() {
        return (ShareTradeType[]) f86473a.clone();
    }

    public final String getTracker() {
        return this.tracker;
    }

    public final String getValue() {
        return this.value;
    }
}
