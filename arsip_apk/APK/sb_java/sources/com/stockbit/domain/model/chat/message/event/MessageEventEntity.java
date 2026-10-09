package com.stockbit.domain.model.chat.message.event;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stockbit/domain/model/chat/message/event/MessageEventEntity;", "Ljava/io/Serializable;", Constants.KEY_TEXT, "", "format", "Lcom/stockbit/domain/model/chat/message/event/MessageEventFormatType;", "<init>", "(Ljava/lang/String;Lcom/stockbit/domain/model/chat/message/event/MessageEventFormatType;)V", "getText", "()Ljava/lang/String;", "getFormat", "()Lcom/stockbit/domain/model/chat/message/event/MessageEventFormatType;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "", "toString", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MessageEventEntity implements Serializable {
    private final MessageEventFormatType format;
    private final String text;

    public MessageEventEntity(String r2, MessageEventFormatType r3) {
        p.l(r2, Constants.KEY_TEXT);
        p.l(r3, "format");
        this.text = r2;
        this.format = r3;
    }

    public final MessageEventFormatType a() {
        return this.format;
    }

    public final String b() {
        return this.text;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof MessageEventEntity) == true) goto L8;
        return false;
    L8:
        MessageEventEntity r52 = (MessageEventEntity) r5;
        if (p.g(this.text, r52.text) == true) goto L12;
        return false;
    L12:
        if (this.format == r52.format) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + this.format.hashCode();
    }

    public String toString() {
        return "MessageEventEntity(text=" + this.text + ", format=" + this.format + ")";
    }
}
