package com.stockbit.model.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b@\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002]^B»\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018JÂ\u0001\u0010O\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010PJ\u0006\u0010Q\u001a\u00020\u0003J\u0014\u0010R\u001a\u00020S2\b\u0010T\u001a\u0004\u0018\u00010UHÖ\u0083\u0004J\n\u0010V\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010W\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020\u0003R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR \u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R \u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001fR \u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001d\"\u0004\b-\u0010\u001fR \u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001d\"\u0004\b/\u0010\u001fR \u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001d\"\u0004\b1\u0010\u001fR \u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001d\"\u0004\b3\u0010\u001fR \u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001d\"\u0004\b5\u0010\u001fR \u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R \u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001d\"\u0004\b;\u0010\u001fR(\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010\u001b\u0012\u0004\b<\u0010=\u001a\u0004\b>\u0010\u0018\"\u0004\b?\u0010\u001a¨\u0006_"}, d2 = {"Lcom/stockbit/model/entity/ProfileExodus;", "Landroid/os/Parcelable;", "userId", "", "username", "", "fullname", "about", "website", "avatar", "Lcom/stockbit/model/entity/ProfileExodus$Avatar;", "country", "language", "gender", FirebaseAnalytics.Param.LOCATION, "address", "birthday", "phone", "Lcom/stockbit/model/entity/ProfileExodus$Phone;", "occupation", "watchlistId", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/model/entity/ProfileExodus$Avatar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/model/entity/ProfileExodus$Phone;Ljava/lang/String;Ljava/lang/Integer;)V", "getUserId", "()Ljava/lang/Integer;", "setUserId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getUsername", "()Ljava/lang/String;", "setUsername", "(Ljava/lang/String;)V", "getFullname", "setFullname", "getAbout", "setAbout", "getWebsite", "setWebsite", "getAvatar", "()Lcom/stockbit/model/entity/ProfileExodus$Avatar;", "setAvatar", "(Lcom/stockbit/model/entity/ProfileExodus$Avatar;)V", "getCountry", "setCountry", "getLanguage", "setLanguage", "getGender", "setGender", "getLocation", "setLocation", "getAddress", "setAddress", "getBirthday", "setBirthday", "getPhone", "()Lcom/stockbit/model/entity/ProfileExodus$Phone;", "setPhone", "(Lcom/stockbit/model/entity/ProfileExodus$Phone;)V", "getOccupation", "setOccupation", "getWatchlistId$annotations", "()V", "getWatchlistId", "setWatchlistId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", Constants.COPY_TYPE, "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/model/entity/ProfileExodus$Avatar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/model/entity/ProfileExodus$Phone;Ljava/lang/String;Ljava/lang/Integer;)Lcom/stockbit/model/entity/ProfileExodus;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Avatar", "Phone", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ProfileExodus implements Parcelable {
    public static final Parcelable.Creator<ProfileExodus> CREATOR = null;

    @SerializedName("about")
    private String about;

    @SerializedName("address")
    private String address;

    @SerializedName("avatar")
    private Avatar avatar;

    @SerializedName("birthday")
    private String birthday;

    @SerializedName("country")
    private String country;

    @SerializedName("fullname")
    private String fullname;

    @SerializedName("gender")
    private String gender;

    @SerializedName("language")
    private String language;

    @SerializedName(FirebaseAnalytics.Param.LOCATION)
    private String location;

    @SerializedName("occupation")
    private String occupation;

    @SerializedName("phone")
    private Phone phone;

    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("username")
    private String username;

    @SerializedName("watchlist_id")
    private Integer watchlistId;

    @SerializedName("website")
    private String website;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006!"}, d2 = {"Lcom/stockbit/model/entity/ProfileExodus$Avatar;", "Landroid/os/Parcelable;", "default", "", "medium", "thumb", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDefault", "()Ljava/lang/String;", "setDefault", "(Ljava/lang/String;)V", "getMedium", "setMedium", "getThumb", "setThumb", "component1", "component2", "component3", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Avatar implements Parcelable {
        public static final Parcelable.Creator<Avatar> CREATOR = null;

        /* renamed from: default, reason: not valid java name */
        @SerializedName("default")
        private String f66default;

        @SerializedName("medium")
        private String medium;

        @SerializedName("thumb")
        private String thumb;

        public static final class a implements Parcelable.Creator {
            public a() {
            }

            public final Avatar a(Parcel r4) {
                p.l(r4, "parcel");
                return new Avatar(r4.readString(), r4.readString(), r4.readString());
            }

            public final Avatar[] b(int r1) {
                return new Avatar[r1];
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

        public Avatar() {
            String r1 = null;
            String r2 = null;
            String r3 = null;
            this(r1, r2, r3, 7, null);
        }

        public final String a() {
            return this.f66default;
        }

        public final String b() {
            return this.medium;
        }

        public final String c() {
            return this.thumb;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof Avatar) == true) goto L8;
            return false;
        L8:
            Avatar r52 = (Avatar) r5;
            if (p.g(this.f66default, r52.f66default) == true) goto L12;
            return false;
        L12:
            if (p.g(this.medium, r52.medium) == true) goto L15;
            return false;
        L15:
            if (p.g(this.thumb, r52.thumb) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            String r02 = this.f66default;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.medium;
            if (r2 != null) goto L9;
            int r22 = 0;
        L10:
            int r05 = (r04 + r22) * 31;
            String r23 = this.thumb;
            if (r23 == null) goto L15;
            r1 = r23.hashCode();
        L15:
            return r05 + r1;
        L9:
            r22 = r2.hashCode();
            goto L10
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "Avatar(default=" + this.f66default + ", medium=" + this.medium + ", thumb=" + this.thumb + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel r1, int r2) {
            p.l(r1, "dest");
            r1.writeString(this.f66default);
            r1.writeString(this.medium);
            r1.writeString(this.thumb);
        }

        public Avatar(String r1, String r2, String r3) {
            this.f66default = r1;
            this.medium = r2;
            this.thumb = r3;
        }

        public /* synthetic */ Avatar(String r2, String r3, String r4, int r5, i r6) {
            if ((r5 & 1) == 0) goto L6;
            r2 = null;
        L6:
            if ((r5 & 2) == 0) goto L9;
            r3 = null;
        L9:
            if ((r5 & 4) == 0) goto L11;
            r4 = null;
        L11:
            this(r2, r3, r4);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006!"}, d2 = {"Lcom/stockbit/model/entity/ProfileExodus$Phone;", "Landroid/os/Parcelable;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "nationalNumber", "formatted", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCountryCode", "()Ljava/lang/String;", "setCountryCode", "(Ljava/lang/String;)V", "getNationalNumber", "setNationalNumber", "getFormatted", "setFormatted", "component1", "component2", "component3", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Phone implements Parcelable {
        public static final Parcelable.Creator<Phone> CREATOR = null;

        @SerializedName("country_code")
        private String countryCode;

        @SerializedName("formatted")
        private String formatted;

        @SerializedName("national_number")
        private String nationalNumber;

        public static final class a implements Parcelable.Creator {
            public a() {
            }

            public final Phone a(Parcel r4) {
                p.l(r4, "parcel");
                return new Phone(r4.readString(), r4.readString(), r4.readString());
            }

            public final Phone[] b(int r1) {
                return new Phone[r1];
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

        public Phone() {
            String r1 = null;
            String r2 = null;
            String r3 = null;
            this(r1, r2, r3, 7, null);
        }

        public static /* synthetic */ Phone b(Phone r02, String r1, String r2, String r3, int r4, Object r5) {
            if ((r4 & 1) == 0) goto L6;
            r1 = r02.countryCode;
        L6:
            if ((r4 & 2) == 0) goto L9;
            r2 = r02.nationalNumber;
        L9:
            if ((r4 & 4) == 0) goto L12;
            r3 = r02.formatted;
        L12:
            return r02.a(r1, r2, r3);
        }

        public final Phone a(String r2, String r3, String r4) {
            return new Phone(r2, r3, r4);
        }

        public final String c() {
            return this.countryCode;
        }

        public final String d() {
            return this.formatted;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String e() {
            return this.nationalNumber;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof Phone) == true) goto L8;
            return false;
        L8:
            Phone r52 = (Phone) r5;
            if (p.g(this.countryCode, r52.countryCode) == true) goto L12;
            return false;
        L12:
            if (p.g(this.nationalNumber, r52.nationalNumber) == true) goto L15;
            return false;
        L15:
            if (p.g(this.formatted, r52.formatted) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public final void f(String r1) {
            this.countryCode = r1;
        }

        public final void g(String r1) {
            this.formatted = r1;
        }

        public final void h(String r1) {
            this.nationalNumber = r1;
        }

        public int hashCode() {
            String r02 = this.countryCode;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.nationalNumber;
            if (r2 != null) goto L9;
            int r22 = 0;
        L10:
            int r05 = (r04 + r22) * 31;
            String r23 = this.formatted;
            if (r23 == null) goto L15;
            r1 = r23.hashCode();
        L15:
            return r05 + r1;
        L9:
            r22 = r2.hashCode();
            goto L10
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "Phone(countryCode=" + this.countryCode + ", nationalNumber=" + this.nationalNumber + ", formatted=" + this.formatted + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel r1, int r2) {
            p.l(r1, "dest");
            r1.writeString(this.countryCode);
            r1.writeString(this.nationalNumber);
            r1.writeString(this.formatted);
        }

        public Phone(String r1, String r2, String r3) {
            this.countryCode = r1;
            this.nationalNumber = r2;
            this.formatted = r3;
        }

        public /* synthetic */ Phone(String r2, String r3, String r4, int r5, i r6) {
            if ((r5 & 1) == 0) goto L6;
            r2 = null;
        L6:
            if ((r5 & 2) == 0) goto L9;
            r3 = null;
        L9:
            if ((r5 & 4) == 0) goto L11;
            r4 = null;
        L11:
            this(r2, r3, r4);
        }
    }

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final ProfileExodus a(Parcel r19) {
            p.l(r19, "parcel");
            Integer r3 = null;
            if (r19.readInt() != 0) goto L5;
            Integer r1 = null;
        L6:
            String r4 = r19.readString();
            String r5 = r19.readString();
            String r6 = r19.readString();
            String r7 = r19.readString();
            if (r19.readInt() != 0) goto L9;
            Avatar r8 = null;
        L10:
            Avatar r82 = r8;
            String r9 = r19.readString();
            String r10 = r19.readString();
            String r11 = r19.readString();
            String r12 = r19.readString();
            String r13 = r19.readString();
            String r14 = r19.readString();
            if (r19.readInt() != 0) goto L13;
            Phone r15 = null;
        L14:
            Phone r152 = r15;
            String r16 = r19.readString();
            if (r19.readInt() == 0) goto L19;
            r3 = Integer.valueOf(r19.readInt());
        L19:
            return new ProfileExodus(r1, r4, r5, r6, r7, r82, r9, r10, r11, r12, r13, r14, r152, r16, r3);
        L13:
            r15 = Phone.CREATOR.createFromParcel(r19);
            goto L14
        L9:
            r8 = Avatar.CREATOR.createFromParcel(r19);
            goto L10
        L5:
            r1 = Integer.valueOf(r19.readInt());
            goto L6
        }

        public final ProfileExodus[] b(int r1) {
            return new ProfileExodus[r1];
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

    public ProfileExodus() {
        Integer r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        Avatar r6 = null;
        String r7 = null;
        String r8 = null;
        String r9 = null;
        String r10 = null;
        String r11 = null;
        String r12 = null;
        Phone r13 = null;
        String r14 = null;
        Integer r15 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, 32767, null);
    }

    public static /* synthetic */ ProfileExodus b(ProfileExodus r16, Integer r17, String r18, String r19, String r20, String r21, Avatar r22, String r23, String r24, String r25, String r26, String r27, String r28, Phone r29, String r30, Integer r31, int r32, Object r33) {
        if ((r32 & 1) == 0) goto L5;
        Integer r2 = r16.userId;
    L7:
        if ((r32 & 2) == 0) goto L9;
        String r3 = r16.username;
    L11:
        if ((r32 & 4) == 0) goto L13;
        String r4 = r16.fullname;
    L15:
        if ((r32 & 8) == 0) goto L17;
        String r5 = r16.about;
    L19:
        if ((r32 & 16) == 0) goto L21;
        String r6 = r16.website;
    L23:
        if ((r32 & 32) == 0) goto L25;
        Avatar r7 = r16.avatar;
    L27:
        if ((r32 & 64) == 0) goto L29;
        String r8 = r16.country;
    L31:
        if ((r32 & 128) == 0) goto L33;
        String r9 = r16.language;
    L35:
        if ((r32 & 256) == 0) goto L37;
        String r10 = r16.gender;
    L39:
        if ((r32 & 512) == 0) goto L41;
        String r11 = r16.location;
    L43:
        if ((r32 & 1024) == 0) goto L45;
        String r12 = r16.address;
    L47:
        if ((r32 & 2048) == 0) goto L49;
        String r13 = r16.birthday;
    L51:
        if ((r32 & 4096) == 0) goto L53;
        Phone r14 = r16.phone;
    L55:
        if ((r32 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        String r15 = r16.occupation;
    L59:
        if ((r32 & 16384) == 0) goto L62;
        Integer r322 = r16.watchlistId;
    L64:
        return r16.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r322);
    L62:
        r322 = r31;
        goto L64
    L57:
        r15 = r30;
        goto L59
    L53:
        r14 = r29;
        goto L55
    L49:
        r13 = r28;
        goto L51
    L45:
        r12 = r27;
        goto L47
    L41:
        r11 = r26;
        goto L43
    L37:
        r10 = r25;
        goto L39
    L33:
        r9 = r24;
        goto L35
    L29:
        r8 = r23;
        goto L31
    L25:
        r7 = r22;
        goto L27
    L21:
        r6 = r21;
        goto L23
    L17:
        r5 = r20;
        goto L19
    L13:
        r4 = r19;
        goto L15
    L9:
        r3 = r18;
        goto L11
    L5:
        r2 = r17;
        goto L7
    }

    public final ProfileExodus a(Integer r17, String r18, String r19, String r20, String r21, Avatar r22, String r23, String r24, String r25, String r26, String r27, String r28, Phone r29, String r30, Integer r31) {
        return new ProfileExodus(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31);
    }

    public final String c() {
        return this.about;
    }

    public final String d() {
        return this.address;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Avatar e() {
        return this.avatar;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ProfileExodus) == true) goto L8;
        return false;
    L8:
        ProfileExodus r52 = (ProfileExodus) r5;
        if (p.g(this.userId, r52.userId) == true) goto L12;
        return false;
    L12:
        if (p.g(this.username, r52.username) == true) goto L15;
        return false;
    L15:
        if (p.g(this.fullname, r52.fullname) == true) goto L18;
        return false;
    L18:
        if (p.g(this.about, r52.about) == true) goto L21;
        return false;
    L21:
        if (p.g(this.website, r52.website) == true) goto L24;
        return false;
    L24:
        if (p.g(this.avatar, r52.avatar) == true) goto L27;
        return false;
    L27:
        if (p.g(this.country, r52.country) == true) goto L30;
        return false;
    L30:
        if (p.g(this.language, r52.language) == true) goto L33;
        return false;
    L33:
        if (p.g(this.gender, r52.gender) == true) goto L36;
        return false;
    L36:
        if (p.g(this.location, r52.location) == true) goto L39;
        return false;
    L39:
        if (p.g(this.address, r52.address) == true) goto L42;
        return false;
    L42:
        if (p.g(this.birthday, r52.birthday) == true) goto L45;
        return false;
    L45:
        if (p.g(this.phone, r52.phone) == true) goto L48;
        return false;
    L48:
        if (p.g(this.occupation, r52.occupation) == true) goto L51;
        return false;
    L51:
        if (p.g(this.watchlistId, r52.watchlistId) == true) goto L53;
        return false;
    L53:
        return true;
    }

    public final String f() {
        return this.birthday;
    }

    public final String g() {
        return this.country;
    }

    public final String getUsername() {
        return this.username;
    }

    public final String h() {
        return this.fullname;
    }

    public int hashCode() {
        Integer r02 = this.userId;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.username;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.fullname;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.about;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.website;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        Avatar r29 = this.avatar;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.country;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.language;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.gender;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.location;
        if (r217 != null) goto L41;
        int r218 = 0;
    L42:
        int r013 = (r012 + r218) * 31;
        String r219 = this.address;
        if (r219 != null) goto L45;
        int r220 = 0;
    L46:
        int r014 = (r013 + r220) * 31;
        String r221 = this.birthday;
        if (r221 != null) goto L49;
        int r222 = 0;
    L50:
        int r015 = (r014 + r222) * 31;
        Phone r223 = this.phone;
        if (r223 != null) goto L53;
        int r224 = 0;
    L54:
        int r016 = (r015 + r224) * 31;
        String r225 = this.occupation;
        if (r225 != null) goto L57;
        int r226 = 0;
    L58:
        int r017 = (r016 + r226) * 31;
        Integer r227 = this.watchlistId;
        if (r227 == null) goto L63;
        r1 = r227.hashCode();
    L63:
        return r017 + r1;
    L57:
        r226 = r225.hashCode();
        goto L58
    L53:
        r224 = r223.hashCode();
        goto L54
    L49:
        r222 = r221.hashCode();
        goto L50
    L45:
        r220 = r219.hashCode();
        goto L46
    L41:
        r218 = r217.hashCode();
        goto L42
    L37:
        r216 = r215.hashCode();
        goto L38
    L33:
        r214 = r213.hashCode();
        goto L34
    L29:
        r212 = r211.hashCode();
        goto L30
    L25:
        r210 = r29.hashCode();
        goto L26
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

    public final String i() {
        return this.gender;
    }

    public final String j() {
        return this.language;
    }

    public final String k() {
        return this.location;
    }

    public final String l() {
        return this.occupation;
    }

    public final Phone m() {
        return this.phone;
    }

    public final Integer n() {
        return this.userId;
    }

    public final Integer o() {
        return this.watchlistId;
    }

    public final String p() {
        return this.website;
    }

    public final void q(Avatar r1) {
        this.avatar = r1;
    }

    public final void r(String r1) {
        this.gender = r1;
    }

    public String toString() {
        return "ProfileExodus(userId=" + this.userId + ", username=" + this.username + ", fullname=" + this.fullname + ", about=" + this.about + ", website=" + this.website + ", avatar=" + this.avatar + ", country=" + this.country + ", language=" + this.language + ", gender=" + this.gender + ", location=" + this.location + ", address=" + this.address + ", birthday=" + this.birthday + ", phone=" + this.phone + ", occupation=" + this.occupation + ", watchlistId=" + this.watchlistId + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        p.l(r4, "dest");
        Integer r02 = this.userId;
        if (r02 != null) goto L5;
        r4.writeInt(0);
    L6:
        r4.writeString(this.username);
        r4.writeString(this.fullname);
        r4.writeString(this.about);
        r4.writeString(this.website);
        Avatar r03 = this.avatar;
        if (r03 != null) goto L9;
        r4.writeInt(0);
    L10:
        r4.writeString(this.country);
        r4.writeString(this.language);
        r4.writeString(this.gender);
        r4.writeString(this.location);
        r4.writeString(this.address);
        r4.writeString(this.birthday);
        Phone r04 = this.phone;
        if (r04 != null) goto L13;
        r4.writeInt(0);
    L14:
        r4.writeString(this.occupation);
        Integer r52 = this.watchlistId;
        if (r52 != null) goto L18;
        r4.writeInt(0);
        return;
    L18:
        r4.writeInt(1);
        r4.writeInt(r52.intValue());
        return;
    L13:
        r4.writeInt(1);
        r04.writeToParcel(r4, r5);
        goto L14
    L9:
        r4.writeInt(1);
        r03.writeToParcel(r4, r5);
        goto L10
    L5:
        r4.writeInt(1);
        r4.writeInt(r02.intValue());
        goto L6
    }

    public ProfileExodus(Integer r1, String r2, String r3, String r4, String r5, Avatar r6, String r7, String r8, String r9, String r10, String r11, String r12, Phone r13, String r14, Integer r15) {
        this.userId = r1;
        this.username = r2;
        this.fullname = r3;
        this.about = r4;
        this.website = r5;
        this.avatar = r6;
        this.country = r7;
        this.language = r8;
        this.gender = r9;
        this.location = r10;
        this.address = r11;
        this.birthday = r12;
        this.phone = r13;
        this.occupation = r14;
        this.watchlistId = r15;
    }

    public /* synthetic */ ProfileExodus(Integer r17, String r18, String r19, String r20, String r21, Avatar r22, String r23, String r24, String r25, String r26, String r27, String r28, Phone r29, String r30, Integer r31, int r32, i r33) {
        String r2 = null;
        if ((r32 & 1) == 0) goto L5;
        Integer r1 = null;
    L7:
        if ((r32 & 2) == 0) goto L9;
        String r3 = null;
    L11:
        if ((r32 & 4) == 0) goto L13;
        String r4 = null;
    L15:
        if ((r32 & 8) == 0) goto L17;
        String r5 = null;
    L19:
        if ((r32 & 16) == 0) goto L21;
        String r6 = null;
    L23:
        if ((r32 & 32) == 0) goto L25;
        Avatar r7 = null;
    L27:
        if ((r32 & 64) == 0) goto L29;
        String r8 = null;
    L31:
        if ((r32 & 128) == 0) goto L33;
        String r9 = null;
    L35:
        if ((r32 & 256) == 0) goto L37;
        String r10 = null;
    L39:
        if ((r32 & 512) == 0) goto L41;
        String r11 = null;
    L43:
        if ((r32 & 1024) == 0) goto L45;
        String r12 = null;
    L47:
        if ((r32 & 2048) == 0) goto L49;
        String r13 = null;
    L51:
        if ((r32 & 4096) == 0) goto L53;
        Phone r14 = null;
    L55:
        if ((r32 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) goto L59;
        r2 = r30;
    L59:
        if ((r32 & 16384) == 0) goto L62;
        Integer r322 = 0;
    L63:
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r2, r322);
        return;
    L62:
        r322 = r31;
        goto L63
    L53:
        r14 = r29;
        goto L55
    L49:
        r13 = r28;
        goto L51
    L45:
        r12 = r27;
        goto L47
    L41:
        r11 = r26;
        goto L43
    L37:
        r10 = r25;
        goto L39
    L33:
        r9 = r24;
        goto L35
    L29:
        r8 = r23;
        goto L31
    L25:
        r7 = r22;
        goto L27
    L21:
        r6 = r21;
        goto L23
    L17:
        r5 = r20;
        goto L19
    L13:
        r4 = r19;
        goto L15
    L9:
        r3 = r18;
        goto L11
    L5:
        r1 = r17;
        goto L7
    }
}
