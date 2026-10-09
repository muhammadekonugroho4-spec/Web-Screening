package com.clevertap.android.sdk.displayunits;

import android.text.TextUtils;
import android.util.Log;
import com.clevertap.android.sdk.Constants;

/* loaded from: classes4.dex */
public enum CTDisplayUnitType extends Enum<CTDisplayUnitType> {
    public static final CTDisplayUnitType CAROUSEL = null;
    public static final CTDisplayUnitType CAROUSEL_WITH_IMAGE = null;
    public static final CTDisplayUnitType CUSTOM_KEY_VALUE = null;
    public static final CTDisplayUnitType MESSAGE_WITH_ICON = null;
    public static final CTDisplayUnitType SIMPLE = null;
    public static final CTDisplayUnitType SIMPLE_WITH_IMAGE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CTDisplayUnitType[] f33823a = null;
    public final String type;

    static {
        SIMPLE = new CTDisplayUnitType("SIMPLE", 0, "simple");
        SIMPLE_WITH_IMAGE = new CTDisplayUnitType("SIMPLE_WITH_IMAGE", 1, "simple-image");
        CAROUSEL = new CTDisplayUnitType("CAROUSEL", 2, "carousel");
        CAROUSEL_WITH_IMAGE = new CTDisplayUnitType("CAROUSEL_WITH_IMAGE", 3, "carousel-image");
        MESSAGE_WITH_ICON = new CTDisplayUnitType("MESSAGE_WITH_ICON", 4, "message-icon");
        CUSTOM_KEY_VALUE = new CTDisplayUnitType("CUSTOM_KEY_VALUE", 5, "custom-key-value");
        f33823a = a();
    }

    CTDisplayUnitType(String r1, int r2, String r3) {
        this.type = r3;
    }

    public static /* synthetic */ CTDisplayUnitType[] a() {
        return new CTDisplayUnitType[]{SIMPLE, SIMPLE_WITH_IMAGE, CAROUSEL, CAROUSEL_WITH_IMAGE, MESSAGE_WITH_ICON, CUSTOM_KEY_VALUE};
    }

    public static CTDisplayUnitType type(String r2) {
        if (TextUtils.isEmpty(r2) == true) goto L45;
        r2.getClass();
        char r02 = 65535;
        switch(r2.hashCode()) {
            case -1799711058: goto L28;
            case -1332589953: goto L24;
            case -902286926: goto L20;
            case -876980953: goto L16;
            case 2908512: goto L12;
            case 1818845568: goto L8;
            default: goto L31;
        };
    L31:
        switch(r02) {
            case 0: goto L44;
            case 1: goto L42;
            case 2: goto L40;
            case 3: goto L38;
            case 4: goto L36;
            case 5: goto L34;
            default: goto L45;
        };
    L34:
        return SIMPLE_WITH_IMAGE;
    L36:
        return CAROUSEL;
    L38:
        return CUSTOM_KEY_VALUE;
    L40:
        return SIMPLE;
    L42:
        return MESSAGE_WITH_ICON;
    L44:
        return CAROUSEL_WITH_IMAGE;
    L8:
        if (r2.equals("simple-image") == false) goto L31;
        r02 = 5;
        goto L31
    L12:
        if (r2.equals("carousel") == false) goto L31;
        r02 = 4;
        goto L31
    L16:
        if (r2.equals("custom-key-value") == false) goto L31;
        r02 = 3;
        goto L31
    L20:
        if (r2.equals("simple") == false) goto L31;
        r02 = 2;
        goto L31
    L24:
        if (r2.equals("message-icon") == false) goto L31;
        r02 = 1;
        goto L31
    L28:
        if (r2.equals("carousel-image") == false) goto L31;
        r02 = 0;
    L45:
        Log.d(Constants.FEATURE_DISPLAY_UNIT, "Unsupported Display Unit Type");
        return null;
    }

    public static CTDisplayUnitType valueOf(String r1) {
        return (CTDisplayUnitType) Enum.valueOf(CTDisplayUnitType.class, r1);
    }

    public static CTDisplayUnitType[] values() {
        return (CTDisplayUnitType[]) f33823a.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.type;
    }
}
