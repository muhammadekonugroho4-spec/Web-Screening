package com.stockbit.usecase.chat.model.chat.message.attachment;

import com.clevertap.android.sdk.Constants;
import com.stockbit.usecase.chat.model.chat.room.ReceiverType;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stockbit/usecase/chat/model/chat/message/attachment/ReceiverData;", "Ljava/io/Serializable;", Constants.KEY_ID, "", "type", "Lcom/stockbit/usecase/chat/model/chat/room/ReceiverType;", "<init>", "(ILcom/stockbit/usecase/chat/model/chat/room/ReceiverType;)V", "getId", "()I", "getType", "()Lcom/stockbit/usecase/chat/model/chat/room/ReceiverType;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "toString", "", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReceiverData implements Serializable {

    /* renamed from: id, reason: collision with root package name */
    private final int f155252id;
    private final ReceiverType type;

    public ReceiverData(int r2, ReceiverType r3) {
        p.l(r3, "type");
        this.f155252id = r2;
        this.type = r3;
    }

    public final int a() {
        return this.f155252id;
    }

    public final ReceiverType b() {
        return this.type;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ReceiverData) == true) goto L8;
        return false;
    L8:
        ReceiverData r52 = (ReceiverData) r5;
        if (this.f155252id == r52.f155252id) goto L12;
        return false;
    L12:
        if (this.type == r52.type) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f155252id) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "ReceiverData(id=" + this.f155252id + ", type=" + this.type + ")";
    }
}
