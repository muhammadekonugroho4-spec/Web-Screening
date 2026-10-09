package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u0000 \u000f2\u00020\u00012\u00020\u0002:\u0001\u0010B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableIntState;", "Landroidx/compose/runtime/X1;", "Landroid/os/Parcelable;", "", "value", "<init>", "(I)V", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/w;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "c", "b", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class ParcelableSnapshotMutableIntState extends X1 implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableIntState> CREATOR = null;

    /* renamed from: c, reason: collision with root package name */
    public static final b f15982c = null;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public ParcelableSnapshotMutableIntState a(Parcel r2) {
            return new ParcelableSnapshotMutableIntState(r2.readInt());
        }

        public ParcelableSnapshotMutableIntState[] b(int r1) {
            return new ParcelableSnapshotMutableIntState[r1];
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
        f15982c = new b(null);
        CREATOR = new a();
    }

    public ParcelableSnapshotMutableIntState(int r1) {
        super(r1);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(d());
    }
}
