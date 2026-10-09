package com.stockbit.dto.chat;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0014\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0005HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0002\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\nR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/stockbit/dto/chat/ChatEligibilityDTO;", "", "isEligible", "", "verifiedStatus", "", "canSendChatRequest", "isBlocked", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getVerifiedStatus", "()Ljava/lang/String;", "getCanSendChatRequest", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/stockbit/dto/chat/ChatEligibilityDTO;", "equals", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ChatEligibilityDTO {

    @SerializedName("can_send_chat_request")
    private final Boolean canSendChatRequest;

    @SerializedName("is_blocked")
    private final Boolean isBlocked;

    @SerializedName("is_eligible")
    private final Boolean isEligible;

    @SerializedName("verified_status")
    private final String verifiedStatus;

    public ChatEligibilityDTO() {
        Boolean r1 = null;
        String r2 = null;
        Boolean r3 = null;
        Boolean r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public final Boolean a() {
        return this.canSendChatRequest;
    }

    public final String b() {
        return this.verifiedStatus;
    }

    public final Boolean c() {
        return this.isBlocked;
    }

    public final Boolean d() {
        return this.isEligible;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ChatEligibilityDTO) == true) goto L8;
        return false;
    L8:
        ChatEligibilityDTO r52 = (ChatEligibilityDTO) r5;
        if (p.g(this.isEligible, r52.isEligible) == true) goto L12;
        return false;
    L12:
        if (p.g(this.verifiedStatus, r52.verifiedStatus) == true) goto L15;
        return false;
    L15:
        if (p.g(this.canSendChatRequest, r52.canSendChatRequest) == true) goto L18;
        return false;
    L18:
        if (p.g(this.isBlocked, r52.isBlocked) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        Boolean r02 = this.isEligible;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.verifiedStatus;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Boolean r23 = this.canSendChatRequest;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Boolean r25 = this.isBlocked;
        if (r25 == null) goto L19;
        r1 = r25.hashCode();
    L19:
        return r06 + r1;
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
        return "ChatEligibilityDTO(isEligible=" + this.isEligible + ", verifiedStatus=" + this.verifiedStatus + ", canSendChatRequest=" + this.canSendChatRequest + ", isBlocked=" + this.isBlocked + ")";
    }

    public ChatEligibilityDTO(Boolean r1, String r2, Boolean r3, Boolean r4) {
        this.isEligible = r1;
        this.verifiedStatus = r2;
        this.canSendChatRequest = r3;
        this.isBlocked = r4;
    }

    public /* synthetic */ ChatEligibilityDTO(Boolean r2, String r3, Boolean r4, Boolean r5, int r6, i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = null;
    L14:
        this(r2, r3, r4, r5);
    }
}
