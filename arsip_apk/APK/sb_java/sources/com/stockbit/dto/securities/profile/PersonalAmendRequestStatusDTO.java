package com.stockbit.dto.securities.profile;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003JV\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0014\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0005HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0002\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0011\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006!"}, d2 = {"Lcom/stockbit/dto/securities/profile/PersonalAmendRequestStatusDTO;", "", "isOngoingAmend", "", Constants.KEY_TITLE, "", "kycNotes", "forceAmend", "userMessage", "personalAmendId", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTitle", "()Ljava/lang/String;", "getKycNotes", "getForceAmend", "getUserMessage", "getPersonalAmendId", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/stockbit/dto/securities/profile/PersonalAmendRequestStatusDTO;", "equals", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PersonalAmendRequestStatusDTO {

    @SerializedName("force_amend")
    private final Boolean forceAmend;

    @SerializedName("is_ongoing_amend")
    private final Boolean isOngoingAmend;

    @SerializedName("kyc_notes")
    private final String kycNotes;

    @SerializedName("personal_amend_id")
    private final String personalAmendId;

    @SerializedName(Constants.KEY_TITLE)
    private final String title;

    @SerializedName("user_message")
    private final String userMessage;

    public PersonalAmendRequestStatusDTO() {
        Boolean r1 = null;
        String r2 = null;
        String r3 = null;
        Boolean r4 = null;
        String r5 = null;
        String r6 = null;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    public final Boolean a() {
        return this.forceAmend;
    }

    public final String b() {
        return this.kycNotes;
    }

    public final String c() {
        return this.personalAmendId;
    }

    public final String d() {
        return this.title;
    }

    public final String e() {
        return this.userMessage;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof PersonalAmendRequestStatusDTO) == true) goto L8;
        return false;
    L8:
        PersonalAmendRequestStatusDTO r52 = (PersonalAmendRequestStatusDTO) r5;
        if (p.g(this.isOngoingAmend, r52.isOngoingAmend) == true) goto L12;
        return false;
    L12:
        if (p.g(this.title, r52.title) == true) goto L15;
        return false;
    L15:
        if (p.g(this.kycNotes, r52.kycNotes) == true) goto L18;
        return false;
    L18:
        if (p.g(this.forceAmend, r52.forceAmend) == true) goto L21;
        return false;
    L21:
        if (p.g(this.userMessage, r52.userMessage) == true) goto L24;
        return false;
    L24:
        if (p.g(this.personalAmendId, r52.personalAmendId) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final Boolean f() {
        return this.isOngoingAmend;
    }

    public int hashCode() {
        Boolean r02 = this.isOngoingAmend;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.title;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.kycNotes;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Boolean r25 = this.forceAmend;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.userMessage;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.personalAmendId;
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
        return "PersonalAmendRequestStatusDTO(isOngoingAmend=" + this.isOngoingAmend + ", title=" + this.title + ", kycNotes=" + this.kycNotes + ", forceAmend=" + this.forceAmend + ", userMessage=" + this.userMessage + ", personalAmendId=" + this.personalAmendId + ")";
    }

    public PersonalAmendRequestStatusDTO(Boolean r1, String r2, String r3, Boolean r4, String r5, String r6) {
        this.isOngoingAmend = r1;
        this.title = r2;
        this.kycNotes = r3;
        this.forceAmend = r4;
        this.userMessage = r5;
        this.personalAmendId = r6;
    }

    public /* synthetic */ PersonalAmendRequestStatusDTO(Boolean r2, String r3, String r4, Boolean r5, String r6, String r7, int r8, i r9) {
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
        String r82 = null;
    L20:
        String r72 = r6;
        Boolean r62 = r5;
        String r52 = r4;
        this(r2, r3, r52, r62, r72, r82);
        return;
    L21:
        r82 = r7;
        goto L20
    }
}
