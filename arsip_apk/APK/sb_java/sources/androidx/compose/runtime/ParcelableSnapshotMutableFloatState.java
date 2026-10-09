package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\u0011B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState;", "Landroidx/compose/runtime/W1;", "Landroid/os/Parcelable;", "", "value", "<init>", "(F)V", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/w;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "c", "b", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class ParcelableSnapshotMutableFloatState extends W1 implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableFloatState> CREATOR = null;

    /* renamed from: c, reason: collision with root package name */
    public static final b f15981c = null;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public ParcelableSnapshotMutableFloatState a(Parcel r2) {
            return new ParcelableSnapshotMutableFloatState(r2.readFloat());
        }

        public ParcelableSnapshotMutableFloatState[] b(int r1) {
            return new ParcelableSnapshotMutableFloatState[r1];
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
        f15981c = new b(null);
        CREATOR = new a();
    }

    public ParcelableSnapshotMutableFloatState(float r1) {
        super(r1);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.writeFloat(a());
    }
}
