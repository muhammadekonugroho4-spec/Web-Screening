package com.stockbit.domain.model.type.openingaccount;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/domain/model/type/openingaccount/TrackingType;", "", "<init>", "(Ljava/lang/String;I)V", "PHONE", "EMAIL", "BIBIT", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum TrackingType extends Enum<TrackingType> {
    public static final TrackingType BIBIT = null;
    public static final TrackingType EMAIL = null;
    public static final TrackingType PHONE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TrackingType[] f86370a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f86371b = null;

    static {
        PHONE = new TrackingType("PHONE", 0);
        EMAIL = new TrackingType("EMAIL", 1);
        BIBIT = new TrackingType("BIBIT", 2);
        TrackingType[] r02 = a();
        f86370a = r02;
        f86371b = b.a(r02);
    }

    TrackingType(String r1, int r2) {
    }

    public static final /* synthetic */ TrackingType[] a() {
        return new TrackingType[]{PHONE, EMAIL, BIBIT};
    }

    public static a getEntries() {
        return f86371b;
    }

    public static TrackingType valueOf(String r1) {
        return (TrackingType) Enum.valueOf(TrackingType.class, r1);
    }

    public static TrackingType[] values() {
        return (TrackingType[]) f86370a.clone();
    }
}
