package com.stockbit.model.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0003J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0003R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006%"}, d2 = {"Lcom/stockbit/model/entity/Additional;", "Landroid/os/Parcelable;", "reputations", "", "followers", "ideas", "following", "<init>", "(IIII)V", "getReputations", "()I", "setReputations", "(I)V", "getFollowers", "setFollowers", "getIdeas", "setIdeas", "getFollowing", "setFollowing", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Additional implements Parcelable {
    public static final Parcelable.Creator<Additional> CREATOR = null;

    @SerializedName("followers")
    private int followers;

    @SerializedName("following")
    private int following;

    @SerializedName("ideas")
    private int ideas;

    @SerializedName("reputations")
    private int reputations;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final Additional a(Parcel r5) {
            p.l(r5, "parcel");
            return new Additional(r5.readInt(), r5.readInt(), r5.readInt(), r5.readInt());
        }

        public final Additional[] b(int r1) {
            return new Additional[r1];
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

    public Additional() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        this(r1, r2, r3, r4, 15, null);
    }

    public final int a() {
        return this.followers;
    }

    public final int b() {
        return this.following;
    }

    public final int c() {
        return this.ideas;
    }

    public final int d() {
        return this.reputations;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(int r1) {
        this.followers = r1;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Additional) == true) goto L8;
        return false;
    L8:
        Additional r52 = (Additional) r5;
        if (this.reputations == r52.reputations) goto L12;
        return false;
    L12:
        if (this.followers == r52.followers) goto L15;
        return false;
    L15:
        if (this.ideas == r52.ideas) goto L18;
        return false;
    L18:
        if (this.following == r52.following) goto L20;
        return false;
    L20:
        return true;
    }

    public final void f(int r1) {
        this.following = r1;
    }

    public final void g(int r1) {
        this.ideas = r1;
    }

    public final void h(int r1) {
        this.reputations = r1;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.reputations) * 31) + Integer.hashCode(this.followers)) * 31) + Integer.hashCode(this.ideas)) * 31) + Integer.hashCode(this.following);
    }

    public String toString() {
        return "Additional(reputations=" + this.reputations + ", followers=" + this.followers + ", ideas=" + this.ideas + ", following=" + this.following + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeInt(this.reputations);
        r1.writeInt(this.followers);
        r1.writeInt(this.ideas);
        r1.writeInt(this.following);
    }

    public Additional(int r1, int r2, int r3, int r4) {
        this.reputations = r1;
        this.followers = r2;
        this.ideas = r3;
        this.following = r4;
    }

    public /* synthetic */ Additional(int r2, int r3, int r4, int r5, int r6, i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = 0;
    L14:
        this(r2, r3, r4, r5);
    }
}
