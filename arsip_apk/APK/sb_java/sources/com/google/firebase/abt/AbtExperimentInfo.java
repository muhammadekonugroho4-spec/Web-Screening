package com.google.firebase.abt;

import android.text.TextUtils;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes6.dex */
public class AbtExperimentInfo {
    private static final String[] ALL_REQUIRED_KEYS = null;
    static final String EXPERIMENT_ID_KEY = "experimentId";
    static final String EXPERIMENT_START_TIME_KEY = "experimentStartTime";
    static final String TIME_TO_LIVE_KEY = "timeToLiveMillis";
    static final String TRIGGER_EVENT_KEY = "triggerEvent";
    static final String TRIGGER_TIMEOUT_KEY = "triggerTimeoutMillis";
    static final String VARIANT_ID_KEY = "variantId";
    static final DateFormat protoTimestampStringParser = null;
    private final String experimentId;
    private final Date experimentStartTime;
    private final long timeToLiveInMillis;
    private final String triggerEventName;
    private final long triggerTimeoutInMillis;
    private final String variantId;

    static {
        ALL_REQUIRED_KEYS = new String[]{"experimentId", EXPERIMENT_START_TIME_KEY, TIME_TO_LIVE_KEY, TRIGGER_TIMEOUT_KEY, "variantId"};
        protoTimestampStringParser = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
    }

    public AbtExperimentInfo(String r1, String r2, String r3, Date r4, long r5, long r7) {
        this.experimentId = r1;
        this.variantId = r2;
        this.triggerEventName = r3;
        this.experimentStartTime = r4;
        this.triggerTimeoutInMillis = r5;
        this.timeToLiveInMillis = r7;
    }

    public static AbtExperimentInfo fromConditionalUserProperty(AnalyticsConnector.ConditionalUserProperty r10) {
        String r02 = r10.triggerEventName;
        if (r02 == null) goto L5;
    L4:
        String r4 = r02;
        return new AbtExperimentInfo(r10.name, String.valueOf(r10.value), r4, new Date(r10.creationTimestamp), r10.triggerTimeout, r10.timeToLive);
    L5:
        r02 = "";
        goto L4
    }

    public static AbtExperimentInfo fromMap(Map<String, String> r12) throws AbtException {
        validateExperimentInfoMap(r12);
        Date r7 = protoTimestampStringParser.parse(r12.get(EXPERIMENT_START_TIME_KEY));     // Catch: NumberFormatException -> L10 ParseException -> L13
        long r8 = Long.parseLong(r12.get(TRIGGER_TIMEOUT_KEY));     // Catch: NumberFormatException -> L10 ParseException -> L13
        long r10 = Long.parseLong(r12.get(TIME_TO_LIVE_KEY));     // Catch: NumberFormatException -> L10 ParseException -> L13
        String r4 = r12.get("experimentId");     // Catch: NumberFormatException -> L10 ParseException -> L13
        String r5 = r12.get("variantId");     // Catch: NumberFormatException -> L10 ParseException -> L13
        if (r12.containsKey(TRIGGER_EVENT_KEY) == false) goto L7;
        String r122 = r12.get(TRIGGER_EVENT_KEY);     // Catch: NumberFormatException -> L10 ParseException -> L13
    L8:
        return new AbtExperimentInfo(r4, r5, r122, r7, r8, r10);
    L7:
        r122 = "";
    L10:
        e = move-exception;
        throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e);
    L13:
        e = move-exception;
        throw new AbtException("Could not process experiment: parsing experiment start time failed.", e);
    }

    public static void validateAbtExperimentInfo(AbtExperimentInfo r02) throws AbtException {
        validateExperimentInfoMap(r02.toStringMap());
    }

    private static void validateExperimentInfoMap(Map<String, String> r6) throws AbtException {
        ArrayList r02 = new ArrayList();
        String[] r1 = ALL_REQUIRED_KEYS;
        int r2 = r1.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L9;
        String r4 = r1[r3];
        if (r6.containsKey(r4) == true) goto L7;
        r02.add(r4);
    L7:
        r3 = r3 + 1;
        goto L3
    L9:
        if (r02.isEmpty() == false) goto L12;
        return;
    L12:
        throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", new Object[]{r02}));
    }

    public String getExperimentId() {
        return this.experimentId;
    }

    public long getStartTimeInMillisSinceEpoch() {
        return this.experimentStartTime.getTime();
    }

    public long getTimeToLiveInMillis() {
        return this.timeToLiveInMillis;
    }

    public String getTriggerEventName() {
        return this.triggerEventName;
    }

    public long getTriggerTimeoutInMillis() {
        return this.triggerTimeoutInMillis;
    }

    public String getVariantId() {
        return this.variantId;
    }

    public AnalyticsConnector.ConditionalUserProperty toConditionalUserProperty(String r4) {
        AnalyticsConnector.ConditionalUserProperty r02 = new AnalyticsConnector.ConditionalUserProperty();
        r02.origin = r4;
        r02.creationTimestamp = getStartTimeInMillisSinceEpoch();
        r02.name = this.experimentId;
        r02.value = this.variantId;
        if (TextUtils.isEmpty(this.triggerEventName) == false) goto L5;
        String r42 = null;
    L6:
        r02.triggerEventName = r42;
        r02.triggerTimeout = this.triggerTimeoutInMillis;
        r02.timeToLive = this.timeToLiveInMillis;
        return r02;
    L5:
        r42 = this.triggerEventName;
        goto L6
    }

    public Map<String, String> toStringMap() {
        HashMap r02 = new HashMap();
        r02.put("experimentId", this.experimentId);
        r02.put("variantId", this.variantId);
        r02.put(TRIGGER_EVENT_KEY, this.triggerEventName);
        r02.put(EXPERIMENT_START_TIME_KEY, protoTimestampStringParser.format(this.experimentStartTime));
        r02.put(TRIGGER_TIMEOUT_KEY, Long.toString(this.triggerTimeoutInMillis));
        r02.put(TIME_TO_LIVE_KEY, Long.toString(this.timeToLiveInMillis));
        return r02;
    }
}
