package com.stockbit.feature.transferasset.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/feature/transferasset/model/TransferAssetConfirmationAction;", "", "<init>", "(Ljava/lang/String;I)V", "CANCEL", "CONFIRM", "transferasset_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum TransferAssetConfirmationAction extends Enum<TransferAssetConfirmationAction> {
    public static final TransferAssetConfirmationAction CANCEL = null;
    public static final TransferAssetConfirmationAction CONFIRM = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TransferAssetConfirmationAction[] f116864a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f116865b = null;

    static {
        CANCEL = new TransferAssetConfirmationAction("CANCEL", 0);
        CONFIRM = new TransferAssetConfirmationAction("CONFIRM", 1);
        TransferAssetConfirmationAction[] r02 = a();
        f116864a = r02;
        f116865b = kotlin.enums.b.a(r02);
    }

    TransferAssetConfirmationAction(String r1, int r2) {
    }

    public static final /* synthetic */ TransferAssetConfirmationAction[] a() {
        return new TransferAssetConfirmationAction[]{CANCEL, CONFIRM};
    }

    public static kotlin.enums.a getEntries() {
        return f116865b;
    }

    public static TransferAssetConfirmationAction valueOf(String r1) {
        return (TransferAssetConfirmationAction) Enum.valueOf(TransferAssetConfirmationAction.class, r1);
    }

    public static TransferAssetConfirmationAction[] values() {
        return (TransferAssetConfirmationAction[]) f116864a.clone();
    }
}
