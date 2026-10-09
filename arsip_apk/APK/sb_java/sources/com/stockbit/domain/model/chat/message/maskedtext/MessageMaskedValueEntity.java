package com.stockbit.domain.model.chat.message.maskedtext;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0007HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/stockbit/domain/model/chat/message/maskedtext/MessageMaskedValueEntity;", "Ljava/io/Serializable;", "format", "Lcom/stockbit/domain/model/chat/message/maskedtext/MessageMaskedValueType;", "link", "Lcom/stockbit/domain/model/chat/message/maskedtext/MessageMaskedLinkEntity;", Constants.KEY_TEXT, "", "<init>", "(Lcom/stockbit/domain/model/chat/message/maskedtext/MessageMaskedValueType;Lcom/stockbit/domain/model/chat/message/maskedtext/MessageMaskedLinkEntity;Ljava/lang/String;)V", "getFormat", "()Lcom/stockbit/domain/model/chat/message/maskedtext/MessageMaskedValueType;", "getLink", "()Lcom/stockbit/domain/model/chat/message/maskedtext/MessageMaskedLinkEntity;", "getText", "()Ljava/lang/String;", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "", "toString", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MessageMaskedValueEntity implements Serializable {
    private final MessageMaskedValueType format;
    private final MessageMaskedLinkEntity link;
    private final String text;

    public MessageMaskedValueEntity(MessageMaskedValueType r2, MessageMaskedLinkEntity r3, String r4) {
        p.l(r2, "format");
        p.l(r3, "link");
        p.l(r4, Constants.KEY_TEXT);
        this.format = r2;
        this.link = r3;
        this.text = r4;
    }

    public final MessageMaskedValueType a() {
        return this.format;
    }

    public final MessageMaskedLinkEntity b() {
        return this.link;
    }

    public final String c() {
        return this.text;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof MessageMaskedValueEntity) == true) goto L8;
        return false;
    L8:
        MessageMaskedValueEntity r52 = (MessageMaskedValueEntity) r5;
        if (this.format == r52.format) goto L12;
        return false;
    L12:
        if (p.g(this.link, r52.link) == true) goto L15;
        return false;
    L15:
        if (p.g(this.text, r52.text) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.format.hashCode() * 31) + this.link.hashCode()) * 31) + this.text.hashCode();
    }

    public String toString() {
        return "MessageMaskedValueEntity(format=" + this.format + ", link=" + this.link + ", text=" + this.text + ")";
    }
}
