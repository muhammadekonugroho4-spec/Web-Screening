package com.google.android.gms.common.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes5.dex */
public class SharedPreferencesUtils {
    private SharedPreferencesUtils() {
    }

    @KeepForSdk
    @Deprecated
    public static void publishWorldReadableSharedPreferences(Context r02, SharedPreferences.Editor r1, String r2) {
        throw new IllegalStateException("world-readable shared preferences should only be used by apk");
    }
}
