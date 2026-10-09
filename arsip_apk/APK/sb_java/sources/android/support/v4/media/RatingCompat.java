package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f2038a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2039b;

    public static class a implements Parcelable.Creator {
        public a() {
        }

        public RatingCompat a(Parcel r3) {
            return new RatingCompat(r3.readInt(), r3.readFloat());
        }

        public RatingCompat[] b(int r1) {
            return new RatingCompat[r1];
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

    public RatingCompat(int r1, float r2) {
        this.f2038a = r1;
        this.f2039b = r2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f2038a;
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder();
        r02.append("Rating:style=");
        r02.append(this.f2038a);
        r02.append(" rating=");
        float r1 = this.f2039b;
        if (r1 >= 0.0f) goto L5;
        String r12 = "unrated";
    L6:
        r02.append(r12);
        return r02.toString();
    L5:
        r12 = String.valueOf(r1);
        goto L6
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.f2038a);
        r1.writeFloat(this.f2039b);
    }
}
