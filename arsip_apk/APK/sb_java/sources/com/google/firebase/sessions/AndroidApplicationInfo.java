package com.google.firebase.sessions;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\nHÆ\u0003JK\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\""}, d2 = {"Lcom/google/firebase/sessions/AndroidApplicationInfo;", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "", "versionName", "appBuildVersion", "deviceManufacturer", "currentProcessDetails", "Lcom/google/firebase/sessions/ProcessDetails;", "appProcessDetails", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/sessions/ProcessDetails;Ljava/util/List;)V", "getAppBuildVersion", "()Ljava/lang/String;", "getAppProcessDetails", "()Ljava/util/List;", "getCurrentProcessDetails", "()Lcom/google/firebase/sessions/ProcessDetails;", "getDeviceManufacturer", "getPackageName", "getVersionName", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidApplicationInfo {
    private final String appBuildVersion;
    private final List<ProcessDetails> appProcessDetails;
    private final ProcessDetails currentProcessDetails;
    private final String deviceManufacturer;
    private final String packageName;
    private final String versionName;

    public AndroidApplicationInfo(String r2, String r3, String r4, String r5, ProcessDetails r6, List<ProcessDetails> r7) {
        p.l(r2, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
        p.l(r3, "versionName");
        p.l(r4, "appBuildVersion");
        p.l(r5, "deviceManufacturer");
        p.l(r6, "currentProcessDetails");
        p.l(r7, "appProcessDetails");
        this.packageName = r2;
        this.versionName = r3;
        this.appBuildVersion = r4;
        this.deviceManufacturer = r5;
        this.currentProcessDetails = r6;
        this.appProcessDetails = r7;
    }

    public static /* synthetic */ AndroidApplicationInfo copy$default(AndroidApplicationInfo r02, String r1, String r2, String r3, String r4, ProcessDetails r5, List r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r02.packageName;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r02.versionName;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r02.appBuildVersion;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r02.deviceManufacturer;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r02.currentProcessDetails;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r02.appProcessDetails;
    L20:
        ProcessDetails r72 = r5;
        List r82 = r6;
        String r52 = r3;
        String r62 = r4;
        return r02.copy(r1, r2, r52, r62, r72, r82);
    }

    public final String component1() {
        return this.packageName;
    }

    public final String component2() {
        return this.versionName;
    }

    public final String component3() {
        return this.appBuildVersion;
    }

    public final String component4() {
        return this.deviceManufacturer;
    }

    public final ProcessDetails component5() {
        return this.currentProcessDetails;
    }

    public final List<ProcessDetails> component6() {
        return this.appProcessDetails;
    }

    public final AndroidApplicationInfo copy(String r9, String r10, String r11, String r12, ProcessDetails r13, List<ProcessDetails> r14) {
        p.l(r9, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
        p.l(r10, "versionName");
        p.l(r11, "appBuildVersion");
        p.l(r12, "deviceManufacturer");
        p.l(r13, "currentProcessDetails");
        p.l(r14, "appProcessDetails");
        return new AndroidApplicationInfo(r9, r10, r11, r12, r13, r14);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AndroidApplicationInfo) == true) goto L8;
        return false;
    L8:
        AndroidApplicationInfo r52 = (AndroidApplicationInfo) r5;
        if (p.g(this.packageName, r52.packageName) == true) goto L12;
        return false;
    L12:
        if (p.g(this.versionName, r52.versionName) == true) goto L15;
        return false;
    L15:
        if (p.g(this.appBuildVersion, r52.appBuildVersion) == true) goto L18;
        return false;
    L18:
        if (p.g(this.deviceManufacturer, r52.deviceManufacturer) == true) goto L21;
        return false;
    L21:
        if (p.g(this.currentProcessDetails, r52.currentProcessDetails) == true) goto L24;
        return false;
    L24:
        if (p.g(this.appProcessDetails, r52.appProcessDetails) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final String getAppBuildVersion() {
        return this.appBuildVersion;
    }

    public final List<ProcessDetails> getAppProcessDetails() {
        return this.appProcessDetails;
    }

    public final ProcessDetails getCurrentProcessDetails() {
        return this.currentProcessDetails;
    }

    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        return (((((((((this.packageName.hashCode() * 31) + this.versionName.hashCode()) * 31) + this.appBuildVersion.hashCode()) * 31) + this.deviceManufacturer.hashCode()) * 31) + this.currentProcessDetails.hashCode()) * 31) + this.appProcessDetails.hashCode();
    }

    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.packageName + ", versionName=" + this.versionName + ", appBuildVersion=" + this.appBuildVersion + ", deviceManufacturer=" + this.deviceManufacturer + ", currentProcessDetails=" + this.currentProcessDetails + ", appProcessDetails=" + this.appProcessDetails + ')';
    }
}
