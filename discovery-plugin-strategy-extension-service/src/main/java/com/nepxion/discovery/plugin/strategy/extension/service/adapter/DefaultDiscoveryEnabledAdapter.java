package com.nepxion.discovery.plugin.strategy.extension.service.adapter;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.nepxion.discovery.common.constant.DiscoveryConstant;
import com.nepxion.discovery.plugin.strategy.adapter.AbstractDiscoveryEnabledAdapter;

public class DefaultDiscoveryEnabledAdapter extends AbstractDiscoveryEnabledAdapter {
    @Override
    protected String getVersionValue() {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (attributes == null) {
            return null;
        }

        return attributes.getRequest().getHeader(DiscoveryConstant.VERSION);
    }

    @Override
    protected String getRegionValue() {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (attributes == null) {
            return null;
        }

        return attributes.getRequest().getHeader(DiscoveryConstant.REGION);
    }
}