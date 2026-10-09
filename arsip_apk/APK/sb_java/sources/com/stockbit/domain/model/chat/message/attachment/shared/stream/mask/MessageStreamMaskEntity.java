package com.stockbit.domain.model.chat.message.attachment.shared.stream.mask;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/stockbit/domain/model/chat/message/attachment/shared/stream/mask/MessageStreamMaskEntity;", "Ljava/io/Serializable;", "tag", "", "attr", "Lcom/stockbit/domain/model/chat/message/attachment/shared/stream/mask/MessageStreamAttrEntity;", Constants.KEY_TEXT, "<init>", "(Ljava/lang/String;Lcom/stockbit/domain/model/chat/message/attachment/shared/stream/mask/MessageStreamAttrEntity;Ljava/lang/String;)V", "getTag", "()Ljava/lang/String;", "getAttr", "()Lcom/stockbit/domain/model/chat/message/attachment/shared/stream/mask/MessageStreamAttrEntity;", "getText", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "", "toString", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MessageStreamMaskEntity implements Serializable {
    private final MessageStreamAttrEntity attr;
    private final String tag;
    private final String text;

    public MessageStreamMaskEntity(String r1, MessageStreamAttrEntity r2, String r3) {
        this.tag = r1;
        this.attr = r2;
        this.text = r3;
    }

    public final MessageStreamAttrEntity a() {
        return this.attr;
    }

    public final String b() {
        return this.tag;
    }

    public final String c() {
        return this.text;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof MessageStreamMaskEntity) == true) goto L8;
        return false;
    L8:
        MessageStreamMaskEntity r52 = (MessageStreamMaskEntity) r5;
        if (p.g(this.tag, r52.tag) == true) goto L12;
        return false;
    L12:
        if (p.g(this.attr, r52.attr) == true) goto L15;
        return false;
    L15:
        if (p.g(this.text, r52.text) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        String r02 = this.tag;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        MessageStreamAttrEntity r2 = this.attr;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.text;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return r05 + r1;
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "MessageStreamMaskEntity(tag=" + this.tag + ", attr=" + this.attr + ", text=" + this.text + ")";
    }
}
