package com.stockbit.dto.chat.room;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0015JV\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0014\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010!\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\"\u001a\u00020\u0005HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\t\u0010\u0015¨\u0006#"}, d2 = {"Lcom/stockbit/dto/chat/room/RoomLastMessageDTO;", "", Constants.KEY_ID, "", Constants.KEY_TEXT, "", "type", "createdAt", "senderUsername", "isDeleted", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getText", "()Ljava/lang/String;", "getType", "getCreatedAt", "getSenderUsername", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/stockbit/dto/chat/room/RoomLastMessageDTO;", "equals", "other", "hashCode", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RoomLastMessageDTO {

    @SerializedName("created_at")
    private final String createdAt;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(Constants.KEY_ID)
    private final Integer f88620id;

    @SerializedName("is_deleted")
    private final Boolean isDeleted;

    @SerializedName("sender_username")
    private final String senderUsername;

    @SerializedName(Constants.KEY_TEXT)
    private final String text;

    @SerializedName("type")
    private final String type;

    public RoomLastMessageDTO() {
        Integer r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        Boolean r6 = null;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    public final String a() {
        return this.createdAt;
    }

    public final Integer b() {
        return this.f88620id;
    }

    public final String c() {
        return this.senderUsername;
    }

    public final String d() {
        return this.text;
    }

    public final String e() {
        return this.type;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof RoomLastMessageDTO) == true) goto L8;
        return false;
    L8:
        RoomLastMessageDTO r52 = (RoomLastMessageDTO) r5;
        if (p.g(this.f88620id, r52.f88620id) == true) goto L12;
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
        if (p.g(this.isDeleted, r52.isDeleted) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final Boolean f() {
        return this.isDeleted;
    }

    public int hashCode() {
        Integer r02 = this.f88620id;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.text;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.type;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.createdAt;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.senderUsername;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        Boolean r29 = this.isDeleted;
        if (r29 == null) goto L27;
        r1 = r29.hashCode();
    L27:
        return r08 + r1;
    L21:
        r28 = r27.hashCode();
        goto L22
    L17:
        r26 = r25.hashCode();
        goto L18
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "RoomLastMessageDTO(id=" + this.f88620id + ", text=" + this.text + ", type=" + this.type + ", createdAt=" + this.createdAt + ", senderUsername=" + this.senderUsername + ", isDeleted=" + this.isDeleted + ")";
    }

    public RoomLastMessageDTO(Integer r1, String r2, String r3, String r4, String r5, Boolean r6) {
        this.f88620id = r1;
        this.text = r2;
        this.type = r3;
        this.createdAt = r4;
        this.senderUsername = r5;
        this.isDeleted = r6;
    }

    public /* synthetic */ RoomLastMessageDTO(Integer r2, String r3, String r4, String r5, String r6, Boolean r7, int r8, i r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r8 & 32) == 0) goto L21;
        Boolean r82 = null;
    L20:
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        this(r2, r3, r52, r62, r72, r82);
        return;
    L21:
        r82 = r7;
        goto L20
    }
}
