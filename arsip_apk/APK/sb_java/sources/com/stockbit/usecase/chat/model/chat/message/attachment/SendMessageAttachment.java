package com.stockbit.usecase.chat.model.chat.message.attachment;

import com.clevertap.android.sdk.Constants;
import com.stockbit.domain.model.chat.message.attachment.upload.UploadType;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/stockbit/usecase/chat/model/chat/message/attachment/SendMessageAttachment;", "Ljava/io/Serializable;", "type", "Lcom/stockbit/domain/model/chat/message/attachment/upload/UploadType;", "url", "", "fileName", "size", "<init>", "(Lcom/stockbit/domain/model/chat/message/attachment/upload/UploadType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Lcom/stockbit/domain/model/chat/message/attachment/upload/UploadType;", "getUrl", "()Ljava/lang/String;", "getFileName", "getSize", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "", "toString", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SendMessageAttachment implements Serializable {
    private final String fileName;
    private final String size;
    private final UploadType type;
    private final String url;

    public SendMessageAttachment(UploadType r2, String r3, String r4, String r5) {
        p.l(r2, "type");
        this.type = r2;
        this.url = r3;
        this.fileName = r4;
        this.size = r5;
    }

    public final UploadType a() {
        return this.type;
    }

    public final String b() {
        return this.url;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof SendMessageAttachment) == true) goto L8;
        return false;
    L8:
        SendMessageAttachment r52 = (SendMessageAttachment) r5;
        if (this.type == r52.type) goto L12;
        return false;
    L12:
        if (p.g(this.url, r52.url) == true) goto L15;
        return false;
    L15:
        if (p.g(this.fileName, r52.fileName) == true) goto L18;
        return false;
    L18:
        if (p.g(this.size, r52.size) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int r02 = this.type.hashCode() * 31;
        String r1 = this.url;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.fileName;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.size;
        if (r15 == null) goto L15;
        r2 = r15.hashCode();
    L15:
        return r04 + r2;
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "SendMessageAttachment(type=" + this.type + ", url=" + this.url + ", fileName=" + this.fileName + ", size=" + this.size + ")";
    }
}
