package com.data.repositories.trading.community;

import kotlin.coroutines.e;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public interface a {
    Object a(String r1, e r2);

    Object b(String r1, e r2);

    Object c(e r1);

    Object d(e r1);

    Flow e(String r1, String r2, String r3, String r4);

    Object getCommunityCode(String r1, e r2);

    Object getCommunityInfo(e r1);

    Object getCommunityStatus(e r1);

    Object getLinkagePrompt(e r1);

    Object leaveCommunity(e r1);
}
