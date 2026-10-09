package com.stockbit.feature.transaction.ui.dialog.model;

import kotlin.Metadata;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stockbit/feature/transaction/ui/dialog/model/BracketOrderTriggerStatus;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "STATUS_DISABLED", "STATUS_ENABLED", "transaction_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum BracketOrderTriggerStatus extends Enum<BracketOrderTriggerStatus> {
    public static final BracketOrderTriggerStatus STATUS_DISABLED = null;
    public static final BracketOrderTriggerStatus STATUS_ENABLED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BracketOrderTriggerStatus[] f113477a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f113478b = null;
    private final String value;

    static {
        STATUS_DISABLED = new BracketOrderTriggerStatus("STATUS_DISABLED", 0, "STATUS_DISABLED");
        STATUS_ENABLED = new BracketOrderTriggerStatus("STATUS_ENABLED", 1, "STATUS_ENABLED");
        BracketOrderTriggerStatus[] r02 = a();
        f113477a = r02;
        f113478b = b.a(r02);
    }

    BracketOrderTriggerStatus(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ BracketOrderTriggerStatus[] a() {
        return new BracketOrderTriggerStatus[]{STATUS_DISABLED, STATUS_ENABLED};
    }

    public static kotlin.enums.a getEntries() {
        return f113478b;
    }

    public static BracketOrderTriggerStatus valueOf(String r1) {
        return (BracketOrderTriggerStatus) Enum.valueOf(BracketOrderTriggerStatus.class, r1);
    }

    public static BracketOrderTriggerStatus[] values() {
        return (BracketOrderTriggerStatus[]) f113477a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
