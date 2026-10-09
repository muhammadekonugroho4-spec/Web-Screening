package com.stockbit.domains.usecase.tradingaccount.model.tradingprofile;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stockbit/domains/usecase/tradingaccount/model/tradingprofile/BeneficiaryRelationUIType;", "", Constants.KEY_ID, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "GENERAL", "usecase-tradingaccount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum BeneficiaryRelationUIType extends Enum<BeneficiaryRelationUIType> {
    public static final BeneficiaryRelationUIType GENERAL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BeneficiaryRelationUIType[] f88507a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f88508b = null;

    /* renamed from: id, reason: collision with root package name */
    private final String f88509id;

    static {
        GENERAL = new BeneficiaryRelationUIType("GENERAL", 0, "0");
        BeneficiaryRelationUIType[] r02 = a();
        f88507a = r02;
        f88508b = kotlin.enums.b.a(r02);
    }

    BeneficiaryRelationUIType(String r1, int r2, String r3) {
        this.f88509id = r3;
    }

    public static final /* synthetic */ BeneficiaryRelationUIType[] a() {
        return new BeneficiaryRelationUIType[]{GENERAL};
    }

    public static kotlin.enums.a getEntries() {
        return f88508b;
    }

    public static BeneficiaryRelationUIType valueOf(String r1) {
        return (BeneficiaryRelationUIType) Enum.valueOf(BeneficiaryRelationUIType.class, r1);
    }

    public static BeneficiaryRelationUIType[] values() {
        return (BeneficiaryRelationUIType[]) f88507a.clone();
    }

    public final String getId() {
        return this.f88509id;
    }
}
