package com.stockbit.domain.model.type.company;

import com.iab.digitalidentity.sdk.core.model.GoPayPlusCameraConfigKt;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stockbit/domain/model/type/company/BrokerDetectorTransactionType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "TRANSACTION_TYPE_NET", "TRANSACTION_TYPE_GROSS", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum BrokerDetectorTransactionType extends Enum<BrokerDetectorTransactionType> {
    public static final BrokerDetectorTransactionType TRANSACTION_TYPE_GROSS = null;
    public static final BrokerDetectorTransactionType TRANSACTION_TYPE_NET = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BrokerDetectorTransactionType[] f86319a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f86320b = null;
    private final String value;

    static {
        TRANSACTION_TYPE_NET = new BrokerDetectorTransactionType("TRANSACTION_TYPE_NET", 0, GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A);
        TRANSACTION_TYPE_GROSS = new BrokerDetectorTransactionType("TRANSACTION_TYPE_GROSS", 1, "2");
        BrokerDetectorTransactionType[] r02 = a();
        f86319a = r02;
        f86320b = b.a(r02);
    }

    BrokerDetectorTransactionType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ BrokerDetectorTransactionType[] a() {
        return new BrokerDetectorTransactionType[]{TRANSACTION_TYPE_NET, TRANSACTION_TYPE_GROSS};
    }

    public static a getEntries() {
        return f86320b;
    }

    public static BrokerDetectorTransactionType valueOf(String r1) {
        return (BrokerDetectorTransactionType) Enum.valueOf(BrokerDetectorTransactionType.class, r1);
    }

    public static BrokerDetectorTransactionType[] values() {
        return (BrokerDetectorTransactionType[]) f86319a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
