package com.stockbit.domain.model.type.openingaccount;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/domain/model/type/openingaccount/BibitRegistrationStatus;", "", "<init>", "(Ljava/lang/String;I)V", "BIBIT_INTEGRATION", "BASIC_REGISTRATION", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum BibitRegistrationStatus extends Enum<BibitRegistrationStatus> {
    public static final BibitRegistrationStatus BASIC_REGISTRATION = null;
    public static final BibitRegistrationStatus BIBIT_INTEGRATION = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BibitRegistrationStatus[] f86333a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f86334b = null;

    static {
        BIBIT_INTEGRATION = new BibitRegistrationStatus("BIBIT_INTEGRATION", 0);
        BASIC_REGISTRATION = new BibitRegistrationStatus("BASIC_REGISTRATION", 1);
        BibitRegistrationStatus[] r02 = a();
        f86333a = r02;
        f86334b = b.a(r02);
    }

    BibitRegistrationStatus(String r1, int r2) {
    }

    public static final /* synthetic */ BibitRegistrationStatus[] a() {
        return new BibitRegistrationStatus[]{BIBIT_INTEGRATION, BASIC_REGISTRATION};
    }

    public static a getEntries() {
        return f86334b;
    }

    public static BibitRegistrationStatus valueOf(String r1) {
        return (BibitRegistrationStatus) Enum.valueOf(BibitRegistrationStatus.class, r1);
    }

    public static BibitRegistrationStatus[] values() {
        return (BibitRegistrationStatus[]) f86333a.clone();
    }
}
