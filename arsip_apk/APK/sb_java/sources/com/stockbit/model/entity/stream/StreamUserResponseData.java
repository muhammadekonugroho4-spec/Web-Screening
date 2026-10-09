package com.stockbit.model.entity.stream;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003Jm\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\"\u001a\u00020\u0003J\u0014\u0010#\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0083\u0004J\n\u0010&\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010'\u001a\u00020\u0007HÖ\u0081\u0004J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0003R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0012R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014¨\u0006-"}, d2 = {"Lcom/stockbit/model/entity/stream/StreamUserResponseData;", "Landroid/os/Parcelable;", "userId", "", "isAuthor", "", "username", "", "avatar", "isVerified", "isPrivilege", "isPro", "country", "verifiedStatus", "<init>", "(IZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getUserId", "()I", "()Z", "getUsername", "()Ljava/lang/String;", "getAvatar", "getCountry", "getVerifiedStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", Constants.COPY_TYPE, "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class StreamUserResponseData implements Parcelable {
    public static final Parcelable.Creator<StreamUserResponseData> CREATOR = null;

    @SerializedName("avatar")
    private final String avatar;

    @SerializedName("country")
    private final String country;

    @SerializedName("is_author")
    private final boolean isAuthor;

    @SerializedName("user_privilege")
    private final String isPrivilege;

    @SerializedName("is_pro")
    private final boolean isPro;

    @SerializedName("is_verified")
    private final boolean isVerified;

    @SerializedName("user_id")
    private final int userId;

    @SerializedName("username")
    private final String username;

    @SerializedName("verified_status")
    private final String verifiedStatus;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final StreamUserResponseData a(Parcel r12) {
            p.l(r12, "parcel");
            int r2 = r12.readInt();
            boolean r3 = false;
            if (r12.readInt() == 0) goto L5;
            boolean r02 = false;
            r3 = true;
            boolean r5 = true;
        L6:
            String r4 = r12.readString();
            boolean r6 = r5;
            String r52 = r12.readString();
            if (r12.readInt() == 0) goto L9;
            boolean r7 = r6;
        L10:
            String r8 = r12.readString();
            if (r12.readInt() == 0) goto L14;
            r02 = r7;
        L14:
            return new StreamUserResponseData(r2, r3, r4, r52, r6, r8, r02, r12.readString(), r12.readString());
        L9:
            r7 = r6;
            r6 = r02;
            goto L10
        L5:
            r02 = false;
            r5 = true;
            goto L6
        }

        public final StreamUserResponseData[] b(int r1) {
            return new StreamUserResponseData[r1];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object createFromParcel(Parcel r1) {
            return a(r1);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object[] newArray(int r1) {
            return b(r1);
        }
    }

    static {
        CREATOR = new a();
    }

    public StreamUserResponseData() {
        int r1 = 0;
        boolean r2 = false;
        String r3 = null;
        String r4 = null;
        boolean r5 = false;
        String r6 = null;
        boolean r7 = false;
        String r8 = null;
        String r9 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, 511, null);
    }

    public final String a() {
        return this.avatar;
    }

    public final int b() {
        return this.userId;
    }

    public final String c() {
        return this.verifiedStatus;
    }

    public final boolean d() {
        return this.isAuthor;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.isPrivilege;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof StreamUserResponseData) == true) goto L8;
        return false;
    L8:
        StreamUserResponseData r52 = (StreamUserResponseData) r5;
        if (this.userId == r52.userId) goto L12;
        return false;
    L12:
        if (this.isAuthor == r52.isAuthor) goto L15;
        return false;
    L15:
        if (p.g(this.username, r52.username) == true) goto L18;
        return false;
    L18:
        if (p.g(this.avatar, r52.avatar) == true) goto L21;
        return false;
    L21:
        if (this.isVerified == r52.isVerified) goto L24;
        return false;
    L24:
        if (p.g(this.isPrivilege, r52.isPrivilege) == true) goto L27;
        return false;
    L27:
        if (this.isPro == r52.isPro) goto L30;
        return false;
    L30:
        if (p.g(this.country, r52.country) == true) goto L33;
        return false;
    L33:
        if (p.g(this.verifiedStatus, r52.verifiedStatus) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final boolean f() {
        return this.isPro;
    }

    public final boolean g() {
        return this.isVerified;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int r02 = ((Integer.hashCode(this.userId) * 31) + Boolean.hashCode(this.isAuthor)) * 31;
        String r1 = this.username;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.avatar;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (((r03 + r14) * 31) + Boolean.hashCode(this.isVerified)) * 31;
        String r15 = this.isPrivilege;
        if (r15 != null) goto L13;
        int r16 = 0;
    L14:
        int r05 = (((r04 + r16) * 31) + Boolean.hashCode(this.isPro)) * 31;
        String r17 = this.country;
        if (r17 != null) goto L17;
        int r18 = 0;
    L18:
        int r06 = (r05 + r18) * 31;
        String r19 = this.verifiedStatus;
        if (r19 == null) goto L23;
        r2 = r19.hashCode();
    L23:
        return r06 + r2;
    L17:
        r18 = r17.hashCode();
        goto L18
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
        return "StreamUserResponseData(userId=" + this.userId + ", isAuthor=" + this.isAuthor + ", username=" + this.username + ", avatar=" + this.avatar + ", isVerified=" + this.isVerified + ", isPrivilege=" + this.isPrivilege + ", isPro=" + this.isPro + ", country=" + this.country + ", verifiedStatus=" + this.verifiedStatus + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeInt(this.userId);
        r1.writeInt(this.isAuthor ? 1 : 0);
        r1.writeString(this.username);
        r1.writeString(this.avatar);
        r1.writeInt(this.isVerified ? 1 : 0);
        r1.writeString(this.isPrivilege);
        r1.writeInt(this.isPro ? 1 : 0);
        r1.writeString(this.country);
        r1.writeString(this.verifiedStatus);
    }

    public StreamUserResponseData(int r1, boolean r2, String r3, String r4, boolean r5, String r6, boolean r7, String r8, String r9) {
        this.userId = r1;
        this.isAuthor = r2;
        this.username = r3;
        this.avatar = r4;
        this.isVerified = r5;
        this.isPrivilege = r6;
        this.isPro = r7;
        this.country = r8;
        this.verifiedStatus = r9;
    }

    public /* synthetic */ StreamUserResponseData(int r3, boolean r4, String r5, String r6, boolean r7, String r8, boolean r9, String r10, String r11, int r12, i r13) {
        if ((r12 & 1) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r4 = false;
    L9:
        if ((r12 & 4) == 0) goto L12;
        r5 = null;
    L12:
        if ((r12 & 8) == 0) goto L15;
        r6 = null;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r7 = false;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r8 = null;
    L21:
        if ((r12 & 64) == 0) goto L24;
        r9 = false;
    L24:
        if ((r12 & 128) == 0) goto L27;
        r10 = null;
    L27:
        if ((r12 & 256) == 0) goto L30;
        String r122 = null;
    L29:
        String r112 = r10;
        boolean r102 = r9;
        String r92 = r8;
        boolean r82 = r7;
        String r72 = r6;
        String r62 = r5;
        this(r3, r4, r62, r72, r82, r92, r102, r112, r122);
        return;
    L30:
        r122 = r11;
        goto L29
    }
}
