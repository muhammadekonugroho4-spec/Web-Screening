package com.stockbit.common.models;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/common/models/ButtonState;", "", "<init>", "(Ljava/lang/String;I)V", "ENABLE", "DISABLE", "LOADING", "common_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum ButtonState extends Enum<ButtonState> {
    public static final ButtonState DISABLE = null;
    public static final ButtonState ENABLE = null;
    public static final ButtonState LOADING = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ButtonState[] f60887a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f60888b = null;

    static {
        ENABLE = new ButtonState("ENABLE", 0);
        DISABLE = new ButtonState("DISABLE", 1);
        LOADING = new ButtonState("LOADING", 2);
        ButtonState[] r02 = a();
        f60887a = r02;
        f60888b = kotlin.enums.b.a(r02);
    }

    ButtonState(String r1, int r2) {
    }

    public static final /* synthetic */ ButtonState[] a() {
        return new ButtonState[]{ENABLE, DISABLE, LOADING};
    }

    public static kotlin.enums.a getEntries() {
        return f60888b;
    }

    public static ButtonState valueOf(String r1) {
        return (ButtonState) Enum.valueOf(ButtonState.class, r1);
    }

    public static ButtonState[] values() {
        return (ButtonState[]) f60887a.clone();
    }
}
