package cn.springcloud.gray.server.dao.mapper;

import cn.springcloud.gray.server.dao.model.GrayInstanceRoutePolicyDO;
import cn.springcloud.gray.server.module.gray.domain.InstanceRoutePolicy;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(
        componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface InstanceRoutePolicyMapper extends ModelMapper<InstanceRoutePolicy, GrayInstanceRoutePolicyDO> {

}
