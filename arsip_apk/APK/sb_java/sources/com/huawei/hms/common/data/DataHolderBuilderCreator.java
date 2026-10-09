package com.huawei.hms.common.data;

import android.content.ContentValues;
import com.huawei.hms.common.data.DataHolder;
import java.util.HashMap;

/* loaded from: classes6.dex */
final class DataHolderBuilderCreator extends DataHolder.Builder {
    public DataHolderBuilderCreator(String[] r1, String r2) {
        super(r1, null, null);
    }

    @Override // com.huawei.hms.common.data.DataHolder.Builder
    public final DataHolder.Builder setDataForContentValuesHashMap(HashMap<String, Object> r2) {
        throw new UnsupportedOperationException("DataHolderBuilderCreator unsupported setDataForContentValuesHashMap");
    }

    @Override // com.huawei.hms.common.data.DataHolder.Builder
    public final DataHolder.Builder withRow(ContentValues r2) {
        throw new UnsupportedOperationException("DataHolderBuilderCreator unsupported withRow");
    }
}
