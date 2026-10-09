package com.stockbit.usecase.transaction.model.type;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/stockbit/usecase/transaction/model/type/CounterPartySideType;", "", "value", "", "type", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getType", "ALL", "BUY", "SELL", "Companion", "usecase-transaction"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum CounterPartySideType extends Enum<CounterPartySideType> {
    public static final CounterPartySideType ALL = null;
    public static final CounterPartySideType BUY = null;
    public static final a Companion = null;
    public static final CounterPartySideType SELL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CounterPartySideType[] f163948a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f163949b = null;
    private final String type;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final CounterPartySideType a(String r4) {
            p.l(r4, "value");
            Iterator<E> r02 = CounterPartySideType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (p.g(((CounterPartySideType) r1).getValue(), r4) == false) goto L4;
        L9:
            CounterPartySideType r12 = (CounterPartySideType) r1;
            if (r12 == null) goto L12;
            return r12;
        L12:
            return CounterPartySideType.BUY;
        L8:
            r1 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        ALL = new CounterPartySideType("ALL", 0, "ALL", "");
        BUY = new CounterPartySideType("BUY", 1, "ORDER_SIDE_BUY", "bid");
        SELL = new CounterPartySideType("SELL", 2, "ORDER_SIDE_SELL", "offer");
        CounterPartySideType[] r02 = a();
        f163948a = r02;
        f163949b = b.a(r02);
        Companion = new a(null);
    }

    CounterPartySideType(String r1, int r2, String r3, String r4) {
        this.value = r3;
        this.type = r4;
    }

    public static final /* synthetic */ CounterPartySideType[] a() {
        return new CounterPartySideType[]{ALL, BUY, SELL};
    }

    public static kotlin.enums.a getEntries() {
        return f163949b;
    }

    public static CounterPartySideType valueOf(String r1) {
        return (CounterPartySideType) Enum.valueOf(CounterPartySideType.class, r1);
    }

    public static CounterPartySideType[] values() {
        return (CounterPartySideType[]) f163948a.clone();
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }
}
