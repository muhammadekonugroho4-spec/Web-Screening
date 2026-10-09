package com.stockbit.uikit.compose.button;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/uikit/compose/button/ButtonState;", "", "<init>", "(Ljava/lang/String;I)V", "ACTIVE", "INACTIVE", "uikit_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.e
/* loaded from: classes11.dex */
public enum ButtonState extends Enum<ButtonState> {
    public static final ButtonState ACTIVE = null;
    public static final ButtonState INACTIVE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ButtonState[] f151508a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f151509b = null;

    static {
        ACTIVE = new ButtonState("ACTIVE", 0);
        INACTIVE = new ButtonState("INACTIVE", 1);
        ButtonState[] r02 = a();
        f151508a = r02;
        f151509b = kotlin.enums.b.a(r02);
    }

    ButtonState(String r1, int r2) {
    }

    public static final /* synthetic */ ButtonState[] a() {
        return new ButtonState[]{ACTIVE, INACTIVE};
    }

    public static kotlin.enums.a getEntries() {
        return f151509b;
    }

    public static ButtonState valueOf(String r1) {
        return (ButtonState) Enum.valueOf(ButtonState.class, r1);
    }

    public static ButtonState[] values() {
        return (ButtonState[]) f151508a.clone();
    }
}
