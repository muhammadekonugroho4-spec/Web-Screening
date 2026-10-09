package com.stockbit.domain.model.securities.order;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.text.y;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/stockbit/domain/model/securities/order/DividendActionType;", "", "raw", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRaw", "()Ljava/lang/String;", "UNSPECIFIED", "DIVIDEND_CASH", "DIVIDEND_STOCK", "BONUS_STOCK", "Companion", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum DividendActionType extends Enum<DividendActionType> {
    public static final DividendActionType BONUS_STOCK = null;
    public static final a Companion = null;
    public static final DividendActionType DIVIDEND_CASH = null;
    public static final DividendActionType DIVIDEND_STOCK = null;
    public static final DividendActionType UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ DividendActionType[] f85385a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f85386b = null;
    private final String raw;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final DividendActionType a(String r5) {
            Iterator<E> r02 = DividendActionType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (y.J(((DividendActionType) r1).getRaw(), r5, true) == false) goto L4;
        L9:
            DividendActionType r12 = (DividendActionType) r1;
            if (r12 == null) goto L12;
            return r12;
        L12:
            return DividendActionType.UNSPECIFIED;
        L8:
            r1 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        UNSPECIFIED = new DividendActionType("UNSPECIFIED", 0, "ACTION_TYPE_UNSPECIFIED");
        DIVIDEND_CASH = new DividendActionType("DIVIDEND_CASH", 1, "ACTION_TYPE_DIVIDEND_CASH");
        DIVIDEND_STOCK = new DividendActionType("DIVIDEND_STOCK", 2, "ACTION_TYPE_DIVIDEND_STOCK");
        BONUS_STOCK = new DividendActionType("BONUS_STOCK", 3, "ACTION_TYPE_BONUS_STOCK");
        DividendActionType[] r02 = a();
        f85385a = r02;
        f85386b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    DividendActionType(String r1, int r2, String r3) {
        this.raw = r3;
    }

    public static final /* synthetic */ DividendActionType[] a() {
        return new DividendActionType[]{UNSPECIFIED, DIVIDEND_CASH, DIVIDEND_STOCK, BONUS_STOCK};
    }

    public static kotlin.enums.a getEntries() {
        return f85386b;
    }

    public static DividendActionType valueOf(String r1) {
        return (DividendActionType) Enum.valueOf(DividendActionType.class, r1);
    }

    public static DividendActionType[] values() {
        return (DividendActionType[]) f85385a.clone();
    }

    public final String getRaw() {
        return this.raw;
    }
}
