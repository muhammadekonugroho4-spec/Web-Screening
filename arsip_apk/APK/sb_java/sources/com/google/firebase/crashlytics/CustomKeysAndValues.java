package com.google.firebase.crashlytics;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class CustomKeysAndValues {
    final Map<String, String> keysAndValues;

    public static class Builder {
        private Map<String, String> keysAndValues;

        public Builder() {
            this.keysAndValues = new HashMap();
        }

        public static /* synthetic */ Map access$000(Builder r02) {
            return r02.keysAndValues;
        }

        public CustomKeysAndValues build() {
            return new CustomKeysAndValues(this);
        }

        public Builder putBoolean(String r2, boolean r3) {
            this.keysAndValues.put(r2, Boolean.toString(r3));
            return this;
        }

        public Builder putDouble(String r2, double r3) {
            this.keysAndValues.put(r2, Double.toString(r3));
            return this;
        }

        public Builder putFloat(String r2, float r3) {
            this.keysAndValues.put(r2, Float.toString(r3));
            return this;
        }

        public Builder putInt(String r2, int r3) {
            this.keysAndValues.put(r2, Integer.toString(r3));
            return this;
        }

        public Builder putLong(String r2, long r3) {
            this.keysAndValues.put(r2, Long.toString(r3));
            return this;
        }

        public Builder putString(String r2, String r3) {
            this.keysAndValues.put(r2, r3);
            return this;
        }
    }

    public CustomKeysAndValues(Builder r1) {
        this.keysAndValues = Builder.access$000(r1);
    }
}
