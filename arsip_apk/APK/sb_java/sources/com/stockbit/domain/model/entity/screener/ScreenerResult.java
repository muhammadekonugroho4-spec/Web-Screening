package com.stockbit.domain.model.entity.screener;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0003J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006#"}, d2 = {"Lcom/stockbit/domain/model/entity/screener/ScreenerResult;", "Landroid/os/Parcelable;", Constants.KEY_ID, "", "item", "", "raw", "", Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "<init>", "(ILjava/lang/String;DLjava/lang/String;)V", "getId", "()I", "getItem", "()Ljava/lang/String;", "getRaw", "()D", "getDisplay", "component1", "component2", "component3", "component4", com.clevertap.android.sdk.Constants.COPY_TYPE, "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ScreenerResult implements Parcelable {
    public static final Parcelable.Creator<ScreenerResult> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f82885a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82886b;

    /* renamed from: c, reason: collision with root package name */
    public final double f82887c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final ScreenerResult a(Parcel r8) {
            p.l(r8, "parcel");
            return new ScreenerResult(r8.readInt(), r8.readString(), r8.readDouble(), r8.readString());
        }

        public final ScreenerResult[] b(int r1) {
            return new ScreenerResult[r1];
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

    public ScreenerResult(int r2, String r3, double r4, String r6) {
        p.l(r3, "item");
        p.l(r6, Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
        this.f82885a = r2;
        this.f82886b = r3;
        this.f82887c = r4;
        this.d = r6;
    }

    public final String a() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof ScreenerResult) == true) goto L8;
        return false;
    L8:
        ScreenerResult r82 = (ScreenerResult) r8;
        if (this.f82885a == r82.f82885a) goto L12;
        return false;
    L12:
        if (p.g(this.f82886b, r82.f82886b) == true) goto L15;
        return false;
    L15:
        if (Double.compare(this.f82887c, r82.f82887c) == 0) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f82885a) * 31) + this.f82886b.hashCode()) * 31) + Double.hashCode(this.f82887c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "ScreenerResult(id=" + this.f82885a + ", item=" + this.f82886b + ", raw=" + this.f82887c + ", display=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        r3.writeInt(this.f82885a);
        r3.writeString(this.f82886b);
        r3.writeDouble(this.f82887c);
        r3.writeString(this.d);
    }

    public /* synthetic */ ScreenerResult(int r2, String r3, double r4, String r6, int r7, i r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = 0.0d;
    L12:
        if ((r7 & 8) == 0) goto L15;
        String r82 = "";
    L14:
        double r62 = r4;
        this(r2, r3, r62, r82);
        return;
    L15:
        r82 = r6;
        goto L14
    }
}
