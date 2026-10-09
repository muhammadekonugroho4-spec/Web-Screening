package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: android.support.v4.media.session.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0018a extends Binder implements a {
        public AbstractBinderC0018a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int r5, Parcel r6, Parcel r7, int r8) {
            if (r5 == 1598968902) goto L58;
            boolean r02 = false;
            Bundle r3 = null;
            ParcelableVolumeInfo r32 = null;
            Bundle r33 = null;
            CharSequence r34 = null;
            MediaMetadataCompat r35 = null;
            PlaybackStateCompat r36 = null;
            switch(r5) {
                case 1: goto L53;
                case 2: goto L51;
                case 3: goto L46;
                case 4: goto L41;
                case 5: goto L39;
                case 6: goto L34;
                case 7: goto L29;
                case 8: goto L24;
                case 9: goto L22;
                case 10: goto L17;
                case 11: goto L12;
                case 12: goto L10;
                case 13: goto L8;
                default: goto L7;
            };
        L8:
            r6.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            d();
            return true;
        L10:
            r6.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            A(r6.readInt());
            return true;
        L12:
            r6.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            if (r6.readInt() == 0) goto L15;
            r02 = true;
        L15:
            H(r02);
            return true;
        L17:
            r6.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            if (r6.readInt() == 0) goto L20;
            r02 = true;
        L20:
            J(r02);
            return true;
        L22:
            r6.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            N(r6.readInt());
            return true;
        L24:
            r6.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            if (r6.readInt() == 0) goto L27;
            r32 = ParcelableVolumeInfo.CREATOR.createFromParcel(r6);
        L27:
            C(r32);
            return true;
        L29:
            r6.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            if (r6.readInt() == 0) goto L32;
            r33 = (Bundle) Bundle.CREATOR.createFromParcel(r6);
        L32:
            E(r33);
            return true;
        L34:
            r6.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            if (r6.readInt() == 0) goto L37;
            r34 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(r6);
        L37:
            K(r34);
            return true;
        L39:
            r6.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            e(r6.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
            return true;
        L41:
            r6.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            if (r6.readInt() == 0) goto L44;
            r35 = MediaMetadataCompat.CREATOR.createFromParcel(r6);
        L44:
            w(r35);
            return true;
        L46:
            r6.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            if (r6.readInt() == 0) goto L49;
            r36 = PlaybackStateCompat.CREATOR.createFromParcel(r6);
        L49:
            U(r36);
            return true;
        L51:
            r6.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            h();
            return true;
        L53:
            r6.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            String r52 = r6.readString();
            if (r6.readInt() == 0) goto L56;
            r3 = (Bundle) Bundle.CREATOR.createFromParcel(r6);
        L56:
            onEvent(r52, r3);
            return true;
        L7:
            return super.onTransact(r5, r6, r7, r8);
        L58:
            r7.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
    }

    void A(int r1);

    void C(ParcelableVolumeInfo r1);

    void E(Bundle r1);

    void H(boolean r1);

    void J(boolean r1);

    void K(CharSequence r1);

    void N(int r1);

    void U(PlaybackStateCompat r1);

    void d();

    void e(List r1);

    void h();

    void onEvent(String r1, Bundle r2);

    void w(MediaMetadataCompat r1);
}
