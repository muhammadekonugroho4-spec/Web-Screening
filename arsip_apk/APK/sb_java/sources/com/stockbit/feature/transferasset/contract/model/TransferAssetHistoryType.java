package com.stockbit.feature.transferasset.contract.model;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/stockbit/feature/transferasset/contract/model/TransferAssetHistoryType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "TRANSFER_IN", "TRANSFER_OUT", "TRANSFER_STOCK", "Companion", "transferasset-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum TransferAssetHistoryType extends Enum<TransferAssetHistoryType> {
    public static final a Companion = null;
    public static final TransferAssetHistoryType TRANSFER_IN = null;
    public static final TransferAssetHistoryType TRANSFER_OUT = null;
    public static final TransferAssetHistoryType TRANSFER_STOCK = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TransferAssetHistoryType[] f116790a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f116791b = null;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        TRANSFER_IN = new TransferAssetHistoryType("TRANSFER_IN", 0, "TRANSFER IN");
        TRANSFER_OUT = new TransferAssetHistoryType("TRANSFER_OUT", 1, "TRANSFER OUT");
        TRANSFER_STOCK = new TransferAssetHistoryType("TRANSFER_STOCK", 2, "TRANSFER STOCK");
        TransferAssetHistoryType[] r02 = a();
        f116790a = r02;
        f116791b = b.a(r02);
        Companion = new a(null);
    }

    TransferAssetHistoryType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ TransferAssetHistoryType[] a() {
        return new TransferAssetHistoryType[]{TRANSFER_IN, TRANSFER_OUT, TRANSFER_STOCK};
    }

    public static kotlin.enums.a getEntries() {
        return f116791b;
    }

    public static TransferAssetHistoryType valueOf(String r1) {
        return (TransferAssetHistoryType) Enum.valueOf(TransferAssetHistoryType.class, r1);
    }

    public static TransferAssetHistoryType[] values() {
        return (TransferAssetHistoryType[]) f116790a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
