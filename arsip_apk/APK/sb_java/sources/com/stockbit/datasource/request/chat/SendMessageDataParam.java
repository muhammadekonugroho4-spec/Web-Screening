package com.stockbit.datasource.request.chat;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001#B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003JH\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0014\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010!\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010\"\u001a\u00020\u0005HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006$"}, d2 = {"Lcom/stockbit/datasource/request/chat/SendMessageDataParam;", "", "receiver", "Lcom/stockbit/datasource/request/chat/ReceiverDataParam;", Constants.KEY_TEXT, "", "repliedMessageId", "", "attachment", "Lcom/stockbit/datasource/request/chat/SendMessageDataParam$AttachmentDataParam;", "referenceId", "<init>", "(Lcom/stockbit/datasource/request/chat/ReceiverDataParam;Ljava/lang/String;Ljava/lang/Integer;Lcom/stockbit/datasource/request/chat/SendMessageDataParam$AttachmentDataParam;Ljava/lang/String;)V", "getReceiver", "()Lcom/stockbit/datasource/request/chat/ReceiverDataParam;", "getText", "()Ljava/lang/String;", "getRepliedMessageId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAttachment", "()Lcom/stockbit/datasource/request/chat/SendMessageDataParam$AttachmentDataParam;", "getReferenceId", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "(Lcom/stockbit/datasource/request/chat/ReceiverDataParam;Ljava/lang/String;Ljava/lang/Integer;Lcom/stockbit/datasource/request/chat/SendMessageDataParam$AttachmentDataParam;Ljava/lang/String;)Lcom/stockbit/datasource/request/chat/SendMessageDataParam;", "equals", "", "other", "hashCode", "toString", "AttachmentDataParam", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SendMessageDataParam {

    @SerializedName("attachment")
    private final AttachmentDataParam attachment;

    @SerializedName("receiver")
    private final ReceiverDataParam receiver;

    @SerializedName("reference_id")
    private final String referenceId;

    @SerializedName("replied_message_id")
    private final Integer repliedMessageId;

    @SerializedName(Constants.KEY_TEXT)
    private final String text;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/stockbit/datasource/request/chat/SendMessageDataParam$AttachmentDataParam;", "", "type", "", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getUrl", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AttachmentDataParam {

        @SerializedName("type")
        private final String type;

        @SerializedName("url")
        private final String url;

        public AttachmentDataParam(String r2, String r3) {
            p.l(r2, "type");
            p.l(r3, "url");
            this.type = r2;
            this.url = r3;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof AttachmentDataParam) == true) goto L8;
            return false;
        L8:
            AttachmentDataParam r52 = (AttachmentDataParam) r5;
            if (p.g(this.type, r52.type) == true) goto L12;
            return false;
        L12:
            if (p.g(this.url, r52.url) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.type.hashCode() * 31) + this.url.hashCode();
        }

        public String toString() {
            return "AttachmentDataParam(type=" + this.type + ", url=" + this.url + ")";
        }
    }

    public SendMessageDataParam(ReceiverDataParam r2, String r3, Integer r4, AttachmentDataParam r5, String r6) {
        p.l(r2, "receiver");
        this.receiver = r2;
        this.text = r3;
        this.repliedMessageId = r4;
        this.attachment = r5;
        this.referenceId = r6;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof SendMessageDataParam) == true) goto L8;
        return false;
    L8:
        SendMessageDataParam r52 = (SendMessageDataParam) r5;
        if (p.g(this.receiver, r52.receiver) == true) goto L12;
        return false;
    L12:
        if (p.g(this.text, r52.text) == true) goto L15;
        return false;
    L15:
        if (p.g(this.repliedMessageId, r52.repliedMessageId) == true) goto L18;
        return false;
    L18:
        if (p.g(this.attachment, r52.attachment) == true) goto L21;
        return false;
    L21:
        if (p.g(this.referenceId, r52.referenceId) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        int r02 = this.receiver.hashCode() * 31;
        String r1 = this.text;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        Integer r13 = this.repliedMessageId;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        AttachmentDataParam r15 = this.attachment;
        if (r15 != null) goto L13;
        int r16 = 0;
    L14:
        int r05 = (r04 + r16) * 31;
        String r17 = this.referenceId;
        if (r17 == null) goto L19;
        r2 = r17.hashCode();
    L19:
        return r05 + r2;
    L13:
        r16 = r15.hashCode();
        goto L14
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "SendMessageDataParam(receiver=" + this.receiver + ", text=" + this.text + ", repliedMessageId=" + this.repliedMessageId + ", attachment=" + this.attachment + ", referenceId=" + this.referenceId + ")";
    }

    public /* synthetic */ SendMessageDataParam(ReceiverDataParam r7, String r8, Integer r9, AttachmentDataParam r10, String r11, int r12, i r13) {
        if ((r12 & 8) == 0) goto L5;
        r10 = null;
    L5:
        this(r7, r8, r9, r10, r11);
    }
}
