package com.stockbit.model.type;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stockbit/model/type/CompanyDeviationDataType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PE_STANDARD_DEVIATION", "PE_FORWARD_DEVIATION", "PBV_STANDARD_DEVIATION", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum CompanyDeviationDataType extends Enum<CompanyDeviationDataType> {
    public static final CompanyDeviationDataType PBV_STANDARD_DEVIATION = null;
    public static final CompanyDeviationDataType PE_FORWARD_DEVIATION = null;
    public static final CompanyDeviationDataType PE_STANDARD_DEVIATION = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CompanyDeviationDataType[] f122169a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f122170b = null;
    private final String value;

    static {
        PE_STANDARD_DEVIATION = new CompanyDeviationDataType("PE_STANDARD_DEVIATION", 0, "PEStandardDeviationBand");
        PE_FORWARD_DEVIATION = new CompanyDeviationDataType("PE_FORWARD_DEVIATION", 1, "ForwardPEStandardDeviationBand");
        PBV_STANDARD_DEVIATION = new CompanyDeviationDataType("PBV_STANDARD_DEVIATION", 2, "PBVStandardDeviationBand");
        CompanyDeviationDataType[] r02 = a();
        f122169a = r02;
        f122170b = kotlin.enums.b.a(r02);
    }

    CompanyDeviationDataType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ CompanyDeviationDataType[] a() {
        return new CompanyDeviationDataType[]{PE_STANDARD_DEVIATION, PE_FORWARD_DEVIATION, PBV_STANDARD_DEVIATION};
    }

    public static kotlin.enums.a getEntries() {
        return f122170b;
    }

    public static CompanyDeviationDataType valueOf(String r1) {
        return (CompanyDeviationDataType) Enum.valueOf(CompanyDeviationDataType.class, r1);
    }

    public static CompanyDeviationDataType[] values() {
        return (CompanyDeviationDataType[]) f122169a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
