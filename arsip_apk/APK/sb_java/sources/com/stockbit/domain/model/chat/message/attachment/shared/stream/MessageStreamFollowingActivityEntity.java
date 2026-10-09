package com.stockbit.domain.model.chat.message.attachment.shared.stream;

import com.clevertap.android.sdk.Constants;
import com.stockbit.domain.model.chat.message.attachment.shared.stream.profile.MessageStreamProfileEntity;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0006HÖ\u0081\u0004R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/stockbit/domain/model/chat/message/attachment/shared/stream/MessageStreamFollowingActivityEntity;", "Ljava/io/Serializable;", "users", "", "Lcom/stockbit/domain/model/chat/message/attachment/shared/stream/profile/MessageStreamProfileEntity;", "info", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getUsers", "()Ljava/util/List;", "getInfo", "()Ljava/lang/String;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "", "toString", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MessageStreamFollowingActivityEntity implements Serializable {
    private final String info;
    private final List<MessageStreamProfileEntity> users;

    public MessageStreamFollowingActivityEntity(List r1, String r2) {
        this.users = r1;
        this.info = r2;
    }

    public final String a() {
        return this.info;
    }

    public final List b() {
        return this.users;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof MessageStreamFollowingActivityEntity) == true) goto L8;
        return false;
    L8:
        MessageStreamFollowingActivityEntity r52 = (MessageStreamFollowingActivityEntity) r5;
        if (p.g(this.users, r52.users) == true) goto L12;
        return false;
    L12:
        if (p.g(this.info, r52.info) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        List<MessageStreamProfileEntity> r02 = this.users;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.info;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "MessageStreamFollowingActivityEntity(users=" + this.users + ", info=" + this.info + ")";
    }
}
