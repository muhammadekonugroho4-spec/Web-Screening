package com.stockbit.usecase.securities.model.order;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/stockbit/usecase/securities/model/order/BulkCancelUIState;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "HIDE_ITEM", "SHOW_ITEM_NON_SELECTABLE", "SHOW_ITEM_SELECTABLE", "UNSPECIFIED", "Companion", "usecase-securities"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum BulkCancelUIState extends Enum<BulkCancelUIState> {
    public static final a Companion = null;
    public static final BulkCancelUIState HIDE_ITEM = null;
    public static final BulkCancelUIState SHOW_ITEM_NON_SELECTABLE = null;
    public static final BulkCancelUIState SHOW_ITEM_SELECTABLE = null;
    public static final BulkCancelUIState UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BulkCancelUIState[] f160923a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f160924b = null;
    private final String value;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        HIDE_ITEM = new BulkCancelUIState("HIDE_ITEM", 0, "HIDE_ITEM");
        SHOW_ITEM_NON_SELECTABLE = new BulkCancelUIState("SHOW_ITEM_NON_SELECTABLE", 1, "SHOW_ITEM_NON_SELECTABLE");
        SHOW_ITEM_SELECTABLE = new BulkCancelUIState("SHOW_ITEM_SELECTABLE", 2, "SHOW_ITEM_SELECTABLE");
        UNSPECIFIED = new BulkCancelUIState("UNSPECIFIED", 3, "UNSPECIFIED");
        BulkCancelUIState[] r02 = a();
        f160923a = r02;
        f160924b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    BulkCancelUIState(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ BulkCancelUIState[] a() {
        return new BulkCancelUIState[]{HIDE_ITEM, SHOW_ITEM_NON_SELECTABLE, SHOW_ITEM_SELECTABLE, UNSPECIFIED};
    }

    public static kotlin.enums.a getEntries() {
        return f160924b;
    }

    public static BulkCancelUIState valueOf(String r1) {
        return (BulkCancelUIState) Enum.valueOf(BulkCancelUIState.class, r1);
    }

    public static BulkCancelUIState[] values() {
        return (BulkCancelUIState[]) f160923a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
