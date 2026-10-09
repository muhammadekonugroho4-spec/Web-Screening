package com.stockbit.domain.model.entity.userprofile;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\u0003J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0003R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u001f"}, d2 = {"Lcom/stockbit/domain/model/entity/userprofile/Connect;", "Landroid/os/Parcelable;", "facebook", "", "twitter", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getFacebook", "()Ljava/lang/Integer;", "setFacebook", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTwitter", "setTwitter", "component1", "component2", Constants.COPY_TYPE, "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/stockbit/domain/model/entity/userprofile/Connect;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Connect implements Parcelable {
    public static final Parcelable.Creator<Connect> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public Integer f83723a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f83724b;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final Connect a(Parcel r5) {
            p.l(r5, "parcel");
            Integer r2 = null;
            if (r5.readInt() != 0) goto L5;
            Integer r1 = null;
        L7:
            if (r5.readInt() == 0) goto L11;
            r2 = Integer.valueOf(r5.readInt());
        L11:
            return new Connect(r1, r2);
        L5:
            r1 = Integer.valueOf(r5.readInt());
            goto L7
        }

        public final Connect[] b(int r1) {
            return new Connect[r1];
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

    public Connect(Integer r1, Integer r2) {
        this.f83723a = r1;
        this.f83724b = r2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Connect) == true) goto L8;
        return false;
    L8:
        Connect r52 = (Connect) r5;
        if (p.g(this.f83723a, r52.f83723a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f83724b, r52.f83724b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        Integer r02 = this.f83723a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Integer r2 = this.f83724b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "Connect(facebook=" + this.f83723a + ", twitter=" + this.f83724b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        Integer r42 = this.f83723a;
        if (r42 != null) goto L5;
        r3.writeInt(0);
    L6:
        Integer r43 = this.f83724b;
        if (r43 != null) goto L10;
        r3.writeInt(0);
        return;
    L10:
        r3.writeInt(1);
        r3.writeInt(r43.intValue());
        return;
    L5:
        r3.writeInt(1);
        r3.writeInt(r42.intValue());
        goto L6
    }
}
