package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;

/* loaded from: classes6.dex */
final class AutoValue_StaticSessionData extends StaticSessionData {
    private final StaticSessionData.AppData appData;
    private final StaticSessionData.DeviceData deviceData;
    private final StaticSessionData.OsData osData;

    public AutoValue_StaticSessionData(StaticSessionData.AppData r1, StaticSessionData.OsData r2, StaticSessionData.DeviceData r3) {
        if (r1 == null) goto L15;
        this.appData = r1;
        if (r2 == null) goto L13;
        this.osData = r2;
        if (r3 == null) goto L11;
        this.deviceData = r3;
        return;
    L11:
        throw new NullPointerException("Null deviceData");
    L13:
        throw new NullPointerException("Null osData");
    L15:
        throw new NullPointerException("Null appData");
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public StaticSessionData.AppData appData() {
        return this.appData;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public StaticSessionData.DeviceData deviceData() {
        return this.deviceData;
    }

    public boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof StaticSessionData) == false) goto L14;
        StaticSessionData r52 = (StaticSessionData) r5;
        if (this.appData.equals(r52.appData()) == false) goto L14;
        if (this.osData.equals(r52.osData()) == false) goto L14;
        if (this.deviceData.equals(r52.deviceData()) == false) goto L14;
        return true;
    L14:
        return false;
    }

    public int hashCode() {
        return ((((this.appData.hashCode() ^ 1000003) * 1000003) ^ this.osData.hashCode()) * 1000003) ^ this.deviceData.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public StaticSessionData.OsData osData() {
        return this.osData;
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.appData + ", osData=" + this.osData + ", deviceData=" + this.deviceData + "}";
    }
}
