package com.google.firebase.remoteconfig.interop.rollouts;

import com.google.auto.value.AutoValue;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.google.firebase.remoteconfig.interop.rollouts.AutoValue_RolloutAssignment;
import org.json.JSONException;
import org.json.JSONObject;

@AutoValue
@Encodable
/* loaded from: classes6.dex */
public abstract class RolloutAssignment {
    private static final String PARAMETER_KEY = "parameterKey";
    private static final String PARAMETER_VALUE = "parameterValue";
    public static final DataEncoder ROLLOUT_ASSIGNMENT_JSON_ENCODER = null;
    private static final String ROLLOUT_ID = "rolloutId";
    private static final String TEMPLATE_VERSION = "templateVersion";
    private static final String VARIANT_ID = "variantId";

    @AutoValue.Builder
    public static abstract class Builder {
        public Builder() {
        }

        public abstract RolloutAssignment build();

        public abstract Builder setParameterKey(String r1);

        public abstract Builder setParameterValue(String r1);

        public abstract Builder setRolloutId(String r1);

        public abstract Builder setTemplateVersion(long r1);

        public abstract Builder setVariantId(String r1);
    }

    static {
        ROLLOUT_ASSIGNMENT_JSON_ENCODER = new JsonDataEncoderBuilder().configureWith(AutoRolloutAssignmentEncoder.CONFIG).build();
    }

    public RolloutAssignment() {
    }

    public static Builder builder() {
        return new AutoValue_RolloutAssignment.Builder();
    }

    public static RolloutAssignment create(JSONObject r3) throws JSONException {
        return builder().setRolloutId(r3.getString("rolloutId")).setVariantId(r3.getString("variantId")).setParameterKey(r3.getString(PARAMETER_KEY)).setParameterValue(r3.getString(PARAMETER_VALUE)).setTemplateVersion(r3.getLong("templateVersion")).build();
    }

    public abstract String getParameterKey();

    public abstract String getParameterValue();

    public abstract String getRolloutId();

    public abstract long getTemplateVersion();

    public abstract String getVariantId();

    public static RolloutAssignment create(String r1) throws JSONException {
        return create(new JSONObject(r1));
    }
}
