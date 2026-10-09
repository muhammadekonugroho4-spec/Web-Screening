package com.stockbit.datasource.request.notification;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/stockbit/datasource/request/notification/NotificationSettingRequest;", "", "type", "", "settings", "", "Lcom/stockbit/datasource/request/notification/NotificationSettingRequest$NotificationSettings;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getType", "()Ljava/lang/String;", "getSettings", "()Ljava/util/List;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "NotificationSettings", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NotificationSettingRequest {

    @SerializedName("settings")
    private final List<NotificationSettings> settings;

    @SerializedName("type")
    private final String type;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/stockbit/datasource/request/notification/NotificationSettingRequest$NotificationSettings;", "", Constants.KEY_KEY, "", "value", "", "<init>", "(Ljava/lang/String;Z)V", "getKey", "()Ljava/lang/String;", "getValue", "()Z", "component1", "component2", Constants.COPY_TYPE, "equals", "other", "hashCode", "", "toString", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NotificationSettings {

        @SerializedName(Constants.KEY_KEY)
        private final String key;

        @SerializedName("value")
        private final boolean value;

        public NotificationSettings(String r2, boolean r3) {
            p.l(r2, Constants.KEY_KEY);
            this.key = r2;
            this.value = r3;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof NotificationSettings) == true) goto L8;
            return false;
        L8:
            NotificationSettings r52 = (NotificationSettings) r5;
            if (p.g(this.key, r52.key) == true) goto L12;
            return false;
        L12:
            if (this.value == r52.value) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.key.hashCode() * 31) + Boolean.hashCode(this.value);
        }

        public String toString() {
            return "NotificationSettings(key=" + this.key + ", value=" + this.value + ")";
        }
    }

    public NotificationSettingRequest(String r2, List<NotificationSettings> r3) {
        p.l(r2, "type");
        p.l(r3, "settings");
        this.type = r2;
        this.settings = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof NotificationSettingRequest) == true) goto L8;
        return false;
    L8:
        NotificationSettingRequest r52 = (NotificationSettingRequest) r5;
        if (p.g(this.type, r52.type) == true) goto L12;
        return false;
    L12:
        if (p.g(this.settings, r52.settings) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.settings.hashCode();
    }

    public String toString() {
        return "NotificationSettingRequest(type=" + this.type + ", settings=" + this.settings + ")";
    }
}
