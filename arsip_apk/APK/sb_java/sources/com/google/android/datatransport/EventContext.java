package com.google.android.datatransport;

import com.google.android.datatransport.AutoValue_EventContext;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes4.dex */
public abstract class EventContext {

    @AutoValue.Builder
    public static abstract class Builder {
        public Builder() {
        }

        public abstract EventContext build();

        public abstract Builder setExperimentIdsClear(byte[] r1);

        public abstract Builder setExperimentIdsEncrypted(byte[] r1);

        public abstract Builder setPseudonymousId(String r1);
    }

    public EventContext() {
    }

    public static Builder builder() {
        return new AutoValue_EventContext.Builder();
    }

    public abstract byte[] getExperimentIdsClear();

    public abstract byte[] getExperimentIdsEncrypted();

    public abstract String getPseudonymousId();
}
