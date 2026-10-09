package com.stockbit.setting.contract;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/stockbit/setting/contract/OpenSettingSource;", "", "trackingValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getTrackingValue", "()Ljava/lang/String;", "Watchlist", "Stream", "Search", "Chat", "Portfolio", "setting-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum OpenSettingSource extends Enum<OpenSettingSource> {
    public static final OpenSettingSource Chat = null;
    public static final OpenSettingSource Portfolio = null;
    public static final OpenSettingSource Search = null;
    public static final OpenSettingSource Stream = null;
    public static final OpenSettingSource Watchlist = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OpenSettingSource[] f135654a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f135655b = null;
    private final String trackingValue;

    static {
        Watchlist = new OpenSettingSource("Watchlist", 0, "watchlist");
        Stream = new OpenSettingSource("Stream", 1, "Stream");
        Search = new OpenSettingSource("Search", 2, FirebaseAnalytics.Event.SEARCH);
        Chat = new OpenSettingSource("Chat", 3, "chat");
        Portfolio = new OpenSettingSource("Portfolio", 4, "portfolio");
        OpenSettingSource[] r02 = a();
        f135654a = r02;
        f135655b = kotlin.enums.b.a(r02);
    }

    OpenSettingSource(String r1, int r2, String r3) {
        this.trackingValue = r3;
    }

    public static final /* synthetic */ OpenSettingSource[] a() {
        return new OpenSettingSource[]{Watchlist, Stream, Search, Chat, Portfolio};
    }

    public static kotlin.enums.a getEntries() {
        return f135655b;
    }

    public static OpenSettingSource valueOf(String r1) {
        return (OpenSettingSource) Enum.valueOf(OpenSettingSource.class, r1);
    }

    public static OpenSettingSource[] values() {
        return (OpenSettingSource[]) f135654a.clone();
    }

    public final String getTrackingValue() {
        return this.trackingValue;
    }
}
