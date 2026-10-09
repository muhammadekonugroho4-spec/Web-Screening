package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class CachedSettingsIo {
    private static final String SETTINGS_CACHE_FILENAME = "com.crashlytics.settings.json";
    private final File cachedSettingsFile;

    public CachedSettingsIo(FileStore r2) {
        this.cachedSettingsFile = r2.getCommonFile(SETTINGS_CACHE_FILENAME);
    }

    private File getSettingsFile() {
        return this.cachedSettingsFile;
    }

    public JSONObject readCachedSettings() {
        Logger.getLogger().d("Checking for cached settings...");
        FileInputStream r1 = null;
        File r2 = getSettingsFile();     // Catch: Throwable -> L12 Exception -> L14
        if (r2.exists() == false) goto L16;
        FileInputStream r3 = new FileInputStream(r2);     // Catch: Throwable -> L12 Exception -> L14
        JSONObject r4 = new JSONObject(CommonUtils.streamToString(r3));     // Catch: Throwable -> L8 Exception -> L10
        r1 = r3;
    L18:
        CommonUtils.closeOrLog(r1, "Error while closing settings cache file.");
        return r4;
    L10:
        e = e;
    L20:
        Logger.getLogger().e("Failed to fetch cached settings", e);     // Catch: Throwable -> L8
        CommonUtils.closeOrLog(r3, "Error while closing settings cache file.");
        return null;
    L16:
        Logger.getLogger().v("Settings file does not exist.");     // Catch: Throwable -> L12 Exception -> L14
        r4 = null;
    L8:
        Throwable th = th;
    L23:
        CommonUtils.closeOrLog(null, "Error while closing settings cache file.");
        throw th;
    L14:
        e = e;
        r3 = null;
    L12:
        th = move-exception;
        th = th;
        goto L23
    }

    public void writeCachedSettings(long r4, JSONObject r6) {
        Logger.getLogger().v("Writing settings to cache file...");
        if (r6 == null) goto L20;
        FileWriter r1 = null;
        r6.put("expires_at", r4);     // Catch: Throwable -> L13 Exception -> L15
        FileWriter r42 = new FileWriter(getSettingsFile());     // Catch: Throwable -> L13 Exception -> L15
        r42.write(r6.toString());     // Catch: Throwable -> L9 Exception -> L11
        r42.flush();     // Catch: Throwable -> L9 Exception -> L11
        CommonUtils.closeOrLog(r42, "Failed to close settings writer.");
        return;
    L11:
        e = e;
        r1 = r42;
    L16:
        Logger.getLogger().e("Failed to cache settings", e);     // Catch: Throwable -> L13
        CommonUtils.closeOrLog(r1, "Failed to close settings writer.");
        return;
    L9:
        th = th;
        r1 = r42;
    L18:
        CommonUtils.closeOrLog(r1, "Failed to close settings writer.");
        throw th;
    L13:
        th = th;
    L15:
        e = e;
        goto L16
    }
}
