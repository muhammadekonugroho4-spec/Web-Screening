package com.stockbit.uikit.compose.button;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/stockbit/uikit/compose/button/ButtonSize;", "", "height", "Landroidx/compose/ui/unit/Dp;", "iconSize", "<init>", "(Ljava/lang/String;IFF)V", "getHeight-D9Ej5fM", "()F", "F", "getIconSize-D9Ej5fM", "DEFAULT", "LARGE", "EXTRA_LARGE", "MEDIUM", "SMALL", "uikit_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum ButtonSize extends Enum<ButtonSize> {
    public static final ButtonSize DEFAULT = null;
    public static final ButtonSize EXTRA_LARGE = null;
    public static final ButtonSize LARGE = null;
    public static final ButtonSize MEDIUM = null;
    public static final ButtonSize SMALL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ButtonSize[] f151506a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f151507b = null;
    private final float height;
    private final float iconSize;

    static {
        float r1 = 44;
        float r3 = 18;
        DEFAULT = new ButtonSize("DEFAULT", 0, androidx.compose.ui.unit.i.h(r1), androidx.compose.ui.unit.i.h(r3));
        LARGE = new ButtonSize("LARGE", 1, androidx.compose.ui.unit.i.h(r1), androidx.compose.ui.unit.i.h(r3));
        EXTRA_LARGE = new ButtonSize("EXTRA_LARGE", 2, androidx.compose.ui.unit.i.h(r1), androidx.compose.ui.unit.i.h(r3));
        MEDIUM = new ButtonSize("MEDIUM", 3, androidx.compose.ui.unit.i.h(40), androidx.compose.ui.unit.i.h(16));
        SMALL = new ButtonSize("SMALL", 4, androidx.compose.ui.unit.i.h(28), androidx.compose.ui.unit.i.h(12));
        ButtonSize[] r02 = a();
        f151506a = r02;
        f151507b = kotlin.enums.b.a(r02);
    }

    ButtonSize(String r1, int r2, float r3, float r4) {
        this.height = r3;
        this.iconSize = r4;
    }

    public static final /* synthetic */ ButtonSize[] a() {
        return new ButtonSize[]{DEFAULT, LARGE, EXTRA_LARGE, MEDIUM, SMALL};
    }

    public static kotlin.enums.a getEntries() {
        return f151507b;
    }

    public static ButtonSize valueOf(String r1) {
        return (ButtonSize) Enum.valueOf(ButtonSize.class, r1);
    }

    public static ButtonSize[] values() {
        return (ButtonSize[]) f151506a.clone();
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m740getHeightD9Ej5fM() {
        return this.height;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m741getIconSizeD9Ej5fM() {
        return this.iconSize;
    }
}
