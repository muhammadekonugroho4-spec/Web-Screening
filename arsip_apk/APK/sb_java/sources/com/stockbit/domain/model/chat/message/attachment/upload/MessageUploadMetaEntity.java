package com.stockbit.domain.model.chat.message.attachment.upload;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stockbit/domain/model/chat/message/attachment/upload/MessageUploadMetaEntity;", "Ljava/io/Serializable;", "picture", "Lcom/stockbit/domain/model/chat/message/attachment/upload/MessageUploadPictureEntity;", "<init>", "(Lcom/stockbit/domain/model/chat/message/attachment/upload/MessageUploadPictureEntity;)V", "getPicture", "()Lcom/stockbit/domain/model/chat/message/attachment/upload/MessageUploadPictureEntity;", "component1", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "", "toString", "", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MessageUploadMetaEntity implements Serializable {
    private final MessageUploadPictureEntity picture;

    public MessageUploadMetaEntity(MessageUploadPictureEntity r1) {
        this.picture = r1;
    }

    public final MessageUploadPictureEntity a() {
        return this.picture;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof MessageUploadMetaEntity) == true) goto L9;
        return false;
    L9:
        if (p.g(this.picture, ((MessageUploadMetaEntity) r4).picture) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        MessageUploadPictureEntity r02 = this.picture;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "MessageUploadMetaEntity(picture=" + this.picture + ")";
    }
}
