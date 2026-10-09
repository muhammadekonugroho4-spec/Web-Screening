package com.stockbit.usecase.sharetrade.model.type;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/stockbit/usecase/sharetrade/model/type/ShareTradeOrderStatusType;", "", "<init>", "(Ljava/lang/String;I)V", "ORDER_STATUS_OPEN", "ORDER_STATUS_MATCH", "ORDER_STATUS_AMEND", "ORDER_STATUS_CANCEL", "ORDER_STATUS_UNSPECIFIED", "Companion", "usecase-sharetrade"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum ShareTradeOrderStatusType extends Enum<ShareTradeOrderStatusType> {
    public static final a Companion = null;
    public static final ShareTradeOrderStatusType ORDER_STATUS_AMEND = null;
    public static final ShareTradeOrderStatusType ORDER_STATUS_CANCEL = null;
    public static final ShareTradeOrderStatusType ORDER_STATUS_MATCH = null;
    public static final ShareTradeOrderStatusType ORDER_STATUS_OPEN = null;
    public static final ShareTradeOrderStatusType ORDER_STATUS_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ShareTradeOrderStatusType[] f162918a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f162919b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final ShareTradeOrderStatusType a(String r2) {
            if (r2 == null) goto L26;
            switch(r2.hashCode()) {
                case -1730455990: goto L21;
                case -171244050: goto L16;
                case 2432586: goto L12;
                case 73130405: goto L7;
                default: goto L26;
            };
        L7:
            if (r2.equals("MATCH") == false) goto L26;
            return ShareTradeOrderStatusType.ORDER_STATUS_MATCH;
        L12:
            if (r2.equals("OPEN") == false) goto L26;
            return ShareTradeOrderStatusType.ORDER_STATUS_OPEN;
        L16:
            if (r2.equals("AMENDED") == false) goto L26;
            return ShareTradeOrderStatusType.ORDER_STATUS_AMEND;
        L21:
            if (r2.equals("REQUEST_CANCEL") == false) goto L26;
            return ShareTradeOrderStatusType.ORDER_STATUS_CANCEL;
        L26:
            return ShareTradeOrderStatusType.ORDER_STATUS_UNSPECIFIED;
        }

        public a() {
        }
    }

    static {
        ORDER_STATUS_OPEN = new ShareTradeOrderStatusType("ORDER_STATUS_OPEN", 0);
        ORDER_STATUS_MATCH = new ShareTradeOrderStatusType("ORDER_STATUS_MATCH", 1);
        ORDER_STATUS_AMEND = new ShareTradeOrderStatusType("ORDER_STATUS_AMEND", 2);
        ORDER_STATUS_CANCEL = new ShareTradeOrderStatusType("ORDER_STATUS_CANCEL", 3);
        ORDER_STATUS_UNSPECIFIED = new ShareTradeOrderStatusType("ORDER_STATUS_UNSPECIFIED", 4);
        ShareTradeOrderStatusType[] r02 = a();
        f162918a = r02;
        f162919b = b.a(r02);
        Companion = new a(null);
    }

    ShareTradeOrderStatusType(String r1, int r2) {
    }

    public static final /* synthetic */ ShareTradeOrderStatusType[] a() {
        return new ShareTradeOrderStatusType[]{ORDER_STATUS_OPEN, ORDER_STATUS_MATCH, ORDER_STATUS_AMEND, ORDER_STATUS_CANCEL, ORDER_STATUS_UNSPECIFIED};
    }

    public static kotlin.enums.a getEntries() {
        return f162919b;
    }

    public static ShareTradeOrderStatusType valueOf(String r1) {
        return (ShareTradeOrderStatusType) Enum.valueOf(ShareTradeOrderStatusType.class, r1);
    }

    public static ShareTradeOrderStatusType[] values() {
        return (ShareTradeOrderStatusType[]) f162918a.clone();
    }
}
