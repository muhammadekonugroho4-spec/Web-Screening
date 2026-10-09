package com.stockbit.domain.model.chat.message.maskedtext;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0004HÖ\u0081\u0004R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/stockbit/domain/model/chat/message/maskedtext/MessageMaskedTextEntity;", "Ljava/io/Serializable;", "masks", "", "", "Lcom/stockbit/domain/model/chat/message/maskedtext/MessageMaskedValueEntity;", Constants.KEY_TEXT, "<init>", "(Ljava/util/Map;Ljava/lang/String;)V", "getMasks", "()Ljava/util/Map;", "getText", "()Ljava/lang/String;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "", "toString", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MessageMaskedTextEntity implements Serializable {
    private final Map<String, MessageMaskedValueEntity> masks;
    private final String text;

    public MessageMaskedTextEntity(Map r2, String r3) {
        p.l(r2, "masks");
        p.l(r3, Constants.KEY_TEXT);
        this.masks = r2;
        this.text = r3;
    }

    public final Map a() {
        return this.masks;
    }

    public final String b() {
        return this.text;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof MessageMaskedTextEntity) == true) goto L8;
        return false;
    L8:
        MessageMaskedTextEntity r52 = (MessageMaskedTextEntity) r5;
        if (p.g(this.masks, r52.masks) == true) goto L12;
        return false;
    L12:
        if (p.g(this.text, r52.text) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.masks.hashCode() * 31) + this.text.hashCode();
    }

    public String toString() {
        return "MessageMaskedTextEntity(masks=" + this.masks + ", text=" + this.text + ")";
    }
}
