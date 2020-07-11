package com.alibaba.csp.sentinel.dashboard.rule.nacos.authority;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.AuthorityRuleEntity;
import com.alibaba.csp.sentinel.dashboard.rule.nacos.NacosConfigUtil;
import com.alibaba.csp.sentinel.dashboard.rule.nacos.RuleNacosPublisher;
import org.springframework.stereotype.Component;

@Component("authorityRuleNacosPublisher")
public class AuthorityRuleNacosPublisher extends RuleNacosPublisher<AuthorityRuleEntity>{

    @Override
    public String getDataIdPostfix() {
        return NacosConfigUtil.AUTHORITY_DATA_ID_POSTFIX;
    }
}