package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;

/* loaded from: classes6.dex */
final class AutoValue_StaticSessionData_AppData extends StaticSessionData.AppData {
    private final String appIdentifier;
    private final int deliveryMechanism;
    private final DevelopmentPlatformProvider developmentPlatformProvider;
    private final String installUuid;
    private final String versionCode;
    private final String versionName;

    public AutoValue_StaticSessionData_AppData(String r1, String r2, String r3, String r4, int r5, DevelopmentPlatformProvider r6) {
        if (r1 == null) goto L23;
        this.appIdentifier = r1;
        if (r2 == null) goto L21;
        this.versionCode = r2;
        if (r3 == null) goto L19;
        this.versionName = r3;
        if (r4 == null) goto L17;
        this.installUuid = r4;
        this.deliveryMechanism = r5;
        if (r6 == null) goto L15;
        this.developmentPlatformProvider = r6;
        return;
    L15:
        throw new NullPointerException("Null developmentPlatformProvider");
    L17:
        throw new NullPointerException("Null installUuid");
    L19:
        throw new NullPointerException("Null versionName");
    L21:
        throw new NullPointerException("Null versionCode");
    L23:
        throw new NullPointerException("Null appIdentifier");
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public String appIdentifier() {
        return this.appIdentifier;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public int deliveryMechanism() {
        return this.deliveryMechanism;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public DevelopmentPlatformProvider developmentPlatformProvider() {
        return this.developmentPlatformProvider;
    }

    public boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof StaticSessionData.AppData) == false) goto L20;
        StaticSessionData.AppData r52 = (StaticSessionData.AppData) r5;
        if (this.appIdentifier.equals(r52.appIdentifier()) == false) goto L20;
        if (this.versionCode.equals(r52.versionCode()) == false) goto L20;
        if (this.versionName.equals(r52.versionName()) == false) goto L20;
        if (this.installUuid.equals(r52.installUuid()) == false) goto L20;
        if (this.deliveryMechanism != r52.deliveryMechanism()) goto L20;
        if (this.developmentPlatformProvider.equals(r52.developmentPlatformProvider()) == false) goto L20;
        return true;
    L20:
        return false;
    }

    public int hashCode() {
        return ((((((((((this.appIdentifier.hashCode() ^ 1000003) * 1000003) ^ this.versionCode.hashCode()) * 1000003) ^ this.versionName.hashCode()) * 1000003) ^ this.installUuid.hashCode()) * 1000003) ^ this.deliveryMechanism) * 1000003) ^ this.developmentPlatformProvider.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public String installUuid() {
        return this.installUuid;
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.appIdentifier + ", versionCode=" + this.versionCode + ", versionName=" + this.versionName + ", installUuid=" + this.installUuid + ", deliveryMechanism=" + this.deliveryMechanism + ", developmentPlatformProvider=" + this.developmentPlatformProvider + "}";
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public String versionCode() {
        return this.versionCode;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public String versionName() {
        return this.versionName;
    }
}
