package com.stockbit.feature.transaction.util;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stockbit/feature/transaction/util/ItemVisibility;", "", "<init>", "(Ljava/lang/String;I)V", "VISIBLE", "HIDDEN_BEHIND_HEADER", "ABOVE_VIEWPORT", "BELOW_VIEWPORT", "LIST_HIDDEN", "transaction_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum ItemVisibility extends Enum<ItemVisibility> {
    public static final ItemVisibility ABOVE_VIEWPORT = null;
    public static final ItemVisibility BELOW_VIEWPORT = null;
    public static final ItemVisibility HIDDEN_BEHIND_HEADER = null;
    public static final ItemVisibility LIST_HIDDEN = null;
    public static final ItemVisibility VISIBLE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ItemVisibility[] f116604a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f116605b = null;

    static {
        VISIBLE = new ItemVisibility("VISIBLE", 0);
        HIDDEN_BEHIND_HEADER = new ItemVisibility("HIDDEN_BEHIND_HEADER", 1);
        ABOVE_VIEWPORT = new ItemVisibility("ABOVE_VIEWPORT", 2);
        BELOW_VIEWPORT = new ItemVisibility("BELOW_VIEWPORT", 3);
        LIST_HIDDEN = new ItemVisibility("LIST_HIDDEN", 4);
        ItemVisibility[] r02 = a();
        f116604a = r02;
        f116605b = kotlin.enums.b.a(r02);
    }

    ItemVisibility(String r1, int r2) {
    }

    public static final /* synthetic */ ItemVisibility[] a() {
        return new ItemVisibility[]{VISIBLE, HIDDEN_BEHIND_HEADER, ABOVE_VIEWPORT, BELOW_VIEWPORT, LIST_HIDDEN};
    }

    public static kotlin.enums.a getEntries() {
        return f116605b;
    }

    public static ItemVisibility valueOf(String r1) {
        return (ItemVisibility) Enum.valueOf(ItemVisibility.class, r1);
    }

    public static ItemVisibility[] values() {
        return (ItemVisibility[]) f116604a.clone();
    }
}
