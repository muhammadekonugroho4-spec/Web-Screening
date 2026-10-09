package com.stockbit.component.dialog.blockingwithtriggerinfo;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/component/dialog/blockingwithtriggerinfo/BlockingWithTriggerInfoType;", "", "<init>", "(Ljava/lang/String;I)V", "AMEND_BANK", "WITHDRAWAL", "dialog_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum BlockingWithTriggerInfoType extends Enum<BlockingWithTriggerInfoType> {
    public static final BlockingWithTriggerInfoType AMEND_BANK = null;
    public static final BlockingWithTriggerInfoType WITHDRAWAL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BlockingWithTriggerInfoType[] f70145a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f70146b = null;

    static {
        AMEND_BANK = new BlockingWithTriggerInfoType("AMEND_BANK", 0);
        WITHDRAWAL = new BlockingWithTriggerInfoType("WITHDRAWAL", 1);
        BlockingWithTriggerInfoType[] r02 = a();
        f70145a = r02;
        f70146b = kotlin.enums.b.a(r02);
    }

    BlockingWithTriggerInfoType(String r1, int r2) {
    }

    public static final /* synthetic */ BlockingWithTriggerInfoType[] a() {
        return new BlockingWithTriggerInfoType[]{AMEND_BANK, WITHDRAWAL};
    }

    public static kotlin.enums.a getEntries() {
        return f70146b;
    }

    public static BlockingWithTriggerInfoType valueOf(String r1) {
        return (BlockingWithTriggerInfoType) Enum.valueOf(BlockingWithTriggerInfoType.class, r1);
    }

    public static BlockingWithTriggerInfoType[] values() {
        return (BlockingWithTriggerInfoType[]) f70145a.clone();
    }
}
