package com.google.crypto.tink.monitoring;

import com.google.crypto.tink.KeyStatus;
import com.google.crypto.tink.annotations.Alpha;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@Immutable
@Alpha
/* loaded from: classes6.dex */
public final class MonitoringKeysetInfo {
    private final MonitoringAnnotations annotations;
    private final List<Entry> entries;
    private final Integer primaryKeyId;

    /* renamed from: com.google.crypto.tink.monitoring.MonitoringKeysetInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private MonitoringAnnotations builderAnnotations;
        private ArrayList<Entry> builderEntries;
        private Integer builderPrimaryKeyId;

        public Builder() {
            this.builderEntries = new ArrayList();
            this.builderAnnotations = MonitoringAnnotations.EMPTY;
            this.builderPrimaryKeyId = null;
        }

        private boolean isKeyIdInEntries(int r3) {
            Iterator<Entry> r02 = this.builderEntries.iterator();
        L4:
            if (r02.hasNext() == false) goto L9;
            if (r02.next().getKeyId() != r3) goto L4;
            return true;
        L9:
            return false;
        }

        @CanIgnoreReturnValue
        public Builder addEntry(KeyStatus r8, int r9, String r10, String r11) {
            ArrayList<Entry> r02 = this.builderEntries;
            if (r02 == null) goto L7;
            r02.add(new Entry(r8, r9, r10, r11, null));
            return this;
        L7:
            throw new IllegalStateException("addEntry cannot be called after build()");
        }

        public MonitoringKeysetInfo build() throws GeneralSecurityException {
            if (this.builderEntries == null) goto L14;
            Integer r02 = this.builderPrimaryKeyId;
            if (r02 != null) goto L7;
        L11:
            MonitoringKeysetInfo r03 = new MonitoringKeysetInfo(this.builderAnnotations, Collections.unmodifiableList(this.builderEntries), this.builderPrimaryKeyId, null);
            this.builderEntries = null;
            return r03;
        L7:
            if (isKeyIdInEntries(r02.intValue()) == true) goto L11;
            throw new GeneralSecurityException("primary key ID is not present in entries");
        L14:
            throw new IllegalStateException("cannot call build() twice");
        }

        @CanIgnoreReturnValue
        public Builder setAnnotations(MonitoringAnnotations r2) {
            if (this.builderEntries == null) goto L7;
            this.builderAnnotations = r2;
            return this;
        L7:
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }

        @CanIgnoreReturnValue
        public Builder setPrimaryKeyId(int r2) {
            if (this.builderEntries == null) goto L7;
            this.builderPrimaryKeyId = Integer.valueOf(r2);
            return this;
        L7:
            throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
    }

    @Immutable
    public static final class Entry {
        private final int keyId;
        private final String keyPrefix;
        private final String keyType;
        private final KeyStatus status;

        public /* synthetic */ Entry(KeyStatus r1, int r2, String r3, String r4, AnonymousClass1 r5) {
            this(r1, r2, r3, r4);
        }

        public boolean equals(Object r4) {
            if ((r4 instanceof Entry) == true) goto L5;
            return false;
        L5:
            Entry r42 = (Entry) r4;
            if (this.status == r42.status) goto L8;
        L15:
            return false;
        L8:
            if (this.keyId != r42.keyId) goto L15;
            if (this.keyType.equals(r42.keyType) == false) goto L15;
            if (this.keyPrefix.equals(r42.keyPrefix) == false) goto L15;
            return true;
        }

        public int getKeyId() {
            return this.keyId;
        }

        public String getKeyPrefix() {
            return this.keyPrefix;
        }

        public String getKeyType() {
            return this.keyType;
        }

        public KeyStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.status, Integer.valueOf(this.keyId), this.keyType, this.keyPrefix});
        }

        public String toString() {
            return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", new Object[]{this.status, Integer.valueOf(this.keyId), this.keyType, this.keyPrefix});
        }

        private Entry(KeyStatus r1, int r2, String r3, String r4) {
            this.status = r1;
            this.keyId = r2;
            this.keyType = r3;
            this.keyPrefix = r4;
        }
    }

    public /* synthetic */ MonitoringKeysetInfo(MonitoringAnnotations r1, List r2, Integer r3, AnonymousClass1 r4) {
        this(r1, r2, r3);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof MonitoringKeysetInfo) == true) goto L5;
        return false;
    L5:
        MonitoringKeysetInfo r42 = (MonitoringKeysetInfo) r4;
        if (this.annotations.equals(r42.annotations) == true) goto L8;
    L13:
        return false;
    L8:
        if (this.entries.equals(r42.entries) == false) goto L13;
        if (Objects.equals(this.primaryKeyId, r42.primaryKeyId) == false) goto L13;
        return true;
    }

    public MonitoringAnnotations getAnnotations() {
        return this.annotations;
    }

    public List<Entry> getEntries() {
        return this.entries;
    }

    public Integer getPrimaryKeyId() {
        return this.primaryKeyId;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.annotations, this.entries});
    }

    public String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", new Object[]{this.annotations, this.entries, this.primaryKeyId});
    }

    private MonitoringKeysetInfo(MonitoringAnnotations r1, List<Entry> r2, Integer r3) {
        this.annotations = r1;
        this.entries = r2;
        this.primaryKeyId = r3;
    }
}
