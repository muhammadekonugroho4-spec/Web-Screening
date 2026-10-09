package androidx.activity.result;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.BaseGmsClient;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0002\u0015\u001cB1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001c\u0010\u000f¨\u0006\u001f"}, d2 = {"Landroidx/activity/result/IntentSenderRequest;", "Landroid/os/Parcelable;", "Landroid/content/IntentSender;", "intentSender", "Landroid/content/Intent;", "fillInIntent", "", "flagsMask", "flagsValues", "<init>", "(Landroid/content/IntentSender;Landroid/content/Intent;II)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "describeContents", "()I", "dest", "flags", "Lkotlin/w;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Landroid/content/IntentSender;", Constants.INAPP_DATA_TAG, "()Landroid/content/IntentSender;", "b", "Landroid/content/Intent;", "()Landroid/content/Intent;", "c", "I", "e", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = null;

    /* renamed from: e, reason: collision with root package name */
    public static final c f2220e = null;

    /* renamed from: a, reason: collision with root package name */
    public final IntentSender f2221a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f2222b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2223c;
    public final int d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final IntentSender f2224a;

        /* renamed from: b, reason: collision with root package name */
        public Intent f2225b;

        /* renamed from: c, reason: collision with root package name */
        public int f2226c;
        public int d;

        public a(IntentSender r2) {
            p.l(r2, "intentSender");
            this.f2224a = r2;
        }

        public final IntentSenderRequest a() {
            return new IntentSenderRequest(this.f2224a, this.f2225b, this.f2226c, this.d);
        }

        public final a b(Intent r1) {
            this.f2225b = r1;
            return this;
        }

        public final a c(int r1, int r2) {
            this.d = r1;
            this.f2226c = r2;
            return this;
        }

        public a(PendingIntent r2) {
            p.l(r2, BaseGmsClient.KEY_PENDING_INTENT);
            IntentSender r22 = r2.getIntentSender();
            p.k(r22, "getIntentSender(...)");
            this(r22);
        }
    }

    public static final class b implements Parcelable.Creator {
        public b() {
        }

        public IntentSenderRequest a(Parcel r2) {
            p.l(r2, "inParcel");
            return new IntentSenderRequest(r2);
        }

        public IntentSenderRequest[] b(int r1) {
            return new IntentSenderRequest[r1];
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

    public static final class c {
        public /* synthetic */ c(i r1) {
            this();
        }

        public c() {
        }
    }

    static {
        f2220e = new c(null);
        CREATOR = new b();
    }

    public IntentSenderRequest(IntentSender r2, Intent r3, int r4, int r5) {
        p.l(r2, "intentSender");
        this.f2221a = r2;
        this.f2222b = r3;
        this.f2223c = r4;
        this.d = r5;
    }

    public final Intent a() {
        return this.f2222b;
    }

    public final int b() {
        return this.f2223c;
    }

    public final int c() {
        return this.d;
    }

    public final IntentSender d() {
        return this.f2221a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r2, int r3) {
        p.l(r2, "dest");
        r2.writeParcelable(this.f2221a, r3);
        r2.writeParcelable(this.f2222b, r3);
        r2.writeInt(this.f2223c);
        r2.writeInt(this.d);
    }

    public IntentSenderRequest(Parcel r4) {
        p.l(r4, "parcel");
        Parcelable r02 = r4.readParcelable(IntentSender.class.getClassLoader());
        p.i(r02);
        this((IntentSender) r02, (Intent) r4.readParcelable(Intent.class.getClassLoader()), r4.readInt(), r4.readInt());
    }
}
