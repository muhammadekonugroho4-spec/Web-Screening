package com.stockbit.domain.model.alert;

import com.google.firebase.messaging.Constants;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001dB\u001d\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0000J\u0006\u0010\u001c\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u001e"}, d2 = {"Lcom/stockbit/domain/model/alert/AlertConditionItemType;", "", "apiValue", "", Constants.ScionAnalytics.PARAM_LABEL, "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getApiValue", "()Ljava/lang/String;", "getLabel", "Unspecified", "Price", "Volume", "Value", "PriceChange", "Frequency", "BestBid", "BestOffer", "Rsi14", "Ma5", "Ma10", "Ma20", "Ma50", "Ma100", "Ma200", "isSameType", "", "other", "isMA", "Companion", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum AlertConditionItemType extends Enum<AlertConditionItemType> {
    public static final AlertConditionItemType BestBid = null;
    public static final AlertConditionItemType BestOffer = null;
    public static final a Companion = null;
    public static final AlertConditionItemType Frequency = null;
    public static final AlertConditionItemType Ma10 = null;
    public static final AlertConditionItemType Ma100 = null;
    public static final AlertConditionItemType Ma20 = null;
    public static final AlertConditionItemType Ma200 = null;
    public static final AlertConditionItemType Ma5 = null;
    public static final AlertConditionItemType Ma50 = null;
    public static final AlertConditionItemType Price = null;
    public static final AlertConditionItemType PriceChange = null;
    public static final AlertConditionItemType Rsi14 = null;
    public static final AlertConditionItemType Unspecified = null;
    public static final AlertConditionItemType Value = null;
    public static final AlertConditionItemType Volume = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AlertConditionItemType[] f80556a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f80557b = null;
    private final String apiValue;
    private final String label;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final AlertConditionItemType a(String r4) {
            kotlin.jvm.internal.p.l(r4, "raw");
            Iterator<E> r02 = AlertConditionItemType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (kotlin.jvm.internal.p.g(((AlertConditionItemType) r1).getApiValue(), r4) == false) goto L4;
        L10:
            return (AlertConditionItemType) r1;
        L8:
            r1 = null;
            goto L10
        }

        public final AlertConditionItemType b(String r2) {
            kotlin.jvm.internal.p.l(r2, "raw");
            AlertConditionItemType r22 = a(r2);
            if (r22 == null) goto L5;
            return r22;
        L5:
            return AlertConditionItemType.Unspecified;
        }

        public a() {
        }
    }

    public static final /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f80558a = null;

        static {
            int[] r02 = new int[AlertConditionItemType.values().length];
            r02[AlertConditionItemType.Ma5.ordinal()] = 1;     // Catch: NoSuchFieldError -> L11
        L19:
            r02[AlertConditionItemType.Ma10.ordinal()] = 2;     // Catch: NoSuchFieldError -> L12
        L27:
            r02[AlertConditionItemType.Ma20.ordinal()] = 3;     // Catch: NoSuchFieldError -> L13
        L21:
            r02[AlertConditionItemType.Ma50.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
        L23:
            r02[AlertConditionItemType.Ma100.ordinal()] = 5;     // Catch: NoSuchFieldError -> L15
        L17:
            r02[AlertConditionItemType.Ma200.ordinal()] = 6;     // Catch: NoSuchFieldError -> L16
        L9:
            f80558a = r02;
        }
    }

    static {
        String r1 = "Unspecified";
        int r2 = 0;
        String r3 = "ITEM_UNSPECIFIED";
        String r4 = null;
        Unspecified = new AlertConditionItemType(r1, r2, r3, r4, 2, null);
        Price = new AlertConditionItemType("Price", 1, "ITEM_PRICE", "Price");
        Volume = new AlertConditionItemType("Volume", 2, "ITEM_VOLUME", "Volume");
        Value = new AlertConditionItemType("Value", 3, "ITEM_VALUE", "Value");
        PriceChange = new AlertConditionItemType("PriceChange", 4, "ITEM_PRICE_CHANGE", "Price Change");
        Frequency = new AlertConditionItemType("Frequency", 5, "ITEM_FREQUENCY", "Frequency");
        BestBid = new AlertConditionItemType("BestBid", 6, "ITEM_BEST_BID", "Best Bid");
        BestOffer = new AlertConditionItemType("BestOffer", 7, "ITEM_BEST_OFFER", "Best Offer");
        Rsi14 = new AlertConditionItemType("Rsi14", 8, "ITEM_RSI_14", "RSI");
        String r6 = "Ma5";
        int r7 = 9;
        String r8 = "ITEM_MA_5";
        String r9 = null;
        Ma5 = new AlertConditionItemType(r6, r7, r8, r9, 2, null);
        String r72 = "Ma10";
        int r82 = 10;
        String r92 = "ITEM_MA_10";
        String r10 = null;
        Ma10 = new AlertConditionItemType(r72, r82, r92, r10, 2, null);
        String r83 = "Ma20";
        int r93 = 11;
        String r102 = "ITEM_MA_20";
        String r11 = null;
        Ma20 = new AlertConditionItemType(r83, r93, r102, r11, 2, null);
        String r12 = "Ma50";
        int r22 = 12;
        String r32 = "ITEM_MA_50";
        String r42 = null;
        Ma50 = new AlertConditionItemType(r12, r22, r32, r42, 2, null);
        String r23 = "Ma100";
        int r33 = 13;
        String r43 = "ITEM_MA_100";
        String r5 = null;
        Ma100 = new AlertConditionItemType(r23, r33, r43, r5, 2, null);
        String r34 = "Ma200";
        int r44 = 14;
        String r52 = "ITEM_MA_200";
        String r62 = null;
        Ma200 = new AlertConditionItemType(r34, r44, r52, r62, 2, null);
        AlertConditionItemType[] r02 = a();
        f80556a = r02;
        f80557b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    AlertConditionItemType(String r1, int r2, String r3, String r4) {
        this.apiValue = r3;
        this.label = r4;
    }

    public static final /* synthetic */ AlertConditionItemType[] a() {
        return new AlertConditionItemType[]{Unspecified, Price, Volume, Value, PriceChange, Frequency, BestBid, BestOffer, Rsi14, Ma5, Ma10, Ma20, Ma50, Ma100, Ma200};
    }

    public static kotlin.enums.a getEntries() {
        return f80557b;
    }

    public static AlertConditionItemType valueOf(String r1) {
        return (AlertConditionItemType) Enum.valueOf(AlertConditionItemType.class, r1);
    }

    public static AlertConditionItemType[] values() {
        return (AlertConditionItemType[]) f80556a.clone();
    }

    public final String getApiValue() {
        return this.apiValue;
    }

    public final String getLabel() {
        return this.label;
    }

    public final boolean isMA() {
        switch(b.f80558a[ordinal()]) {
            case 1: goto L6;
            case 2: goto L6;
            case 3: goto L6;
            case 4: goto L6;
            case 5: goto L6;
            case 6: goto L6;
            default: goto L4;
        };
    L4:
        return false;
    L6:
        return true;
    }

    public final boolean isSameType(AlertConditionItemType r2) {
        kotlin.jvm.internal.p.l(r2, "other");
        if (isMA() == true) goto L5;
    L6:
        if (this == r2) goto L11;
        return false;
    L11:
        return true;
    L5:
        if (r2.isMA() == false) goto L6;
        return true;
    }

    /* synthetic */ AlertConditionItemType(String r1, int r2, String r3, String r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 2) == 0) goto L5;
        r4 = null;
    L5:
        this(r1, r2, r3, r4);
    }
}
