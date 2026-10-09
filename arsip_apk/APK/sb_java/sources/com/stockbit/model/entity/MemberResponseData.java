package com.stockbit.model.entity;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.scheduling.WorkQueueKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jb\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010!J\u0014\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010%\u001a\u00020\u0005HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\b\u0010\u0015R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0017\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012¨\u0006&"}, d2 = {"Lcom/stockbit/model/entity/MemberResponseData;", "", "userId", "", "username", "", "fullName", "avatar", "isVerified", "", "memberId", "verifiedStatus", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;)V", "getUserId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUsername", "()Ljava/lang/String;", "getFullName", "getAvatar", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMemberId", "getVerifiedStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", Constants.COPY_TYPE, "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;)Lcom/stockbit/model/entity/MemberResponseData;", "equals", "other", "hashCode", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MemberResponseData {

    @SerializedName("avatar")
    private final String avatar;

    @SerializedName("full_name")
    private final String fullName;

    @SerializedName("is_verified")
    private final Boolean isVerified;

    @SerializedName("member_id")
    private final Integer memberId;

    @SerializedName("user_id")
    private final Integer userId;

    @SerializedName("username")
    private final String username;

    @SerializedName("verified_status")
    private final String verifiedStatus;

    public MemberResponseData() {
        Integer r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        Boolean r5 = null;
        Integer r6 = null;
        String r7 = null;
        this(r1, r2, r3, r4, r5, r6, r7, WorkQueueKt.MASK, null);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof MemberResponseData) == true) goto L8;
        return false;
    L8:
        MemberResponseData r52 = (MemberResponseData) r5;
        if (p.g(this.userId, r52.userId) == true) goto L12;
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
        if (p.g(this.isVerified, r52.isVerified) == true) goto L24;
        return false;
    L24:
        if (p.g(this.memberId, r52.memberId) == true) goto L27;
        return false;
    L27:
        if (p.g(this.verifiedStatus, r52.verifiedStatus) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public int hashCode() {
        Integer r02 = this.userId;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.username;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.fullName;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.avatar;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        Boolean r27 = this.isVerified;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        Integer r29 = this.memberId;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.verifiedStatus;
        if (r211 == null) goto L31;
        r1 = r211.hashCode();
    L31:
        return r09 + r1;
    L25:
        r210 = r29.hashCode();
        goto L26
    L21:
        r28 = r27.hashCode();
        goto L22
    L17:
        r26 = r25.hashCode();
        goto L18
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "MemberResponseData(userId=" + this.userId + ", username=" + this.username + ", fullName=" + this.fullName + ", avatar=" + this.avatar + ", isVerified=" + this.isVerified + ", memberId=" + this.memberId + ", verifiedStatus=" + this.verifiedStatus + ')';
    }

    public MemberResponseData(Integer r1, String r2, String r3, String r4, Boolean r5, Integer r6, String r7) {
        this.userId = r1;
        this.username = r2;
        this.fullName = r3;
        this.avatar = r4;
        this.isVerified = r5;
        this.memberId = r6;
        this.verifiedStatus = r7;
    }

    public /* synthetic */ MemberResponseData(Integer r2, String r3, String r4, String r5, Boolean r6, Integer r7, String r8, int r9, i r10) {
        if ((r9 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r7 = null;
    L21:
        if ((r9 & 64) == 0) goto L24;
        String r92 = null;
    L23:
        Integer r82 = r7;
        Boolean r72 = r6;
        String r62 = r5;
        String r52 = r4;
        this(r2, r3, r52, r62, r72, r82, r92);
        return;
    L24:
        r92 = r8;
        goto L23
    }
}
