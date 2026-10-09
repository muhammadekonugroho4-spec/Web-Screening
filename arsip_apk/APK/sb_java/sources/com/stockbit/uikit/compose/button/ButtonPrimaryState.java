package com.stockbit.uikit.compose.button;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/uikit/compose/button/ButtonPrimaryState;", "", "<init>", "(Ljava/lang/String;I)V", "ACTIVE", "INACTIVE", "uikit_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum ButtonPrimaryState extends Enum<ButtonPrimaryState> {
    public static final ButtonPrimaryState ACTIVE = null;
    public static final ButtonPrimaryState INACTIVE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ButtonPrimaryState[] f151502a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f151503b = null;

    static {
        ACTIVE = new ButtonPrimaryState("ACTIVE", 0);
        INACTIVE = new ButtonPrimaryState("INACTIVE", 1);
        ButtonPrimaryState[] r02 = a();
        f151502a = r02;
        f151503b = kotlin.enums.b.a(r02);
    }

    ButtonPrimaryState(String r1, int r2) {
    }

    public static final /* synthetic */ ButtonPrimaryState[] a() {
        return new ButtonPrimaryState[]{ACTIVE, INACTIVE};
    }

    public static kotlin.enums.a getEntries() {
        return f151503b;
    }

    public static ButtonPrimaryState valueOf(String r1) {
        return (ButtonPrimaryState) Enum.valueOf(ButtonPrimaryState.class, r1);
    }

    public static ButtonPrimaryState[] values() {
        return (ButtonPrimaryState[]) f151502a.clone();
    }
}
