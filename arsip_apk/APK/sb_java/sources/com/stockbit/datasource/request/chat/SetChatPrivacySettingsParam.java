package com.stockbit.datasource.request.chat;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/stockbit/datasource/request/chat/SetChatPrivacySettingsParam;", "", "groupSetting", "", "personalSetting", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getGroupSetting", "()Ljava/lang/String;", "getPersonalSetting", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SetChatPrivacySettingsParam {

    @SerializedName("group_setting")
    private final String groupSetting;

    @SerializedName("personal_setting")
    private final String personalSetting;

    public SetChatPrivacySettingsParam(String r2, String r3) {
        p.l(r2, "groupSetting");
        p.l(r3, "personalSetting");
        this.groupSetting = r2;
        this.personalSetting = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof SetChatPrivacySettingsParam) == true) goto L8;
        return false;
    L8:
        SetChatPrivacySettingsParam r52 = (SetChatPrivacySettingsParam) r5;
        if (p.g(this.groupSetting, r52.groupSetting) == true) goto L12;
        return false;
    L12:
        if (p.g(this.personalSetting, r52.personalSetting) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.groupSetting.hashCode() * 31) + this.personalSetting.hashCode();
    }

    public String toString() {
        return "SetChatPrivacySettingsParam(groupSetting=" + this.groupSetting + ", personalSetting=" + this.personalSetting + ")";
    }
}
