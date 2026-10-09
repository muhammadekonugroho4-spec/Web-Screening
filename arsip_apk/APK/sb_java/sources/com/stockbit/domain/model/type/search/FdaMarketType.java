package com.stockbit.domain.model.type.search;

import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lcom/stockbit/domain/model/type/search/FdaMarketType;", "", Constants.ScionAnalytics.PARAM_LABEL, "", "value", "position", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V", "getLabel", "()Ljava/lang/String;", "getValue", "getPosition", "()I", "FDA_MARKET_TYPE_REGULAR", "FDA_MARKET_TYPE_ALL_MARKET", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum FdaMarketType extends Enum<FdaMarketType> {
    public static final a Companion = null;
    public static final FdaMarketType FDA_MARKET_TYPE_ALL_MARKET = null;
    public static final FdaMarketType FDA_MARKET_TYPE_REGULAR = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ FdaMarketType[] f86410a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86411b = null;
    private final String label;
    private final int position;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final List a() {
            FdaMarketType[] r02 = FdaMarketType.values();
            ArrayList r1 = new ArrayList(r02.length);
            int r2 = r02.length;
            int r3 = 0;
        L3:
            if (r3 >= r2) goto L5;
            r1.add(r02[r3].getLabel());
            r3 = r3 + 1;
            goto L3
        L5:
            return r1;
        }

        public final FdaMarketType b(Integer r7) {
            FdaMarketType[] r02 = FdaMarketType.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L11;
            FdaMarketType r3 = r02[r2];
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
        FDA_MARKET_TYPE_REGULAR = new FdaMarketType("FDA_MARKET_TYPE_REGULAR", 0, "Regular", "MARKET_TYPE_REGULAR", 0);
        FDA_MARKET_TYPE_ALL_MARKET = new FdaMarketType("FDA_MARKET_TYPE_ALL_MARKET", 1, "All Market", "MARKET_TYPE_ALL_MARKET", 1);
        FdaMarketType[] r02 = a();
        f86410a = r02;
        f86411b = b.a(r02);
        Companion = new a(null);
    }

    FdaMarketType(String r1, int r2, String r3, String r4, int r5) {
        this.label = r3;
        this.value = r4;
        this.position = r5;
    }

    public static final /* synthetic */ FdaMarketType[] a() {
        return new FdaMarketType[]{FDA_MARKET_TYPE_REGULAR, FDA_MARKET_TYPE_ALL_MARKET};
    }

    public static kotlin.enums.a getEntries() {
        return f86411b;
    }

    public static FdaMarketType valueOf(String r1) {
        return (FdaMarketType) Enum.valueOf(FdaMarketType.class, r1);
    }

    public static FdaMarketType[] values() {
        return (FdaMarketType[]) f86410a.clone();
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getPosition() {
        return this.position;
    }

    public final String getValue() {
        return this.value;
    }
}
