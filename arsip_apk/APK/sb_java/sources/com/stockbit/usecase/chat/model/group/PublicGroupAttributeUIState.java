package com.stockbit.usecase.chat.model.group;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/stockbit/usecase/chat/model/group/PublicGroupAttributeUIState;", "Ljava/io/Serializable;", "invitationCode", "", "<init>", "(Ljava/lang/String;)V", "getInvitationCode", "()Ljava/lang/String;", "component1", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "", "toString", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PublicGroupAttributeUIState implements Serializable {
    private final String invitationCode;

    public PublicGroupAttributeUIState(String r2) {
        p.l(r2, "invitationCode");
        this.invitationCode = r2;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof PublicGroupAttributeUIState) == true) goto L9;
        return false;
    L9:
        if (p.g(this.invitationCode, ((PublicGroupAttributeUIState) r4).invitationCode) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.invitationCode.hashCode();
    }

    public String toString() {
        return "PublicGroupAttributeUIState(invitationCode=" + this.invitationCode + ")";
    }
}
