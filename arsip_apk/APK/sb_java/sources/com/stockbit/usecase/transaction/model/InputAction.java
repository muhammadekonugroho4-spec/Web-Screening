package com.stockbit.usecase.transaction.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/usecase/transaction/model/InputAction;", "", "<init>", "(Ljava/lang/String;I)V", "MIN_CLICKED", "PLUS_CLICKED", "NONE", "usecase-transaction"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum InputAction extends Enum<InputAction> {
    public static final InputAction MIN_CLICKED = null;
    public static final InputAction NONE = null;
    public static final InputAction PLUS_CLICKED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ InputAction[] f163764a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f163765b = null;

    static {
        MIN_CLICKED = new InputAction("MIN_CLICKED", 0);
        PLUS_CLICKED = new InputAction("PLUS_CLICKED", 1);
        NONE = new InputAction("NONE", 2);
        InputAction[] r02 = a();
        f163764a = r02;
        f163765b = kotlin.enums.b.a(r02);
    }

    InputAction(String r1, int r2) {
    }

    public static final /* synthetic */ InputAction[] a() {
        return new InputAction[]{MIN_CLICKED, PLUS_CLICKED, NONE};
    }

    public static kotlin.enums.a getEntries() {
        return f163765b;
    }

    public static InputAction valueOf(String r1) {
        return (InputAction) Enum.valueOf(InputAction.class, r1);
    }

    public static InputAction[] values() {
        return (InputAction[]) f163764a.clone();
    }
}
