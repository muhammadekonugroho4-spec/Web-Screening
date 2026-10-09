package com.stockbit.usecase.brokeractivity.model.type;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/stockbit/usecase/brokeractivity/model/type/BrokerActivityColumnType;", "", Constants.KEY_TITLE, "", "position", "", "param", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getPosition", "()I", "getParam", "CODE", "SECURITIES", "TOTAL_VAL", "NET_VAL", "BUY_VAL", "SELL_VAL", "TOTAL_VOL", "TOTAL_FREQ", "usecase-brokeractivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum BrokerActivityColumnType extends Enum<BrokerActivityColumnType> {
    public static final BrokerActivityColumnType BUY_VAL = null;
    public static final BrokerActivityColumnType CODE = null;
    public static final BrokerActivityColumnType NET_VAL = null;
    public static final BrokerActivityColumnType SECURITIES = null;
    public static final BrokerActivityColumnType SELL_VAL = null;
    public static final BrokerActivityColumnType TOTAL_FREQ = null;
    public static final BrokerActivityColumnType TOTAL_VAL = null;
    public static final BrokerActivityColumnType TOTAL_VOL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BrokerActivityColumnType[] f154889a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f154890b = null;
    private final String param;
    private final int position;
    private final String title;

    static {
        CODE = new BrokerActivityColumnType("CODE", 0, "Code", 1, "TB_SORT_BY_CODE");
        SECURITIES = new BrokerActivityColumnType("SECURITIES", 1, "Sekuritas", 2, "TB_SORT_BY_NAME");
        TOTAL_VAL = new BrokerActivityColumnType("TOTAL_VAL", 2, "T.val", 3, "TB_SORT_BY_TOTAL_VALUE");
        NET_VAL = new BrokerActivityColumnType("NET_VAL", 3, "N.val", 4, "TB_SORT_BY_NET_VALUE");
        BUY_VAL = new BrokerActivityColumnType("BUY_VAL", 4, "B.val", 5, "TB_SORT_BY_BUY_VALUE");
        SELL_VAL = new BrokerActivityColumnType("SELL_VAL", 5, "S.val", 6, "TB_SORT_BY_SELL_VALUE");
        TOTAL_VOL = new BrokerActivityColumnType("TOTAL_VOL", 6, "T.vol", 7, "TB_SORT_BY_TOTAL_VOLUME");
        TOTAL_FREQ = new BrokerActivityColumnType("TOTAL_FREQ", 7, "T.freq", 8, "TB_SORT_BY_TOTAL_FREQUENCY");
        BrokerActivityColumnType[] r02 = a();
        f154889a = r02;
        f154890b = b.a(r02);
    }

    BrokerActivityColumnType(String r1, int r2, String r3, int r4, String r5) {
        this.title = r3;
        this.position = r4;
        this.param = r5;
    }

    public static final /* synthetic */ BrokerActivityColumnType[] a() {
        return new BrokerActivityColumnType[]{CODE, SECURITIES, TOTAL_VAL, NET_VAL, BUY_VAL, SELL_VAL, TOTAL_VOL, TOTAL_FREQ};
    }

    public static a getEntries() {
        return f154890b;
    }

    public static BrokerActivityColumnType valueOf(String r1) {
        return (BrokerActivityColumnType) Enum.valueOf(BrokerActivityColumnType.class, r1);
    }

    public static BrokerActivityColumnType[] values() {
        return (BrokerActivityColumnType[]) f154889a.clone();
    }

    public final String getParam() {
        return this.param;
    }

    public final int getPosition() {
        return this.position;
    }

    public final String getTitle() {
        return this.title;
    }
}
