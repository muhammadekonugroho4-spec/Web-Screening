package com.google.firebase.remoteconfig.internal;

import android.os.Bundle;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class Personalization {
    public static final String ANALYTICS_ORIGIN_PERSONALIZATION = "fp";
    public static final String ARM_INDEX = "armIndex";
    public static final String CHOICE_ID = "choiceId";
    public static final String EXTERNAL_ARM_INDEX_PARAM = "arm_index";
    public static final String EXTERNAL_ARM_VALUE_PARAM = "arm_value";
    public static final String EXTERNAL_EVENT = "personalization_assignment";
    public static final String EXTERNAL_GROUP_PARAM = "group";
    public static final String EXTERNAL_PERSONALIZATION_ID_PARAM = "personalization_id";
    public static final String EXTERNAL_RC_PARAMETER_PARAM = "arm_key";
    public static final String GROUP = "group";
    public static final String INTERNAL_CHOICE_ID_PARAM = "_fpid";
    public static final String INTERNAL_EVENT = "_fpc";
    public static final String PERSONALIZATION_ID = "personalizationId";
    private final Provider<AnalyticsConnector> analyticsConnector;
    private final Map<String, String> loggedChoiceIds;

    public Personalization(Provider<AnalyticsConnector> r2) {
        this.loggedChoiceIds = Collections.synchronizedMap(new HashMap());
        this.analyticsConnector = r2;
    }

    public void logArmActive(String r6, ConfigContainer r7) {
        AnalyticsConnector r02 = this.analyticsConnector.get();
        if (r02 == null) goto L32;
        JSONObject r1 = r7.getPersonalizationMetadata();
        if (r1.length() < 1) goto L33;
        JSONObject r72 = r7.getConfigs();
        if (r72.length() < 1) goto L34;
        JSONObject r12 = r1.optJSONObject(r6);
        if (r12 == null) goto L35;
        String r2 = r12.optString(CHOICE_ID);
        if (r2.isEmpty() == false) goto L17;
        return;
    L17:
        Map<String, String> r3 = this.loggedChoiceIds;
        monitor-enter(r3);
    L23:
        th = move-exception;
        throw th;
    L20:
        if (r2.equals(this.loggedChoiceIds.get(r6)) == false) goto L25;
        monitor-exit(r3);     // Catch: Throwable -> L23
        return;
    L25:
        this.loggedChoiceIds.put(r6, r2);     // Catch: Throwable -> L23
        monitor-exit(r3);     // Catch: Throwable -> L23
        Bundle r32 = new Bundle();
        r32.putString(EXTERNAL_RC_PARAMETER_PARAM, r6);
        r32.putString(EXTERNAL_ARM_VALUE_PARAM, r72.optString(r6));
        r32.putString(EXTERNAL_PERSONALIZATION_ID_PARAM, r12.optString(PERSONALIZATION_ID));
        r32.putInt(EXTERNAL_ARM_INDEX_PARAM, r12.optInt(ARM_INDEX, -1));
        r32.putString("group", r12.optString("group"));
        r02.logEvent(ANALYTICS_ORIGIN_PERSONALIZATION, EXTERNAL_EVENT, r32);
        Bundle r62 = new Bundle();
        r62.putString(INTERNAL_CHOICE_ID_PARAM, r2);
        r02.logEvent(ANALYTICS_ORIGIN_PERSONALIZATION, INTERNAL_EVENT, r62);
        return;
    L35:
        return;
    L34:
        return;
    L33:
        return;
    }
}
