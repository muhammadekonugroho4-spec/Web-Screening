package com.stockbit.usecase.chat.model.group;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/stockbit/usecase/chat/model/group/GroupStatsUIState;", "Ljava/io/Serializable;", "members", "Lcom/stockbit/usecase/chat/model/group/MemberStatsUIState;", "admins", "Lcom/stockbit/usecase/chat/model/group/AdminStatsUIState;", "<init>", "(Lcom/stockbit/usecase/chat/model/group/MemberStatsUIState;Lcom/stockbit/usecase/chat/model/group/AdminStatsUIState;)V", "getMembers", "()Lcom/stockbit/usecase/chat/model/group/MemberStatsUIState;", "getAdmins", "()Lcom/stockbit/usecase/chat/model/group/AdminStatsUIState;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "", "toString", "", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GroupStatsUIState implements Serializable {
    private final AdminStatsUIState admins;
    private final MemberStatsUIState members;

    public GroupStatsUIState(MemberStatsUIState r2, AdminStatsUIState r3) {
        p.l(r2, "members");
        p.l(r3, "admins");
        this.members = r2;
        this.admins = r3;
    }

    public final AdminStatsUIState a() {
        return this.admins;
    }

    public final MemberStatsUIState b() {
        return this.members;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof GroupStatsUIState) == true) goto L8;
        return false;
    L8:
        GroupStatsUIState r52 = (GroupStatsUIState) r5;
        if (p.g(this.members, r52.members) == true) goto L12;
        return false;
    L12:
        if (p.g(this.admins, r52.admins) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.members.hashCode() * 31) + this.admins.hashCode();
    }

    public String toString() {
        return "GroupStatsUIState(members=" + this.members + ", admins=" + this.admins + ")";
    }
}
