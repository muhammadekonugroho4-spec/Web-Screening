package com.huawei.hms.common.data;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.huawei.hms.common.internal.Objects;
import com.huawei.hms.common.internal.Preconditions;

/* loaded from: classes6.dex */
public class DataBufferRef {

    /* renamed from: a, reason: collision with root package name */
    private int f39070a;
    protected final DataHolder mDataHolder;
    protected int mDataRow;

    public DataBufferRef(DataHolder r2, int r3) {
        Preconditions.checkNotNull(r2, "dataHolder cannot be null");
        this.mDataHolder = r2;
        getWindowIndex(r3);
    }

    public void copyToBuffer(String r4, CharArrayBuffer r5) {
        this.mDataHolder.copyToBuffer(r4, this.mDataRow, this.f39070a, r5);
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof DataBufferRef) == false) goto L12;
        DataBufferRef r42 = (DataBufferRef) r4;
        if (r42.mDataRow != this.mDataRow) goto L12;
        if (r42.f39070a != this.f39070a) goto L12;
        if (r42.mDataHolder != this.mDataHolder) goto L12;
        return true;
    L12:
        return false;
    }

    public boolean getBoolean(String r5) {
        Object r52 = this.mDataHolder.getValue(r5, this.mDataRow, this.f39070a, DataHolder.TYPE_BOOLEAN);
        if (r52 != null) goto L5;
        return false;
    L5:
        return ((Boolean) r52).booleanValue();
    }

    public byte[] getByteArray(String r5) {
        Object r52 = this.mDataHolder.getValue(r5, this.mDataRow, this.f39070a, DataHolder.TYPE_BYTE_ARRAY);
        if (r52 != null) goto L5;
        return null;
    L5:
        return (byte[]) r52;
    }

    public int getDataRow() {
        return this.mDataRow;
    }

    public double getDouble(String r5) {
        Object r52 = this.mDataHolder.getValue(r5, this.mDataRow, this.f39070a, DataHolder.TYPE_DOUBLE);
        if (r52 != null) goto L5;
        return -1.0d;
    L5:
        return ((Double) r52).doubleValue();
    }

    public float getFloat(String r5) {
        Object r52 = this.mDataHolder.getValue(r5, this.mDataRow, this.f39070a, DataHolder.TYPE_FLOAT);
        if (r52 != null) goto L5;
        return -1.0f;
    L5:
        return ((Float) r52).floatValue();
    }

    public int getInteger(String r5) {
        Object r52 = this.mDataHolder.getValue(r5, this.mDataRow, this.f39070a, DataHolder.TYPE_INT);
        if (r52 != null) goto L5;
        return -1;
    L5:
        return ((Integer) r52).intValue();
    }

    public long getLong(String r5) {
        Object r52 = this.mDataHolder.getValue(r5, this.mDataRow, this.f39070a, DataHolder.TYPE_LONG);
        if (r52 != null) goto L5;
        return -1;
    L5:
        return ((Long) r52).longValue();
    }

    public String getString(String r5) {
        Object r52 = this.mDataHolder.getValue(r5, this.mDataRow, this.f39070a, DataHolder.TYPE_STRING);
        if (r52 != null) goto L5;
        return "";
    L5:
        return (String) r52;
    }

    public final void getWindowIndex(int r3) {
        if (r3 >= 0) goto L4;
    L6:
        boolean r02 = false;
    L7:
        Preconditions.checkArgument(r02, "rowNum is out of index");
        this.mDataRow = r3;
        this.f39070a = this.mDataHolder.getWindowIndex(r3);
        return;
    L4:
        if (r3 >= this.mDataHolder.getCount()) goto L6;
        r02 = true;
        goto L7
    }

    public boolean hasColumn(String r2) {
        return this.mDataHolder.hasColumn(r2);
    }

    public boolean hasNull(String r4) {
        return this.mDataHolder.hasNull(r4, this.mDataRow, this.f39070a);
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{Integer.valueOf(this.mDataRow), Integer.valueOf(this.f39070a), this.mDataHolder});
    }

    public boolean isDataValid() {
        return !this.mDataHolder.isClosed();
    }

    public Uri parseUri(String r5) {
        String r52 = (String) this.mDataHolder.getValue(r5, this.mDataRow, this.f39070a, DataHolder.TYPE_STRING);
        if (r52 != null) goto L7;
        return null;
    L7:
        return Uri.parse(r52);
    }
}
