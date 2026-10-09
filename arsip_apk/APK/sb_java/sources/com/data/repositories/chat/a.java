package com.data.repositories.chat;

import com.stockbit.domain.model.chat.group.g;
import java.util.List;
import kotlin.coroutines.e;

/* loaded from: classes4.dex */
public interface a {
    Object a(String r1, String r2, String r3, String r4, e r5);

    Object b(String r1, long r2, boolean r4, e r5);

    Object c(int r1, int r2, String r3, e r4);

    Object createGroupEligibility(e r1);

    Object d(String r1, List r2, e r3);

    Object e(int r1, int r2, e r3);

    Object f(String r1, String r2, String r3, String r4, e r5);

    Object g(String r1, String r2, e r3);

    Object getContactStatus(e r1);

    Object getGroupDetail(String r1, e r2);

    Object getGroupMemberDetail(int r1, int r2, e r3);

    Object getGroupSettings(int r1, e r2);

    Object getMaxGroupMember(e r1);

    Object h(int r1, boolean r2, e r3);

    Object i(String r1, String r2, int r3, int r4, boolean r5, String r6, e r7);

    Object j(String r1, String r2, String r3, String r4, g r5, e r6);

    Object k(String r1, boolean r2, e r3);

    Object l(String r1, String r2, String r3, String r4, List r5, g r6, e r7);

    Object m(int r1, boolean r2, e r3);

    Object resetGroupInvitationLink(int r1, e r2);
}
