package com.google.firebase.remoteconfig;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class CustomSignals {
    final Map<String, String> customSignals;

    public static class Builder {
        private Map<String, String> customSignals;

        public Builder() {
            this.customSignals = new HashMap();
        }

        public static /* synthetic */ Map access$000(Builder r02) {
            return r02.customSignals;
        }

        public CustomSignals build() {
            return new CustomSignals(this);
        }

        public Builder put(String r2, String r3) {
            this.customSignals.put(r2, r3);
            return this;
        }

        public Builder put(String r2, long r3) {
            this.customSignals.put(r2, Long.toString(r3));
            return this;
        }

        public Builder put(String r2, double r3) {
            this.customSignals.put(r2, Double.toString(r3));
            return this;
        }
    }

    public CustomSignals(Builder r1) {
        this.customSignals = Builder.access$000(r1);
    }
}
