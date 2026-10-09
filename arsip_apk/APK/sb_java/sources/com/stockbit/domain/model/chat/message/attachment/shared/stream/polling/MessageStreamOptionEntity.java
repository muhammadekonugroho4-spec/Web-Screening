package com.stockbit.domain.model.chat.message.attachment.shared.stream.polling;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/stockbit/domain/model/chat/message/attachment/shared/stream/polling/MessageStreamOptionEntity;", "Ljava/io/Serializable;", Constants.KEY_ID, "", "value", "", "countVoters", "<init>", "(ILjava/lang/String;I)V", "getId", "()I", "getValue", "()Ljava/lang/String;", "getCountVoters", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "toString", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MessageStreamOptionEntity implements Serializable {
    private final int countVoters;

    /* renamed from: id, reason: collision with root package name */
    private final int f81273id;
    private final String value;

    public MessageStreamOptionEntity(int r2, String r3, int r4) {
        p.l(r3, "value");
        this.f81273id = r2;
        this.value = r3;
        this.countVoters = r4;
    }

    public final int a() {
        return this.countVoters;
    }

    public final int b() {
        return this.f81273id;
    }

    public final String c() {
        return this.value;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof MessageStreamOptionEntity) == true) goto L8;
        return false;
    L8:
        MessageStreamOptionEntity r52 = (MessageStreamOptionEntity) r5;
        if (this.f81273id == r52.f81273id) goto L12;
        return false;
    L12:
        if (p.g(this.value, r52.value) == true) goto L15;
        return false;
    L15:
        if (this.countVoters == r52.countVoters) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f81273id) * 31) + this.value.hashCode()) * 31) + Integer.hashCode(this.countVoters);
    }

    public String toString() {
        return "MessageStreamOptionEntity(id=" + this.f81273id + ", value=" + this.value + ", countVoters=" + this.countVoters + ")";
    }
}
