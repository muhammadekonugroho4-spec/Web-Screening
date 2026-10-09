package com.stockbit.liveness_contract.model.type;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/liveness_contract/model/type/OALivenessResultType;", "", "<init>", "(Ljava/lang/String;I)V", "Success", "OtherRDN", "Cancel", "liveness-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum OALivenessResultType extends Enum<OALivenessResultType> {
    public static final OALivenessResultType Cancel = null;
    public static final OALivenessResultType OtherRDN = null;
    public static final OALivenessResultType Success = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OALivenessResultType[] f121295a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f121296b = null;

    static {
        Success = new OALivenessResultType("Success", 0);
        OtherRDN = new OALivenessResultType("OtherRDN", 1);
        Cancel = new OALivenessResultType("Cancel", 2);
        OALivenessResultType[] r02 = a();
        f121295a = r02;
        f121296b = b.a(r02);
    }

    OALivenessResultType(String r1, int r2) {
    }

    public static final /* synthetic */ OALivenessResultType[] a() {
        return new OALivenessResultType[]{Success, OtherRDN, Cancel};
    }

    public static a getEntries() {
        return f121296b;
    }

    public static OALivenessResultType valueOf(String r1) {
        return (OALivenessResultType) Enum.valueOf(OALivenessResultType.class, r1);
    }

    public static OALivenessResultType[] values() {
        return (OALivenessResultType[]) f121295a.clone();
    }
}
