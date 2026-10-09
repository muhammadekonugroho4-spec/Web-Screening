package com.stockbit.usecase.chat.model.group;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J'\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/stockbit/usecase/chat/model/group/GroupShareTradeUIState;", "Ljava/io/Serializable;", "isAutoshareActive", "", "isMemberAllowed", "isShareValue", "<init>", "(ZZZ)V", "()Z", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "other", "", "hashCode", "", "toString", "", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GroupShareTradeUIState implements Serializable {
    private final boolean isAutoshareActive;
    private final boolean isMemberAllowed;
    private final boolean isShareValue;

    public GroupShareTradeUIState(boolean r1, boolean r2, boolean r3) {
        this.isAutoshareActive = r1;
        this.isMemberAllowed = r2;
        this.isShareValue = r3;
    }

    public final boolean a() {
        return this.isAutoshareActive;
    }

    public final boolean b() {
        return this.isMemberAllowed;
    }

    public final boolean c() {
        return this.isShareValue;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof GroupShareTradeUIState) == true) goto L8;
        return false;
    L8:
        GroupShareTradeUIState r52 = (GroupShareTradeUIState) r5;
        if (this.isAutoshareActive == r52.isAutoshareActive) goto L12;
        return false;
    L12:
        if (this.isMemberAllowed == r52.isMemberAllowed) goto L15;
        return false;
    L15:
        if (this.isShareValue == r52.isShareValue) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isAutoshareActive) * 31) + Boolean.hashCode(this.isMemberAllowed)) * 31) + Boolean.hashCode(this.isShareValue);
    }

    public String toString() {
        return "GroupShareTradeUIState(isAutoshareActive=" + this.isAutoshareActive + ", isMemberAllowed=" + this.isMemberAllowed + ", isShareValue=" + this.isShareValue + ")";
    }
}
