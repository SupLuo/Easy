package easy.skin.factory;

import android.content.Context;
import android.util.AttributeSet;

import java.util.List;

import easy.skin.SkinConst;
import easy.skin.attr.SkinAttr;

/**
 * Created by Lucio on 17/3/31.
 * 命名空间属性工厂：必须申明属性空间，并且skin:enable=true
 */
class NamespaceSkinAttrFactory extends SkinAttrFactory {

    NamespaceSkinAttrFactory(){}

    @Override
    public List<SkinAttr> getSkinAttrs(AttributeSet attrs, Context context) {
        //是否配备了
        boolean isSkinEnable = attrs.getAttributeBooleanValue(SkinConst.NAMESPACE, SkinConst.NAMESPACE_ATTR_SKIN_ENABLE, false);
        if (!isSkinEnable)
            return null;
        return super.getSkinAttrs(attrs, context);
    }

    @Override
    protected boolean addRefAttr(String attrName, int attrValueRefId, String entryName, String typeName) {
        return true;
    }
}
