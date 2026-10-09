package com.stockbit.feature.trusteddevice.base.setuperror;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/feature/trusteddevice/base/setuperror/ButtonType;", "", "<init>", "(Ljava/lang/String;I)V", "PRIMARY", "SECONDARY", "trusteddevice_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum ButtonType extends Enum<ButtonType> {
    public static final ButtonType PRIMARY = null;
    public static final ButtonType SECONDARY = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ButtonType[] f117626a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f117627b = null;

    static {
        PRIMARY = new ButtonType("PRIMARY", 0);
        SECONDARY = new ButtonType("SECONDARY", 1);
        ButtonType[] r02 = a();
        f117626a = r02;
        f117627b = kotlin.enums.b.a(r02);
    }

    ButtonType(String r1, int r2) {
    }

    public static final /* synthetic */ ButtonType[] a() {
        return new ButtonType[]{PRIMARY, SECONDARY};
    }

    public static kotlin.enums.a getEntries() {
        return f117627b;
    }

    public static ButtonType valueOf(String r1) {
        return (ButtonType) Enum.valueOf(ButtonType.class, r1);
    }

    public static ButtonType[] values() {
        return (ButtonType[]) f117626a.clone();
    }
}
