package com.huawei.hms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.common.internal.safeparcel.AbstractSafeParcelable;
import com.huawei.hms.common.internal.safeparcel.SafeParcelWriter;
import com.huawei.hms.common.sqlite.HMSCursorWrapper;
import com.huawei.hms.support.log.HMSLog;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable, AutoCloseable {
    private static final Builder BUILDER = null;
    public static final Parcelable.Creator<DataHolder> CREATOR = null;
    private static final String TAG = "DataHolder";
    public static final String TYPE_BOOLEAN = "type_boolean";
    public static final String TYPE_BYTE_ARRAY = "type_byte_array";
    public static final String TYPE_DOUBLE = "type_double";
    public static final String TYPE_FLOAT = "type_float";
    public static final String TYPE_INT = "type_int";
    public static final String TYPE_LONG = "type_long";
    public static final String TYPE_STRING = "type_string";
    private String[] columns;
    private Bundle columnsBundle;
    private CursorWindow[] cursorWindows;
    private int dataCount;
    private boolean isInstance;
    private boolean mClosed;
    private Bundle metadata;
    private int[] perCursorCounts;
    private int statusCode;
    private int version;

    /* renamed from: com.huawei.hms.common.data.DataHolder$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String[] f39071a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<HashMap<String, Object>> f39072b;

        /* renamed from: c, reason: collision with root package name */
        private final String f39073c;
        private final HashMap<Object, Integer> d;

        public /* synthetic */ Builder(String[] r1, String r2, AnonymousClass1 r3) {
            this(r1, r2);
        }

        public static /* synthetic */ String[] a(Builder r02) {
            return r02.f39071a;
        }

        public static /* synthetic */ ArrayList b(Builder r02) {
            return r02.f39072b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DataHolder build(int r3) {
            return new DataHolder(this, r3, null, 0 == true ? 1 : 0);
        }

        public Builder setDataForContentValuesHashMap(HashMap<String, Object> r4) {
            Preconditions.checkNotNull(r4, "contentValuesHashMap cannot be null");
            String r02 = this.f39073c;
            if (r02 == null) goto L10;
            Object r03 = r4.get(r02);
            if (r03 == null) goto L10;
            Integer r1 = this.d.get(r03);
            if (r1 == null) goto L9;
            int r04 = r1.intValue();
            boolean r12 = true;
        L11:
            if (r12 == false) goto L14;
            this.f39072b.remove(r04);
            this.f39072b.add(r04, r4);
            return this;
        L14:
            this.f39072b.add(r4);
            return this;
        L9:
            this.d.put(r03, Integer.valueOf(this.f39072b.size()));
        L10:
            r04 = 0;
            r12 = false;
            goto L11
        }

        public Builder withRow(ContentValues r4) {
            Preconditions.checkNotNull(r4, "contentValues cannot be null");
            HashMap<String, Object> r02 = new HashMap(r4.size());
            Iterator<Map.Entry<String, Object>> r42 = r4.valueSet().iterator();
        L4:
            if (r42.hasNext() == false) goto L7;
            Map.Entry<String, Object> r1 = r42.next();
            r02.put(r1.getKey(), r1.getValue());
            goto L4
        L7:
            return setDataForContentValuesHashMap(r02);
        }

        private Builder(String[] r2, String r3) {
            Preconditions.checkNotNull(r2, "builderColumnsP cannot be null");
            this.f39071a = r2;
            this.f39072b = new ArrayList();
            this.f39073c = r3;
            this.d = new HashMap();
        }

        public DataHolder build(int r7, Bundle r8) {
            return new DataHolder(this, r7, r8, -1, null);
        }

        public Builder(String[] r1, String r2, DataHolderBuilderCreator r3) {
            this(r1, null);
        }
    }

    public static class DataHolderException extends RuntimeException {
        public DataHolderException(String r1) {
            super(r1);
        }
    }

    static {
        CREATOR = new DataHolderCreator();
        BUILDER = new DataHolderBuilderCreator(new String[0], null);
    }

    public /* synthetic */ DataHolder(Builder r1, int r2, Bundle r3, int r4, AnonymousClass1 r5) {
        this(r1, r2, r3, r4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder builder(String[] r2) {
        return new Builder(r2, null, 0 == true ? 1 : 0);
    }

    private void checkAvailable(String r2, int r3) {
        Bundle r02 = this.columnsBundle;
        if (r02 != null) goto L5;
    L16:
        String r22 = "cannot find column: " + r2;
    L17:
        Preconditions.checkArgument(r22.isEmpty(), r22);
        return;
    L5:
        if (r02.containsKey(r2) == false) goto L16;
        if (isClosed() == false) goto L10;
        r22 = "buffer has been closed";
        goto L17
    L10:
        if (r3 >= 0) goto L12;
    L15:
        r22 = "row is out of index:" + r3;
        goto L17
    L12:
        if (r3 >= this.dataCount) goto L15;
        r22 = "";
        goto L17
    }

    public static DataHolder empty(int r3) {
        return new DataHolder(BUILDER, r3, null);
    }

    private static CursorWindow[] getCursorWindows(HMSCursorWrapper r5) {
        ArrayList r02 = new ArrayList();
        int r2 = r5.getCount();     // Catch: Throwable -> L8
        CursorWindow r3 = r5.getWindow();     // Catch: Throwable -> L8
        if (r3 != null) goto L6;
    L10:
        int r32 = 0;
    L11:
        r02.addAll(iterCursorWrapper(r5, r32, r2));     // Catch: Throwable -> L8
        CursorWindow[] r03 = (CursorWindow[]) r02.toArray(new CursorWindow[r02.size()]);     // Catch: Throwable -> L8
        r5.close();
        return r03;
    L6:
        if (r3.getStartPosition() != 0) goto L10;
        r3.acquireReference();     // Catch: Throwable -> L8
        r5.setWindow(null);     // Catch: Throwable -> L8
        r02.add(r3);     // Catch: Throwable -> L8
        r32 = r3.getNumRows();     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        HMSLog.e(TAG, "fail to getCursorWindows: " + th.getMessage());     // Catch: Throwable -> L18
        CursorWindow[] r04 = new CursorWindow[0];     // Catch: Throwable -> L18
        r5.close();
        return r04;
    L18:
        th = move-exception;
        r5.close();
        throw th;
    }

    private static ArrayList<CursorWindow> iterCursorWindow(Builder r10, int r11, List r12) {
        ArrayList<CursorWindow> r02 = new ArrayList();
        CursorWindow r1 = new CursorWindow(null);
        r1.setNumColumns(Builder.a(r10).length);
        r02.add(r1);
        int r4 = 0;
    L3:
        if (r4 >= r11) goto L30;
    L11:
        e = move-exception;
        Iterator<CursorWindow> r112 = r02.iterator();
    L27:
        if (r112.hasNext() == false) goto L29;
        r112.next().close();
        goto L27
    L29:
        throw e;
    L6:
        if (r1.allocRow() == true) goto L14;
        HMSLog.d(TAG, "Failed to allocate a row");     // Catch: RuntimeException -> L11
        r1 = new CursorWindow(null);     // Catch: RuntimeException -> L11
        r1.setStartPosition(r4);     // Catch: RuntimeException -> L11
        r1.setNumColumns(Builder.a(r10).length);     // Catch: RuntimeException -> L11
        if (r1.allocRow() == false) goto L9;
        r02.add(r1);     // Catch: RuntimeException -> L11
        goto L14
    L9:
        HMSLog.e(TAG, "Failed to retry to allocate a row");     // Catch: RuntimeException -> L11
        return r02;
    L14:
        HashMap r5 = (HashMap) r12.get(r4);     // Catch: RuntimeException -> L11
        boolean r7 = true;
        int r8 = 0;
    L16:
        if (r8 >= Builder.a(r10).length) goto L21;
        r7 = putValue(r1, r5.get(Builder.a(r10)[r8]), r4, r8);     // Catch: RuntimeException -> L11
        if (r7 == false) goto L21;
        r8 = r8 + 1;     // Catch: RuntimeException -> L11
    L21:
        if (r7 == false) goto L22;
        r4 = r4 + 1;
        goto L3
    L22:
        HMSLog.d(TAG, "fail to put data for row " + r4);     // Catch: RuntimeException -> L11
        r1.freeLastRow();     // Catch: RuntimeException -> L11
        CursorWindow r113 = new CursorWindow(null);     // Catch: RuntimeException -> L11
        r113.setStartPosition(r4);     // Catch: RuntimeException -> L11
        r113.setNumColumns(Builder.a(r10).length);     // Catch: RuntimeException -> L11
        r02.add(r113);     // Catch: RuntimeException -> L11
        return r02;
    L30:
        return r02;
    }

    private static ArrayList<CursorWindow> iterCursorWrapper(HMSCursorWrapper r3, int r4, int r5) {
        ArrayList<CursorWindow> r02 = new ArrayList();
    L3:
        if (r4 >= r5) goto L14;
        if (r3.moveToPosition(r4) == false) goto L14;
        CursorWindow r1 = r3.getWindow();
        if (r1 != null) goto L9;
        r1 = new CursorWindow(null);
        r1.setStartPosition(r4);
        r3.fillWindow(r4, r1);
    L11:
        if (r1.getNumRows() == 0) goto L14;
        r02.add(r1);
        r4 = r1.getNumRows() + r1.getStartPosition();
        goto L3
    L9:
        r1.acquireReference();
        r3.setWindow(null);
    L14:
        return r02;
    }

    private static boolean putValue(CursorWindow r2, Object r3, int r4, int r5) throws IllegalArgumentException {
        if (r3 != null) goto L6;
        return r2.putNull(r4, r5);
    L6:
        if ((r3 instanceof Boolean) == false) goto L14;
        if (((Boolean) r3).booleanValue() == false) goto L10;
        long r02 = 1;
    L12:
        return r2.putLong(r02, r4, r5);
    L10:
        r02 = 0;
        goto L12
    L14:
        if ((r3 instanceof Integer) == false) goto L18;
        return r2.putLong(((Integer) r3).intValue(), r4, r5);
    L18:
        if ((r3 instanceof Long) == false) goto L22;
        return r2.putLong(((Long) r3).longValue(), r4, r5);
    L22:
        if ((r3 instanceof Float) == false) goto L26;
        return r2.putDouble(((Float) r3).floatValue(), r4, r5);
    L26:
        if ((r3 instanceof Double) == false) goto L30;
        return r2.putDouble(((Double) r3).doubleValue(), r4, r5);
    L30:
        if ((r3 instanceof String) == false) goto L34;
        return r2.putString((String) r3, r4, r5);
    L34:
        if ((r3 instanceof byte[]) == false) goto L38;
        return r2.putBlob((byte[]) r3, r4, r5);
    L38:
        throw new IllegalArgumentException("unsupported type for column: " + r3);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (this.mClosed == true) goto L11;
        CursorWindow[] r02 = this.cursorWindows;     // Catch: Throwable -> L8
        int r1 = r02.length;     // Catch: Throwable -> L8
        int r2 = 0;
    L6:
        if (r2 >= r1) goto L10;
        r02[r2].close();     // Catch: Throwable -> L8
        r2 = r2 + 1;     // Catch: Throwable -> L8
        goto L6
    L10:
        this.mClosed = true;     // Catch: Throwable -> L8
    L11:
        monitor-exit(this);
    }

    public final void collectColumsAndCount() {
        this.columnsBundle = new Bundle();
        String[] r02 = this.columns;
        int r1 = 0;
        if (r02 != null) goto L5;
    L24:
        this.dataCount = 0;
        return;
    L5:
        if (r02.length == 0) goto L24;
        int r03 = 0;
    L8:
        String[] r2 = this.columns;
        if (r03 >= r2.length) goto L11;
        this.columnsBundle.putInt(r2[r03], r03);
        r03 = r03 + 1;
        goto L8
    L11:
        CursorWindow[] r04 = this.cursorWindows;
        if (r04 != null) goto L14;
    L22:
        this.dataCount = 0;
        return;
    L14:
        if (r04.length == 0) goto L22;
        this.perCursorCounts = new int[r04.length];
        int r05 = 0;
    L17:
        CursorWindow[] r22 = this.cursorWindows;
        if (r1 >= r22.length) goto L20;
        this.perCursorCounts[r1] = r05;
        r05 = r22[r1].getStartPosition() + this.cursorWindows[r1].getNumRows();
        r1 = r1 + 1;
        goto L17
    L20:
        this.dataCount = r05;
    }

    public final void copyToBuffer(String r2, int r3, int r4, CharArrayBuffer r5) {
        checkAvailable(r2, r3);
        this.cursorWindows[r4].copyStringToBuffer(r3, this.columnsBundle.getInt(r2), r5);
    }

    public final void finalize() throws Throwable {
        if (this.isInstance == true) goto L5;
    L9:
        super.finalize();
        return;
    L5:
        if (this.cursorWindows.length <= 0) goto L9;
        if (isClosed() == true) goto L9;
        close();
        goto L9
    }

    public final int getCount() {
        return this.dataCount;
    }

    public final Bundle getMetadata() {
        return this.metadata;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final Object getValue(String r5, int r6, int r7, String r8) {
        boolean r02 = true;
        r8.getClass();
        char r2 = 65535;
        switch(r8.hashCode()) {
            case -1092271849: goto L30;
            case -870070237: goto L26;
            case -675993238: goto L22;
            case 445002870: goto L18;
            case 519136353: goto L14;
            case 878975158: goto L10;
            case 1300508295: goto L6;
            default: goto L33;
        };
    L33:
        switch(r2) {
            case 0: goto L52;
            case 1: goto L46;
            case 2: goto L44;
            case 3: goto L42;
            case 4: goto L40;
            case 5: goto L38;
            case 6: goto L36;
            default: goto L34;
        };
    L34:
        return null;
    L36:
        checkAvailable(r5, r6);
        return this.cursorWindows[r7].getBlob(r6, this.columnsBundle.getInt(r5));
    L38:
        checkAvailable(r5, r6);
        return this.cursorWindows[r7].getString(r6, this.columnsBundle.getInt(r5));
    L40:
        checkAvailable(r5, r6);
        return Long.valueOf(this.cursorWindows[r7].getLong(r6, this.columnsBundle.getInt(r5)));
    L42:
        checkAvailable(r5, r6);
        return Double.valueOf(this.cursorWindows[r7].getDouble(r6, this.columnsBundle.getInt(r5)));
    L44:
        checkAvailable(r5, r6);
        return Integer.valueOf(this.cursorWindows[r7].getInt(r6, this.columnsBundle.getInt(r5)));
    L46:
        checkAvailable(r5, r6);
        if (this.cursorWindows[r7].getLong(r6, this.columnsBundle.getInt(r5)) == 1) goto L51;
        r02 = false;
    L51:
        return Boolean.valueOf(r02);
    L52:
        checkAvailable(r5, r6);
        return Float.valueOf(this.cursorWindows[r7].getFloat(r6, this.columnsBundle.getInt(r5)));
    L6:
        if (r8.equals(TYPE_BYTE_ARRAY) == false) goto L33;
        r2 = 6;
        goto L33
    L10:
        if (r8.equals(TYPE_STRING) == false) goto L33;
        r2 = 5;
        goto L33
    L14:
        if (r8.equals(TYPE_LONG) == false) goto L33;
        r2 = 4;
        goto L33
    L18:
        if (r8.equals(TYPE_DOUBLE) == false) goto L33;
        r2 = 3;
        goto L33
    L22:
        if (r8.equals(TYPE_INT) == false) goto L33;
        r2 = 2;
        goto L33
    L26:
        if (r8.equals(TYPE_BOOLEAN) == false) goto L33;
        r2 = 1;
        goto L33
    L30:
        if (r8.equals(TYPE_FLOAT) == false) goto L33;
        r2 = 0;
        goto L33
    }

    public final int getWindowIndex(int r6) {
        int r02 = 0;
        if (r6 < 0) goto L5;
    L8:
        boolean r2 = true;
    L9:
        Preconditions.checkArgument(r2, "rowIndex is out of index:" + r6);
    L10:
        int[] r22 = this.perCursorCounts;
        if (r02 >= r22.length) goto L17;
        if (r6 < r22[r02]) goto L14;
        r02 = r02 + 1;
        goto L10
    L14:
        r02 = r02 - 1;
    L17:
        if (r02 == r22.length) goto L19;
        return r02;
    L19:
        return r02 - 1;
    L5:
        if (r6 < this.dataCount) goto L8;
        r2 = false;
        goto L9
    }

    public final boolean hasColumn(String r2) {
        return this.columnsBundle.containsKey(r2);
    }

    public final boolean hasNull(String r2, int r3, int r4) {
        checkAvailable(r2, r3);
        if (this.cursorWindows[r4].getType(r3, this.columnsBundle.getInt(r2)) != 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final synchronized boolean isClosed() {
        monitor-enter(this);
        boolean r02 = this.mClosed;     // Catch: Throwable -> L6
        monitor-exit(this);
        return r02;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r6, int r7) {
        int r02 = SafeParcelWriter.beginObjectHeader(r6);
        SafeParcelWriter.writeStringArray(r6, 1, this.columns, false);
        SafeParcelWriter.writeTypedArray(r6, 2, this.cursorWindows, r7, false);
        SafeParcelWriter.writeInt(r6, 3, getStatusCode());
        SafeParcelWriter.writeBundle(r6, 4, getMetadata(), false);
        SafeParcelWriter.writeInt(r6, 1000, this.version);
        SafeParcelWriter.finishObjectHeader(r6, r02);
        if ((r7 & 1) == 0) goto L6;
        close();
        return;
    }

    public /* synthetic */ DataHolder(Builder r1, int r2, Bundle r3, AnonymousClass1 r4) {
        this(r1, r2, r3);
    }

    public DataHolder(int r2, String[] r3, CursorWindow[] r4, int r5, Bundle r6) {
        this.mClosed = false;
        this.isInstance = true;
        this.version = r2;
        this.columns = r3;
        this.cursorWindows = r4;
        this.statusCode = r5;
        this.metadata = r6;
        collectColumsAndCount();
    }

    public DataHolder(String[] r2, CursorWindow[] r3, int r4, Bundle r5) {
        Preconditions.checkNotNull(r2, "columnsP cannot be null");
        Preconditions.checkNotNull(r3, "cursorWindowP cannot be null");
        this.mClosed = false;
        this.isInstance = true;
        this.version = 1;
        this.columns = r2;
        this.cursorWindows = r3;
        this.statusCode = r4;
        this.metadata = r5;
        collectColumsAndCount();
    }

    private static CursorWindow[] getCursorWindows(Builder r2, int r3) {
        if (Builder.a(r2).length == 0) goto L5;
        if (r3 >= 0) goto L8;
    L9:
        r3 = Builder.b(r2).size();
    L10:
        ArrayList<CursorWindow> r22 = iterCursorWindow(r2, r3, Builder.b(r2).subList(0, r3));
        return (CursorWindow[]) r22.toArray(new CursorWindow[r22.size()]);
    L8:
        if (r3 < Builder.b(r2).size()) goto L10;
    L5:
        return new CursorWindow[0];
    }

    private DataHolder(HMSCursorWrapper r2, int r3, Bundle r4) {
        this(r2.getColumnNames(), getCursorWindows(r2), r3, r4);
    }

    public DataHolder(Cursor r2, int r3, Bundle r4) {
        this(new HMSCursorWrapper(r2), r3, r4);
    }

    private DataHolder(Builder r2, int r3, Bundle r4) {
        this(Builder.a(r2), getCursorWindows(r2, -1), r3, null);
    }

    private DataHolder(Builder r2, int r3, Bundle r4, int r5) {
        this(Builder.a(r2), getCursorWindows(r2, -1), r3, r4);
    }
}
