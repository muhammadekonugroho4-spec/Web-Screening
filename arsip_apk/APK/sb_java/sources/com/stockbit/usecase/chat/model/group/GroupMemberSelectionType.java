package com.stockbit.usecase.chat.model.group;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/usecase/chat/model/group/GroupMemberSelectionType;", "Ljava/io/Serializable;", "<init>", "()V", "NewGroup", "AddMember", "Lcom/stockbit/usecase/chat/model/group/GroupMemberSelectionType$AddMember;", "Lcom/stockbit/usecase/chat/model/group/GroupMemberSelectionType$NewGroup;", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class GroupMemberSelectionType implements Serializable {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0004HÖ\u0081\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/stockbit/usecase/chat/model/group/GroupMemberSelectionType$AddMember;", "Lcom/stockbit/usecase/chat/model/group/GroupMemberSelectionType;", "Ljava/io/Serializable;", "groupId", "", "roomId", "maxGroupMember", "", "totalGroupMember", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "getGroupId", "()Ljava/lang/String;", "getRoomId", "getMaxGroupMember", "()I", "getTotalGroupMember", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "toString", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AddMember extends GroupMemberSelectionType implements Serializable {
        private final String groupId;
        private final int maxGroupMember;
        private final String roomId;
        private final int totalGroupMember;

        public AddMember(String r2, String r3, int r4, int r5) {
            p.l(r2, "groupId");
            p.l(r3, "roomId");
            super(null);
            this.groupId = r2;
            this.roomId = r3;
            this.maxGroupMember = r4;
            this.totalGroupMember = r5;
        }

        public final String a() {
            return this.groupId;
        }

        public final int b() {
            return this.totalGroupMember;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof AddMember) == true) goto L8;
            return false;
        L8:
            AddMember r52 = (AddMember) r5;
            if (p.g(this.groupId, r52.groupId) == true) goto L12;
            return false;
        L12:
            if (p.g(this.roomId, r52.roomId) == true) goto L15;
            return false;
        L15:
            if (this.maxGroupMember == r52.maxGroupMember) goto L18;
            return false;
        L18:
            if (this.totalGroupMember == r52.totalGroupMember) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            return (((((this.groupId.hashCode() * 31) + this.roomId.hashCode()) * 31) + Integer.hashCode(this.maxGroupMember)) * 31) + Integer.hashCode(this.totalGroupMember);
        }

        public String toString() {
            return "AddMember(groupId=" + this.groupId + ", roomId=" + this.roomId + ", maxGroupMember=" + this.maxGroupMember + ", totalGroupMember=" + this.totalGroupMember + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0014\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0006HÖ\u0083\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004J\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004¨\u0006\u000e"}, d2 = {"Lcom/stockbit/usecase/chat/model/group/GroupMemberSelectionType$NewGroup;", "Lcom/stockbit/usecase/chat/model/group/GroupMemberSelectionType;", "Ljava/io/Serializable;", "<init>", "()V", "readResolve", "", "equals", "", "other", "hashCode", "", "toString", "", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NewGroup extends GroupMemberSelectionType implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public static final NewGroup f155525a = null;

        static {
            f155525a = new NewGroup();
        }

        private NewGroup() {
            super(null);
        }

        private final Object readResolve() {
            return f155525a;
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof NewGroup) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 246250711;
        }

        public String toString() {
            return "NewGroup";
        }
    }

    public /* synthetic */ GroupMemberSelectionType(i r1) {
        this();
    }

    private GroupMemberSelectionType() {
    }
}
