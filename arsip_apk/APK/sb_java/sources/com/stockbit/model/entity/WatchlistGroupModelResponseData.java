package com.stockbit.model.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.perf.util.Constants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B_\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000fJ\u0006\u0010$\u001a\u00020\u0007J\u000e\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0007J\b\u0010(\u001a\u00020\u0007H\u0016J\u0018\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0007H\u0016R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u001c\"\u0004\b\u001f\u0010\u001eR \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013R\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010\u001b¨\u0006-"}, d2 = {"Lcom/stockbit/model/entity/WatchlistGroupModelResponseData;", "Landroid/os/Parcelable;", "watchlistid", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "description", "followed", "", "isDefault", "", "isFavorite", "categoryType", "LOADING_FOLLOWING_STATE", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZZLjava/lang/String;I)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getWatchlistid", "()Ljava/lang/String;", "setWatchlistid", "(Ljava/lang/String;)V", "getName", "setName", "getDescription", "setDescription", "getFollowed", "()I", "setFollowed", "(I)V", "()Z", "setDefault", "(Z)V", "setFavorite", "getCategoryType", "setCategoryType", "getLOADING_FOLLOWING_STATE", "setLOADING_FOLLOWING_STATE", "getLoadingFollowingState", "setLoadingFollowingState", "", "loadingFollowingState", "describeContents", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public class WatchlistGroupModelResponseData implements Parcelable {
    public static final Parcelable.Creator<WatchlistGroupModelResponseData> CREATOR = null;
    private int LOADING_FOLLOWING_STATE;

    @SerializedName("category_type")
    @Expose
    private String categoryType;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("followed")
    @Expose
    private int followed;

    @SerializedName("is_default")
    @Expose
    private boolean isDefault;

    @SerializedName("is_favorite")
    @Expose
    private boolean isFavorite;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @Expose
    private String name;

    @SerializedName(alternate = {"watchlist_id"}, value = "watchlistid")
    @Expose
    private String watchlistid;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final WatchlistGroupModelResponseData a(Parcel r11) {
            p.l(r11, "parcel");
            String r2 = r11.readString();
            String r3 = r11.readString();
            String r4 = r11.readString();
            int r5 = r11.readInt();
            boolean r6 = false;
            boolean r7 = true;
            if (r11.readInt() == 0) goto L5;
            boolean r02 = false;
            r6 = true;
        L7:
            if (r11.readInt() != 0) goto L11;
            r7 = r02;
        L11:
            return new WatchlistGroupModelResponseData(r2, r3, r4, r5, r6, r7, r11.readString(), r11.readInt());
        L5:
            r02 = false;
            goto L7
        }

        public final WatchlistGroupModelResponseData[] b(int r1) {
            return new WatchlistGroupModelResponseData[r1];
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

    public WatchlistGroupModelResponseData() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        int r4 = 0;
        boolean r5 = false;
        boolean r6 = false;
        String r7 = null;
        int r8 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, r8, Constants.MAX_HOST_LENGTH, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getCategoryType() {
        return this.categoryType;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getFollowed() {
        return this.followed;
    }

    public final int getLOADING_FOLLOWING_STATE() {
        return this.LOADING_FOLLOWING_STATE;
    }

    public final int getLoadingFollowingState() {
        return this.LOADING_FOLLOWING_STATE;
    }

    public final String getName() {
        return this.name;
    }

    public final String getWatchlistid() {
        return this.watchlistid;
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }

    public final void setCategoryType(String r1) {
        this.categoryType = r1;
    }

    public final void setDefault(boolean r1) {
        this.isDefault = r1;
    }

    public final void setDescription(String r1) {
        this.description = r1;
    }

    public final void setFavorite(boolean r1) {
        this.isFavorite = r1;
    }

    public final void setFollowed(int r1) {
        this.followed = r1;
    }

    public final void setLOADING_FOLLOWING_STATE(int r1) {
        this.LOADING_FOLLOWING_STATE = r1;
    }

    public final void setLoadingFollowingState(int r1) {
        this.LOADING_FOLLOWING_STATE = r1;
    }

    public final void setName(String r1) {
        this.name = r1;
    }

    public final void setWatchlistid(String r1) {
        this.watchlistid = r1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.watchlistid);
        r1.writeString(this.name);
        r1.writeString(this.description);
        r1.writeInt(this.followed);
        r1.writeInt(this.isDefault ? 1 : 0);
        r1.writeInt(this.isFavorite ? 1 : 0);
        r1.writeString(this.categoryType);
        r1.writeInt(this.LOADING_FOLLOWING_STATE);
    }

    public WatchlistGroupModelResponseData(String r1, String r2, String r3, int r4, boolean r5, boolean r6, String r7, int r8) {
        this.watchlistid = r1;
        this.name = r2;
        this.description = r3;
        this.followed = r4;
        this.isDefault = r5;
        this.isFavorite = r6;
        this.categoryType = r7;
        this.LOADING_FOLLOWING_STATE = r8;
    }

    public /* synthetic */ WatchlistGroupModelResponseData(String r3, String r4, String r5, int r6, boolean r7, boolean r8, String r9, int r10, int r11, i r12) {
        if ((r11 & 1) == 0) goto L6;
        r3 = null;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r4 = null;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r5 = null;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r6 = 0;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r7 = false;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r8 = false;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r9 = null;
    L24:
        if ((r11 & 128) == 0) goto L26;
        r10 = -1;
    L26:
        int r112 = r10;
        String r102 = r9;
        boolean r92 = r8;
        boolean r82 = r7;
        int r72 = r6;
        String r62 = r5;
        this(r3, r4, r62, r72, r82, r92, r102, r112);
    }

    public WatchlistGroupModelResponseData(String r13, String r14) {
        p.l(r13, "watchlistid");
        p.l(r14, AppMeasurementSdk.ConditionalUserProperty.NAME);
        String r2 = null;
        String r3 = null;
        String r4 = null;
        int r5 = 0;
        boolean r6 = false;
        boolean r7 = false;
        String r8 = null;
        int r9 = 0;
        this(r2, r3, r4, r5, r6, r7, r8, r9, Constants.MAX_HOST_LENGTH, null);
        this.watchlistid = r13;
        this.name = r14;
    }
}
