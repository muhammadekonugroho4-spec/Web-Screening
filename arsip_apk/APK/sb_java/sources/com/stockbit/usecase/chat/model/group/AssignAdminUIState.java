package com.stockbit.usecase.chat.model.group;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stockbit/usecase/chat/model/group/AssignAdminUIState;", "Ljava/io/Serializable;", "member", "Lcom/stockbit/usecase/chat/model/newchat/MemberUIState;", "groupId", "", "<init>", "(Lcom/stockbit/usecase/chat/model/newchat/MemberUIState;Ljava/lang/String;)V", "getMember", "()Lcom/stockbit/usecase/chat/model/newchat/MemberUIState;", "getGroupId", "()Ljava/lang/String;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "", "toString", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AssignAdminUIState implements Serializable {
    private final String groupId;
    private final com.stockbit.usecase.chat.model.newchat.b member;

    public AssignAdminUIState(com.stockbit.usecase.chat.model.newchat.b r2, String r3) {
        p.l(r2, "member");
        p.l(r3, "groupId");
        this.member = r2;
        this.groupId = r3;
    }

    public final String a() {
        return this.groupId;
    }

    public final com.stockbit.usecase.chat.model.newchat.b b() {
        return this.member;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AssignAdminUIState) == true) goto L8;
        return false;
    L8:
        AssignAdminUIState r52 = (AssignAdminUIState) r5;
        if (p.g(this.member, r52.member) == true) goto L12;
        return false;
    L12:
        if (p.g(this.groupId, r52.groupId) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.member.hashCode() * 31) + this.groupId.hashCode();
    }

    public String toString() {
        return "AssignAdminUIState(member=" + this.member + ", groupId=" + this.groupId + ")";
    }
}
