package android.support.v4.media;

import android.media.MediaDescription;
import android.net.Uri;

/* loaded from: classes.dex */
public abstract class c {

    public static class a {
        public static void a(Object r02, Uri r1) {
            ((MediaDescription.Builder) r02).setMediaUri(r1);
        }
    }

    public static Uri a(Object r02) {
        return ((MediaDescription) r02).getMediaUri();
    }
}
