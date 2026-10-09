package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import com.google.firebase.crashlytics.internal.settings.Settings;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class SettingsV3JsonTransform implements SettingsJsonTransform {
    public SettingsV3JsonTransform() {
    }

    private static Settings.FeatureFlagData buildFeatureFlagDataFrom(JSONObject r4) {
        return new Settings.FeatureFlagData(r4.optBoolean("collect_reports", true), r4.optBoolean("collect_anrs", false), r4.optBoolean("collect_build_ids", false));
    }

    private static Settings.SessionData buildSessionDataFrom(JSONObject r2) {
        return new Settings.SessionData(r2.optInt("max_custom_exception_events", 8), 4);
    }

    private static long getExpiresAtFrom(CurrentTimeProvider r4, long r5, JSONObject r7) {
        if (r7.has("expires_at") == false) goto L7;
        return r7.optLong("expires_at");
    L7:
        return r4.getCurrentTimeMillis() + (r5 * 1000);
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsJsonTransform
    public Settings buildFromJson(CurrentTimeProvider r16, JSONObject r17) throws JSONException {
        int r8 = r17.optInt("settings_version", 0);
        int r9 = r17.optInt("cache_duration", 3600);
        double r10 = r17.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double r12 = r17.optDouble("on_demand_backoff_base", 1.2d);
        int r14 = r17.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (r17.has("session") == false) goto L6;
        Settings.SessionData r1 = buildSessionDataFrom(r17.getJSONObject("session"));
    L8:
        return new Settings(getExpiresAtFrom(r16, r9, r17), r1, buildFeatureFlagDataFrom(r17.getJSONObject("features")), r8, r9, r10, r12, r14);
    L6:
        r1 = buildSessionDataFrom(new JSONObject());
        goto L8
    }
}
