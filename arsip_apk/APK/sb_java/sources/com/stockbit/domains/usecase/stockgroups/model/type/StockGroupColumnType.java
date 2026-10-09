package com.stockbit.domains.usecase.stockgroups.model.type;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/stockbit/domains/usecase/stockgroups/model/type/StockGroupColumnType;", "", Constants.KEY_TITLE, "", "param", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getParam", "GROUP_NAME", "VALUE", "VOLUME", "FREQUENCY", "Companion", "usecase-stock-groups"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum StockGroupColumnType extends Enum<StockGroupColumnType> {
    public static final a Companion = null;
    public static final StockGroupColumnType FREQUENCY = null;
    public static final StockGroupColumnType GROUP_NAME = null;
    public static final StockGroupColumnType VALUE = null;
    public static final StockGroupColumnType VOLUME = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ StockGroupColumnType[] f88455a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f88456b = null;
    private final String param;
    private final String title;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        GROUP_NAME = new StockGroupColumnType("GROUP_NAME", 0, "Groups", "STOCK_GROUP_NAME");
        VALUE = new StockGroupColumnType("VALUE", 1, "Value", "STOCK_GROUP_VALUE");
        VOLUME = new StockGroupColumnType("VOLUME", 2, "Volume", "STOCK_GROUP_VOLUME");
        FREQUENCY = new StockGroupColumnType("FREQUENCY", 3, "Freq", "STOCK_GROUP_FREQUENCY");
        StockGroupColumnType[] r02 = a();
        f88455a = r02;
        f88456b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    StockGroupColumnType(String r1, int r2, String r3, String r4) {
        this.title = r3;
        this.param = r4;
    }

    public static final /* synthetic */ StockGroupColumnType[] a() {
        return new StockGroupColumnType[]{GROUP_NAME, VALUE, VOLUME, FREQUENCY};
    }

    public static kotlin.enums.a getEntries() {
        return f88456b;
    }

    public static StockGroupColumnType valueOf(String r1) {
        return (StockGroupColumnType) Enum.valueOf(StockGroupColumnType.class, r1);
    }

    public static StockGroupColumnType[] values() {
        return (StockGroupColumnType[]) f88455a.clone();
    }

    public final String getParam() {
        return this.param;
    }

    public final String getTitle() {
        return this.title;
    }
}
