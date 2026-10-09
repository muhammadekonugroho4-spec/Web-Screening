package com.stockbit.uikit.compose.button;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/uikit/compose/button/ButtonIconPosition;", "", "<init>", "(Ljava/lang/String;I)V", "START", "END", "uikit_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum ButtonIconPosition extends Enum<ButtonIconPosition> {
    public static final ButtonIconPosition END = null;
    public static final ButtonIconPosition START = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ButtonIconPosition[] f151496a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f151497b = null;

    static {
        START = new ButtonIconPosition("START", 0);
        END = new ButtonIconPosition("END", 1);
        ButtonIconPosition[] r02 = a();
        f151496a = r02;
        f151497b = kotlin.enums.b.a(r02);
    }

    ButtonIconPosition(String r1, int r2) {
    }

    public static final /* synthetic */ ButtonIconPosition[] a() {
        return new ButtonIconPosition[]{START, END};
    }

    public static kotlin.enums.a getEntries() {
        return f151497b;
    }

    public static ButtonIconPosition valueOf(String r1) {
        return (ButtonIconPosition) Enum.valueOf(ButtonIconPosition.class, r1);
    }

    public static ButtonIconPosition[] values() {
        return (ButtonIconPosition[]) f151496a.clone();
    }
}
