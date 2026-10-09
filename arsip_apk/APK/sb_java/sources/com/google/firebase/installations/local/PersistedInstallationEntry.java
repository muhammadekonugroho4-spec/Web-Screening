package com.google.firebase.installations.local;

import com.google.auto.value.AutoValue;
import com.google.firebase.installations.local.AutoValue_PersistedInstallationEntry;
import com.google.firebase.installations.local.PersistedInstallation;

@AutoValue
/* loaded from: classes6.dex */
public abstract class PersistedInstallationEntry {
    public static PersistedInstallationEntry INSTANCE;

    @AutoValue.Builder
    public static abstract class Builder {
        public Builder() {
        }

        public abstract PersistedInstallationEntry build();

        public abstract Builder setAuthToken(String r1);

        public abstract Builder setExpiresInSecs(long r1);

        public abstract Builder setFirebaseInstallationId(String r1);

        public abstract Builder setFisError(String r1);

        public abstract Builder setRefreshToken(String r1);

        public abstract Builder setRegistrationStatus(PersistedInstallation.RegistrationStatus r1);

        public abstract Builder setTokenCreationEpochInSecs(long r1);
    }

    static {
        INSTANCE = builder().build();
    }

    public PersistedInstallationEntry() {
    }

    public static Builder builder() {
        return new AutoValue_PersistedInstallationEntry.Builder().setTokenCreationEpochInSecs(0).setRegistrationStatus(PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION).setExpiresInSecs(0);
    }

    public abstract String getAuthToken();

    public abstract long getExpiresInSecs();

    public abstract String getFirebaseInstallationId();

    public abstract String getFisError();

    public abstract String getRefreshToken();

    public abstract PersistedInstallation.RegistrationStatus getRegistrationStatus();

    public abstract long getTokenCreationEpochInSecs();

    public boolean isErrored() {
        if (getRegistrationStatus() != PersistedInstallation.RegistrationStatus.REGISTER_ERROR) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean isNotGenerated() {
        if (getRegistrationStatus() != PersistedInstallation.RegistrationStatus.NOT_GENERATED) goto L5;
        return true;
    L5:
        if (getRegistrationStatus() == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION) goto L11;
        return false;
    L11:
        return true;
    }

    public boolean isRegistered() {
        if (getRegistrationStatus() != PersistedInstallation.RegistrationStatus.REGISTERED) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean isUnregistered() {
        if (getRegistrationStatus() != PersistedInstallation.RegistrationStatus.UNREGISTERED) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean shouldAttemptMigration() {
        if (getRegistrationStatus() != PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION) goto L6;
        return true;
    L6:
        return false;
    }

    public abstract Builder toBuilder();

    public PersistedInstallationEntry withAuthToken(String r2, long r3, long r5) {
        return toBuilder().setAuthToken(r2).setExpiresInSecs(r3).setTokenCreationEpochInSecs(r5).build();
    }

    public PersistedInstallationEntry withClearedAuthToken() {
        return toBuilder().setAuthToken(null).build();
    }

    public PersistedInstallationEntry withFisError(String r2) {
        return toBuilder().setFisError(r2).setRegistrationStatus(PersistedInstallation.RegistrationStatus.REGISTER_ERROR).build();
    }

    public PersistedInstallationEntry withNoGeneratedFid() {
        return toBuilder().setRegistrationStatus(PersistedInstallation.RegistrationStatus.NOT_GENERATED).build();
    }

    public PersistedInstallationEntry withRegisteredFid(String r2, String r3, long r4, String r6, long r7) {
        return toBuilder().setFirebaseInstallationId(r2).setRegistrationStatus(PersistedInstallation.RegistrationStatus.REGISTERED).setAuthToken(r6).setRefreshToken(r3).setExpiresInSecs(r7).setTokenCreationEpochInSecs(r4).build();
    }

    public PersistedInstallationEntry withUnregisteredFid(String r2) {
        return toBuilder().setFirebaseInstallationId(r2).setRegistrationStatus(PersistedInstallation.RegistrationStatus.UNREGISTERED).build();
    }
}
