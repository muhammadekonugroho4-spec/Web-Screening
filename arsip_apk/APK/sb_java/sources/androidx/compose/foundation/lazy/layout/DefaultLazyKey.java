package androidx.compose.foundation.lazy.layout;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0083\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\rJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;", "Landroid/os/Parcelable;", "", FirebaseAnalytics.Param.INDEX, "<init>", "(I)V", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/w;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class DefaultLazyKey implements Parcelable {
    public static final Parcelable.Creator<DefaultLazyKey> CREATOR = null;

    /* renamed from: b, reason: collision with root package name */
    public static final b f8606b = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f8607a;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public DefaultLazyKey a(Parcel r2) {
            return new DefaultLazyKey(r2.readInt());
        }

        public DefaultLazyKey[] b(int r1) {
            return new DefaultLazyKey[r1];
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
        public /* synthetic */ b(kotlin.jvm.internal.i r1) {
            this();
        }

        public b() {
        }
    }

    static {
        f8606b = new b(null);
        CREATOR = new a();
    }

    public DefaultLazyKey(int r1) {
        this.f8607a = r1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof DefaultLazyKey) == true) goto L9;
        return false;
    L9:
        if (this.f8607a == ((DefaultLazyKey) r4).f8607a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Integer.hashCode(this.f8607a);
    }

    public String toString() {
        return "DefaultLazyKey(index=" + this.f8607a + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.f8607a);
    }
}
