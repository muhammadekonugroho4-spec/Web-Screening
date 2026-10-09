package com.evrencoskun.tableview.preference;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes4.dex */
public class SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<SavedState> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public Preferences f35467a;

    public static class a implements Parcelable.Creator {
        public a() {
        }

        public SavedState a(Parcel r3) {
            return new SavedState(r3, null);
        }

        public SavedState[] b(int r1) {
            return new SavedState[r1];
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

    public /* synthetic */ SavedState(Parcel r1, a r2) {
        this(r1);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel r2, int r3) {
        super.writeToParcel(r2, r3);
        r2.writeParcelable(this.f35467a, r3);
    }

    public SavedState(Parcelable r1) {
        super(r1);
    }

    public SavedState(Parcel r2) {
        super(r2);
        this.f35467a = (Preferences) r2.readParcelable(Preferences.class.getClassLoader());
    }
}
