package com.stockbit.domain.model.valueobject.openingaccount;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0003J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/stockbit/domain/model/valueobject/openingaccount/OAVerificationStep;", "Landroid/os/Parcelable;", NotificationCompat.CATEGORY_STATUS, "", Constants.KEY_TEXT, "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getText", "()Ljava/lang/String;", "component1", "component2", Constants.COPY_TYPE, "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/stockbit/domain/model/valueobject/openingaccount/OAVerificationStep;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OAVerificationStep implements Parcelable {
    public static final Parcelable.Creator<OAVerificationStep> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final Integer f86902a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86903b;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final OAVerificationStep a(Parcel r3) {
            p.l(r3, "parcel");
            if (r3.readInt() != 0) goto L5;
            Integer r1 = null;
        L7:
            return new OAVerificationStep(r1, r3.readString());
        L5:
            r1 = Integer.valueOf(r3.readInt());
            goto L7
        }

        public final OAVerificationStep[] b(int r1) {
            return new OAVerificationStep[r1];
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

    public OAVerificationStep(Integer r1, String r2) {
        this.f86902a = r1;
        this.f86903b = r2;
    }

    public final Integer a() {
        return this.f86902a;
    }

    public final String b() {
        return this.f86903b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof OAVerificationStep) == true) goto L8;
        return false;
    L8:
        OAVerificationStep r52 = (OAVerificationStep) r5;
        if (p.g(this.f86902a, r52.f86902a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86903b, r52.f86903b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        Integer r02 = this.f86902a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f86903b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "OAVerificationStep(status=" + this.f86902a + ", text=" + this.f86903b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        p.l(r2, "dest");
        Integer r32 = this.f86902a;
        if (r32 != null) goto L6;
        int r33 = 0;
    L5:
        r2.writeInt(r33);
        r2.writeString(this.f86903b);
        return;
    L6:
        r2.writeInt(1);
        r33 = r32.intValue();
        goto L5
    }
}
