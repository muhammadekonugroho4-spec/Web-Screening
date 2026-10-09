package com.stockbit.domain.model.company.keystats;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/stockbit/domain/model/company/keystats/KeyStatsItemType;", "", "<init>", "(Ljava/lang/String;I)V", "TYPE_INFO_BANNER", "TYPE_FILTER_OPTION", "TYPE_HEADER", "TYPE_ITEM_VALUE", "TYPE_ITEM_VALUES", "TYPE_HEADER_VALUES", "TYPE_DIVIDEND_HEADER", "TYPE_DIVIDEND_ITEM", "TYPE_PERIOD", "TYPE_PRICE_PERFORMANCE", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum KeyStatsItemType extends Enum<KeyStatsItemType> {
    public static final KeyStatsItemType TYPE_DIVIDEND_HEADER = null;
    public static final KeyStatsItemType TYPE_DIVIDEND_ITEM = null;
    public static final KeyStatsItemType TYPE_FILTER_OPTION = null;
    public static final KeyStatsItemType TYPE_HEADER = null;
    public static final KeyStatsItemType TYPE_HEADER_VALUES = null;
    public static final KeyStatsItemType TYPE_INFO_BANNER = null;
    public static final KeyStatsItemType TYPE_ITEM_VALUE = null;
    public static final KeyStatsItemType TYPE_ITEM_VALUES = null;
    public static final KeyStatsItemType TYPE_PERIOD = null;
    public static final KeyStatsItemType TYPE_PRICE_PERFORMANCE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ KeyStatsItemType[] f81647a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f81648b = null;

    static {
        TYPE_INFO_BANNER = new KeyStatsItemType("TYPE_INFO_BANNER", 0);
        TYPE_FILTER_OPTION = new KeyStatsItemType("TYPE_FILTER_OPTION", 1);
        TYPE_HEADER = new KeyStatsItemType("TYPE_HEADER", 2);
        TYPE_ITEM_VALUE = new KeyStatsItemType("TYPE_ITEM_VALUE", 3);
        TYPE_ITEM_VALUES = new KeyStatsItemType("TYPE_ITEM_VALUES", 4);
        TYPE_HEADER_VALUES = new KeyStatsItemType("TYPE_HEADER_VALUES", 5);
        TYPE_DIVIDEND_HEADER = new KeyStatsItemType("TYPE_DIVIDEND_HEADER", 6);
        TYPE_DIVIDEND_ITEM = new KeyStatsItemType("TYPE_DIVIDEND_ITEM", 7);
        TYPE_PERIOD = new KeyStatsItemType("TYPE_PERIOD", 8);
        TYPE_PRICE_PERFORMANCE = new KeyStatsItemType("TYPE_PRICE_PERFORMANCE", 9);
        KeyStatsItemType[] r02 = a();
        f81647a = r02;
        f81648b = kotlin.enums.b.a(r02);
    }

    KeyStatsItemType(String r1, int r2) {
    }

    public static final /* synthetic */ KeyStatsItemType[] a() {
        return new KeyStatsItemType[]{TYPE_INFO_BANNER, TYPE_FILTER_OPTION, TYPE_HEADER, TYPE_ITEM_VALUE, TYPE_ITEM_VALUES, TYPE_HEADER_VALUES, TYPE_DIVIDEND_HEADER, TYPE_DIVIDEND_ITEM, TYPE_PERIOD, TYPE_PRICE_PERFORMANCE};
    }

    public static kotlin.enums.a getEntries() {
        return f81648b;
    }

    public static KeyStatsItemType valueOf(String r1) {
        return (KeyStatsItemType) Enum.valueOf(KeyStatsItemType.class, r1);
    }

    public static KeyStatsItemType[] values() {
        return (KeyStatsItemType[]) f81647a.clone();
    }
}
