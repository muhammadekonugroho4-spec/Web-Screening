package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;

/* loaded from: classes6.dex */
final class AutoValue_StaticSessionData_OsData extends StaticSessionData.OsData {
    private final boolean isRooted;
    private final String osCodeName;
    private final String osRelease;

    public AutoValue_StaticSessionData_OsData(String r1, String r2, boolean r3) {
        if (r1 == null) goto L11;
        this.osRelease = r1;
        if (r2 == null) goto L9;
        this.osCodeName = r2;
        this.isRooted = r3;
        return;
    L9:
        throw new NullPointerException("Null osCodeName");
    L11:
        throw new NullPointerException("Null osRelease");
    }

    public boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof StaticSessionData.OsData) == false) goto L14;
        StaticSessionData.OsData r52 = (StaticSessionData.OsData) r5;
        if (this.osRelease.equals(r52.osRelease()) == false) goto L14;
        if (this.osCodeName.equals(r52.osCodeName()) == false) goto L14;
        if (this.isRooted != r52.isRooted()) goto L14;
        return true;
    L14:
        return false;
    }

    public int hashCode() {
        int r02 = (((this.osRelease.hashCode() ^ 1000003) * 1000003) ^ this.osCodeName.hashCode()) * 1000003;
        if (this.isRooted == false) goto L5;
        int r1 = 1231;
    L7:
        return r02 ^ r1;
    L5:
        r1 = 1237;
        goto L7
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public boolean isRooted() {
        return this.isRooted;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public String osCodeName() {
        return this.osCodeName;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public String osRelease() {
        return this.osRelease;
    }

    public String toString() {
        return "OsData{osRelease=" + this.osRelease + ", osCodeName=" + this.osCodeName + ", isRooted=" + this.isRooted + "}";
    }
}
