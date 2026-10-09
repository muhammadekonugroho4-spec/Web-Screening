package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public int f2056a;

    /* renamed from: b, reason: collision with root package name */
    public int f2057b;

    /* renamed from: c, reason: collision with root package name */
    public int f2058c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2059e;

    public static class a implements Parcelable.Creator {
        public a() {
        }

        public ParcelableVolumeInfo a(Parcel r2) {
            return new ParcelableVolumeInfo(r2);
        }

        public ParcelableVolumeInfo[] b(int r1) {
            return new ParcelableVolumeInfo[r1];
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

    public ParcelableVolumeInfo(Parcel r2) {
        this.f2056a = r2.readInt();
        this.f2058c = r2.readInt();
        this.d = r2.readInt();
        this.f2059e = r2.readInt();
        this.f2057b = r2.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.f2056a);
        r1.writeInt(this.f2058c);
        r1.writeInt(this.d);
        r1.writeInt(this.f2059e);
        r1.writeInt(this.f2057b);
    }
}
