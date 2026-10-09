package com.stockbit.usecase.securities.model.portfolio;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/stockbit/usecase/securities/model/portfolio/PortfolioFilterType;", "", "<init>", "(Ljava/lang/String;I)V", "STOCKS", "BONDS", "MARGIN", "PORTFOLIO", "Companion", "usecase-securities"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum PortfolioFilterType extends Enum<PortfolioFilterType> {
    public static final PortfolioFilterType BONDS = null;
    public static final a Companion = null;
    public static final PortfolioFilterType MARGIN = null;
    public static final PortfolioFilterType PORTFOLIO = null;
    public static final PortfolioFilterType STOCKS = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PortfolioFilterType[] f161702a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f161703b = null;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final PortfolioFilterType a(String r4) {
            Iterator<E> r02 = PortfolioFilterType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (kotlin.jvm.internal.p.g(((PortfolioFilterType) r1).name(), r4) == false) goto L4;
        L9:
            PortfolioFilterType r12 = (PortfolioFilterType) r1;
            if (r12 == null) goto L12;
            return r12;
        L12:
            return PortfolioFilterType.STOCKS;
        L8:
            r1 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        STOCKS = new PortfolioFilterType("STOCKS", 0);
        BONDS = new PortfolioFilterType("BONDS", 1);
        MARGIN = new PortfolioFilterType("MARGIN", 2);
        PORTFOLIO = new PortfolioFilterType("PORTFOLIO", 3);
        PortfolioFilterType[] r02 = a();
        f161702a = r02;
        f161703b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    PortfolioFilterType(String r1, int r2) {
    }

    public static final /* synthetic */ PortfolioFilterType[] a() {
        return new PortfolioFilterType[]{STOCKS, BONDS, MARGIN, PORTFOLIO};
    }

    public static kotlin.enums.a getEntries() {
        return f161703b;
    }

    public static PortfolioFilterType valueOf(String r1) {
        return (PortfolioFilterType) Enum.valueOf(PortfolioFilterType.class, r1);
    }

    public static PortfolioFilterType[] values() {
        return (PortfolioFilterType[]) f161702a.clone();
    }
}
