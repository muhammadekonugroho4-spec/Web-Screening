package com.stockbit.usecase.chat.model.group;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/stockbit/usecase/chat/model/group/GroupAttributeUIState;", "Ljava/io/Serializable;", "private", "Lcom/stockbit/usecase/chat/model/group/PrivateGroupAttributeUIState;", "public", "Lcom/stockbit/usecase/chat/model/group/PublicGroupAttributeUIState;", "<init>", "(Lcom/stockbit/usecase/chat/model/group/PrivateGroupAttributeUIState;Lcom/stockbit/usecase/chat/model/group/PublicGroupAttributeUIState;)V", "getPrivate", "()Lcom/stockbit/usecase/chat/model/group/PrivateGroupAttributeUIState;", "getPublic", "()Lcom/stockbit/usecase/chat/model/group/PublicGroupAttributeUIState;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "", "toString", "", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GroupAttributeUIState implements Serializable {

    /* renamed from: private, reason: not valid java name */
    private final PrivateGroupAttributeUIState f67private;

    /* renamed from: public, reason: not valid java name */
    private final PublicGroupAttributeUIState f68public;

    public GroupAttributeUIState(PrivateGroupAttributeUIState r2, PublicGroupAttributeUIState r3) {
        p.l(r2, "private");
        p.l(r3, "public");
        this.f67private = r2;
        this.f68public = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof GroupAttributeUIState) == true) goto L8;
        return false;
    L8:
        GroupAttributeUIState r52 = (GroupAttributeUIState) r5;
        if (p.g(this.f67private, r52.f67private) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f68public, r52.f68public) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f67private.hashCode() * 31) + this.f68public.hashCode();
    }

    public String toString() {
        return "GroupAttributeUIState(private=" + this.f67private + ", public=" + this.f68public + ")";
    }
}
