package com.stockbit.domain.model.markettime;

import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/stockbit/domain/model/markettime/MarketStatus;", "", "<init>", "(Ljava/lang/String;I)V", "OPEN", "CLOSE", "BREAK", "Companion", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum MarketStatus extends Enum<MarketStatus> {
    public static final MarketStatus BREAK = null;
    public static final MarketStatus CLOSE = null;
    public static final a Companion = null;
    public static final MarketStatus OPEN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ MarketStatus[] f84314a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f84315b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final MarketStatus a(String r2) {
            p.l(r2, "stateName");
            int r02 = r2.hashCode();
            switch(r02) {
                case -1447869226: goto L44;
                case -1098790442: goto L39;
                case -926553415: goto L34;
                case -741650917: goto L31;
                case 713231580: goto L28;
                case 1030934835: goto L25;
                case 1919016617: goto L22;
                default: goto L4;
            };
        L4:
            switch(r02) {
                case 1600348546: goto L19;
                case 1600348547: goto L16;
                case 1600348548: goto L13;
                case 1600348549: goto L10;
                case 1600348550: goto L7;
                default: goto L46;
            };
        L7:
            if (r2.equals("STATE_NAME_SESSION_5") == false) goto L46;
        L42:
            return MarketStatus.OPEN;
        L10:
            if (r2.equals("STATE_NAME_SESSION_4") == true) goto L42;
        L13:
            if (r2.equals("STATE_NAME_SESSION_3") == true) goto L42;
        L16:
            if (r2.equals("STATE_NAME_SESSION_2") == true) goto L42;
        L19:
            if (r2.equals("STATE_NAME_SESSION_1") == true) goto L42;
        L46:
            return MarketStatus.CLOSE;
        L22:
            if (r2.equals("STATE_NAME_MARKET_CLOSED") == false) goto L46;
        L48:
            return MarketStatus.CLOSE;
        L25:
            if (r2.equals("STATE_NAME_PRE_CLOSING") == true) goto L42;
        L28:
            if (r2.equals("STATE_NAME_POST_CLOSING") == false) goto L46;
        L31:
            if (r2.equals("STATE_NAME_NEGOTIATION") == true) goto L48;
        L34:
            if (r2.equals("STATE_NAME_BREAK") == false) goto L46;
            return MarketStatus.BREAK;
        L39:
            if (r2.equals("STATE_NAME_PRE_OPENING") == true) goto L42;
        L44:
            if (r2.equals("STATE_NAME_BEFORE_MARKET") == true) goto L48;
            goto L46
        }

        public a() {
        }
    }

    static {
        OPEN = new MarketStatus("OPEN", 0);
        CLOSE = new MarketStatus("CLOSE", 1);
        BREAK = new MarketStatus("BREAK", 2);
        MarketStatus[] r02 = a();
        f84314a = r02;
        f84315b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    MarketStatus(String r1, int r2) {
    }

    public static final /* synthetic */ MarketStatus[] a() {
        return new MarketStatus[]{OPEN, CLOSE, BREAK};
    }

    public static kotlin.enums.a getEntries() {
        return f84315b;
    }

    public static MarketStatus valueOf(String r1) {
        return (MarketStatus) Enum.valueOf(MarketStatus.class, r1);
    }

    public static MarketStatus[] values() {
        return (MarketStatus[]) f84314a.clone();
    }
}
