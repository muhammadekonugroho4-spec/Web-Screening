package com.stockbit.usecase.securities.model.common;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/stockbit/usecase/securities/model/common/DayTradeInfoEventType;", "", "<init>", "(Ljava/lang/String;I)V", "EVENT_TYPE_UNSPECIFIED", "EVENT_TYPE_AVAILABLE", "EVENT_TYPE_ACCOUNT_INACTIVE", "EVENT_TYPE_DISABLE_OUTSIDE_MARKET_HOURS", "EVENT_TYPE_DISABLE_EXCEED_DEBT_RATIO", "EVENT_TYPE_DISABLE_EMPTY_TRADING_BALANCE", "EVENT_TYPE_DISABLE_MAX_DEBT_LIMIT", "Companion", "usecase-securities"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum DayTradeInfoEventType extends Enum<DayTradeInfoEventType> {
    public static final a Companion = null;
    public static final DayTradeInfoEventType EVENT_TYPE_ACCOUNT_INACTIVE = null;
    public static final DayTradeInfoEventType EVENT_TYPE_AVAILABLE = null;
    public static final DayTradeInfoEventType EVENT_TYPE_DISABLE_EMPTY_TRADING_BALANCE = null;
    public static final DayTradeInfoEventType EVENT_TYPE_DISABLE_EXCEED_DEBT_RATIO = null;
    public static final DayTradeInfoEventType EVENT_TYPE_DISABLE_MAX_DEBT_LIMIT = null;
    public static final DayTradeInfoEventType EVENT_TYPE_DISABLE_OUTSIDE_MARKET_HOURS = null;
    public static final DayTradeInfoEventType EVENT_TYPE_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ DayTradeInfoEventType[] f160416a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f160417b = null;

    public static final class a {

        /* renamed from: com.stockbit.usecase.securities.model.common.DayTradeInfoEventType$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1619a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f160418a = null;

            static {
                int[] r02 = new int[DayTradeInfoEventType.values().length];
                r02[DayTradeInfoEventType.EVENT_TYPE_ACCOUNT_INACTIVE.ordinal()] = 1;     // Catch: NoSuchFieldError -> L10
            L15:
                r02[DayTradeInfoEventType.EVENT_TYPE_DISABLE_OUTSIDE_MARKET_HOURS.ordinal()] = 2;     // Catch: NoSuchFieldError -> L11
            L23:
                r02[DayTradeInfoEventType.EVENT_TYPE_DISABLE_EXCEED_DEBT_RATIO.ordinal()] = 3;     // Catch: NoSuchFieldError -> L12
            L17:
                r02[DayTradeInfoEventType.EVENT_TYPE_DISABLE_EMPTY_TRADING_BALANCE.ordinal()] = 4;     // Catch: NoSuchFieldError -> L13
            L19:
                r02[DayTradeInfoEventType.EVENT_TYPE_DISABLE_MAX_DEBT_LIMIT.ordinal()] = 5;     // Catch: NoSuchFieldError -> L14
            L8:
                f160418a = r02;
            }
        }

        public /* synthetic */ a(i r1) {
            this();
        }

        public final DayTradeInfoEventType a(String r6) {
            DayTradeInfoEventType[] r02 = DayTradeInfoEventType.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            DayTradeInfoEventType r3 = r02[r2];
            if (p.g(r6, r3.name()) == true) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return DayTradeInfoEventType.EVENT_TYPE_UNSPECIFIED;
        L8:
            r3 = null;
            goto L9
        }

        public final boolean b(DayTradeInfoEventType r3) {
            p.l(r3, "<this>");
            int r32 = C1619a.f160418a[r3.ordinal()];
            if (r32 != 1) goto L5;
        L14:
            return true;
        L5:
            if (r32 == 2) goto L14;
            if (r32 == 3) goto L14;
            if (r32 == 4) goto L14;
            if (r32 == 5) goto L14;
            return false;
        }

        public a() {
        }
    }

    static {
        EVENT_TYPE_UNSPECIFIED = new DayTradeInfoEventType("EVENT_TYPE_UNSPECIFIED", 0);
        EVENT_TYPE_AVAILABLE = new DayTradeInfoEventType("EVENT_TYPE_AVAILABLE", 1);
        EVENT_TYPE_ACCOUNT_INACTIVE = new DayTradeInfoEventType("EVENT_TYPE_ACCOUNT_INACTIVE", 2);
        EVENT_TYPE_DISABLE_OUTSIDE_MARKET_HOURS = new DayTradeInfoEventType("EVENT_TYPE_DISABLE_OUTSIDE_MARKET_HOURS", 3);
        EVENT_TYPE_DISABLE_EXCEED_DEBT_RATIO = new DayTradeInfoEventType("EVENT_TYPE_DISABLE_EXCEED_DEBT_RATIO", 4);
        EVENT_TYPE_DISABLE_EMPTY_TRADING_BALANCE = new DayTradeInfoEventType("EVENT_TYPE_DISABLE_EMPTY_TRADING_BALANCE", 5);
        EVENT_TYPE_DISABLE_MAX_DEBT_LIMIT = new DayTradeInfoEventType("EVENT_TYPE_DISABLE_MAX_DEBT_LIMIT", 6);
        DayTradeInfoEventType[] r02 = a();
        f160416a = r02;
        f160417b = b.a(r02);
        Companion = new a(null);
    }

    DayTradeInfoEventType(String r1, int r2) {
    }

    public static final /* synthetic */ DayTradeInfoEventType[] a() {
        return new DayTradeInfoEventType[]{EVENT_TYPE_UNSPECIFIED, EVENT_TYPE_AVAILABLE, EVENT_TYPE_ACCOUNT_INACTIVE, EVENT_TYPE_DISABLE_OUTSIDE_MARKET_HOURS, EVENT_TYPE_DISABLE_EXCEED_DEBT_RATIO, EVENT_TYPE_DISABLE_EMPTY_TRADING_BALANCE, EVENT_TYPE_DISABLE_MAX_DEBT_LIMIT};
    }

    public static kotlin.enums.a getEntries() {
        return f160417b;
    }

    public static DayTradeInfoEventType valueOf(String r1) {
        return (DayTradeInfoEventType) Enum.valueOf(DayTradeInfoEventType.class, r1);
    }

    public static DayTradeInfoEventType[] values() {
        return (DayTradeInfoEventType[]) f160416a.clone();
    }
}
