package com.iab.digitalidentity.sdk.core.network.model;

import a.AbstractC2049c;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u001c\u0010\u0012¨\u0006\u001d"}, d2 = {"com/iab/digitalidentity/sdk/core/network/model/UnifiedKycRequest$SubmitConsentDeviceInfo", "", "", "os", RemoteConfigConstants.RequestFieldKey.APP_ID, RemoteConfigConstants.RequestFieldKey.APP_VERSION, "deviceMake", "deviceModel", Constants.DEVICE_ID_TAG, "ipAddress", "latitude", "longitude", "userAgent", "networkProvider", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getOs", "()Ljava/lang/String;", "getAppId", "getAppVersion", "getDeviceMake", "getDeviceModel", "getDeviceId", "getIpAddress", "getLatitude", "getLongitude", "getUserAgent", "getNetworkProvider", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnifiedKycRequest$SubmitConsentDeviceInfo {

    @SerializedName(RemoteConfigConstants.RequestFieldKey.APP_ID)
    private final String appId;

    @SerializedName(RemoteConfigConstants.RequestFieldKey.APP_VERSION)
    private final String appVersion;

    @SerializedName(Constants.DEVICE_ID_TAG)
    private final String deviceId;

    @SerializedName("deviceMake")
    private final String deviceMake;

    @SerializedName("deviceModel")
    private final String deviceModel;

    @SerializedName("ipAddress")
    private final String ipAddress;

    @SerializedName("latitude")
    private final String latitude;

    @SerializedName("longitude")
    private final String longitude;

    @SerializedName("networkProvider")
    private final String networkProvider;

    @SerializedName("operatingSystem")
    private final String os;

    @SerializedName("userAgent")
    private final String userAgent;

    public UnifiedKycRequest$SubmitConsentDeviceInfo(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12) {
        p.l(r2, "os");
        p.l(r3, RemoteConfigConstants.RequestFieldKey.APP_ID);
        p.l(r4, RemoteConfigConstants.RequestFieldKey.APP_VERSION);
        p.l(r5, "deviceMake");
        p.l(r6, "deviceModel");
        p.l(r7, Constants.DEVICE_ID_TAG);
        p.l(r8, "ipAddress");
        p.l(r9, "latitude");
        p.l(r10, "longitude");
        this.os = r2;
        this.appId = r3;
        this.appVersion = r4;
        this.deviceMake = r5;
        this.deviceModel = r6;
        this.deviceId = r7;
        this.ipAddress = r8;
        this.latitude = r9;
        this.longitude = r10;
        this.userAgent = r11;
        this.networkProvider = r12;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof UnifiedKycRequest$SubmitConsentDeviceInfo) == true) goto L8;
        return false;
    L8:
        UnifiedKycRequest$SubmitConsentDeviceInfo r52 = (UnifiedKycRequest$SubmitConsentDeviceInfo) r5;
        if (p.g(this.os, r52.os) == true) goto L12;
        return false;
    L12:
        if (p.g(this.appId, r52.appId) == true) goto L15;
        return false;
    L15:
        if (p.g(this.appVersion, r52.appVersion) == true) goto L18;
        return false;
    L18:
        if (p.g(this.deviceMake, r52.deviceMake) == true) goto L21;
        return false;
    L21:
        if (p.g(this.deviceModel, r52.deviceModel) == true) goto L24;
        return false;
    L24:
        if (p.g(this.deviceId, r52.deviceId) == true) goto L27;
        return false;
    L27:
        if (p.g(this.ipAddress, r52.ipAddress) == true) goto L30;
        return false;
    L30:
        if (p.g(this.latitude, r52.latitude) == true) goto L33;
        return false;
    L33:
        if (p.g(this.longitude, r52.longitude) == true) goto L36;
        return false;
    L36:
        if (p.g(this.userAgent, r52.userAgent) == true) goto L39;
        return false;
    L39:
        if (p.g(this.networkProvider, r52.networkProvider) == true) goto L41;
        return false;
    L41:
        return true;
    }

    public final int hashCode() {
        int r02 = AbstractC2049c.a(this.longitude, AbstractC2049c.a(this.latitude, AbstractC2049c.a(this.ipAddress, AbstractC2049c.a(this.deviceId, AbstractC2049c.a(this.deviceModel, AbstractC2049c.a(this.deviceMake, AbstractC2049c.a(this.appVersion, AbstractC2049c.a(this.appId, this.os.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
        String r2 = this.userAgent;
        int r3 = 0;
        if (r2 != null) goto L5;
        int r22 = 0;
    L6:
        int r03 = (r02 + r22) * 31;
        String r1 = this.networkProvider;
        if (r1 == null) goto L11;
        r3 = r1.hashCode();
    L11:
        return r03 + r3;
    L5:
        r22 = r2.hashCode();
        goto L6
    }

    public final String toString() {
        return "SubmitConsentDeviceInfo(os=" + this.os + ", appId=" + this.appId + ", appVersion=" + this.appVersion + ", deviceMake=" + this.deviceMake + ", deviceModel=" + this.deviceModel + ", deviceId=" + this.deviceId + ", ipAddress=" + this.ipAddress + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", userAgent=" + this.userAgent + ", networkProvider=" + this.networkProvider + ")";
    }

    public /* synthetic */ UnifiedKycRequest$SubmitConsentDeviceInfo(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, int r13, i r14) {
        if ((r13 & 512) == 0) goto L6;
        r11 = null;
    L6:
        if ((r13 & 1024) == 0) goto L9;
        String r132 = null;
    L10:
        this(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r132);
        return;
    L9:
        r132 = r12;
        goto L10
    }
}
