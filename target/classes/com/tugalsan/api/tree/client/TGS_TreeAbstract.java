package com.tugalsan.api.tree.client;

import com.google.gwt.user.client.rpc.IsSerializable;
import com.tugalsan.api.string.client.*;

public class TGS_TreeAbstract<A> implements IsSerializable {

    public TGS_TreeAbstract() {//DTO
    }

    public TGS_TreeAbstract(A id) {
        this.id = id;
    }
    public A id;

    @Override
    public String toString() {
        return TGS_StringUtils.concat(
                TGS_TreeAbstract.class.getSimpleName(),
                "{",
                "id=", String.valueOf(id),
                "}"
        );
    }
}
