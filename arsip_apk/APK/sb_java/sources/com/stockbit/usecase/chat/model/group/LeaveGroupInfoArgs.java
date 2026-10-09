package com.stockbit.usecase.chat.model.group;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0014\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0083\u0004J\n\u0010 \u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010!\u001a\u00020\bHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/stockbit/usecase/chat/model/group/LeaveGroupInfoArgs;", "Ljava/io/Serializable;", "isAdmin", "", "isOnlyAdminLeft", "groupId", "", "roomName", "", "totalAdmin", "roomId", "", "<init>", "(ZZILjava/lang/String;IJ)V", "()Z", "getGroupId", "()I", "getRoomName", "()Ljava/lang/String;", "getTotalAdmin", "getRoomId", "()J", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "equals", "other", "", "hashCode", "toString", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LeaveGroupInfoArgs implements Serializable {
    private final int groupId;
    private final boolean isAdmin;
    private final boolean isOnlyAdminLeft;
    private final long roomId;
    private final String roomName;
    private final int totalAdmin;

    public LeaveGroupInfoArgs(boolean r2, boolean r3, int r4, String r5, int r6, long r7) {
        p.l(r5, "roomName");
        this.isAdmin = r2;
        this.isOnlyAdminLeft = r3;
        this.groupId = r4;
        this.roomName = r5;
        this.totalAdmin = r6;
        this.roomId = r7;
    }

    public final int a() {
        return this.groupId;
    }

    public final long b() {
        return this.roomId;
    }

    public final String c() {
        return this.roomName;
    }

    public final int d() {
        return this.totalAdmin;
    }

    public final boolean e() {
        return this.isAdmin;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof LeaveGroupInfoArgs) == true) goto L8;
        return false;
    L8:
        LeaveGroupInfoArgs r82 = (LeaveGroupInfoArgs) r8;
        if (this.isAdmin == r82.isAdmin) goto L12;
        return false;
    L12:
        if (this.isOnlyAdminLeft == r82.isOnlyAdminLeft) goto L15;
        return false;
    L15:
        if (this.groupId == r82.groupId) goto L18;
        return false;
    L18:
        if (p.g(this.roomName, r82.roomName) == true) goto L21;
        return false;
    L21:
        if (this.totalAdmin == r82.totalAdmin) goto L24;
        return false;
    L24:
        if (this.roomId == r82.roomId) goto L26;
        return false;
    L26:
        return true;
    }

    public final boolean f() {
        return this.isOnlyAdminLeft;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.isAdmin) * 31) + Boolean.hashCode(this.isOnlyAdminLeft)) * 31) + Integer.hashCode(this.groupId)) * 31) + this.roomName.hashCode()) * 31) + Integer.hashCode(this.totalAdmin)) * 31) + Long.hashCode(this.roomId);
    }

    public String toString() {
        return "LeaveGroupInfoArgs(isAdmin=" + this.isAdmin + ", isOnlyAdminLeft=" + this.isOnlyAdminLeft + ", groupId=" + this.groupId + ", roomName=" + this.roomName + ", totalAdmin=" + this.totalAdmin + ", roomId=" + this.roomId + ")";
    }
}
