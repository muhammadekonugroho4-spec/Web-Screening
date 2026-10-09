package com.stockbit.domain.type;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/stockbit/domain/type/OrderExpiryType;", "", "raw", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRaw", "()Ljava/lang/String;", "Unspecified", "GTC", "GFD", "FAK", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum OrderExpiryType extends Enum<OrderExpiryType> {
    public static final OrderExpiryType FAK = null;
    public static final OrderExpiryType GFD = null;
    public static final OrderExpiryType GTC = null;
    public static final OrderExpiryType Unspecified = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OrderExpiryType[] f87654a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f87655b = null;
    private final String raw;

    static {
        Unspecified = new OrderExpiryType("Unspecified", 0, "ORDER_EXPIRY_TYPE_UNSPECIFIED");
        GTC = new OrderExpiryType("GTC", 1, "ORDER_EXPIRY_TYPE_GTC");
        GFD = new OrderExpiryType("GFD", 2, "ORDER_EXPIRY_TYPE_GFD");
        FAK = new OrderExpiryType("FAK", 3, "ORDER_EXPIRY_TYPE_FAK");
        OrderExpiryType[] r02 = a();
        f87654a = r02;
        f87655b = b.a(r02);
    }

    OrderExpiryType(String r1, int r2, String r3) {
        this.raw = r3;
    }

    public static final /* synthetic */ OrderExpiryType[] a() {
        return new OrderExpiryType[]{Unspecified, GTC, GFD, FAK};
    }

    public static a getEntries() {
        return f87655b;
    }

    public static OrderExpiryType valueOf(String r1) {
        return (OrderExpiryType) Enum.valueOf(OrderExpiryType.class, r1);
    }

    public static OrderExpiryType[] values() {
        return (OrderExpiryType[]) f87654a.clone();
    }

    public final String getRaw() {
        return this.raw;
    }
}
