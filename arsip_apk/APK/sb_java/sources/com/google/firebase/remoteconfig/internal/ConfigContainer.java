package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class ConfigContainer {
    static final String ABT_EXPERIMENTS_KEY = "abt_experiments_key";
    static final String CONFIGS_KEY = "configs_key";
    private static final Date DEFAULTS_FETCH_TIME = null;
    static final String FETCH_TIME_KEY = "fetch_time_key";
    static final String PERSONALIZATION_METADATA_KEY = "personalization_metadata_key";
    public static final String ROLLOUT_METADATA_AFFECTED_KEYS = "affectedParameterKeys";
    public static final String ROLLOUT_METADATA_ID = "rolloutId";
    static final String ROLLOUT_METADATA_KEY = "rollout_metadata_key";
    public static final String ROLLOUT_METADATA_VARIANT_ID = "variantId";
    static final String TEMPLATE_VERSION_NUMBER_KEY = "template_version_number_key";
    private JSONArray abtExperiments;
    private JSONObject configsJson;
    private JSONObject containerJson;
    private Date fetchTime;
    private JSONObject personalizationMetadata;
    private JSONArray rolloutMetadata;
    private long templateVersionNumber;

    /* renamed from: com.google.firebase.remoteconfig.internal.ConfigContainer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder {
        private JSONArray builderAbtExperiments;
        private JSONObject builderConfigsJson;
        private Date builderFetchTime;
        private JSONObject builderPersonalizationMetadata;
        private JSONArray builderRolloutMetadata;
        private long builderTemplateVersionNumber;

        public /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        public ConfigContainer build() throws JSONException {
            return new ConfigContainer(this.builderConfigsJson, this.builderFetchTime, this.builderAbtExperiments, this.builderPersonalizationMetadata, this.builderTemplateVersionNumber, this.builderRolloutMetadata, null);
        }

        public Builder replaceConfigsWith(Map<String, String> r2) {
            this.builderConfigsJson = new JSONObject(r2);
            return this;
        }

        public Builder withAbtExperiments(JSONArray r2) {
            this.builderAbtExperiments = new JSONArray(r2.toString());     // Catch: JSONException -> L4
        L3:
            return this;
        }

        public Builder withFetchTime(Date r1) {
            this.builderFetchTime = r1;
            return this;
        }

        public Builder withPersonalizationMetadata(JSONObject r2) {
            this.builderPersonalizationMetadata = new JSONObject(r2.toString());     // Catch: JSONException -> L4
        L3:
            return this;
        }

        public Builder withRolloutMetadata(JSONArray r2) {
            this.builderRolloutMetadata = new JSONArray(r2.toString());     // Catch: JSONException -> L4
        L3:
            return this;
        }

        public Builder withTemplateVersionNumber(long r1) {
            this.builderTemplateVersionNumber = r1;
            return this;
        }

        private Builder() {
            this.builderConfigsJson = new JSONObject();
            this.builderFetchTime = ConfigContainer.access$000();
            this.builderAbtExperiments = new JSONArray();
            this.builderPersonalizationMetadata = new JSONObject();
            this.builderTemplateVersionNumber = 0;
            this.builderRolloutMetadata = new JSONArray();
        }

        public Builder replaceConfigsWith(JSONObject r2) {
            this.builderConfigsJson = new JSONObject(r2.toString());     // Catch: JSONException -> L4
        L3:
            return this;
        }

        public Builder(ConfigContainer r3) {
            this.builderConfigsJson = r3.getConfigs();
            this.builderFetchTime = r3.getFetchTime();
            this.builderAbtExperiments = r3.getAbtExperiments();
            this.builderPersonalizationMetadata = r3.getPersonalizationMetadata();
            this.builderTemplateVersionNumber = r3.getTemplateVersionNumber();
            this.builderRolloutMetadata = r3.getRolloutMetadata();
        }
    }

    static {
        DEFAULTS_FETCH_TIME = new Date(0);
    }

    public /* synthetic */ ConfigContainer(JSONObject r1, Date r2, JSONArray r3, JSONObject r4, long r5, JSONArray r7, AnonymousClass1 r8) throws JSONException {
        this(r1, r2, r3, r4, r5, r7);
    }

    public static /* synthetic */ Date access$000() {
        return DEFAULTS_FETCH_TIME;
    }

    public static ConfigContainer copyOf(JSONObject r9) throws JSONException {
        JSONObject r02 = r9.optJSONObject(PERSONALIZATION_METADATA_KEY);
        if (r02 != null) goto L5;
        r02 = new JSONObject();
    L5:
        JSONObject r5 = r02;
        JSONArray r03 = r9.optJSONArray(ROLLOUT_METADATA_KEY);
        if (r03 != null) goto L8;
        r03 = new JSONArray();
    L8:
        JSONObject r2 = r9.getJSONObject(CONFIGS_KEY);
        Date r3 = new Date(r9.getLong(FETCH_TIME_KEY));
        JSONArray r4 = r9.getJSONArray(ABT_EXPERIMENTS_KEY);
        long r6 = r9.optLong(TEMPLATE_VERSION_NUMBER_KEY);
        return new ConfigContainer(r2, r3, r4, r5, r6, r03);
    }

    private Map<String, Map<String, String>> createRolloutParameterKeyMap() throws JSONException {
        HashMap r02 = new HashMap();
        int r2 = 0;
    L4:
        if (r2 >= getRolloutMetadata().length()) goto L16;
        JSONObject r3 = getRolloutMetadata().getJSONObject(r2);
        String r4 = r3.getString(ROLLOUT_METADATA_ID);
        String r5 = r3.getString("variantId");
        JSONArray r32 = r3.getJSONArray(ROLLOUT_METADATA_AFFECTED_KEYS);
        int r6 = 0;
    L7:
        if (r6 >= r32.length()) goto L15;
        String r7 = r32.getString(r6);
        if (r02.containsKey(r7) == true) goto L11;
        r02.put(r7, new HashMap());
    L11:
        Map r72 = (Map) r02.get(r7);
        if (r72 == null) goto L14;
        r72.put(r4, r5);
    L14:
        r6 = r6 + 1;
        goto L7
    L15:
        r2 = r2 + 1;
        goto L4
    L16:
        return r02;
    }

    private static ConfigContainer deepCopyOf(JSONObject r1) throws JSONException {
        return copyOf(new JSONObject(r1.toString()));
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof ConfigContainer) == true) goto L10;
        return false;
    L10:
        return this.containerJson.toString().equals(((ConfigContainer) r2).toString());
    }

    public JSONArray getAbtExperiments() {
        return this.abtExperiments;
    }

    public Set<String> getChangedParams(ConfigContainer r9) throws JSONException {
        JSONObject r02 = deepCopyOf(r9.containerJson).getConfigs();
        Map<String, Map<String, String>> r1 = createRolloutParameterKeyMap();
        Map<String, Map<String, String>> r2 = r9.createRolloutParameterKeyMap();
        HashSet r3 = new HashSet();
        Iterator<String> r4 = getConfigs().keys();
    L4:
        if (r4.hasNext() == false) goto L38;
        String r5 = r4.next();
        if (r9.getConfigs().has(r5) == false) goto L7;
        if (getConfigs().get(r5).equals(r9.getConfigs().get(r5)) == false) goto L10;
        if (getPersonalizationMetadata().has(r5) == false) goto L16;
        if (r9.getPersonalizationMetadata().has(r5) == true) goto L16;
    L19:
        r3.add(r5);
    L16:
        if (getPersonalizationMetadata().has(r5) == true) goto L21;
        if (r9.getPersonalizationMetadata().has(r5) == true) goto L19;
    L21:
        if (getPersonalizationMetadata().has(r5) == false) goto L28;
        if (r9.getPersonalizationMetadata().has(r5) == false) goto L28;
        if (getPersonalizationMetadata().getJSONObject(r5).toString().equals(r9.getPersonalizationMetadata().getJSONObject(r5).toString()) == true) goto L28;
        r3.add(r5);
    L28:
        if (r1.containsKey(r5) != r2.containsKey(r5)) goto L29;
        if (r1.containsKey(r5) == false) goto L37;
        if (r2.containsKey(r5) == false) goto L37;
        if (r1.get(r5).equals(r2.get(r5)) == true) goto L37;
        r3.add(r5);
    L37:
        r02.remove(r5);
        goto L4
    L29:
        r3.add(r5);
        goto L4
    L10:
        r3.add(r5);
        goto L4
    L7:
        r3.add(r5);
        goto L4
    L38:
        Iterator<String> r92 = r02.keys();
    L40:
        if (r92.hasNext() == false) goto L42;
        r3.add(r92.next());
        goto L40
    L42:
        return r3;
    }

    public JSONObject getConfigs() {
        return this.configsJson;
    }

    public Date getFetchTime() {
        return this.fetchTime;
    }

    public JSONObject getPersonalizationMetadata() {
        return this.personalizationMetadata;
    }

    public JSONArray getRolloutMetadata() {
        return this.rolloutMetadata;
    }

    public long getTemplateVersionNumber() {
        return this.templateVersionNumber;
    }

    public int hashCode() {
        return this.containerJson.hashCode();
    }

    public String toString() {
        return this.containerJson.toString();
    }

    private ConfigContainer(JSONObject r5, Date r6, JSONArray r7, JSONObject r8, long r9, JSONArray r11) throws JSONException {
        JSONObject r02 = new JSONObject();
        r02.put(CONFIGS_KEY, r5);
        r02.put(FETCH_TIME_KEY, r6.getTime());
        r02.put(ABT_EXPERIMENTS_KEY, r7);
        r02.put(PERSONALIZATION_METADATA_KEY, r8);
        r02.put(TEMPLATE_VERSION_NUMBER_KEY, r9);
        r02.put(ROLLOUT_METADATA_KEY, r11);
        this.configsJson = r5;
        this.fetchTime = r6;
        this.abtExperiments = r7;
        this.personalizationMetadata = r8;
        this.templateVersionNumber = r9;
        this.rolloutMetadata = r11;
        this.containerJson = r02;
    }

    public static Builder newBuilder(ConfigContainer r1) {
        return new Builder(r1);
    }
}
