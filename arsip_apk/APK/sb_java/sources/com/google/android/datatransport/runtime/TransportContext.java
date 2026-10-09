package com.google.android.datatransport.runtime;

import android.util.Base64;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.AutoValue_TransportContext;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes4.dex */
public abstract class TransportContext {

    @AutoValue.Builder
    public static abstract class Builder {
        public Builder() {
        }

        public abstract TransportContext build();

        public abstract Builder setBackendName(String r1);

        public abstract Builder setExtras(byte[] r1);

        public abstract Builder setPriority(Priority r1);
    }

    public TransportContext() {
    }

    public static Builder builder() {
        return new AutoValue_TransportContext.Builder().setPriority(Priority.DEFAULT);
    }

    public abstract String getBackendName();

    public abstract byte[] getExtras();

    public abstract Priority getPriority();

    public boolean shouldUploadClientHealthMetrics() {
        if (getExtras() == null) goto L6;
        return true;
    L6:
        return false;
    }

    public final String toString() {
        String r02 = getBackendName();
        Priority r1 = getPriority();
        if (getExtras() != null) goto L5;
        String r2 = "";
    L7:
        return String.format("TransportContext(%s, %s, %s)", new Object[]{r02, r1, r2});
    L5:
        r2 = Base64.encodeToString(getExtras(), 2);
        goto L7
    }

    public TransportContext withPriority(Priority r3) {
        return builder().setBackendName(getBackendName()).setPriority(r3).setExtras(getExtras()).build();
    }
}
