package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes4.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final b f28563a;

    public static class a implements Parcelable.Creator {
        public a() {
        }

        public ParcelImpl a(Parcel r2) {
            return new ParcelImpl(r2);
        }

        public ParcelImpl[] b(int r1) {
            return new ParcelImpl[r1];
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

    public ParcelImpl(Parcel r2) {
        this.f28563a = new androidx.versionedparcelable.a(r2).u();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        new androidx.versionedparcelable.a(r1).L(this.f28563a);
    }
}
