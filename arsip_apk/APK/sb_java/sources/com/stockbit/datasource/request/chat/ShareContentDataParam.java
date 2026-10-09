package com.stockbit.datasource.request.chat;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001eB1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0006HÖ\u0081\u0004R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/stockbit/datasource/request/chat/ShareContentDataParam;", "", "receivers", "", "Lcom/stockbit/datasource/request/chat/ReceiverDataParam;", Constants.KEY_TEXT, "", "sharedContent", "Lcom/stockbit/datasource/request/chat/ShareContentDataParam$SharedContent;", "attachmentUrl", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/stockbit/datasource/request/chat/ShareContentDataParam$SharedContent;Ljava/lang/String;)V", "getReceivers", "()Ljava/util/List;", "getText", "()Ljava/lang/String;", "getSharedContent", "()Lcom/stockbit/datasource/request/chat/ShareContentDataParam$SharedContent;", "getAttachmentUrl", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "SharedContent", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ShareContentDataParam {

    @SerializedName("attachment_url")
    private final String attachmentUrl;

    @SerializedName("receivers")
    private final List<ReceiverDataParam> receivers;

    @SerializedName("shared_content")
    private final SharedContent sharedContent;

    @SerializedName(Constants.KEY_TEXT)
    private final String text;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/stockbit/datasource/request/chat/ShareContentDataParam$SharedContent;", "", Constants.KEY_ID, "", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getType", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SharedContent {

        /* renamed from: id, reason: collision with root package name */
        @SerializedName(Constants.KEY_ID)
        private final String f80112id;

        @SerializedName("type")
        private final String type;

        public SharedContent(String r2, String r3) {
            p.l(r2, Constants.KEY_ID);
            p.l(r3, "type");
            this.f80112id = r2;
            this.type = r3;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof SharedContent) == true) goto L8;
            return false;
        L8:
            SharedContent r52 = (SharedContent) r5;
            if (p.g(this.f80112id, r52.f80112id) == true) goto L12;
            return false;
        L12:
            if (p.g(this.type, r52.type) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f80112id.hashCode() * 31) + this.type.hashCode();
        }

        public String toString() {
            return "SharedContent(id=" + this.f80112id + ", type=" + this.type + ")";
        }
    }

    public ShareContentDataParam(List<ReceiverDataParam> r2, String r3, SharedContent r4, String r5) {
        p.l(r2, "receivers");
        p.l(r3, Constants.KEY_TEXT);
        this.receivers = r2;
        this.text = r3;
        this.sharedContent = r4;
        this.attachmentUrl = r5;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ShareContentDataParam) == true) goto L8;
        return false;
    L8:
        ShareContentDataParam r52 = (ShareContentDataParam) r5;
        if (p.g(this.receivers, r52.receivers) == true) goto L12;
        return false;
    L12:
        if (p.g(this.text, r52.text) == true) goto L15;
        return false;
    L15:
        if (p.g(this.sharedContent, r52.sharedContent) == true) goto L18;
        return false;
    L18:
        if (p.g(this.attachmentUrl, r52.attachmentUrl) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int r02 = ((this.receivers.hashCode() * 31) + this.text.hashCode()) * 31;
        SharedContent r1 = this.sharedContent;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.attachmentUrl;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "ShareContentDataParam(receivers=" + this.receivers + ", text=" + this.text + ", sharedContent=" + this.sharedContent + ", attachmentUrl=" + this.attachmentUrl + ")";
    }
}
