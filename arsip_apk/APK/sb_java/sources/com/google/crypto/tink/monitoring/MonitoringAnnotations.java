package com.google.crypto.tink.monitoring;

import com.google.crypto.tink.annotations.Alpha;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Immutable
@Alpha
/* loaded from: classes6.dex */
public final class MonitoringAnnotations {
    public static final MonitoringAnnotations EMPTY = null;
    private final Map<String, String> entries;

    /* renamed from: com.google.crypto.tink.monitoring.MonitoringAnnotations$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private HashMap<String, String> builderEntries;

        public Builder() {
            this.builderEntries = new HashMap();
        }

        @CanIgnoreReturnValue
        public Builder add(String r2, String r3) {
            HashMap<String, String> r02 = this.builderEntries;
            if (r02 == null) goto L7;
            r02.put(r2, r3);
            return this;
        L7:
            throw new IllegalStateException("add cannot be called after build()");
        }

        @CanIgnoreReturnValue
        public Builder addAll(Map<String, String> r2) {
            HashMap<String, String> r02 = this.builderEntries;
            if (r02 == null) goto L7;
            r02.putAll(r2);
            return this;
        L7:
            throw new IllegalStateException("addAll cannot be called after build()");
        }

        public MonitoringAnnotations build() {
            if (this.builderEntries == null) goto L7;
            MonitoringAnnotations r02 = new MonitoringAnnotations(Collections.unmodifiableMap(this.builderEntries), null);
            this.builderEntries = null;
            return r02;
        L7:
            throw new IllegalStateException("cannot call build() twice");
        }
    }

    static {
        EMPTY = newBuilder().build();
    }

    public /* synthetic */ MonitoringAnnotations(Map r1, AnonymousClass1 r2) {
        this(r1);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public boolean equals(Object r2) {
        if ((r2 instanceof MonitoringAnnotations) == true) goto L7;
        return false;
    L7:
        return this.entries.equals(((MonitoringAnnotations) r2).entries);
    }

    public int hashCode() {
        return this.entries.hashCode();
    }

    public Map<String, String> toMap() {
        return this.entries;
    }

    public String toString() {
        return this.entries.toString();
    }

    private MonitoringAnnotations(Map<String, String> r1) {
        this.entries = r1;
    }
}
