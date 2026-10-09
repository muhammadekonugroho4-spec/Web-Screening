package com.stockbit.domain.model.chat.message.attachment.shared.invitation;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/stockbit/domain/model/chat/message/attachment/shared/invitation/MessageInvitationEntity;", "Ljava/io/Serializable;", "invitationCode", "", "roomName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getInvitationCode", "()Ljava/lang/String;", "getRoomName", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "", "toString", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MessageInvitationEntity implements Serializable {
    private final String invitationCode;
    private final String roomName;

    public MessageInvitationEntity(String r2, String r3) {
        p.l(r2, "invitationCode");
        p.l(r3, "roomName");
        this.invitationCode = r2;
        this.roomName = r3;
    }

    public final String a() {
        return this.invitationCode;
    }

    public final String b() {
        return this.roomName;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof MessageInvitationEntity) == true) goto L8;
        return false;
    L8:
        MessageInvitationEntity r52 = (MessageInvitationEntity) r5;
        if (p.g(this.invitationCode, r52.invitationCode) == true) goto L12;
        return false;
    L12:
        if (p.g(this.roomName, r52.roomName) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.invitationCode.hashCode() * 31) + this.roomName.hashCode();
    }

    public String toString() {
        return "MessageInvitationEntity(invitationCode=" + this.invitationCode + ", roomName=" + this.roomName + ")";
    }
}
