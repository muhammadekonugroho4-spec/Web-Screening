package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.backends.AutoValue_BackendRequest;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes4.dex */
public abstract class BackendRequest {

    @AutoValue.Builder
    public static abstract class Builder {
        public Builder() {
        }

        public abstract BackendRequest build();

        public abstract Builder setEvents(Iterable<EventInternal> r1);

        public abstract Builder setExtras(byte[] r1);
    }

    public BackendRequest() {
    }

    public static Builder builder() {
        return new AutoValue_BackendRequest.Builder();
    }

    public static BackendRequest create(Iterable<EventInternal> r1) {
        return builder().setEvents(r1).build();
    }

    public abstract Iterable<EventInternal> getEvents();

    public abstract byte[] getExtras();
}
