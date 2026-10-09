package com.stockbit.model.entity.stream;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0003J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0003R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006!"}, d2 = {"Lcom/stockbit/model/entity/stream/UsersResponseData;", "Landroid/os/Parcelable;", Constants.KEY_ID, "", "username", "", "country", "avatar", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getUsername", "()Ljava/lang/String;", "getCountry", "getAvatar", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class UsersResponseData implements Parcelable {
    public static final Parcelable.Creator<UsersResponseData> CREATOR = null;

    @SerializedName("avatar")
    private final String avatar;

    @SerializedName("country")
    private final String country;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(Constants.KEY_ID)
    private final int f122108id;

    @SerializedName("username")
    private final String username;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final UsersResponseData a(Parcel r5) {
            p.l(r5, "parcel");
            return new UsersResponseData(r5.readInt(), r5.readString(), r5.readString(), r5.readString());
        }

        public final UsersResponseData[] b(int r1) {
            return new UsersResponseData[r1];
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

    public UsersResponseData(int r2, String r3, String r4, String r5) {
        p.l(r3, "username");
        this.f122108id = r2;
        this.username = r3;
        this.country = r4;
        this.avatar = r5;
    }

    public final String a() {
        return this.avatar;
    }

    public final int b() {
        return this.f122108id;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof UsersResponseData) == true) goto L8;
        return false;
    L8:
        UsersResponseData r52 = (UsersResponseData) r5;
        if (this.f122108id == r52.f122108id) goto L12;
        return false;
    L12:
        if (p.g(this.username, r52.username) == true) goto L15;
        return false;
    L15:
        if (p.g(this.country, r52.country) == true) goto L18;
        return false;
    L18:
        if (p.g(this.avatar, r52.avatar) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int r02 = ((Integer.hashCode(this.f122108id) * 31) + this.username.hashCode()) * 31;
        String r1 = this.country;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.avatar;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "UsersResponseData(id=" + this.f122108id + ", username=" + this.username + ", country=" + this.country + ", avatar=" + this.avatar + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeInt(this.f122108id);
        r1.writeString(this.username);
        r1.writeString(this.country);
        r1.writeString(this.avatar);
    }

    public /* synthetic */ UsersResponseData(int r2, String r3, String r4, String r5, int r6, i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r6 & 4) == 0) goto L9;
        r4 = null;
    L9:
        if ((r6 & 8) == 0) goto L11;
        r5 = null;
    L11:
        this(r2, r3, r4, r5);
    }
}
