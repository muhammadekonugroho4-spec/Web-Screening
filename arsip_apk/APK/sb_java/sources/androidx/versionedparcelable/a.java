package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.collection.C2337a;

/* loaded from: classes4.dex */
public class a extends VersionedParcel {
    public final SparseIntArray d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f28567e;

    /* renamed from: f, reason: collision with root package name */
    public final int f28568f;

    /* renamed from: g, reason: collision with root package name */
    public final int f28569g;

    /* renamed from: h, reason: collision with root package name */
    public final String f28570h;

    /* renamed from: i, reason: collision with root package name */
    public int f28571i;

    /* renamed from: j, reason: collision with root package name */
    public int f28572j;

    /* renamed from: k, reason: collision with root package name */
    public int f28573k;

    public a(Parcel r9) {
        this(r9, r9.dataPosition(), r9.dataSize(), "", new C2337a(), new C2337a(), new C2337a());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void A(byte[] r3) {
        if (r3 == null) goto L5;
        this.f28567e.writeInt(r3.length);
        this.f28567e.writeByteArray(r3);
        return;
    L5:
        this.f28567e.writeInt(-1);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void C(CharSequence r3) {
        TextUtils.writeToParcel(r3, this.f28567e, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void E(int r2) {
        this.f28567e.writeInt(r2);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void G(Parcelable r3) {
        this.f28567e.writeParcelable(r3, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void I(String r2) {
        this.f28567e.writeString(r2);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void a() {
        int r02 = this.f28571i;
        if (r02 < 0) goto L6;
        int r03 = this.d.get(r02);
        int r1 = this.f28567e.dataPosition();
        int r2 = r1 - r03;
        this.f28567e.setDataPosition(r03);
        this.f28567e.writeInt(r2);
        this.f28567e.setDataPosition(r1);
        return;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public VersionedParcel b() {
        Parcel r1 = this.f28567e;
        int r2 = r1.dataPosition();
        int r3 = this.f28572j;
        if (r3 != this.f28568f) goto L6;
        r3 = this.f28569g;
    L6:
        return new a(r1, r2, r3, this.f28570h + "  ", this.f28564a, this.f28565b, this.f28566c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean g() {
        if (this.f28567e.readInt() == 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] i() {
        int r02 = this.f28567e.readInt();
        if (r02 >= 0) goto L6;
        return null;
    L6:
        byte[] r03 = new byte[r02];
        this.f28567e.readByteArray(r03);
        return r03;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f28567e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean m(int r5) {
    L3:
        if (this.f28572j >= this.f28569g) goto L12;
        int r02 = this.f28573k;
        if (r02 == r5) goto L6;
        if (String.valueOf(r02).compareTo(String.valueOf(r5)) > 0) goto L9;
        this.f28567e.setDataPosition(this.f28572j);
        int r03 = this.f28567e.readInt();
        this.f28573k = this.f28567e.readInt();
        this.f28572j += r03;
        goto L3
    L9:
        return false;
    L6:
        return true;
    L12:
        if (this.f28573k != r5) goto L14;
        return true;
    L14:
        return false;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int o() {
        return this.f28567e.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public Parcelable q() {
        return this.f28567e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String s() {
        return this.f28567e.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void w(int r3) {
        a();
        this.f28571i = r3;
        this.d.put(r3, this.f28567e.dataPosition());
        E(0);
        E(r3);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void y(boolean r2) {
        this.f28567e.writeInt(r2 ? 1 : 0);
    }

    public a(Parcel r1, int r2, int r3, String r4, C2337a r5, C2337a r6, C2337a r7) {
        super(r5, r6, r7);
        this.d = new SparseIntArray();
        this.f28571i = -1;
        this.f28573k = -1;
        this.f28567e = r1;
        this.f28568f = r2;
        this.f28569g = r3;
        this.f28572j = r2;
        this.f28570h = r4;
    }
}
