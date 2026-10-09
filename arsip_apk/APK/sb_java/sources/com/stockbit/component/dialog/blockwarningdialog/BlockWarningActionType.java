package com.stockbit.component.dialog.blockwarningdialog;

import com.stockbit.component.dialog.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/stockbit/component/dialog/blockwarningdialog/BlockWarningActionType;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "EMAIL", "PASSWORD", "PHONE", "PIN", "dialog_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum BlockWarningActionType extends Enum<BlockWarningActionType> {
    public static final BlockWarningActionType EMAIL = null;
    public static final BlockWarningActionType PASSWORD = null;
    public static final BlockWarningActionType PHONE = null;
    public static final BlockWarningActionType PIN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BlockWarningActionType[] f70164a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f70165b = null;
    private final int value;

    static {
        EMAIL = new BlockWarningActionType("EMAIL", 0, e.f70222F);
        PASSWORD = new BlockWarningActionType("PASSWORD", 1, e.f70223G);
        PHONE = new BlockWarningActionType("PHONE", 2, e.f70224H);
        PIN = new BlockWarningActionType("PIN", 3, e.f70226J);
        BlockWarningActionType[] r02 = a();
        f70164a = r02;
        f70165b = kotlin.enums.b.a(r02);
    }

    BlockWarningActionType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static final /* synthetic */ BlockWarningActionType[] a() {
        return new BlockWarningActionType[]{EMAIL, PASSWORD, PHONE, PIN};
    }

    public static kotlin.enums.a getEntries() {
        return f70165b;
    }

    public static BlockWarningActionType valueOf(String r1) {
        return (BlockWarningActionType) Enum.valueOf(BlockWarningActionType.class, r1);
    }

    public static BlockWarningActionType[] values() {
        return (BlockWarningActionType[]) f70164a.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
