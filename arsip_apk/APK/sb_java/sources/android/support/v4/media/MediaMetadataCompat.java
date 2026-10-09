package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.collection.C2337a;

/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = null;

    /* renamed from: b, reason: collision with root package name */
    public static final C2337a f2034b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f2035c = null;
    public static final String[] d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f2036e = null;

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f2037a;

    public static class a implements Parcelable.Creator {
        public a() {
        }

        public MediaMetadataCompat a(Parcel r2) {
            return new MediaMetadataCompat(r2);
        }

        public MediaMetadataCompat[] b(int r1) {
            return new MediaMetadataCompat[r1];
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
        C2337a r02 = new C2337a();
        f2034b = r02;
        r02.put("android.media.metadata.TITLE", 1);
        r02.put("android.media.metadata.ARTIST", 1);
        r02.put("android.media.metadata.DURATION", 0);
        r02.put("android.media.metadata.ALBUM", 1);
        r02.put("android.media.metadata.AUTHOR", 1);
        r02.put("android.media.metadata.WRITER", 1);
        r02.put("android.media.metadata.COMPOSER", 1);
        r02.put("android.media.metadata.COMPILATION", 1);
        r02.put("android.media.metadata.DATE", 1);
        r02.put("android.media.metadata.YEAR", 0);
        r02.put("android.media.metadata.GENRE", 1);
        r02.put("android.media.metadata.TRACK_NUMBER", 0);
        r02.put("android.media.metadata.NUM_TRACKS", 0);
        r02.put("android.media.metadata.DISC_NUMBER", 0);
        r02.put("android.media.metadata.ALBUM_ARTIST", 1);
        r02.put("android.media.metadata.ART", 2);
        r02.put("android.media.metadata.ART_URI", 1);
        r02.put("android.media.metadata.ALBUM_ART", 2);
        r02.put("android.media.metadata.ALBUM_ART_URI", 1);
        r02.put("android.media.metadata.USER_RATING", 3);
        r02.put("android.media.metadata.RATING", 3);
        r02.put("android.media.metadata.DISPLAY_TITLE", 1);
        r02.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        r02.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        r02.put("android.media.metadata.DISPLAY_ICON", 2);
        r02.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        r02.put("android.media.metadata.MEDIA_ID", 1);
        r02.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        r02.put("android.media.metadata.MEDIA_URI", 1);
        r02.put("android.media.metadata.ADVERTISEMENT", 0);
        r02.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        f2035c = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        d = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        f2036e = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new a();
    }

    public MediaMetadataCompat(Parcel r2) {
        this.f2037a = r2.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.writeBundle(this.f2037a);
    }
}
