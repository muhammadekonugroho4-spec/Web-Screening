package com.stockbit.model.entity;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000eJJ\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\bHÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0002\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0004\u0010\u000bR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0005\u0010\u000bR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0006\u0010\u000bR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/stockbit/model/entity/PersonalResponseData;", "", "isAdmin", "", "isBlocked", "isDeactivated", "isVerified", "userId", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUserId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/stockbit/model/entity/PersonalResponseData;", "equals", "other", "hashCode", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PersonalResponseData {

    @SerializedName("is_admin")
    private final Boolean isAdmin;

    @SerializedName("is_blocked")
    private final Boolean isBlocked;

    @SerializedName("is_deactivated")
    private final Boolean isDeactivated;

    @SerializedName("is_verified")
    private final Boolean isVerified;

    @SerializedName("user_id")
    private final Integer userId;

    public PersonalResponseData() {
        Boolean r1 = null;
        Boolean r2 = null;
        Boolean r3 = null;
        Boolean r4 = null;
        Integer r5 = null;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    public final Integer a() {
        return this.userId;
    }

    public final Boolean b() {
        return this.isAdmin;
    }

    public final Boolean c() {
        return this.isBlocked;
    }

    public final Boolean d() {
        return this.isDeactivated;
    }

    public final Boolean e() {
        return this.isVerified;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof PersonalResponseData) == true) goto L8;
        return false;
    L8:
        PersonalResponseData r52 = (PersonalResponseData) r5;
        if (p.g(this.isAdmin, r52.isAdmin) == true) goto L12;
        return false;
    L12:
        if (p.g(this.isBlocked, r52.isBlocked) == true) goto L15;
        return false;
    L15:
        if (p.g(this.isDeactivated, r52.isDeactivated) == true) goto L18;
        return false;
    L18:
        if (p.g(this.isVerified, r52.isVerified) == true) goto L21;
        return false;
    L21:
        if (p.g(this.userId, r52.userId) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        Boolean r02 = this.isAdmin;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Boolean r2 = this.isBlocked;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Boolean r23 = this.isDeactivated;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Boolean r25 = this.isVerified;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        Integer r27 = this.userId;
        if (r27 == null) goto L23;
        r1 = r27.hashCode();
    L23:
        return r07 + r1;
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
        return "PersonalResponseData(isAdmin=" + this.isAdmin + ", isBlocked=" + this.isBlocked + ", isDeactivated=" + this.isDeactivated + ", isVerified=" + this.isVerified + ", userId=" + this.userId + ')';
    }

    public PersonalResponseData(Boolean r1, Boolean r2, Boolean r3, Boolean r4, Integer r5) {
        this.isAdmin = r1;
        this.isBlocked = r2;
        this.isDeactivated = r3;
        this.isVerified = r4;
        this.userId = r5;
    }

    public /* synthetic */ PersonalResponseData(Boolean r1, Boolean r2, Boolean r3, Boolean r4, Integer r5, int r6, i r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = Boolean.FALSE;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = Boolean.FALSE;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = Boolean.FALSE;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = Boolean.FALSE;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = 0;
    L17:
        Boolean r62 = r4;
        Integer r72 = r5;
        Boolean r52 = r3;
        Boolean r32 = r1;
        this(r32, r2, r52, r62, r72);
    }
}
