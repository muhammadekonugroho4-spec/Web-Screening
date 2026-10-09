package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;

/* loaded from: classes.dex */
public abstract class MediaSessionCompat {

    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = null;

        /* renamed from: a, reason: collision with root package name */
        public final MediaDescriptionCompat f2050a;

        /* renamed from: b, reason: collision with root package name */
        public final long f2051b;

        public static class a implements Parcelable.Creator {
            public a() {
            }

            public QueueItem a(Parcel r2) {
                return new QueueItem(r2);
            }

            public QueueItem[] b(int r1) {
                return new QueueItem[r1];
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

        public QueueItem(Parcel r3) {
            this.f2050a = MediaDescriptionCompat.CREATOR.createFromParcel(r3);
            this.f2051b = r3.readLong();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f2050a + ", Id=" + this.f2051b + " }";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel r3, int r4) {
            this.f2050a.writeToParcel(r3, r4);
            r3.writeLong(this.f2051b);
        }
    }

    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = null;

        /* renamed from: a, reason: collision with root package name */
        public ResultReceiver f2052a;

        public static class a implements Parcelable.Creator {
            public a() {
            }

            public ResultReceiverWrapper a(Parcel r2) {
                return new ResultReceiverWrapper(r2);
            }

            public ResultReceiverWrapper[] b(int r1) {
                return new ResultReceiverWrapper[r1];
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

        public ResultReceiverWrapper(Parcel r2) {
            this.f2052a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(r2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel r2, int r3) {
            this.f2052a.writeToParcel(r2, r3);
        }
    }

    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = null;

        /* renamed from: a, reason: collision with root package name */
        public final Object f2053a;

        /* renamed from: b, reason: collision with root package name */
        public b f2054b;

        /* renamed from: c, reason: collision with root package name */
        public Bundle f2055c;

        public static class a implements Parcelable.Creator {
            public a() {
            }

            public Token a(Parcel r2) {
                return new Token(r2.readParcelable(null));
            }

            public Token[] b(int r1) {
                return new Token[r1];
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

        public Token(Object r2) {
            this(r2, null, null);
        }

        public static Token a(Object r1) {
            return b(r1, null);
        }

        public static Token b(Object r1, b r2) {
            if (r1 != null) goto L4;
            return null;
        L4:
            return new Token(d.a(r1), r2);
        }

        public b c() {
            return this.f2054b;
        }

        public Object d() {
            return this.f2053a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public void e(b r1) {
            this.f2054b = r1;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof Token) == true) goto L8;
            return false;
        L8:
            Token r42 = (Token) r4;
            Object r1 = this.f2053a;
            if (r1 == null) goto L11;
            Object r43 = r42.f2053a;
            if (r43 != null) goto L18;
            return false;
        L18:
            return r1.equals(r43);
        L11:
            if (r42.f2053a != null) goto L13;
            return true;
        L13:
            return false;
        }

        public void f(Bundle r1) {
            this.f2055c = r1;
        }

        public int hashCode() {
            Object r02 = this.f2053a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel r2, int r3) {
            r2.writeParcelable((Parcelable) this.f2053a, r3);
        }

        public Token(Object r2, b r3) {
            this(r2, r3, null);
        }

        public Token(Object r1, b r2, Bundle r3) {
            this.f2053a = r1;
            this.f2054b = r2;
            this.f2055c = r3;
        }
    }

    public static void a(Bundle r1) {
        if (r1 == null) goto L5;
        r1.setClassLoader(MediaSessionCompat.class.getClassLoader());
        return;
    }
}
