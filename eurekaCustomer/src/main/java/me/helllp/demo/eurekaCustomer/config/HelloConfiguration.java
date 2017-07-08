package me.helllp.demo.eurekaCustomer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class HelloConfiguration {
    /**
     * 负载均衡策略
     * @return
     */
    @Bean
    public IRule ribbonRule() {
//        return new BestAvailableRule(); //选择一个最小的并发请求的server
//        return new WeightedResponseTimeRule(); //根据相应时间分配一个weight，相应时间越长，weight越小，被选中的可能性越低。
//        return new RetryRule(); //对选定的负载均衡策略机上重试机制。
//        return new RoundRobinRule(); //roundRobin方式轮询选择server
        return new RandomRule(); //随机选择一个server
//        return new ZoneAvoidanceRule(); //复合判断server所在区域的性能和server的可用性选择server
//        return new AvailabilityFilteringRule();
    }
}
