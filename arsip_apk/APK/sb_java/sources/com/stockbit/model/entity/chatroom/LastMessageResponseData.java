package com.stockbit.model.entity.chatroom;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JL\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0014\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010 \u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0005HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0015¨\u0006\""}, d2 = {"Lcom/stockbit/model/entity/chatroom/LastMessageResponseData;", "", Constants.KEY_ID, "", Constants.KEY_TEXT, "", "type", "createdAt", "senderUsername", "isDeleted", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getText", "()Ljava/lang/String;", "getType", "getCreatedAt", "getSenderUsername", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/stockbit/model/entity/chatroom/LastMessageResponseData;", "equals", "other", "hashCode", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LastMessageResponseData {

    @SerializedName("created_at")
    private final String createdAt;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(Constants.KEY_ID)
    private final Integer f122050id;

    @SerializedName("is_deleted")
    private final boolean isDeleted;

    @SerializedName("sender_username")
    private final String senderUsername;

    @SerializedName(Constants.KEY_TEXT)
    private final String text;

    @SerializedName("type")
    private final String type;

    public LastMessageResponseData(Integer r2, String r3, String r4, String r5, String r6, boolean r7) {
        p.l(r3, Constants.KEY_TEXT);
        p.l(r4, "type");
        p.l(r5, "createdAt");
        p.l(r6, "senderUsername");
        this.f122050id = r2;
        this.text = r3;
        this.type = r4;
        this.createdAt = r5;
        this.senderUsername = r6;
        this.isDeleted = r7;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof LastMessageResponseData) == true) goto L8;
        return false;
    L8:
        LastMessageResponseData r52 = (LastMessageResponseData) r5;
        if (p.g(this.f122050id, r52.f122050id) == true) goto L12;
        return false;
    L12:
        if (p.g(this.text, r52.text) == true) goto L15;
        return false;
    L15:
        if (p.g(this.type, r52.type) == true) goto L18;
        return false;
    L18:
        if (p.g(this.createdAt, r52.createdAt) == true) goto L21;
        return false;
    L21:
        if (p.g(this.senderUsername, r52.senderUsername) == true) goto L24;
        return false;
    L24:
        if (this.isDeleted == r52.isDeleted) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        Integer r02 = this.f122050id;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (((((((((r03 * 31) + this.text.hashCode()) * 31) + this.type.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.senderUsername.hashCode()) * 31) + Boolean.hashCode(this.isDeleted);
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "LastMessageResponseData(id=" + this.f122050id + ", text=" + this.text + ", type=" + this.type + ", createdAt=" + this.createdAt + ", senderUsername=" + this.senderUsername + ", isDeleted=" + this.isDeleted + ')';
    }

    public /* synthetic */ LastMessageResponseData(Integer r1, String r2, String r3, String r4, String r5, boolean r6, int r7, i r8) {
        if ((r7 & 1) == 0) goto L5;
        r1 = 0;
    L5:
        this(r1, r2, r3, r4, r5, r6);
    }
}
