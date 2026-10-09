package com.stockbit.usecase.chat.model.group;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b)\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\tHÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\u009f\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u0005HÆ\u0001J\u0014\u00101\u001a\u00020\t2\b\u00102\u001a\u0004\u0018\u000103HÖ\u0083\u0004J\n\u00104\u001a\u00020\u0003HÖ\u0081\u0004J\n\u00105\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001cR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001cR\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001cR\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010\u0012\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u001cR\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019¨\u00066"}, d2 = {"Lcom/stockbit/usecase/chat/model/group/Member;", "Ljava/io/Serializable;", "userId", "", "username", "", "fullName", "avatar", "isVerified", "", "isSelected", "isAdmin", "isYou", "isGroupMember", "position", "totalGroupMember", "isGroupRoomAccepted", "memberId", "isInteractable", "verifiedStatus", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZIIZIZLjava/lang/String;)V", "getUserId", "()I", "getUsername", "()Ljava/lang/String;", "getFullName", "getAvatar", "()Z", "getPosition", "getTotalGroupMember", "getMemberId", "getVerifiedStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", Constants.COPY_TYPE, "equals", "other", "", "hashCode", "toString", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Member implements Serializable {
    private final String avatar;
    private final String fullName;
    private final boolean isAdmin;
    private final boolean isGroupMember;
    private final boolean isGroupRoomAccepted;
    private final boolean isInteractable;
    private final boolean isSelected;
    private final boolean isVerified;
    private final boolean isYou;
    private final int memberId;
    private final int position;
    private final int totalGroupMember;
    private final int userId;
    private final String username;
    private final String verifiedStatus;

    public Member(int r3, String r4, String r5, String r6, boolean r7, boolean r8, boolean r9, boolean r10, boolean r11, int r12, int r13, boolean r14, int r15, boolean r16, String r17) {
        p.l(r4, "username");
        p.l(r5, "fullName");
        p.l(r6, "avatar");
        p.l(r17, "verifiedStatus");
        this.userId = r3;
        this.username = r4;
        this.fullName = r5;
        this.avatar = r6;
        this.isVerified = r7;
        this.isSelected = r8;
        this.isAdmin = r9;
        this.isYou = r10;
        this.isGroupMember = r11;
        this.position = r12;
        this.totalGroupMember = r13;
        this.isGroupRoomAccepted = r14;
        this.memberId = r15;
        this.isInteractable = r16;
        this.verifiedStatus = r17;
    }

    public final String a() {
        return this.avatar;
    }

    public final String b() {
        return this.fullName;
    }

    public final int c() {
        return this.memberId;
    }

    public final int d() {
        return this.userId;
    }

    public final String e() {
        return this.username;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Member) == true) goto L8;
        return false;
    L8:
        Member r52 = (Member) r5;
        if (this.userId == r52.userId) goto L12;
        return false;
    L12:
        if (p.g(this.username, r52.username) == true) goto L15;
        return false;
    L15:
        if (p.g(this.fullName, r52.fullName) == true) goto L18;
        return false;
    L18:
        if (p.g(this.avatar, r52.avatar) == true) goto L21;
        return false;
    L21:
        if (this.isVerified == r52.isVerified) goto L24;
        return false;
    L24:
        if (this.isSelected == r52.isSelected) goto L27;
        return false;
    L27:
        if (this.isAdmin == r52.isAdmin) goto L30;
        return false;
    L30:
        if (this.isYou == r52.isYou) goto L33;
        return false;
    L33:
        if (this.isGroupMember == r52.isGroupMember) goto L36;
        return false;
    L36:
        if (this.position == r52.position) goto L39;
        return false;
    L39:
        if (this.totalGroupMember == r52.totalGroupMember) goto L42;
        return false;
    L42:
        if (this.isGroupRoomAccepted == r52.isGroupRoomAccepted) goto L45;
        return false;
    L45:
        if (this.memberId == r52.memberId) goto L48;
        return false;
    L48:
        if (this.isInteractable == r52.isInteractable) goto L51;
        return false;
    L51:
        if (p.g(this.verifiedStatus, r52.verifiedStatus) == true) goto L53;
        return false;
    L53:
        return true;
    }

    public final boolean f() {
        return this.isAdmin;
    }

    public final boolean g() {
        return this.isVerified;
    }

    public final boolean h() {
        return this.isYou;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((Integer.hashCode(this.userId) * 31) + this.username.hashCode()) * 31) + this.fullName.hashCode()) * 31) + this.avatar.hashCode()) * 31) + Boolean.hashCode(this.isVerified)) * 31) + Boolean.hashCode(this.isSelected)) * 31) + Boolean.hashCode(this.isAdmin)) * 31) + Boolean.hashCode(this.isYou)) * 31) + Boolean.hashCode(this.isGroupMember)) * 31) + Integer.hashCode(this.position)) * 31) + Integer.hashCode(this.totalGroupMember)) * 31) + Boolean.hashCode(this.isGroupRoomAccepted)) * 31) + Integer.hashCode(this.memberId)) * 31) + Boolean.hashCode(this.isInteractable)) * 31) + this.verifiedStatus.hashCode();
    }

    public String toString() {
        return "Member(userId=" + this.userId + ", username=" + this.username + ", fullName=" + this.fullName + ", avatar=" + this.avatar + ", isVerified=" + this.isVerified + ", isSelected=" + this.isSelected + ", isAdmin=" + this.isAdmin + ", isYou=" + this.isYou + ", isGroupMember=" + this.isGroupMember + ", position=" + this.position + ", totalGroupMember=" + this.totalGroupMember + ", isGroupRoomAccepted=" + this.isGroupRoomAccepted + ", memberId=" + this.memberId + ", isInteractable=" + this.isInteractable + ", verifiedStatus=" + this.verifiedStatus + ")";
    }

    public /* synthetic */ Member(int r17, String r18, String r19, String r20, boolean r21, boolean r22, boolean r23, boolean r24, boolean r25, int r26, int r27, boolean r28, int r29, boolean r30, String r31, int r32, i r33) {
        if ((r32 & 1) == 0) goto L5;
        int r1 = 0;
    L7:
        if ((r32 & 2) == 0) goto L9;
        String r3 = "";
    L11:
        if ((r32 & 4) == 0) goto L13;
        String r5 = "";
    L15:
        if ((r32 & 8) == 0) goto L17;
        String r6 = "";
    L19:
        if ((r32 & 16) == 0) goto L21;
        boolean r7 = false;
    L23:
        if ((r32 & 32) == 0) goto L25;
        boolean r8 = false;
    L27:
        if ((r32 & 64) == 0) goto L29;
        boolean r9 = false;
    L31:
        if ((r32 & 128) == 0) goto L33;
        boolean r10 = false;
    L35:
        if ((r32 & 256) == 0) goto L37;
        boolean r11 = false;
    L39:
        if ((r32 & 512) == 0) goto L41;
        int r12 = 0;
    L43:
        if ((r32 & 1024) == 0) goto L45;
        int r13 = 0;
    L47:
        if ((r32 & 2048) == 0) goto L49;
        boolean r14 = false;
    L51:
        if ((r32 & 4096) == 0) goto L53;
        int r15 = 0;
    L55:
        if ((r32 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        boolean r2 = false;
    L59:
        if ((r32 & 16384) == 0) goto L62;
        String r322 = "";
    L63:
        this(r1, r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r322);
        return;
    L62:
        r322 = r31;
        goto L63
    L57:
        r2 = r30;
        goto L59
    L53:
        r15 = r29;
        goto L55
    L49:
        r14 = r28;
        goto L51
    L45:
        r13 = r27;
        goto L47
    L41:
        r12 = r26;
        goto L43
    L37:
        r11 = r25;
        goto L39
    L33:
        r10 = r24;
        goto L35
    L29:
        r9 = r23;
        goto L31
    L25:
        r8 = r22;
        goto L27
    L21:
        r7 = r21;
        goto L23
    L17:
        r6 = r20;
        goto L19
    L13:
        r5 = r19;
        goto L15
    L9:
        r3 = r18;
        goto L11
    L5:
        r1 = r17;
        goto L7
    }
}
