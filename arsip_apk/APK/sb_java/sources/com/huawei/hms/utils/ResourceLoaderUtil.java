package com.huawei.hms.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.clevertap.android.sdk.Constants;

/* loaded from: classes6.dex */
public abstract class ResourceLoaderUtil {

    /* renamed from: a, reason: collision with root package name */
    private static Context f39558a;

    /* renamed from: b, reason: collision with root package name */
    private static String f39559b;

    public ResourceLoaderUtil() {
    }

    public static int getAnimId(String r3) {
        return f39558a.getResources().getIdentifier(r3, "anim", f39559b);
    }

    public static int getColorId(String r3) {
        return f39558a.getResources().getIdentifier(r3, Constants.KEY_COLOR, f39559b);
    }

    public static int getDimenId(String r3) {
        return f39558a.getResources().getIdentifier(r3, "dimen", f39559b);
    }

    public static Drawable getDrawable(String r1) {
        return f39558a.getResources().getDrawable(getDrawableId(r1));
    }

    public static int getDrawableId(String r3) {
        return f39558a.getResources().getIdentifier(r3, "drawable", f39559b);
    }

    public static int getIdId(String r3) {
        return f39558a.getResources().getIdentifier(r3, Constants.KEY_ID, f39559b);
    }

    public static int getLayoutId(String r3) {
        return f39558a.getResources().getIdentifier(r3, "layout", f39559b);
    }

    public static String getString(String r1) {
        return f39558a.getResources().getString(getStringId(r1));
    }

    public static int getStringId(String r3) {
        return f39558a.getResources().getIdentifier(r3, "string", f39559b);
    }

    public static int getStyleId(String r3) {
        return f39558a.getResources().getIdentifier(r3, "style", f39559b);
    }

    public static Context getmContext() {
        return f39558a;
    }

    public static void setmContext(Context r02) {
        f39558a = r02;
        f39559b = r02.getPackageName();
    }

    public static String getString(String r1, Object... r2) {
        return f39558a.getResources().getString(getStringId(r1), r2);
    }
}
