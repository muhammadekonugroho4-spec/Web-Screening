package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class b {

    public static class a {
        public static Object a(Object r02) {
            return ((MediaDescription.Builder) r02).build();
        }

        public static Object b() {
            return new MediaDescription.Builder();
        }

        public static void c(Object r02, CharSequence r1) {
            ((MediaDescription.Builder) r02).setDescription(r1);
        }

        public static void d(Object r02, Bundle r1) {
            ((MediaDescription.Builder) r02).setExtras(r1);
        }

        public static void e(Object r02, Bitmap r1) {
            ((MediaDescription.Builder) r02).setIconBitmap(r1);
        }

        public static void f(Object r02, Uri r1) {
            ((MediaDescription.Builder) r02).setIconUri(r1);
        }

        public static void g(Object r02, String r1) {
            ((MediaDescription.Builder) r02).setMediaId(r1);
        }

        public static void h(Object r02, CharSequence r1) {
            ((MediaDescription.Builder) r02).setSubtitle(r1);
        }

        public static void i(Object r02, CharSequence r1) {
            ((MediaDescription.Builder) r02).setTitle(r1);
        }
    }

    public static Object a(Parcel r1) {
        return MediaDescription.CREATOR.createFromParcel(r1);
    }

    public static CharSequence b(Object r02) {
        return ((MediaDescription) r02).getDescription();
    }

    public static Bundle c(Object r02) {
        return ((MediaDescription) r02).getExtras();
    }

    public static Bitmap d(Object r02) {
        return ((MediaDescription) r02).getIconBitmap();
    }

    public static Uri e(Object r02) {
        return ((MediaDescription) r02).getIconUri();
    }

    public static String f(Object r02) {
        return ((MediaDescription) r02).getMediaId();
    }

    public static CharSequence g(Object r02) {
        return ((MediaDescription) r02).getSubtitle();
    }

    public static CharSequence h(Object r02) {
        return ((MediaDescription) r02).getTitle();
    }

    public static void i(Object r02, Parcel r1, int r2) {
        ((MediaDescription) r02).writeToParcel(r1, r2);
    }
}
