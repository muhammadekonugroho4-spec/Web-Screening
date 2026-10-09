package com.stockbit.remote.models.request;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import com.stockbit.model.type.GroupAccessResponseType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JC\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\nHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/stockbit/remote/models/request/CreateGroupRequest;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "description", "avatarUrl", "accessType", "Lcom/stockbit/model/type/GroupAccessResponseType;", "userIds", "", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/model/type/GroupAccessResponseType;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getDescription", "getAvatarUrl", "getAccessType", "()Lcom/stockbit/model/type/GroupAccessResponseType;", "getUserIds", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CreateGroupRequest {

    @SerializedName("access_type")
    private final GroupAccessResponseType accessType;

    @SerializedName("avatar_url")
    private final String avatarUrl;

    @SerializedName("description")
    private final String description;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @SerializedName("user_ids")
    private final List<Integer> userIds;

    public CreateGroupRequest(String r2, String r3, String r4, GroupAccessResponseType r5, List<Integer> r6) {
        p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r3, "description");
        p.l(r5, "accessType");
        p.l(r6, "userIds");
        this.name = r2;
        this.description = r3;
        this.avatarUrl = r4;
        this.accessType = r5;
        this.userIds = r6;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CreateGroupRequest) == true) goto L8;
        return false;
    L8:
        CreateGroupRequest r52 = (CreateGroupRequest) r5;
        if (p.g(this.name, r52.name) == true) goto L12;
        return false;
    L12:
        if (p.g(this.description, r52.description) == true) goto L15;
        return false;
    L15:
        if (p.g(this.avatarUrl, r52.avatarUrl) == true) goto L18;
        return false;
    L18:
        if (this.accessType == r52.accessType) goto L21;
        return false;
    L21:
        if (p.g(this.userIds, r52.userIds) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        int r02 = ((this.name.hashCode() * 31) + this.description.hashCode()) * 31;
        String r1 = this.avatarUrl;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((((r02 + r12) * 31) + this.accessType.hashCode()) * 31) + this.userIds.hashCode();
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "CreateGroupRequest(name=" + this.name + ", description=" + this.description + ", avatarUrl=" + this.avatarUrl + ", accessType=" + this.accessType + ", userIds=" + this.userIds + ')';
    }
}
