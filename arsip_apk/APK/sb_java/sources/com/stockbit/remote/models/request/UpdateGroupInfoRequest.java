package com.stockbit.remote.models.request;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/stockbit/remote/models/request/UpdateGroupInfoRequest;", "", "avatar", "", "description", AppMeasurementSdk.ConditionalUserProperty.NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvatar", "()Ljava/lang/String;", "getDescription", "getName", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class UpdateGroupInfoRequest {

    @SerializedName("avatar")
    private final String avatar;

    @SerializedName("description")
    private final String description;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    public UpdateGroupInfoRequest(String r2, String r3, String r4) {
        p.l(r3, "description");
        p.l(r4, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.avatar = r2;
        this.description = r3;
        this.name = r4;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof UpdateGroupInfoRequest) == true) goto L8;
        return false;
    L8:
        UpdateGroupInfoRequest r52 = (UpdateGroupInfoRequest) r5;
        if (p.g(this.avatar, r52.avatar) == true) goto L12;
        return false;
    L12:
        if (p.g(this.description, r52.description) == true) goto L15;
        return false;
    L15:
        if (p.g(this.name, r52.name) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        String r02 = this.avatar;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (((r03 * 31) + this.description.hashCode()) * 31) + this.name.hashCode();
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "UpdateGroupInfoRequest(avatar=" + this.avatar + ", description=" + this.description + ", name=" + this.name + ')';
    }
}
