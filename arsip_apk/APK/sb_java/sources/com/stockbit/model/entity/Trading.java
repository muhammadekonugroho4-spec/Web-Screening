package com.stockbit.model.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0003J\u0014\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0003R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\""}, d2 = {"Lcom/stockbit/model/entity/Trading;", "Landroid/os/Parcelable;", "accountId", "", "isPro", "", "hasRealtradingAccess", "<init>", "(IZZ)V", "getAccountId", "()I", "setAccountId", "(I)V", "()Z", "setPro", "(Z)V", "getHasRealtradingAccess", "setHasRealtradingAccess", "component1", "component2", "component3", Constants.COPY_TYPE, "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Trading implements Parcelable {
    public static final Parcelable.Creator<Trading> CREATOR = null;

    @SerializedName("account_id")
    private int accountId;

    @SerializedName("has_realtrading_access")
    private boolean hasRealtradingAccess;

    @SerializedName("is_pro")
    private boolean isPro;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final Trading a(Parcel r6) {
            p.l(r6, "parcel");
            int r1 = r6.readInt();
            boolean r3 = false;
            if (r6.readInt() == 0) goto L5;
            boolean r2 = true;
        L7:
            if (r6.readInt() == 0) goto L10;
            r3 = true;
        L10:
            return new Trading(r1, r2, r3);
        L5:
            r2 = false;
            goto L7
        }

        public final Trading[] b(int r1) {
            return new Trading[r1];
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

    public Trading(int r1, boolean r2, boolean r3) {
        this.accountId = r1;
        this.isPro = r2;
        this.hasRealtradingAccess = r3;
    }

    public final boolean a() {
        return this.hasRealtradingAccess;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Trading) == true) goto L8;
        return false;
    L8:
        Trading r52 = (Trading) r5;
        if (this.accountId == r52.accountId) goto L12;
        return false;
    L12:
        if (this.isPro == r52.isPro) goto L15;
        return false;
    L15:
        if (this.hasRealtradingAccess == r52.hasRealtradingAccess) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.accountId) * 31) + Boolean.hashCode(this.isPro)) * 31) + Boolean.hashCode(this.hasRealtradingAccess);
    }

    public String toString() {
        return "Trading(accountId=" + this.accountId + ", isPro=" + this.isPro + ", hasRealtradingAccess=" + this.hasRealtradingAccess + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeInt(this.accountId);
        r1.writeInt(this.isPro ? 1 : 0);
        r1.writeInt(this.hasRealtradingAccess ? 1 : 0);
    }
}
