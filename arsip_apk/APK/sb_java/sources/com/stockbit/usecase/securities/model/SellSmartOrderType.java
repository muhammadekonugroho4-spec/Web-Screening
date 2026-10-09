package com.stockbit.usecase.securities.model;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/stockbit/usecase/securities/model/SellSmartOrderType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ORDER_TYPE_LIMIT", "ORDER_TYPE_MARKET", "ORDER_TYPE_UNSPECIFIED", "Companion", "usecase-securities"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum SellSmartOrderType extends Enum<SellSmartOrderType> {
    public static final a Companion = null;
    public static final SellSmartOrderType ORDER_TYPE_LIMIT = null;
    public static final SellSmartOrderType ORDER_TYPE_MARKET = null;
    public static final SellSmartOrderType ORDER_TYPE_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SellSmartOrderType[] f160330a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f160331b = null;
    private final String value;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final SellSmartOrderType a(String r4) {
            p.l(r4, "value");
            Iterator<E> r02 = SellSmartOrderType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (p.g(((SellSmartOrderType) r1).name(), r4) == false) goto L4;
        L9:
            SellSmartOrderType r12 = (SellSmartOrderType) r1;
            if (r12 == null) goto L12;
            return r12;
        L12:
            return SellSmartOrderType.ORDER_TYPE_UNSPECIFIED;
        L8:
            r1 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        ORDER_TYPE_LIMIT = new SellSmartOrderType("ORDER_TYPE_LIMIT", 0, "Limit");
        ORDER_TYPE_MARKET = new SellSmartOrderType("ORDER_TYPE_MARKET", 1, "Market");
        ORDER_TYPE_UNSPECIFIED = new SellSmartOrderType("ORDER_TYPE_UNSPECIFIED", 2, "");
        SellSmartOrderType[] r02 = a();
        f160330a = r02;
        f160331b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    SellSmartOrderType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ SellSmartOrderType[] a() {
        return new SellSmartOrderType[]{ORDER_TYPE_LIMIT, ORDER_TYPE_MARKET, ORDER_TYPE_UNSPECIFIED};
    }

    public static kotlin.enums.a getEntries() {
        return f160331b;
    }

    public static SellSmartOrderType valueOf(String r1) {
        return (SellSmartOrderType) Enum.valueOf(SellSmartOrderType.class, r1);
    }

    public static SellSmartOrderType[] values() {
        return (SellSmartOrderType[]) f160330a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
