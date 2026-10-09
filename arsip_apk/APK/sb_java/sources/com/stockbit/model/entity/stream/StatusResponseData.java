package com.stockbit.model.entity.stream;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003Jm\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0014\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0083\u0004J\n\u0010 \u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010!\u001a\u00020\"HÖ\u0081\u0004J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000fR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000fR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000fR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000f¨\u0006("}, d2 = {"Lcom/stockbit/model/entity/stream/StatusResponseData;", "Landroid/os/Parcelable;", "isPinned", "", "isTrending", "isReposted", "isLiked", "isSaved", "isFollowed", "isUnavailable", "isJunk", "isSpam", "isViolation", "<init>", "(ZZZZZZZZZZ)V", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", Constants.COPY_TYPE, "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class StatusResponseData implements Parcelable {
    public static final Parcelable.Creator<StatusResponseData> CREATOR = null;

    @SerializedName("is_followed")
    private final boolean isFollowed;

    @SerializedName("is_junk")
    private final boolean isJunk;

    @SerializedName("is_liked")
    private final boolean isLiked;

    @SerializedName("is_pinned")
    private final boolean isPinned;

    @SerializedName("is_reposted")
    private final boolean isReposted;

    @SerializedName("is_saved")
    private final boolean isSaved;

    @SerializedName("is_spam")
    private final boolean isSpam;

    @SerializedName("is_trending")
    private final boolean isTrending;

    @SerializedName("is_unavailable")
    private final boolean isUnavailable;

    @SerializedName("is_violation")
    private final boolean isViolation;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final StatusResponseData a(Parcel r13) {
            p.l(r13, "parcel");
            boolean r2 = false;
            boolean r3 = true;
            if (r13.readInt() == 0) goto L5;
            boolean r02 = false;
            r2 = true;
        L7:
            if (r13.readInt() == 0) goto L9;
            boolean r4 = true;
        L11:
            if (r13.readInt() == 0) goto L13;
            boolean r5 = r4;
        L15:
            if (r13.readInt() == 0) goto L17;
            boolean r6 = r5;
        L19:
            if (r13.readInt() == 0) goto L21;
            boolean r7 = r6;
        L23:
            if (r13.readInt() == 0) goto L25;
            boolean r8 = r7;
        L27:
            if (r13.readInt() == 0) goto L29;
            boolean r9 = r8;
        L31:
            if (r13.readInt() == 0) goto L33;
            boolean r10 = r9;
        L35:
            if (r13.readInt() == 0) goto L37;
            boolean r11 = r10;
        L39:
            if (r13.readInt() != 0) goto L43;
            r11 = r02;
        L43:
            return new StatusResponseData(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
        L37:
            r11 = r10;
            r10 = r02;
            goto L39
        L33:
            r10 = r9;
            r9 = r02;
            goto L35
        L29:
            r9 = r8;
            r8 = r02;
            goto L31
        L25:
            r8 = r7;
            r7 = r02;
            goto L27
        L21:
            r7 = r6;
            r6 = r02;
            goto L23
        L17:
            r6 = r5;
            r5 = r02;
            goto L19
        L13:
            r5 = r4;
            r4 = r02;
            goto L15
        L9:
            r4 = true;
            r3 = r02;
            goto L11
        L5:
            r02 = false;
            goto L7
        }

        public final StatusResponseData[] b(int r1) {
            return new StatusResponseData[r1];
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

    public StatusResponseData() {
        boolean r1 = false;
        boolean r2 = false;
        boolean r3 = false;
        boolean r4 = false;
        boolean r5 = false;
        boolean r6 = false;
        boolean r7 = false;
        boolean r8 = false;
        boolean r9 = false;
        boolean r10 = false;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, 1023, null);
    }

    public final boolean a() {
        return this.isFollowed;
    }

    public final boolean b() {
        return this.isJunk;
    }

    public final boolean c() {
        return this.isLiked;
    }

    public final boolean d() {
        return this.isPinned;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.isReposted;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof StatusResponseData) == true) goto L8;
        return false;
    L8:
        StatusResponseData r52 = (StatusResponseData) r5;
        if (this.isPinned == r52.isPinned) goto L12;
        return false;
    L12:
        if (this.isTrending == r52.isTrending) goto L15;
        return false;
    L15:
        if (this.isReposted == r52.isReposted) goto L18;
        return false;
    L18:
        if (this.isLiked == r52.isLiked) goto L21;
        return false;
    L21:
        if (this.isSaved == r52.isSaved) goto L24;
        return false;
    L24:
        if (this.isFollowed == r52.isFollowed) goto L27;
        return false;
    L27:
        if (this.isUnavailable == r52.isUnavailable) goto L30;
        return false;
    L30:
        if (this.isJunk == r52.isJunk) goto L33;
        return false;
    L33:
        if (this.isSpam == r52.isSpam) goto L36;
        return false;
    L36:
        if (this.isViolation == r52.isViolation) goto L38;
        return false;
    L38:
        return true;
    }

    public final boolean f() {
        return this.isSaved;
    }

    public final boolean g() {
        return this.isSpam;
    }

    public final boolean h() {
        return this.isTrending;
    }

    public int hashCode() {
        return (((((((((((((((((Boolean.hashCode(this.isPinned) * 31) + Boolean.hashCode(this.isTrending)) * 31) + Boolean.hashCode(this.isReposted)) * 31) + Boolean.hashCode(this.isLiked)) * 31) + Boolean.hashCode(this.isSaved)) * 31) + Boolean.hashCode(this.isFollowed)) * 31) + Boolean.hashCode(this.isUnavailable)) * 31) + Boolean.hashCode(this.isJunk)) * 31) + Boolean.hashCode(this.isSpam)) * 31) + Boolean.hashCode(this.isViolation);
    }

    public final boolean i() {
        return this.isUnavailable;
    }

    public final boolean j() {
        return this.isViolation;
    }

    public String toString() {
        return "StatusResponseData(isPinned=" + this.isPinned + ", isTrending=" + this.isTrending + ", isReposted=" + this.isReposted + ", isLiked=" + this.isLiked + ", isSaved=" + this.isSaved + ", isFollowed=" + this.isFollowed + ", isUnavailable=" + this.isUnavailable + ", isJunk=" + this.isJunk + ", isSpam=" + this.isSpam + ", isViolation=" + this.isViolation + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeInt(this.isPinned ? 1 : 0);
        r1.writeInt(this.isTrending ? 1 : 0);
        r1.writeInt(this.isReposted ? 1 : 0);
        r1.writeInt(this.isLiked ? 1 : 0);
        r1.writeInt(this.isSaved ? 1 : 0);
        r1.writeInt(this.isFollowed ? 1 : 0);
        r1.writeInt(this.isUnavailable ? 1 : 0);
        r1.writeInt(this.isJunk ? 1 : 0);
        r1.writeInt(this.isSpam ? 1 : 0);
        r1.writeInt(this.isViolation ? 1 : 0);
    }

    public StatusResponseData(boolean r1, boolean r2, boolean r3, boolean r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9, boolean r10) {
        this.isPinned = r1;
        this.isTrending = r2;
        this.isReposted = r3;
        this.isLiked = r4;
        this.isSaved = r5;
        this.isFollowed = r6;
        this.isUnavailable = r7;
        this.isJunk = r8;
        this.isSpam = r9;
        this.isViolation = r10;
    }

    public /* synthetic */ StatusResponseData(boolean r2, boolean r3, boolean r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9, boolean r10, boolean r11, int r12, i r13) {
        if ((r12 & 1) == 0) goto L6;
        r2 = false;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r3 = false;
    L9:
        if ((r12 & 4) == 0) goto L12;
        r4 = false;
    L12:
        if ((r12 & 8) == 0) goto L15;
        r5 = false;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r6 = false;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r7 = false;
    L21:
        if ((r12 & 64) == 0) goto L24;
        r8 = false;
    L24:
        if ((r12 & 128) == 0) goto L27;
        r9 = false;
    L27:
        if ((r12 & 256) == 0) goto L30;
        r10 = false;
    L30:
        if ((r12 & 512) == 0) goto L33;
        boolean r122 = false;
    L32:
        boolean r112 = r10;
        boolean r102 = r9;
        boolean r92 = r8;
        boolean r82 = r7;
        boolean r72 = r6;
        boolean r62 = r5;
        boolean r52 = r4;
        this(r2, r3, r52, r62, r72, r82, r92, r102, r112, r122);
        return;
    L33:
        r122 = r11;
        goto L32
    }
}
