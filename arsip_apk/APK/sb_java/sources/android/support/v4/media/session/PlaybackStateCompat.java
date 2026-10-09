package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f2060a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2061b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2062c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2063e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2064f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f2065g;

    /* renamed from: h, reason: collision with root package name */
    public final long f2066h;

    /* renamed from: i, reason: collision with root package name */
    public List f2067i;

    /* renamed from: j, reason: collision with root package name */
    public final long f2068j;

    /* renamed from: k, reason: collision with root package name */
    public final Bundle f2069k;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = null;

        /* renamed from: a, reason: collision with root package name */
        public final String f2070a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f2071b;

        /* renamed from: c, reason: collision with root package name */
        public final int f2072c;
        public final Bundle d;

        public static class a implements Parcelable.Creator {
            public a() {
            }

            public CustomAction a(Parcel r2) {
                return new CustomAction(r2);
            }

            public CustomAction[] b(int r1) {
                return new CustomAction[r1];
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

        public CustomAction(Parcel r2) {
            this.f2070a = r2.readString();
            this.f2071b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(r2);
            this.f2072c = r2.readInt();
            this.d = r2.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + this.f2071b + ", mIcon=" + this.f2072c + ", mExtras=" + this.d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel r2, int r3) {
            r2.writeString(this.f2070a);
            TextUtils.writeToParcel(this.f2071b, r2, r3);
            r2.writeInt(this.f2072c);
            r2.writeBundle(this.d);
        }
    }

    public static class a implements Parcelable.Creator {
        public a() {
        }

        public PlaybackStateCompat a(Parcel r2) {
            return new PlaybackStateCompat(r2);
        }

        public PlaybackStateCompat[] b(int r1) {
            return new PlaybackStateCompat[r1];
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

    public PlaybackStateCompat(Parcel r3) {
        this.f2060a = r3.readInt();
        this.f2061b = r3.readLong();
        this.d = r3.readFloat();
        this.f2066h = r3.readLong();
        this.f2062c = r3.readLong();
        this.f2063e = r3.readLong();
        this.f2065g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(r3);
        this.f2067i = r3.createTypedArrayList(CustomAction.CREATOR);
        this.f2068j = r3.readLong();
        this.f2069k = r3.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f2064f = r3.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f2060a + ", position=" + this.f2061b + ", buffered position=" + this.f2062c + ", speed=" + this.d + ", updated=" + this.f2066h + ", actions=" + this.f2063e + ", error code=" + this.f2064f + ", error message=" + this.f2065g + ", custom actions=" + this.f2067i + ", active item id=" + this.f2068j + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r3, int r4) {
        r3.writeInt(this.f2060a);
        r3.writeLong(this.f2061b);
        r3.writeFloat(this.d);
        r3.writeLong(this.f2066h);
        r3.writeLong(this.f2062c);
        r3.writeLong(this.f2063e);
        TextUtils.writeToParcel(this.f2065g, r3, r4);
        r3.writeTypedList(this.f2067i);
        r3.writeLong(this.f2068j);
        r3.writeBundle(this.f2069k);
        r3.writeInt(this.f2064f);
    }
}
