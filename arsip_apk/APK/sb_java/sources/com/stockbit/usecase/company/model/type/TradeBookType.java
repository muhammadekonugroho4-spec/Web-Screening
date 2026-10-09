package com.stockbit.usecase.company.model.type;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/stockbit/usecase/company/model/type/TradeBookType;", "", "value", "", Constants.KEY_TEXT, "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getText", "BY_CHART", "BY_PRICE", "BY_TIME", "Companion", "usecase-company"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum TradeBookType extends Enum<TradeBookType> {
    public static final TradeBookType BY_CHART = null;
    public static final TradeBookType BY_PRICE = null;
    public static final TradeBookType BY_TIME = null;
    public static final a Companion = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TradeBookType[] f156673a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f156674b = null;
    private final String text;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        BY_CHART = new TradeBookType("BY_CHART", 0, "GROUP_BY_CHART", "Chart");
        BY_PRICE = new TradeBookType("BY_PRICE", 1, "GROUP_BY_PRICE", "Price");
        BY_TIME = new TradeBookType("BY_TIME", 2, "GROUP_BY_TIME", "Time");
        TradeBookType[] r02 = a();
        f156673a = r02;
        f156674b = b.a(r02);
        Companion = new a(null);
    }

    TradeBookType(String r1, int r2, String r3, String r4) {
        this.value = r3;
        this.text = r4;
    }

    public static final /* synthetic */ TradeBookType[] a() {
        return new TradeBookType[]{BY_CHART, BY_PRICE, BY_TIME};
    }

    public static kotlin.enums.a getEntries() {
        return f156674b;
    }

    public static TradeBookType valueOf(String r1) {
        return (TradeBookType) Enum.valueOf(TradeBookType.class, r1);
    }

    public static TradeBookType[] values() {
        return (TradeBookType[]) f156673a.clone();
    }

    public final String getText() {
        return this.text;
    }

    public final String getValue() {
        return this.value;
    }
}
