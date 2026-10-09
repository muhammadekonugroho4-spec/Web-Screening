package com.stockbit.domain.model.securities.account;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/stockbit/domain/model/securities/account/PortfolioPurposeType;", "", "<init>", "(Ljava/lang/String;I)V", "PURPOSE_UNSPECIFIED", "PURPOSE_TRADING", "PURPOSE_LONG_TERM_INVESTING", "PURPOSE_SHORT_TERM_INVESTING", "Companion", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum PortfolioPurposeType extends Enum<PortfolioPurposeType> {
    public static final a Companion = null;
    public static final PortfolioPurposeType PURPOSE_LONG_TERM_INVESTING = null;
    public static final PortfolioPurposeType PURPOSE_SHORT_TERM_INVESTING = null;
    public static final PortfolioPurposeType PURPOSE_TRADING = null;
    public static final PortfolioPurposeType PURPOSE_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PortfolioPurposeType[] f85008a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f85009b = null;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final PortfolioPurposeType a(String r4) {
            Iterator<E> r02 = PortfolioPurposeType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (p.g(((PortfolioPurposeType) r1).name(), r4) == false) goto L4;
        L9:
            PortfolioPurposeType r12 = (PortfolioPurposeType) r1;
            if (r12 == null) goto L12;
            return r12;
        L12:
            return PortfolioPurposeType.PURPOSE_UNSPECIFIED;
        L8:
            r1 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        PURPOSE_UNSPECIFIED = new PortfolioPurposeType("PURPOSE_UNSPECIFIED", 0);
        PURPOSE_TRADING = new PortfolioPurposeType("PURPOSE_TRADING", 1);
        PURPOSE_LONG_TERM_INVESTING = new PortfolioPurposeType("PURPOSE_LONG_TERM_INVESTING", 2);
        PURPOSE_SHORT_TERM_INVESTING = new PortfolioPurposeType("PURPOSE_SHORT_TERM_INVESTING", 3);
        PortfolioPurposeType[] r02 = a();
        f85008a = r02;
        f85009b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    PortfolioPurposeType(String r1, int r2) {
    }

    public static final /* synthetic */ PortfolioPurposeType[] a() {
        return new PortfolioPurposeType[]{PURPOSE_UNSPECIFIED, PURPOSE_TRADING, PURPOSE_LONG_TERM_INVESTING, PURPOSE_SHORT_TERM_INVESTING};
    }

    public static kotlin.enums.a getEntries() {
        return f85009b;
    }

    public static PortfolioPurposeType valueOf(String r1) {
        return (PortfolioPurposeType) Enum.valueOf(PortfolioPurposeType.class, r1);
    }

    public static PortfolioPurposeType[] values() {
        return (PortfolioPurposeType[]) f85008a.clone();
    }
}
