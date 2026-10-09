package com.stockbit.uikit.input;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/uikit/input/InputMaskStyle;", "", "<init>", "(Ljava/lang/String;I)V", "TEXT", "NPWP", "uikit_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum InputMaskStyle extends Enum<InputMaskStyle> {
    public static final InputMaskStyle NPWP = null;
    public static final InputMaskStyle TEXT = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ InputMaskStyle[] f153270a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f153271b = null;

    static {
        TEXT = new InputMaskStyle("TEXT", 0);
        NPWP = new InputMaskStyle("NPWP", 1);
        InputMaskStyle[] r02 = a();
        f153270a = r02;
        f153271b = kotlin.enums.b.a(r02);
    }

    InputMaskStyle(String r1, int r2) {
    }

    public static final /* synthetic */ InputMaskStyle[] a() {
        return new InputMaskStyle[]{TEXT, NPWP};
    }

    public static kotlin.enums.a getEntries() {
        return f153271b;
    }

    public static InputMaskStyle valueOf(String r1) {
        return (InputMaskStyle) Enum.valueOf(InputMaskStyle.class, r1);
    }

    public static InputMaskStyle[] values() {
        return (InputMaskStyle[]) f153270a.clone();
    }
}
