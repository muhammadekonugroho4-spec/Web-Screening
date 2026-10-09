package com.stockbit.usecase.chat.model.group;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC11777v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\bHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/stockbit/usecase/chat/model/group/GroupRequirementUIState;", "Ljava/io/Serializable;", "hideMemberGroup", "", "customRequirements", "", "Lcom/stockbit/usecase/chat/model/group/CustomRequirementUIState;", "rejectionMessage", "", "<init>", "(ZLjava/util/List;Ljava/lang/String;)V", "getHideMemberGroup", "()Z", "getCustomRequirements", "()Ljava/util/List;", "getRejectionMessage", "()Ljava/lang/String;", "activeCustomRequirement", "", "getActiveCustomRequirement", "()I", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "other", "", "hashCode", "toString", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GroupRequirementUIState implements Serializable {
    private final int activeCustomRequirement;
    private final List<CustomRequirementUIState<?>> customRequirements;
    private final boolean hideMemberGroup;
    private final String rejectionMessage;

    public GroupRequirementUIState(boolean r2, List r3, String r4) {
        p.l(r3, "customRequirements");
        this.hideMemberGroup = r2;
        this.customRequirements = r3;
        this.rejectionMessage = r4;
        List r32 = r3;
        int r42 = 0;
        if ((r32 instanceof Collection) == true) goto L5;
    L7:
        Iterator r22 = r32.iterator();
    L9:
        if (r22.hasNext() == false) goto L15;
        if (((CustomRequirementUIState) r22.next()).a() == false) goto L9;
        r42 = r42 + 1;
        if (r42 >= 0) goto L9;
        AbstractC11777v.x();
    L15:
        this.activeCustomRequirement = r42;
        return;
    L5:
        if (r32.isEmpty() == false) goto L7;
        goto L7
    }

    public static /* synthetic */ GroupRequirementUIState b(GroupRequirementUIState r02, boolean r1, List r2, String r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r02.hideMemberGroup;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r02.customRequirements;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r02.rejectionMessage;
    L12:
        return r02.a(r1, r2, r3);
    }

    public final GroupRequirementUIState a(boolean r2, List r3, String r4) {
        p.l(r3, "customRequirements");
        return new GroupRequirementUIState(r2, r3, r4);
    }

    public final int c() {
        return this.activeCustomRequirement;
    }

    public final List d() {
        return this.customRequirements;
    }

    public final boolean e() {
        return this.hideMemberGroup;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof GroupRequirementUIState) == true) goto L8;
        return false;
    L8:
        GroupRequirementUIState r52 = (GroupRequirementUIState) r5;
        if (this.hideMemberGroup == r52.hideMemberGroup) goto L12;
        return false;
    L12:
        if (p.g(this.customRequirements, r52.customRequirements) == true) goto L15;
        return false;
    L15:
        if (p.g(this.rejectionMessage, r52.rejectionMessage) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final String f() {
        return this.rejectionMessage;
    }

    public int hashCode() {
        int r02 = ((Boolean.hashCode(this.hideMemberGroup) * 31) + this.customRequirements.hashCode()) * 31;
        String r1 = this.rejectionMessage;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "GroupRequirementUIState(hideMemberGroup=" + this.hideMemberGroup + ", customRequirements=" + this.customRequirements + ", rejectionMessage=" + this.rejectionMessage + ")";
    }

    public /* synthetic */ GroupRequirementUIState(boolean r1, List r2, String r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = false;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = AbstractC11777v.o();
    L9:
        if ((r4 & 4) == 0) goto L11;
        r3 = null;
    L11:
        this(r1, r2, r3);
    }
}
