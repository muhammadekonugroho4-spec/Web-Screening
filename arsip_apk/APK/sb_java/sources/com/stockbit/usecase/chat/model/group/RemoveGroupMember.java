package com.stockbit.usecase.chat.model.group;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/stockbit/usecase/chat/model/group/RemoveGroupMember;", "Ljava/io/Serializable;", "groupId", "", "roomId", "member", "Lcom/stockbit/usecase/chat/model/group/Member;", "fromScreen", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/usecase/chat/model/group/Member;Ljava/lang/String;)V", "getGroupId", "()Ljava/lang/String;", "getRoomId", "getMember", "()Lcom/stockbit/usecase/chat/model/group/Member;", "getFromScreen", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "", "toString", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RemoveGroupMember implements Serializable {
    private final String fromScreen;
    private final String groupId;
    private final Member member;
    private final String roomId;

    public RemoveGroupMember(String r2, String r3, Member r4, String r5) {
        p.l(r2, "groupId");
        p.l(r3, "roomId");
        p.l(r4, "member");
        p.l(r5, "fromScreen");
        this.groupId = r2;
        this.roomId = r3;
        this.member = r4;
        this.fromScreen = r5;
    }

    public final String a() {
        return this.groupId;
    }

    public final Member b() {
        return this.member;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof RemoveGroupMember) == true) goto L8;
        return false;
    L8:
        RemoveGroupMember r52 = (RemoveGroupMember) r5;
        if (p.g(this.groupId, r52.groupId) == true) goto L12;
        return false;
    L12:
        if (p.g(this.roomId, r52.roomId) == true) goto L15;
        return false;
    L15:
        if (p.g(this.member, r52.member) == true) goto L18;
        return false;
    L18:
        if (p.g(this.fromScreen, r52.fromScreen) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.groupId.hashCode() * 31) + this.roomId.hashCode()) * 31) + this.member.hashCode()) * 31) + this.fromScreen.hashCode();
    }

    public String toString() {
        return "RemoveGroupMember(groupId=" + this.groupId + ", roomId=" + this.roomId + ", member=" + this.member + ", fromScreen=" + this.fromScreen + ")";
    }
}
