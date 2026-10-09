package com.stockbit.datasource.request.chat;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/stockbit/datasource/request/chat/JoinSettingDataParam;", "", "requirement", "Lcom/stockbit/datasource/request/chat/RequirementDataParam;", "isHideMemberPreview", "", "<init>", "(Lcom/stockbit/datasource/request/chat/RequirementDataParam;Z)V", "getRequirement", "()Lcom/stockbit/datasource/request/chat/RequirementDataParam;", "()Z", "component1", "component2", Constants.COPY_TYPE, "equals", "other", "hashCode", "", "toString", "", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class JoinSettingDataParam {

    @SerializedName("is_hide_member_preview")
    private final boolean isHideMemberPreview;

    @SerializedName("requirement")
    private final RequirementDataParam requirement;

    public JoinSettingDataParam(RequirementDataParam r1, boolean r2) {
        this.requirement = r1;
        this.isHideMemberPreview = r2;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof JoinSettingDataParam) == true) goto L8;
        return false;
    L8:
        JoinSettingDataParam r52 = (JoinSettingDataParam) r5;
        if (p.g(this.requirement, r52.requirement) == true) goto L12;
        return false;
    L12:
        if (this.isHideMemberPreview == r52.isHideMemberPreview) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        RequirementDataParam r02 = this.requirement;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (r03 * 31) + Boolean.hashCode(this.isHideMemberPreview);
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "JoinSettingDataParam(requirement=" + this.requirement + ", isHideMemberPreview=" + this.isHideMemberPreview + ")";
    }
}
