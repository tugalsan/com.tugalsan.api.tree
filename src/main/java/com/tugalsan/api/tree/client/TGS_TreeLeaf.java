package com.tugalsan.api.tree.client;

import com.google.gwt.user.client.rpc.IsSerializable;
import com.tugalsan.api.string.client.*;

public class TGS_TreeLeaf<A, B> extends TGS_TreeAbstract<A> implements IsSerializable {

    public TGS_TreeLeaf() {//DTO
    }

    public TGS_TreeLeaf(A id, B value) {
        super(id);
        this.value = value;
    }
    public B value;

    public static <A, B> TGS_TreeLeaf<A, B> of(A id, B value) {
        return new TGS_TreeLeaf(id, value);
    }

    @Override
    public String toString() {
        return TGS_StringUtils.concat(
                TGS_TreeLeaf.class.getSimpleName(),
                "{",
                "id=", String.valueOf(id),
                ", value=", String.valueOf(value),
                "}"
        );
    }
}
