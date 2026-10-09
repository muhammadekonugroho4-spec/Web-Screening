package com.stockbit.domain.model.entity.securities;

import java.util.Locale;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/stockbit/domain/model/entity/securities/FilterExpiryType;", "", "<init>", "(Ljava/lang/String;I)V", "GTC", "DAY", "FAK", "UNSPECIFIED", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum FilterExpiryType extends Enum<FilterExpiryType> {
    public static final a Companion = null;
    public static final FilterExpiryType DAY = null;
    public static final FilterExpiryType FAK = null;
    public static final FilterExpiryType GTC = null;
    public static final FilterExpiryType UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ FilterExpiryType[] f83115a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f83116b = null;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final FilterExpiryType a(String r8) {
            FilterExpiryType[] r02 = FilterExpiryType.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            FilterExpiryType r3 = null;
            String r32 = null;
            if (r2 >= r1) goto L12;
            FilterExpiryType r4 = r02[r2];
            String r5 = r4.name();
            if (r8 == null) goto L9;
            r32 = r8.toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.p.k(r32, "toUpperCase(...)");
        L9:
            if (kotlin.jvm.internal.p.g(r5, r32) == true) goto L10;
            r2 = r2 + 1;
            goto L3
        L10:
            r3 = r4;
        L12:
            if (r3 == null) goto L14;
            return r3;
        L14:
            return FilterExpiryType.UNSPECIFIED;
        }

        public a() {
        }
    }

    static {
        GTC = new FilterExpiryType("GTC", 0);
        DAY = new FilterExpiryType("DAY", 1);
        FAK = new FilterExpiryType("FAK", 2);
        UNSPECIFIED = new FilterExpiryType("UNSPECIFIED", 3);
        FilterExpiryType[] r02 = a();
        f83115a = r02;
        f83116b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    FilterExpiryType(String r1, int r2) {
    }

    public static final /* synthetic */ FilterExpiryType[] a() {
        return new FilterExpiryType[]{GTC, DAY, FAK, UNSPECIFIED};
    }

    public static kotlin.enums.a getEntries() {
        return f83116b;
    }

    public static FilterExpiryType valueOf(String r1) {
        return (FilterExpiryType) Enum.valueOf(FilterExpiryType.class, r1);
    }

    public static FilterExpiryType[] values() {
        return (FilterExpiryType[]) f83115a.clone();
    }
}
