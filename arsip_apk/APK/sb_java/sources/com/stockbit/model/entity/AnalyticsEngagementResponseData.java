package com.stockbit.model.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u0003J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0003R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006&"}, d2 = {"Lcom/stockbit/model/entity/AnalyticsEngagementResponseData;", "Landroid/os/Parcelable;", "like", "", "reply", FirebaseAnalytics.Event.SHARE, "profileView", "signClick", "mediaClick", "<init>", "(IIIIII)V", "getLike", "()I", "getReply", "getShare", "getProfileView", "getSignClick", "getMediaClick", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AnalyticsEngagementResponseData implements Parcelable {
    public static final Parcelable.Creator<AnalyticsEngagementResponseData> CREATOR = null;

    @SerializedName("like")
    private final int like;

    @SerializedName("media_click")
    private final int mediaClick;

    @SerializedName("profile_view")
    private final int profileView;

    @SerializedName("reply")
    private final int reply;

    @SerializedName(FirebaseAnalytics.Event.SHARE)
    private final int share;

    @SerializedName("sign_click")
    private final int signClick;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final AnalyticsEngagementResponseData a(Parcel r9) {
            p.l(r9, "parcel");
            return new AnalyticsEngagementResponseData(r9.readInt(), r9.readInt(), r9.readInt(), r9.readInt(), r9.readInt(), r9.readInt());
        }

        public final AnalyticsEngagementResponseData[] b(int r1) {
            return new AnalyticsEngagementResponseData[r1];
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

    public AnalyticsEngagementResponseData() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AnalyticsEngagementResponseData) == true) goto L8;
        return false;
    L8:
        AnalyticsEngagementResponseData r52 = (AnalyticsEngagementResponseData) r5;
        if (this.like == r52.like) goto L12;
        return false;
    L12:
        if (this.reply == r52.reply) goto L15;
        return false;
    L15:
        if (this.share == r52.share) goto L18;
        return false;
    L18:
        if (this.profileView == r52.profileView) goto L21;
        return false;
    L21:
        if (this.signClick == r52.signClick) goto L24;
        return false;
    L24:
        if (this.mediaClick == r52.mediaClick) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.like) * 31) + Integer.hashCode(this.reply)) * 31) + Integer.hashCode(this.share)) * 31) + Integer.hashCode(this.profileView)) * 31) + Integer.hashCode(this.signClick)) * 31) + Integer.hashCode(this.mediaClick);
    }

    public String toString() {
        return "AnalyticsEngagementResponseData(like=" + this.like + ", reply=" + this.reply + ", share=" + this.share + ", profileView=" + this.profileView + ", signClick=" + this.signClick + ", mediaClick=" + this.mediaClick + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeInt(this.like);
        r1.writeInt(this.reply);
        r1.writeInt(this.share);
        r1.writeInt(this.profileView);
        r1.writeInt(this.signClick);
        r1.writeInt(this.mediaClick);
    }

    public AnalyticsEngagementResponseData(int r1, int r2, int r3, int r4, int r5, int r6) {
        this.like = r1;
        this.reply = r2;
        this.share = r3;
        this.profileView = r4;
        this.signClick = r5;
        this.mediaClick = r6;
    }

    public /* synthetic */ AnalyticsEngagementResponseData(int r2, int r3, int r4, int r5, int r6, int r7, int r8, i r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r8 & 32) == 0) goto L21;
        int r82 = 0;
    L20:
        int r72 = r6;
        int r62 = r5;
        int r52 = r4;
        this(r2, r3, r52, r62, r72, r82);
        return;
    L21:
        r82 = r7;
        goto L20
    }
}
