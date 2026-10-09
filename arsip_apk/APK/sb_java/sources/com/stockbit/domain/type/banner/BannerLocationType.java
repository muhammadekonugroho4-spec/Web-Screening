package com.stockbit.domain.type.banner;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/stockbit/domain/type/banner/BannerLocationType;", "", "<init>", "(Ljava/lang/String;I)V", "LOCATION_UNSPECIFIED", "LOCATION_PORTFOLIO", "LOCATION_ORDER_LIST", "LOCATION_PORTFOLIO_MARGIN", "Companion", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum BannerLocationType extends Enum<BannerLocationType> {
    public static final a Companion = null;
    public static final BannerLocationType LOCATION_ORDER_LIST = null;
    public static final BannerLocationType LOCATION_PORTFOLIO = null;
    public static final BannerLocationType LOCATION_PORTFOLIO_MARGIN = null;
    public static final BannerLocationType LOCATION_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BannerLocationType[] f87664a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f87665b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final BannerLocationType a(String r6) {
            BannerLocationType[] r02 = BannerLocationType.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            BannerLocationType r3 = r02[r2];
            if (p.g(r6, r3.name()) == true) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return BannerLocationType.LOCATION_UNSPECIFIED;
        L8:
            r3 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        LOCATION_UNSPECIFIED = new BannerLocationType("LOCATION_UNSPECIFIED", 0);
        LOCATION_PORTFOLIO = new BannerLocationType("LOCATION_PORTFOLIO", 1);
        LOCATION_ORDER_LIST = new BannerLocationType("LOCATION_ORDER_LIST", 2);
        LOCATION_PORTFOLIO_MARGIN = new BannerLocationType("LOCATION_PORTFOLIO_MARGIN", 3);
        BannerLocationType[] r02 = a();
        f87664a = r02;
        f87665b = b.a(r02);
        Companion = new a(null);
    }

    BannerLocationType(String r1, int r2) {
    }

    public static final /* synthetic */ BannerLocationType[] a() {
        return new BannerLocationType[]{LOCATION_UNSPECIFIED, LOCATION_PORTFOLIO, LOCATION_ORDER_LIST, LOCATION_PORTFOLIO_MARGIN};
    }

    public static kotlin.enums.a getEntries() {
        return f87665b;
    }

    public static BannerLocationType valueOf(String r1) {
        return (BannerLocationType) Enum.valueOf(BannerLocationType.class, r1);
    }

    public static BannerLocationType[] values() {
        return (BannerLocationType[]) f87664a.clone();
    }
}
