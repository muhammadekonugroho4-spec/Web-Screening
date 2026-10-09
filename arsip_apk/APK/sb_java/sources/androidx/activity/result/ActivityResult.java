package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0017B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019¨\u0006\u001b"}, d2 = {"Landroidx/activity/result/ActivityResult;", "Landroid/os/Parcelable;", "", "resultCode", "Landroid/content/Intent;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(ILandroid/content/Intent;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "toString", "()Ljava/lang/String;", "dest", "flags", "Lkotlin/w;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "I", "b", "Landroid/content/Intent;", "()Landroid/content/Intent;", "c", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class ActivityResult implements Parcelable {
    public static final Parcelable.Creator<ActivityResult> CREATOR = null;

    /* renamed from: c, reason: collision with root package name */
    public static final b f2217c = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f2218a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f2219b;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public ActivityResult a(Parcel r2) {
            p.l(r2, "parcel");
            return new ActivityResult(r2);
        }

        public ActivityResult[] b(int r1) {
            return new ActivityResult[r1];
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

    public static final class b {
        public /* synthetic */ b(i r1) {
            this();
        }

        public final String a(int r2) {
            if (r2 == (-1)) goto L9;
            if (r2 != 0) goto L6;
            return "RESULT_CANCELED";
        L6:
            return String.valueOf(r2);
        L9:
            return "RESULT_OK";
        }

        public b() {
        }
    }

    static {
        f2217c = new b(null);
        CREATOR = new a();
    }

    public ActivityResult(int r1, Intent r2) {
        this.f2218a = r1;
        this.f2219b = r2;
    }

    public final Intent a() {
        return this.f2219b;
    }

    public final int b() {
        return this.f2218a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + f2217c.a(this.f2218a) + ", data=" + this.f2219b + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r2, int r3) {
        p.l(r2, "dest");
        r2.writeInt(this.f2218a);
        if (this.f2219b != null) goto L5;
        int r02 = 0;
    L6:
        r2.writeInt(r02);
        Intent r03 = this.f2219b;
        if (r03 == null) goto L10;
        r03.writeToParcel(r2, r3);
        return;
    L10:
        return;
    L5:
        r02 = 1;
        goto L6
    }

    public ActivityResult(Parcel r3) {
        p.l(r3, "parcel");
        int r02 = r3.readInt();
        if (r3.readInt() != 0) goto L5;
        Intent r32 = null;
    L6:
        this(r02, r32);
        return;
    L5:
        r32 = (Intent) Intent.CREATOR.createFromParcel(r3);
        goto L6
    }
}
