package androidx.customview.view;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes4.dex */
public abstract class AbsSavedState implements Parcelable {
    public static final Parcelable.Creator<AbsSavedState> CREATOR = null;
    public static final AbsSavedState EMPTY_STATE = null;
    private final Parcelable mSuperState;

    public class a implements Parcelable.ClassLoaderCreator {
        public a() {
        }

        public AbsSavedState a(Parcel r2) {
            return b(r2, null);
        }

        public AbsSavedState b(Parcel r1, ClassLoader r2) {
            if (r1.readParcelable(r2) != null) goto L7;
            return AbsSavedState.EMPTY_STATE;
        L7:
            throw new IllegalStateException("superState must be null");
        }

        public AbsSavedState[] c(int r1) {
            return new AbsSavedState[r1];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object createFromParcel(Parcel r1) {
            return a(r1);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object[] newArray(int r1) {
            return c(r1);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public /* bridge */ /* synthetic */ Object createFromParcel(Parcel r1, ClassLoader r2) {
            return b(r1, r2);
        }
    }

    static {
        EMPTY_STATE = new AnonymousClass1();
        CREATOR = new a();
    }

    public /* synthetic */ AbsSavedState(AnonymousClass1 r1) {
        this();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Parcelable getSuperState() {
        return this.mSuperState;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r2, int r3) {
        r2.writeParcelable(this.mSuperState, r3);
    }

    public AbsSavedState() {
        this.mSuperState = null;
    }

    public AbsSavedState(Parcelable r2) {
        if (r2 == null) goto L11;
        if (r2 != EMPTY_STATE) goto L8;
        r2 = null;
    L8:
        this.mSuperState = r2;
        return;
    L11:
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbsSavedState(Parcel r1, ClassLoader r2) {
        Parcelable r12 = r1.readParcelable(r2);
        if (r12 != null) goto L6;
        r12 = EMPTY_STATE;
    L6:
        this.mSuperState = r12;
    }
}
