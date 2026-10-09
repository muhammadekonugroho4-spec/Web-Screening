package com.stockbit.datasource.request.notification;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stockbit/datasource/request/notification/PushNotificationTokenDataParam;", "", "device", "Lcom/stockbit/datasource/request/notification/PushNotificationTokenDataParam$Device;", "onesignalId", "", "<init>", "(Lcom/stockbit/datasource/request/notification/PushNotificationTokenDataParam$Device;Ljava/lang/String;)V", "getDevice", "()Lcom/stockbit/datasource/request/notification/PushNotificationTokenDataParam$Device;", "getOnesignalId", "()Ljava/lang/String;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Device", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PushNotificationTokenDataParam {

    @SerializedName("device")
    private final Device device;

    @SerializedName("onesignal_id")
    private final String onesignalId;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/stockbit/datasource/request/notification/PushNotificationTokenDataParam$Device;", "", Constants.DEVICE_ID_TAG, "", "platform", "deviceModel", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "pushToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeviceId", "()Ljava/lang/String;", "getPlatform", "getDeviceModel", "getAppVersion", "getPushToken", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Device {

        @SerializedName("app_version")
        private final String appVersion;

        @SerializedName("device_id")
        private final String deviceId;

        @SerializedName("device_model")
        private final String deviceModel;

        /* renamed from: platform, reason: collision with root package name */
        @SerializedName("platform")
        private final String f80120platform;

        @SerializedName("push_token")
        private final String pushToken;

        public Device(String r2, String r3, String r4, String r5, String r6) {
            p.l(r2, Constants.DEVICE_ID_TAG);
            p.l(r3, "platform");
            p.l(r4, "deviceModel");
            p.l(r5, RemoteConfigConstants.RequestFieldKey.APP_VERSION);
            p.l(r6, "pushToken");
            this.deviceId = r2;
            this.f80120platform = r3;
            this.deviceModel = r4;
            this.appVersion = r5;
            this.pushToken = r6;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof Device) == true) goto L8;
            return false;
        L8:
            Device r52 = (Device) r5;
            if (p.g(this.deviceId, r52.deviceId) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f80120platform, r52.f80120platform) == true) goto L15;
            return false;
        L15:
            if (p.g(this.deviceModel, r52.deviceModel) == true) goto L18;
            return false;
        L18:
            if (p.g(this.appVersion, r52.appVersion) == true) goto L21;
            return false;
        L21:
            if (p.g(this.pushToken, r52.pushToken) == true) goto L23;
            return false;
        L23:
            return true;
        }

        public int hashCode() {
            return (((((((this.deviceId.hashCode() * 31) + this.f80120platform.hashCode()) * 31) + this.deviceModel.hashCode()) * 31) + this.appVersion.hashCode()) * 31) + this.pushToken.hashCode();
        }

        public String toString() {
            return "Device(deviceId=" + this.deviceId + ", platform=" + this.f80120platform + ", deviceModel=" + this.deviceModel + ", appVersion=" + this.appVersion + ", pushToken=" + this.pushToken + ")";
        }
    }

    public PushNotificationTokenDataParam(Device r2, String r3) {
        p.l(r2, "device");
        p.l(r3, "onesignalId");
        this.device = r2;
        this.onesignalId = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof PushNotificationTokenDataParam) == true) goto L8;
        return false;
    L8:
        PushNotificationTokenDataParam r52 = (PushNotificationTokenDataParam) r5;
        if (p.g(this.device, r52.device) == true) goto L12;
        return false;
    L12:
        if (p.g(this.onesignalId, r52.onesignalId) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.device.hashCode() * 31) + this.onesignalId.hashCode();
    }

    public String toString() {
        return "PushNotificationTokenDataParam(device=" + this.device + ", onesignalId=" + this.onesignalId + ")";
    }
}
