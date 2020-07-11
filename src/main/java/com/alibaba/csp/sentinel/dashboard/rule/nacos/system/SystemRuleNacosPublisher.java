package com.alibaba.csp.sentinel.dashboard.rule.nacos.system;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.SystemRuleEntity;
import com.alibaba.csp.sentinel.dashboard.rule.nacos.NacosConfigUtil;
import com.alibaba.csp.sentinel.dashboard.rule.nacos.RuleNacosPublisher;
import org.springframework.stereotype.Component;

@Component("systemRuleNacosPublisher")
public class SystemRuleNacosPublisher  extends RuleNacosPublisher<SystemRuleEntity> {
    @Override
    public String getDataIdPostfix() {
        return NacosConfigUtil.SYSTEM_DATA_ID_POSTFIX;
    }
}
