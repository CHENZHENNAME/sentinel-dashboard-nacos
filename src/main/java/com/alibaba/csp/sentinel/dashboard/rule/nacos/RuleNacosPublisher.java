package com.alibaba.csp.sentinel.dashboard.rule.nacos;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.RuleEntity;
import com.alibaba.csp.sentinel.dashboard.rule.DynamicRulePublisher;
import com.alibaba.csp.sentinel.datasource.Converter;
import com.alibaba.csp.sentinel.util.AssertUtil;
import com.alibaba.nacos.api.config.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class RuleNacosPublisher<T extends RuleEntity> implements DynamicRulePublisher<List<T>> {

    @Autowired
    protected ConfigService configService;
    @Autowired
    protected Converter<List<T>, String> converter;

    @Override
    public void publish(String app, List<T> rules) throws Exception {
        AssertUtil.notEmpty(app, "app name cannot be empty");
        if (rules == null) {
            return;
        }
        configService.publishConfig(app + getDataIdPostfix(),
                NacosConfigUtil.GROUP_ID, converter.convert(rules));
    }
    /**
     * 文件后缀 参考 com.alibaba.csp.sentinel.dashboard.rule.nacos.NacosConfigUtil.FLOW_DATA_ID_POSTFIX
     * @return
     */
    public abstract String getDataIdPostfix();
}
