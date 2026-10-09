package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import com.google.firebase.crashlytics.internal.settings.Settings;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class DefaultSettingsJsonTransform implements SettingsJsonTransform {
    public DefaultSettingsJsonTransform() {
    }

    public static Settings defaultSettings(CurrentTimeProvider r12) {
        return new Settings(r12.getCurrentTimeMillis() + 3600000, new Settings.SessionData(8, 4), new Settings.FeatureFlagData(true, false, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsJsonTransform
    public Settings buildFromJson(CurrentTimeProvider r1, JSONObject r2) {
        return defaultSettings(r1);
    }
}
