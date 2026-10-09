package coil.fetch;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class d {
    public static /* bridge */ /* synthetic */ AssetFileDescriptor a(ContentResolver r02, Uri r1, String r2, Bundle r3, CancellationSignal r4) {
        return r02.openTypedAssetFile(r1, r2, r3, r4);
    }
}
