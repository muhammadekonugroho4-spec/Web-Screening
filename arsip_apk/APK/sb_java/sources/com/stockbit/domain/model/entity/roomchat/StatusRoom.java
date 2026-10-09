package com.stockbit.domain.model.entity.roomchat;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.e;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\fHÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/stockbit/domain/model/entity/roomchat/StatusRoom;", "Landroid/os/Parcelable;", "isMuted", "", "isMentioned", "<init>", "(ZZ)V", "()Z", "component1", "component2", Constants.COPY_TYPE, "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@e
/* loaded from: classes8.dex */
public final class StatusRoom implements Parcelable {
    public static final Parcelable.Creator<StatusRoom> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f82847a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f82848b;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final StatusRoom a(Parcel r5) {
            p.l(r5, "parcel");
            boolean r2 = false;
            if (r5.readInt() == 0) goto L5;
            boolean r1 = true;
        L7:
            if (r5.readInt() == 0) goto L10;
            r2 = true;
        L10:
            return new StatusRoom(r1, r2);
        L5:
            r1 = false;
            goto L7
        }

        public final StatusRoom[] b(int r1) {
            return new StatusRoom[r1];
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

    public StatusRoom(boolean r1, boolean r2) {
        this.f82847a = r1;
        this.f82848b = r2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof StatusRoom) == true) goto L8;
        return false;
    L8:
        StatusRoom r52 = (StatusRoom) r5;
        if (this.f82847a == r52.f82847a) goto L12;
        return false;
    L12:
        if (this.f82848b == r52.f82848b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f82847a) * 31) + Boolean.hashCode(this.f82848b);
    }

    public String toString() {
        return "StatusRoom(isMuted=" + this.f82847a + ", isMentioned=" + this.f82848b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeInt(this.f82847a ? 1 : 0);
        r1.writeInt(this.f82848b ? 1 : 0);
    }
}
