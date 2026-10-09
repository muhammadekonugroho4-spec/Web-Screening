package com.stockbit.datasource.request.chat;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/stockbit/datasource/request/chat/UpdateGroupInfoDataParam;", "", "avatar", "", "description", AppMeasurementSdk.ConditionalUserProperty.NAME, "joinSetting", "Lcom/stockbit/datasource/request/chat/JoinSettingDataParam;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/datasource/request/chat/JoinSettingDataParam;)V", "getAvatar", "()Ljava/lang/String;", "getDescription", "getName", "getJoinSetting", "()Lcom/stockbit/datasource/request/chat/JoinSettingDataParam;", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UpdateGroupInfoDataParam {

    @SerializedName("avatar")
    private final String avatar;

    @SerializedName("description")
    private final String description;

    @SerializedName("join_setting")
    private final JoinSettingDataParam joinSetting;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    public UpdateGroupInfoDataParam(String r2, String r3, String r4, JoinSettingDataParam r5) {
        p.l(r3, "description");
        p.l(r4, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.avatar = r2;
        this.description = r3;
        this.name = r4;
        this.joinSetting = r5;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof UpdateGroupInfoDataParam) == true) goto L8;
        return false;
    L8:
        UpdateGroupInfoDataParam r52 = (UpdateGroupInfoDataParam) r5;
        if (p.g(this.avatar, r52.avatar) == true) goto L12;
        return false;
    L12:
        if (p.g(this.description, r52.description) == true) goto L15;
        return false;
    L15:
        if (p.g(this.name, r52.name) == true) goto L18;
        return false;
    L18:
        if (p.g(this.joinSetting, r52.joinSetting) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        String r02 = this.avatar;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = ((((r03 * 31) + this.description.hashCode()) * 31) + this.name.hashCode()) * 31;
        JoinSettingDataParam r2 = this.joinSetting;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "UpdateGroupInfoDataParam(avatar=" + this.avatar + ", description=" + this.description + ", name=" + this.name + ", joinSetting=" + this.joinSetting + ")";
    }
}
