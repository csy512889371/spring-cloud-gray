package cn.springlcoud.gray.event;

import cn.springcloud.gray.model.PolicyDefinition;
import lombok.Data;

/**
 * @author saleson
 * @date 2020-02-03 12:15
 */
@Data
public class GrayPolicyEvent extends GrayEvent {

    private String serviceId;
    private String instanceId;
    private PolicyDefinition source;


    @Override
    public String getSourceId() {
        return getSource().getPolicyId();
    }


}
