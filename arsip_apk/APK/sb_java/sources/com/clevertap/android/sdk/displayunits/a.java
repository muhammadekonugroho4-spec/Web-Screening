package com.clevertap.android.sdk.displayunits;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnit;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f33824a;

    public a() {
        this.f33824a = new HashMap();
    }

    public synchronized CleverTapDisplayUnit a(String r2) {
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (TextUtils.isEmpty(r2) == true) goto L10;
        CleverTapDisplayUnit r22 = (CleverTapDisplayUnit) this.f33824a.get(r2);     // Catch: Throwable -> L8
        monitor-exit(this);
        return r22;
    L10:
        Logger.d(Constants.FEATURE_DISPLAY_UNIT, "Can't return Display Unit, id was null");     // Catch: Throwable -> L8
        monitor-exit(this);
        return null;
    }

    public synchronized void b() {
        monitor-enter(this);
        this.f33824a.clear();     // Catch: Throwable -> L6
        Logger.d(Constants.FEATURE_DISPLAY_UNIT, "Cleared Display Units Cache");     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    public synchronized ArrayList c(JSONArray r7) {
        monitor-enter(this);
        b();     // Catch: Throwable -> L14
        ArrayList r02 = null;
        if (r7 != null) goto L6;
    L28:
        Logger.d(Constants.FEATURE_DISPLAY_UNIT, "Null json array response can't parse Display Units ");     // Catch: Throwable -> L14
        monitor-exit(this);
        return null;
    L6:
        if (r7.length() <= 0) goto L28;
        ArrayList r1 = new ArrayList();     // Catch: Throwable -> L14
        int r2 = 0;
    L33:
        if (r2 >= r7.length()) goto L21;
        CleverTapDisplayUnit r3 = CleverTapDisplayUnit.e((JSONObject) r7.get(r2));     // Catch: Throwable -> L14 Exception -> L16
        if (TextUtils.isEmpty(r3.getError()) == false) goto L18;
        this.f33824a.put(r3.c(), r3);     // Catch: Throwable -> L14 Exception -> L16
        r1.add(r3);     // Catch: Throwable -> L14 Exception -> L16
    L19:
        r2 = r2 + 1;
        goto L33
    L18:
        Logger.d(Constants.FEATURE_DISPLAY_UNIT, "Failed to convert JsonArray item at index:" + r2 + " to Display Unit");     // Catch: Throwable -> L14 Exception -> L16
        goto L19
    L21:
        if (r1.isEmpty() == true) goto L23;
        r02 = r1;
    L23:
        monitor-exit(this);
        return r02;
    L16:
        e = move-exception;
        Logger.d(Constants.FEATURE_DISPLAY_UNIT, "Failed while parsing Display Unit:" + e.getLocalizedMessage());     // Catch: Throwable -> L14
        return null;
    L14:
        th = move-exception;
        throw th;
    }
}
