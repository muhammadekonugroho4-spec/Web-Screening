package com.stockbit.uikit.compose.button;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/uikit/compose/button/ButtonPrimaryWidth;", "", "<init>", "(Ljava/lang/String;I)V", "NORMAL", "STICKY", "STICKYROUND", "uikit_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum ButtonPrimaryWidth extends Enum<ButtonPrimaryWidth> {
    public static final ButtonPrimaryWidth NORMAL = null;
    public static final ButtonPrimaryWidth STICKY = null;
    public static final ButtonPrimaryWidth STICKYROUND = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ButtonPrimaryWidth[] f151504a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f151505b = null;

    static {
        NORMAL = new ButtonPrimaryWidth("NORMAL", 0);
        STICKY = new ButtonPrimaryWidth("STICKY", 1);
        STICKYROUND = new ButtonPrimaryWidth("STICKYROUND", 2);
        ButtonPrimaryWidth[] r02 = a();
        f151504a = r02;
        f151505b = kotlin.enums.b.a(r02);
    }

    ButtonPrimaryWidth(String r1, int r2) {
    }

    public static final /* synthetic */ ButtonPrimaryWidth[] a() {
        return new ButtonPrimaryWidth[]{NORMAL, STICKY, STICKYROUND};
    }

    public static kotlin.enums.a getEntries() {
        return f151505b;
    }

    public static ButtonPrimaryWidth valueOf(String r1) {
        return (ButtonPrimaryWidth) Enum.valueOf(ButtonPrimaryWidth.class, r1);
    }

    public static ButtonPrimaryWidth[] values() {
        return (ButtonPrimaryWidth[]) f151504a.clone();
    }
}
