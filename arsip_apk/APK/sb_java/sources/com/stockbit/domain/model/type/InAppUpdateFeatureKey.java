package com.stockbit.domain.model.type;

import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0018"}, d2 = {"Lcom/stockbit/domain/model/type/InAppUpdateFeatureKey;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "LOGIN_SOCIAL", "LOGIN_TRADING", "OTP", "STREAM", "NEWS", "RESEARCH", "WATCHLIST", "TRADING_PAGE", "WITHDRAWAL", "DEPOSIT", "SEARCH_MARKET", "REGISTER_SEKURITAS", "MARKET", "SEARCH_GLOBAL", "SEARCH_REKSADANA", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum InAppUpdateFeatureKey extends Enum<InAppUpdateFeatureKey> {
    public static final a Companion = null;
    public static final InAppUpdateFeatureKey DEPOSIT = null;
    public static final InAppUpdateFeatureKey LOGIN_SOCIAL = null;
    public static final InAppUpdateFeatureKey LOGIN_TRADING = null;
    public static final InAppUpdateFeatureKey MARKET = null;
    public static final InAppUpdateFeatureKey NEWS = null;
    public static final InAppUpdateFeatureKey OTP = null;
    public static final InAppUpdateFeatureKey REGISTER_SEKURITAS = null;
    public static final InAppUpdateFeatureKey RESEARCH = null;
    public static final InAppUpdateFeatureKey SEARCH_GLOBAL = null;
    public static final InAppUpdateFeatureKey SEARCH_MARKET = null;
    public static final InAppUpdateFeatureKey SEARCH_REKSADANA = null;
    public static final InAppUpdateFeatureKey STREAM = null;
    public static final InAppUpdateFeatureKey TRADING_PAGE = null;
    public static final InAppUpdateFeatureKey WATCHLIST = null;
    public static final InAppUpdateFeatureKey WITHDRAWAL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ InAppUpdateFeatureKey[] f86199a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86200b = null;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        LOGIN_SOCIAL = new InAppUpdateFeatureKey("LOGIN_SOCIAL", 0, "login_social");
        LOGIN_TRADING = new InAppUpdateFeatureKey("LOGIN_TRADING", 1, "login_trading");
        OTP = new InAppUpdateFeatureKey("OTP", 2, "otp");
        STREAM = new InAppUpdateFeatureKey("STREAM", 3, "stream");
        NEWS = new InAppUpdateFeatureKey("NEWS", 4, "news");
        RESEARCH = new InAppUpdateFeatureKey("RESEARCH", 5, "research");
        WATCHLIST = new InAppUpdateFeatureKey("WATCHLIST", 6, "watchlist");
        TRADING_PAGE = new InAppUpdateFeatureKey("TRADING_PAGE", 7, "trading_page");
        WITHDRAWAL = new InAppUpdateFeatureKey("WITHDRAWAL", 8, "withdrawal");
        DEPOSIT = new InAppUpdateFeatureKey("DEPOSIT", 9, "deposit");
        SEARCH_MARKET = new InAppUpdateFeatureKey("SEARCH_MARKET", 10, "search_market");
        REGISTER_SEKURITAS = new InAppUpdateFeatureKey("REGISTER_SEKURITAS", 11, "register_sekuritas");
        MARKET = new InAppUpdateFeatureKey("MARKET", 12, "market");
        SEARCH_GLOBAL = new InAppUpdateFeatureKey("SEARCH_GLOBAL", 13, "search_global");
        SEARCH_REKSADANA = new InAppUpdateFeatureKey("SEARCH_REKSADANA", 14, "search_reksadana");
        InAppUpdateFeatureKey[] r02 = a();
        f86199a = r02;
        f86200b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    InAppUpdateFeatureKey(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ InAppUpdateFeatureKey[] a() {
        return new InAppUpdateFeatureKey[]{LOGIN_SOCIAL, LOGIN_TRADING, OTP, STREAM, NEWS, RESEARCH, WATCHLIST, TRADING_PAGE, WITHDRAWAL, DEPOSIT, SEARCH_MARKET, REGISTER_SEKURITAS, MARKET, SEARCH_GLOBAL, SEARCH_REKSADANA};
    }

    public static kotlin.enums.a getEntries() {
        return f86200b;
    }

    public static InAppUpdateFeatureKey valueOf(String r1) {
        return (InAppUpdateFeatureKey) Enum.valueOf(InAppUpdateFeatureKey.class, r1);
    }

    public static InAppUpdateFeatureKey[] values() {
        return (InAppUpdateFeatureKey[]) f86199a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
