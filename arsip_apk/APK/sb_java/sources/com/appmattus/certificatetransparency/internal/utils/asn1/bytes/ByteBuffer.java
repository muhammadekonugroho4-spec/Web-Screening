package com.appmattus.certificatetransparency.internal.utils.asn1.bytes;

import java.util.Iterator;
import kotlin.sequences.l;

/* loaded from: classes4.dex */
public interface ByteBuffer extends Iterable, kotlin.jvm.internal.markers.a {

    public static final class DefaultImpls {
        public static Iterator a(ByteBuffer r2) {
            return l.a(new ByteBuffer$iterator$1(r2, null));
        }
    }

    byte get(int r1);

    int getSize();

    byte[] p0(int r1, int r2);

    ByteBuffer x(int r1, int r2);
}
