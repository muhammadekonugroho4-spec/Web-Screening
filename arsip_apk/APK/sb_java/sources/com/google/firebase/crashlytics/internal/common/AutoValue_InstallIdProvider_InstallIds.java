package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.common.InstallIdProvider;

/* loaded from: classes6.dex */
final class AutoValue_InstallIdProvider_InstallIds extends InstallIdProvider.InstallIds {
    private final String crashlyticsInstallId;
    private final String firebaseAuthenticationToken;
    private final String firebaseInstallationId;

    public AutoValue_InstallIdProvider_InstallIds(String r1, String r2, String r3) {
        if (r1 == null) goto L7;
        this.crashlyticsInstallId = r1;
        this.firebaseInstallationId = r2;
        this.firebaseAuthenticationToken = r3;
        return;
    L7:
        throw new NullPointerException("Null crashlyticsInstallId");
    }

    public boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof InstallIdProvider.InstallIds) == false) goto L24;
        InstallIdProvider.InstallIds r52 = (InstallIdProvider.InstallIds) r5;
        if (this.crashlyticsInstallId.equals(r52.getCrashlyticsInstallId()) == false) goto L24;
        String r1 = this.firebaseInstallationId;
        if (r1 != null) goto L15;
        if (r52.getFirebaseInstallationId() != null) goto L24;
    L16:
        String r12 = this.firebaseAuthenticationToken;
        if (r12 != null) goto L22;
        if (r52.getFirebaseAuthenticationToken() != null) goto L24;
    L23:
        return true;
    L22:
        if (r12.equals(r52.getFirebaseAuthenticationToken()) == false) goto L24;
    L15:
        if (r1.equals(r52.getFirebaseInstallationId()) == true) goto L16;
    L24:
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds
    public String getCrashlyticsInstallId() {
        return this.crashlyticsInstallId;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds
    public String getFirebaseAuthenticationToken() {
        return this.firebaseAuthenticationToken;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds
    public String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
    }

    public int hashCode() {
        int r02 = (this.crashlyticsInstallId.hashCode() ^ 1000003) * 1000003;
        String r2 = this.firebaseInstallationId;
        int r3 = 0;
        if (r2 != null) goto L5;
        int r22 = 0;
    L6:
        int r03 = (r02 ^ r22) * 1000003;
        String r1 = this.firebaseAuthenticationToken;
        if (r1 == null) goto L11;
        r3 = r1.hashCode();
    L11:
        return r03 ^ r3;
    L5:
        r22 = r2.hashCode();
        goto L6
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.crashlyticsInstallId + ", firebaseInstallationId=" + this.firebaseInstallationId + ", firebaseAuthenticationToken=" + this.firebaseAuthenticationToken + "}";
    }
}
