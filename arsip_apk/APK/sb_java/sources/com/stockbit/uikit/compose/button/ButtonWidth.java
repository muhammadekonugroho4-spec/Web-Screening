package com.stockbit.uikit.compose.button;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/uikit/compose/button/ButtonWidth;", "", "<init>", "(Ljava/lang/String;I)V", "NORMAL", "STICKY", "STICKYROUND", "uikit_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.e
/* loaded from: classes11.dex */
public enum ButtonWidth extends Enum<ButtonWidth> {
    public static final ButtonWidth NORMAL = null;
    public static final ButtonWidth STICKY = null;
    public static final ButtonWidth STICKYROUND = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ButtonWidth[] f151510a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f151511b = null;

    static {
        NORMAL = new ButtonWidth("NORMAL", 0);
        STICKY = new ButtonWidth("STICKY", 1);
        STICKYROUND = new ButtonWidth("STICKYROUND", 2);
        ButtonWidth[] r02 = a();
        f151510a = r02;
        f151511b = kotlin.enums.b.a(r02);
    }

    ButtonWidth(String r1, int r2) {
    }

    public static final /* synthetic */ ButtonWidth[] a() {
        return new ButtonWidth[]{NORMAL, STICKY, STICKYROUND};
    }

    public static kotlin.enums.a getEntries() {
        return f151511b;
    }

    public static ButtonWidth valueOf(String r1) {
        return (ButtonWidth) Enum.valueOf(ButtonWidth.class, r1);
    }

    public static ButtonWidth[] values() {
        return (ButtonWidth[]) f151510a.clone();
    }
}
