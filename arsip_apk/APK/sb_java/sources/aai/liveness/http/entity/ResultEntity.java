package aai.liveness.http.entity;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ResultEntity extends ai.advance.common.entity.a implements Parcelable {
    public static final Parcelable.Creator<ResultEntity> CREATOR = null;

    public class a implements Parcelable.Creator {
        public a() {
        }

        public ResultEntity a(Parcel r2) {
            return new ResultEntity(r2);
        }

        public ResultEntity[] b(int r1) {
            return new ResultEntity[r1];
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

    public ResultEntity() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ResultEntity{, code='" + this.f1734a + "', success=" + this.f1735b + ", data='" + this.f1736c + "', exception=" + this.d + ", message='" + this.f1737e + "', extra='" + this.f1738f + "', transactionId='" + this.f1739g + "', pricingStrategy='" + this.f1740h + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.writeString(this.f1734a);
        r1.writeByte(this.f1735b ? 1 : 0);
        r1.writeString(this.f1736c);
        r1.writeSerializable(this.d);
        r1.writeString(this.f1737e);
        r1.writeString(this.f1738f);
        r1.writeString(this.f1739g);
        r1.writeString(this.f1740h);
    }

    public ResultEntity(Parcel r2) {
        this.f1734a = r2.readString();
        if (r2.readByte() == 0) goto L5;
        boolean r02 = true;
    L6:
        this.f1735b = r02;
        this.f1736c = r2.readString();
        this.d = (Exception) r2.readSerializable();
        this.f1737e = r2.readString();
        this.f1738f = r2.readString();
        this.f1739g = r2.readString();
        this.f1740h = r2.readString();
        return;
    L5:
        r02 = false;
        goto L6
    }
}
