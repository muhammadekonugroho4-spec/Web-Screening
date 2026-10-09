package com.stockbit.component.securities.stock.model;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/stockbit/component/securities/stock/model/NotationListViewType;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "GENERIC", "SPECIFIC", "UMA", "DT_MULTIPLIER", "TRADING_LIMIT", "BADGE", "Companion", "securities_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum NotationListViewType extends Enum<NotationListViewType> {
    public static final NotationListViewType BADGE = null;
    public static final a Companion = null;
    public static final NotationListViewType DT_MULTIPLIER = null;
    public static final NotationListViewType GENERIC = null;
    public static final NotationListViewType SPECIFIC = null;
    public static final NotationListViewType TRADING_LIMIT = null;
    public static final NotationListViewType UMA = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ NotationListViewType[] f76444a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f76445b = null;
    private final int value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final NotationListViewType a(int r4) {
            Iterator<E> r02 = NotationListViewType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (((NotationListViewType) r1).getValue() != r4) goto L4;
        L9:
            NotationListViewType r12 = (NotationListViewType) r1;
            if (r12 == null) goto L12;
            return r12;
        L12:
            return NotationListViewType.GENERIC;
        L8:
            r1 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        GENERIC = new NotationListViewType("GENERIC", 0, 1);
        SPECIFIC = new NotationListViewType("SPECIFIC", 1, 2);
        UMA = new NotationListViewType("UMA", 2, 3);
        DT_MULTIPLIER = new NotationListViewType("DT_MULTIPLIER", 3, 4);
        TRADING_LIMIT = new NotationListViewType("TRADING_LIMIT", 4, 5);
        BADGE = new NotationListViewType("BADGE", 5, 6);
        NotationListViewType[] r02 = a();
        f76444a = r02;
        f76445b = b.a(r02);
        Companion = new a(null);
    }

    NotationListViewType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static final /* synthetic */ NotationListViewType[] a() {
        return new NotationListViewType[]{GENERIC, SPECIFIC, UMA, DT_MULTIPLIER, TRADING_LIMIT, BADGE};
    }

    public static kotlin.enums.a getEntries() {
        return f76445b;
    }

    public static NotationListViewType valueOf(String r1) {
        return (NotationListViewType) Enum.valueOf(NotationListViewType.class, r1);
    }

    public static NotationListViewType[] values() {
        return (NotationListViewType[]) f76444a.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
