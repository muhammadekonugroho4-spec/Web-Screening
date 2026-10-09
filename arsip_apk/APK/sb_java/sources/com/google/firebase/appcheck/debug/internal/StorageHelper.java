package com.google.firebase.appcheck.debug.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes6.dex */
public class StorageHelper {
    static final String DEBUG_SECRET_KEY = "com.google.firebase.appcheck.debug.DEBUG_SECRET";
    static final String PREFS_TEMPLATE = "com.google.firebase.appcheck.debug.store.%s";
    private final SharedPreferences sharedPreferences;

    public StorageHelper(Context r2, String r3) {
        Preconditions.checkNotNull(r2);
        Preconditions.checkNotEmpty(r3);
        this.sharedPreferences = r2.getSharedPreferences(String.format(PREFS_TEMPLATE, new Object[]{r3}), 0);
    }

    public String retrieveDebugSecret() {
        return this.sharedPreferences.getString(DEBUG_SECRET_KEY, null);
    }

    public void saveDebugSecret(String r3) {
        this.sharedPreferences.edit().putString(DEBUG_SECRET_KEY, r3).apply();
    }
}
