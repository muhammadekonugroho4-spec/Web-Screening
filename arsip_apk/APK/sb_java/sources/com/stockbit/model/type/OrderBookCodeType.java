package com.stockbit.model.type;

import com.clevertap.android.sdk.Constants;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B9\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rj\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0019"}, d2 = {"Lcom/stockbit/model/type/OrderBookCodeType;", "", "value", "", Constants.KEY_OLD_VALUE, Constants.KEY_TITLE, "position", "", "titleResource", "brokerType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getOldValue", "getTitle", "getPosition", "()I", "getTitleResource", "getBrokerType", "ALL", "LOCAL", "BUMN", "ASING", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum OrderBookCodeType extends Enum<OrderBookCodeType> {
    public static final OrderBookCodeType ALL = null;
    public static final OrderBookCodeType ASING = null;
    public static final OrderBookCodeType BUMN = null;
    public static final a Companion = null;
    public static final OrderBookCodeType LOCAL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OrderBookCodeType[] f122191a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f122192b = null;
    private final String brokerType;
    private final String oldValue;
    private final int position;
    private final String title;
    private final int titleResource;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final OrderBookCodeType a(String r8) {
            OrderBookCodeType[] r02 = OrderBookCodeType.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            String r3 = null;
            if (r2 >= r1) goto L12;
            OrderBookCodeType r4 = r02[r2];
            String r5 = r4.getOldValue();
            if (r8 == null) goto L9;
            r3 = r8.toLowerCase(Locale.ROOT);
            p.k(r3, "toLowerCase(...)");
        L9:
            if (p.g(r5, r3) == true) goto L10;
            r2 = r2 + 1;
            goto L3
        L10:
            return r4;
        L12:
            return null;
        }

        public final OrderBookCodeType b(Integer r7) {
            OrderBookCodeType[] r02 = OrderBookCodeType.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L11;
            OrderBookCodeType r3 = r02[r2];
            int r4 = r3.getPosition();
            if (r7 == null) goto L10;
            if (r4 != r7.intValue()) goto L10;
            return r3;
        L10:
            r2 = r2 + 1;
            goto L3
        L11:
            return null;
        }

        public a() {
        }
    }

    static {
        ALL = new OrderBookCodeType("ALL", 0, "GROUP_UNSPECIFIED", "", "All", 0, com.stockbit.model.a.f121968a, "BROKER_TYPE_UNSPECIFIED");
        LOCAL = new OrderBookCodeType("LOCAL", 1, "GROUP_LOCAL", "lokal", "Local", 1, com.stockbit.model.a.d, "BROKER_TYPE_LOCAL");
        BUMN = new OrderBookCodeType("BUMN", 2, "GROUP_GOVERNMENT", "pemerintah", "BUMN", 2, com.stockbit.model.a.f121969b, "BROKER_TYPE_GOVERNMENT");
        ASING = new OrderBookCodeType("ASING", 3, "GROUP_FOREIGN", "asing", "Asing", 3, com.stockbit.model.a.f121970c, "BROKER_TYPE_FOREIGN");
        OrderBookCodeType[] r02 = a();
        f122191a = r02;
        f122192b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    OrderBookCodeType(String r1, int r2, String r3, String r4, String r5, int r6, int r7, String r8) {
        this.value = r3;
        this.oldValue = r4;
        this.title = r5;
        this.position = r6;
        this.titleResource = r7;
        this.brokerType = r8;
    }

    public static final /* synthetic */ OrderBookCodeType[] a() {
        return new OrderBookCodeType[]{ALL, LOCAL, BUMN, ASING};
    }

    public static kotlin.enums.a getEntries() {
        return f122192b;
    }

    public static OrderBookCodeType valueOf(String r1) {
        return (OrderBookCodeType) Enum.valueOf(OrderBookCodeType.class, r1);
    }

    public static OrderBookCodeType[] values() {
        return (OrderBookCodeType[]) f122191a.clone();
    }

    public final String getBrokerType() {
        return this.brokerType;
    }

    public final String getOldValue() {
        return this.oldValue;
    }

    public final int getPosition() {
        return this.position;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getTitleResource() {
        return this.titleResource;
    }

    public final String getValue() {
        return this.value;
    }
}
