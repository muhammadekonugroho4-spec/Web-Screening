package com.stockbit.domain.model.chat.message.attachment.upload;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/stockbit/domain/model/chat/message/attachment/upload/MessageUploadPictureEntity;", "Ljava/io/Serializable;", "height", "", "width", "<init>", "(II)V", "getHeight", "()I", "getWidth", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "toString", "", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MessageUploadPictureEntity implements Serializable {
    private final int height;
    private final int width;

    public MessageUploadPictureEntity(int r1, int r2) {
        this.height = r1;
        this.width = r2;
    }

    public final int a() {
        return this.height;
    }

    public final int b() {
        return this.width;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof MessageUploadPictureEntity) == true) goto L8;
        return false;
    L8:
        MessageUploadPictureEntity r52 = (MessageUploadPictureEntity) r5;
        if (this.height == r52.height) goto L12;
        return false;
    L12:
        if (this.width == r52.width) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Integer.hashCode(this.height) * 31) + Integer.hashCode(this.width);
    }

    public String toString() {
        return "MessageUploadPictureEntity(height=" + this.height + ", width=" + this.width + ")";
    }
}
