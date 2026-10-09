package com.stockbit.component.dialog.ordertype;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B1\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/stockbit/component/dialog/ordertype/OrderSettingType;", "", Constants.KEY_TITLE, "", "subtitle", "switchTagId", "image", "<init>", "(Ljava/lang/String;IIIII)V", "getTitle", "()I", "getSubtitle", "getSwitchTagId", "getImage", "BRACKET_ORDER", "VOLUME_TRIGGER_ORDER", "SPLIT_ORDER", "dialog_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum OrderSettingType extends Enum<OrderSettingType> {
    public static final OrderSettingType BRACKET_ORDER = null;
    public static final OrderSettingType SPLIT_ORDER = null;
    public static final OrderSettingType VOLUME_TRIGGER_ORDER = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OrderSettingType[] f70317a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f70318b = null;
    private final int image;
    private final int subtitle;
    private final int switchTagId;
    private final int title;

    static {
        int r3 = com.stockbit.component.dialog.e.f70271o0;
        int r4 = com.stockbit.component.dialog.e.f70249d0;
        int r6 = com.stockbit.component.dialog.b.f70131i;
        BRACKET_ORDER = new OrderSettingType("BRACKET_ORDER", 0, r3, r4, com.stockbit.component.dialog.e.f70245b, r6);
        int r42 = com.stockbit.component.dialog.e.f70263k0;
        int r5 = com.stockbit.component.dialog.e.f70259i0;
        int r7 = com.stockbit.component.dialog.b.f70135m;
        VOLUME_TRIGGER_ORDER = new OrderSettingType("VOLUME_TRIGGER_ORDER", 1, r42, r5, com.stockbit.component.dialog.e.f70243a, r7);
        int r52 = com.stockbit.component.dialog.e.f70257h0;
        int r62 = com.stockbit.component.dialog.e.f70255g0;
        int r8 = com.stockbit.component.dialog.b.f70132j;
        SPLIT_ORDER = new OrderSettingType("SPLIT_ORDER", 2, r52, r62, com.stockbit.component.dialog.e.f70247c, r8);
        OrderSettingType[] r02 = a();
        f70317a = r02;
        f70318b = kotlin.enums.b.a(r02);
    }

    OrderSettingType(String r1, int r2, int r3, int r4, int r5, int r6) {
        this.title = r3;
        this.subtitle = r4;
        this.switchTagId = r5;
        this.image = r6;
    }

    public static final /* synthetic */ OrderSettingType[] a() {
        return new OrderSettingType[]{BRACKET_ORDER, VOLUME_TRIGGER_ORDER, SPLIT_ORDER};
    }

    public static kotlin.enums.a getEntries() {
        return f70318b;
    }

    public static OrderSettingType valueOf(String r1) {
        return (OrderSettingType) Enum.valueOf(OrderSettingType.class, r1);
    }

    public static OrderSettingType[] values() {
        return (OrderSettingType[]) f70317a.clone();
    }

    public final int getImage() {
        return this.image;
    }

    public final int getSubtitle() {
        return this.subtitle;
    }

    public final int getSwitchTagId() {
        return this.switchTagId;
    }

    public final int getTitle() {
        return this.title;
    }
}
