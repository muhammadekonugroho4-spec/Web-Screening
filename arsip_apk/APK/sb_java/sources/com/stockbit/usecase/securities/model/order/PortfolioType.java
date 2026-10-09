package com.stockbit.usecase.securities.model.order;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/stockbit/usecase/securities/model/order/PortfolioType;", "", "<init>", "(Ljava/lang/String;I)V", "UNSPECIFIED", "DAY_TRADE", "REGULAR", "MARGIN", "Companion", "usecase-securities"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum PortfolioType extends Enum<PortfolioType> {
    public static final a Companion = null;
    public static final PortfolioType DAY_TRADE = null;
    public static final PortfolioType MARGIN = null;
    public static final PortfolioType REGULAR = null;
    public static final PortfolioType UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PortfolioType[] f161194a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f161195b = null;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final PortfolioType a(String r4) {
            Iterator<E> r02 = PortfolioType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (kotlin.jvm.internal.p.g(((PortfolioType) r1).name(), r4) == false) goto L4;
        L9:
            PortfolioType r12 = (PortfolioType) r1;
            if (r12 == null) goto L12;
            return r12;
        L12:
            return PortfolioType.UNSPECIFIED;
        L8:
            r1 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        UNSPECIFIED = new PortfolioType("UNSPECIFIED", 0);
        DAY_TRADE = new PortfolioType("DAY_TRADE", 1);
        REGULAR = new PortfolioType("REGULAR", 2);
        MARGIN = new PortfolioType("MARGIN", 3);
        PortfolioType[] r02 = a();
        f161194a = r02;
        f161195b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    PortfolioType(String r1, int r2) {
    }

    public static final /* synthetic */ PortfolioType[] a() {
        return new PortfolioType[]{UNSPECIFIED, DAY_TRADE, REGULAR, MARGIN};
    }

    public static kotlin.enums.a getEntries() {
        return f161195b;
    }

    public static PortfolioType valueOf(String r1) {
        return (PortfolioType) Enum.valueOf(PortfolioType.class, r1);
    }

    public static PortfolioType[] values() {
        return (PortfolioType[]) f161194a.clone();
    }
}
